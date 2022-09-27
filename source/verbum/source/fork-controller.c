
#include "fork-controller.h"

static void     *check_communication (void *_param);
static void     *open_controller     (void *_param);
static int       preparations        (void);
static int       initialize_worker   (void);
static void      prepare_globals     (void);
static int       prepare_node_mapper (void);
static void     *node_mapper_monitor (void *_param);
static void     *open_node_mapper    (void *_param);
static int       prepare_mutex       (void);
static int       prepare_workers     (void);
static int       prepare_items       (void);
static int       prepare_threads     (void);
static worker_t *create_item         (int worker_id);
static int       insert_item         (worker_t *n_worker);

static void     *worker_interface   (void *tparam);
static void     *worker_controller     (void *tparam);


static int  create_verbum_node (char *response);
static void *create_verbum_node_th (void *_param);


static p_mutex_t           mutex_workers  = PTHREAD_MUTEX_INITIALIZER;
static p_mutex_t           mutex_new_node = PTHREAD_MUTEX_INITIALIZER;
static worker_t          *workers       = NULL;

extern global_t global;

int initialize_fork_controller (void)
{
	pthread_t tid;

	if (pthread_create(&tid, NULL, check_communication, NULL) != 0) 
        say_error_ret(0, "Error creating new thread - Fork Controller communication.");
    
    return 1;
}

int initialize_fork_controller_interface (void)
{
    if (!preparations())
        say_ret(0, "Error performing preparations.");

    if (initialize_worker())
        infinite_loop();

    return 0;
}

static void *check_communication (void *_param)
{
	pthread_t tid;

	say("Checks connection to Fork Controller interface...");

    if (check_interface(DEFAULT_FORK_CONTROLLER_SERVER_PORT))
        say_ret(NULL, "Fork Controller interface OK.");

    say("Starts new Fork Controller process.");

    if (pthread_create(&tid, NULL, open_controller, NULL) != 0) 
        say_error_ret(NULL, "Error creating new thread.");
}

static void *open_controller(void *_param)
{
	open_application(APPLICATION_FORK_CONTROLLER);
}

static int initialize_worker (void)
{
    param_t *param;
    pthread_t tid;

    prepare_thread_param(param);
    param->port = DEFAULT_FORK_CONTROLLER_SERVER_PORT;

    if (pthread_create(&tid, NULL, worker_interface, param) != 0)
        say_error_ret(0, "Error creating new thread - Fork Controller interface.");

    return 1;
}

static int preparations (void)
{
    prepare_globals();

    if (!prepare_mutex())
        say_ret(0, "Error preparing Mutex.");

    if (!prepare_node_mapper())
        say_ret(0, "Error preparing Node Mapper monitor.");

    if (!prepare_workers())
        say_ret(0, "Error preparing Workers.");

    return 1;
}

static void prepare_globals (void)
{
	if (global.configuration.node.id) {
		free(global.configuration.node.id);
		global.configuration.node.id = NULL;
	}
}

static int prepare_mutex (void)
{
    if (pthread_mutex_init(&mutex_workers, NULL) != 0) 
        say_ret(0, "Mutex initialization failed - Workers.");

    if (pthread_mutex_init(&mutex_new_node, NULL) != 0) 
        say_ret(0, "Mutex initialization failed - Add new node.");

    return 1;
}

static int prepare_node_mapper (void)
{
    pthread_t tid;
	param_t *param;
    
    prepare_thread_param(param);
	param->port = global.configuration.node_mapper.server_port;

	if (pthread_create(&tid, NULL, node_mapper_monitor, param) != 0)
        say_error_ret(0, "Error creating new thread - Node Mapper monitor.");

    return 1;
}

static void *node_mapper_monitor (void *_param)
{
	param_t *param = (param_t *) _param;
    pthread_t tid;

	say("Node Mapper monitor started!");
	say("Node Mapper server port: %d", param->port);

	while (1) {
        if (!check_interface(param->port)) {
            if (pthread_create(&tid, NULL, open_node_mapper, NULL) != 0)
                say_error_ret(0, "Error creating new thread - open Node Mapper process.");
        }

		sleep(1);
	}
}

static void *open_node_mapper (void *_param)
{
    open_application(APPLICATION_NODE_MAPPER);
}

static int prepare_workers (void)
{
    if (!prepare_items())
        say_ret(0, "Error initializing list items - Workers.");
    
    if (!prepare_threads())
        say_ret(0, "Error initializing threads - Workers.");

    return 1;
}

static int prepare_items (void)
{
    worker_t *worker, *n_worker;

    // Prepares initial item of Workers list.
    workers = create_item(0);
    if (!workers)
        say_ret(0, "Error create worker item.");

    // Prepare items.
    for (int a=1; a<FORK_CONTROLLER_THREADS_LIMIT; a++) {
        n_worker = create_item(a);

        if (!n_worker) 
            say_ret(0, "Error create worker item.");

        if (!insert_item(n_worker))
            say_ret(0, "Error insert worker item.");
    }

    return 1;
}

static int prepare_threads (void)
{
    worker_t *worker;
    int status = 1;

    pthread_mutex_lock(&mutex_workers);
    
    for (worker=workers; worker!=NULL; worker=worker->next) {
        if (pthread_create(&worker->tid, NULL, worker_controller, NULL) != 0) {
            say_error("Error creating new thread - Worker Controller.");
            status = 0;
            break;
        }
    }

    pthread_mutex_unlock(&mutex_workers);

    if (!status)
        return 0;

    return 1;
}

