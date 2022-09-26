
#include "fork-controller.h"

#include "../../verbum-node/node.h"
#include "../../verbum-node-mapper/node-mapper.h"

static void            *worker_interface   (void *tparam);
static int              prepare_workers    (void);
static thread_worker_t *worker_create_item (int wid);
static int              worker_insert_item (thread_worker_t *new_worker);
static void            *worker_handler     (void *tparam);

static void *check_and_open_fork_controller (void *_param);
static void *start_fork_controller (void *_param);
static int open_fork_controller_process (void);
static void prepare_fork_data (void);
static void *node_mapper_monitor_th (void *_param);
static void open_node_mapper (void);
static void *start_verbum_node_mapper (void *param);
static int create_verbum_node (char *response);
static void *create_verbum_node_th (void *_param);
static int initialize_fork_controller_server (void);

static pthread_mutex_t           mutex_workers = PTHREAD_MUTEX_INITIALIZER;
static pthread_mutex_t           mutex_create_proc = PTHREAD_MUTEX_INITIALIZER;
static thread_worker_t          *workers       = NULL;

/**
 * Initialization.
 */

int initialize_fork_controller (void)
{
	pthread_t tid1;
	pthread_create(&tid1, NULL, check_and_open_fork_controller, NULL);
}

static void *check_and_open_fork_controller (void *_param)
{
	char address []= LOCALHOST;
	int sock = -1, status = 0;
	char *response = NULL;
	char message[]= "no-data:" VERBUM_EOH;
	pthread_t tid1;

	say("Checking Fork Controller connection.");

	sock = check_protocol(address, VERBUM_FORK_CONTROLLER_PORT, 1, 1);

	if (sock != -1) {
		response = send_raw_data(sock, message);
		if (response) {
			status = 1;
			mem_sfree(response);
		}

		close(sock);
	} 

	if (!status) 
		pthread_create(&tid1, NULL, start_fork_controller, NULL);

	say("Fork Controller OK.");
}

static void *start_fork_controller (void *_param)
{
	say("Open new Fork Controller connection.");
	open_fork_controller_process();
}

static int open_fork_controller_process (void)
{
    int fd, fd_limit;
    pid_t pid;

    say("Opening via fork(), application: Fork Controller");

    pid = fork();

    if (pid < 0)
        say_ret(0, "error open fork() 1.");    
    if (pid > 0)
       return 0;

    if (setsid() < 0)
        say_ret(0, "error setsid.");       

    pid = fork();

    if (pid < 0)
        say_exit("error open fork() 2.");
    if (pid > 0) 
        say_exit("fork() 2.");

    // Close all file descriptors.
    fd_limit = (int) sysconf(_SC_OPEN_MAX);

    for (int fd = STDERR_FILENO + 1; fd < fd_limit; fd++) {
#ifndef BLOCK_FORK_STDOUT
        if (fd != 1)
#endif
        close(fd);
    }

    stdin  = fopen("/dev/null", "r" );
    stderr = fopen("/dev/null", "w+");
    
#ifndef BLOCK_FORK_STDOUT
    stdout = fopen("/dev/null", "w+");
#endif

    // Ignore child and tty signals.
    signal(SIGCHLD, SIG_IGN);
    signal(SIGTSTP, SIG_IGN);
    signal(SIGTTOU, SIG_IGN);
    signal(SIGTTIN, SIG_IGN);

    say("Opened via fork(), application: Fork Controller");

	initialize_fork_controller_server();
}

static int initialize_fork_controller_server (void)
{
    int status = 0, size = 0;
    pthread_t tid;
    interface_param_t *param = (interface_param_t *) malloc(sizeof(interface_param_t));

    if (!param)
        say_exit("Error alloc interface_param_t.");
    
    param->max_connections = SERVERS_MAX_CONNECTION;
    param->port = VERBUM_FORK_CONTROLLER_PORT;

    // Prepare mutex.
    if (pthread_mutex_init(&mutex_workers, NULL) != 0) 
        say_ret(0, "mutex init failed - workers.");

    if (pthread_mutex_init(&mutex_create_proc, NULL) != 0) 
        say_ret(0, "mutex init failed - create proc/fork.");

    // Prepare workers, node list and connection list.
    workers = worker_create_item(0);
    if (!workers)
        say_ret(0, "error create worker item.");

    // Create thread.
    status = pthread_create(&tid, NULL, worker_interface, param);
    if (status != 0)
        say_ret(0, "error creating thread - Fork Controller.");

    infinite_loop();
}

static void prepare_fork_data (void)
{
	if (global.configuration.node.id) {
		free(global.configuration.node.id);
		global.configuration.node.id = NULL;
	}
}

static void *node_mapper_monitor_th (void *_param)
{
	nm_param_t *param = (nm_param_t *) _param;
	char address [] = LOCALHOST;
	int sock = -1, status = 0;
	char *response = NULL;
	char message[]= "no-data:" VERBUM_EOH;

	say("Node Mapper monitor started!");
	say("Node Mapper server port: %d", param->node_mapper_port);

	while (1) {
		status = 0;
		sock   = check_protocol(address, param->node_mapper_port, 1, 1);

		if (sock != -1) {
			response = send_raw_data(sock, message);
			if (response) {
				status = 1;
				mem_sfree(response);
			}

			close(sock);
		}

		if (!status)
			open_node_mapper();

		sleep(1);
	}
	
	return NULL;
}

static void open_node_mapper (void)
{
    pthread_t tid;
    pthread_create(&tid, NULL, start_verbum_node_mapper, NULL);
}

static void *start_verbum_node_mapper (void *param)
{
    open_application(VERBUM_NODE_MAPPER_APPLICATION);
}

void *worker_interface (void *tparam)
{
    say("Fork Controller interface - started!");

    interface_param_t *param = (interface_param_t *) tparam;
    struct sockaddr_in address, client;
    socklen_t client_size;
    int ssock = -1, nsock = -1, status = -1, block = 0;
    const int enable = 1;
    thread_worker_t *worker;
    pthread_t tid1;

	prepare_fork_data();

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

    if (!prepare_workers())
        say_exit("Error prepare workers.");

    say("Fork Controller server port: %d", param->port);

	// Open Node Mapper monitor.
	nm_param_t *param_mth = (nm_param_t *) malloc (sizeof(nm_param_t));
	param_mth->node_mapper_port = global.configuration.node_mapper.server_port;
	pthread_create(&tid1, NULL, node_mapper_monitor_th, param_mth);

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

int prepare_workers (void)
{
    thread_worker_t *worker;
    int status = -1, result = 1;

    // Prepare items.
    for (int a=1; a<FC_THREAD_LIMIT; a++) {
        thread_worker_t *new_worker = worker_create_item(a);

        if (!new_worker) {
            say("error allocationg memory.");
            result = 0;
            break;
        }

        if (!worker_insert_item(new_worker)) {
            say("error insert worker item.");
            result = 0;
            break;
        }
    }

    if (result == 0)
        goto pw_end;

    // Prepare threads.
    pthread_mutex_lock(&mutex_workers);
    
    for (worker=workers; worker!=NULL; worker=worker->next) {
        worker_param_t *param = (worker_param_t *) malloc(sizeof(worker_param_t));

        if (!param) {
            say("error allocating memory.");
            result = 0;
            break;
        }
        
        // Worker ID.
        param->wid = worker->wid;
        
        status = pthread_create(&worker->tid, NULL, worker_handler, param);

        if (status != 0) {
            say("error while creating thread - worker handler.");
            result = 0;
            break;
        }
    }

    pthread_mutex_unlock(&mutex_workers);

    pw_end:
    return result;
}

thread_worker_t *worker_create_item (int wid)
{
    thread_worker_t * worker;
    mem_alloc_ret(worker, sizeof(thread_worker_t), thread_worker_t *, NULL);

    worker->wid    = wid;
    worker->sock   = -1;
    worker->status = 0;
    worker->next   = NULL;

    return worker;
}

int worker_insert_item (thread_worker_t *new_worker)
{
    if (!new_worker)
        return 0;

    pthread_mutex_lock(&mutex_workers);
    thread_worker_t *worker = workers;

    while (1) {
        if (!worker->next) {
            worker->next = new_worker;
            break;
        }

        worker = worker->next;
    }

    pthread_mutex_unlock(&mutex_workers);
    return 1;
}

void *worker_handler (void *tparam)
{
    worker_param_t  *param = (worker_param_t *) tparam;
    thread_worker_t *worker;
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

                pthread_mutex_lock(&mutex_create_proc);

                create_verbum_node(response);
                usleep(100000);

                pthread_mutex_unlock(&mutex_create_proc);
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
	open_application(VERBUM_NODE_APPLICATION);
	return NULL;
}