static worker_t *create_item (int worker_id)
{
    worker_t * worker;
    mem_alloc_ret(worker, sizeof(worker_t), worker_t *, NULL);

    worker->wid    = worker_id;
    worker->sock   = -1;
    worker->status = 0;
    worker->next   = NULL;

    return worker;
}

static int insert_item (worker_t *n_worker)
{
    if (!n_worker)
        return 0;

    pthread_mutex_lock(&mutex_workers);
    worker_t *worker = workers;

    while (1) {
        if (!worker->next) {
            worker->next = n_worker;
            break;
        }

        worker = worker->next;
    }

    pthread_mutex_unlock(&mutex_workers);
    return 1;
}

static void *worker_interface (void *tparam)
{
    say("Fork Controller interface - started!");

    param_t *param = (param_t *) tparam;
    struct sockaddr_in address, client;
    socklen_t client_size;
    int ssock = -1, nsock = -1, status = -1, block = 0;
    const int enable = 1;
    worker_t *worker;

    ssock = socket(AF_INET, SOCK_STREAM, 0);
    address.sin_addr.s_addr = INADDR_ANY;
    address.sin_family      = AF_INET;
    address.sin_port        = htons(param->port);

    if (setsockopt(ssock, SOL_SOCKET, SO_REUSEADDR, &enable, sizeof(int)) < 0)
        say_ret(NULL, "Setsockopt (SO_REUSEADDR) failed.");

    status = bind(ssock, (struct sockaddr*) &address, sizeof(address));
    if (status != 0)
        say_exit("Error bind server.");

    if (listen(ssock, param->max_connections) != 0) 
        say_exit("Error listen server.");

    say("Fork Controller server port: %d", param->port);

    while (1) {
        
        // Process connection.
        client_size = sizeof(client);
        nsock = accept(ssock, (struct sockaddr*) &client, &client_size);

        if (nsock != -1) {

            say("connection accepted!");

            // Configure socket.
            struct timeval tms;
            tms.tv_sec  = CONNECTION_TIMEOUT_RECV;
            tms.tv_usec = 0;
            setsockopt(nsock, SOL_SOCKET, SO_RCVTIMEO, (const char*)&tms, sizeof(struct timeval));

            // Checks if the thread is free to use.
            status = 0;
            pthread_mutex_lock(&mutex_workers);
            
            for (worker=workers; worker!=NULL; worker=worker->next) {
                if (worker->status == 0) {

                    // Send signal do worker.
                    worker->status = 1;
                    worker->sock   = nsock;

                    status = 1;
                    break;
                }
            }

            pthread_mutex_unlock(&mutex_workers);

            say("worker found status: %d", status);

            if (status == 0) {
                close(nsock);
                usleep(100000);
            }

        } else
            say("Error accept client.");
    }

    close(ssock);
    return NULL;
}

void *worker_controller (void *tparam)
{
    worker_t *worker;
    int wid = -1, run = 0, sock = -1;
    int status = 0;
    char *response = NULL;
	char success_message []= VERBUM_DEFAULT_SUCCESS VERBUM_EOH;

    while (1) {

        /**
         * Checks if there is order to execute thread.
         */

        run = 0;
        pthread_mutex_lock(&mutex_workers);
        
        for (worker=workers; worker!=NULL; worker=worker->next) {
            if (worker->status == 1) {
                worker->status = 2;
                run  = 1;
                sock = worker->sock;
                wid  = worker->wid;
                break;
            }
        }
        
        pthread_mutex_unlock(&mutex_workers);

        if (run == 0) {
            usleep(100000);
            continue;
        }

        /**
         * Process actions.
         */

        status = send_handshake(sock, 
            "Verbum Node Fork Controller - v1.0.0 - I Love Jesus <3\r\n\r\n");

        // Communication.
        response = get_recv_content(sock);
        if (response) {

            if (strstr(response, "create-verbum-node:")) {
                say("Process action to create a new Verbum Node");

                pthread_mutex_lock(&mutex_new_node);

                create_verbum_node(response);
                usleep(100000);

                pthread_mutex_unlock(&mutex_new_node);
            }

            send(sock, success_message, strlen(success_message), VERBUM_SEND_FLAGS);
            mem_sfree(response);
        }

        /**
         * Finish.
         */

        close(sock);

        pthread_mutex_lock(&mutex_workers);
        
        for (worker=workers; worker!=NULL; worker=worker->next) {
            if (worker->wid == wid) {
                worker->status = 0;
                worker->sock   = -1;
                break;
            }
        }
        
        pthread_mutex_unlock(&mutex_workers);
    }

    return NULL;
}

static int create_verbum_node (char *response)
{
	pthread_t tid1;
	int size = 0;
    char *node_param = NULL;
    char *ptr = NULL;
    char prefix []= "create-verbum-node:";

	if (!response)
		return 0;

	// Prepare data.	
    ptr = strstr(response, prefix);
    if (!ptr)
        return 0;

	say("fork controller, response: %s", response);

    ptr += strlen(prefix);
	
	// Current node ID.
	if (ptr && strlen(ptr) > 0) {
		size = sizeof(char) * (strlen(ptr) + 1);
		global.configuration.node.id = (char *) realloc(global.configuration.node.id, size);

		if (global.configuration.node.id) {
			memset(global.configuration.node.id, 0, size);
			memcpy(global.configuration.node.id, ptr, strlen(ptr));
		}

		say("Current node ID: %s", global.configuration.node.id);
	} else {
		global.configuration.node.id = NULL;
	}

	// Create node process.
	pthread_create(&tid1, NULL, create_verbum_node_th, NULL);
	return 0;
}

static void *create_verbum_node_th (void *_param)
{
	open_application(APPLICATION_NODE);
	return NULL;
}


