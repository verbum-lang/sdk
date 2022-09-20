
#include "node-mapper.h"
#include "node-control.h"
#include "connection-control.h"
#include "communication.h"
#include "timeout-control.h"

static int           prepare_mutex      (void);
static int           prepare_data       (void);
static int           prepare_interface  (void);
static void         *prepare_server     (void *_param);
static int           prepare_workers    (char *node_mapper_id);
static worker_t     *create_worker      (int worker_id);
static int           insert_worker      (worker_t *n_worker);
static int           server_connections (int ssock);
static int           process_client     (int sock);
static void         *worker_controller  (void *_param);

static p_mutex_t     mutex_workers     = PTHREAD_MUTEX_INITIALIZER;
static worker_t     *workers           = NULL;

extern node_t       *node_mapper_nodes;
extern p_mutex_t     node_mapper_mutex_nodes;
extern p_mutex_t     node_mapper_mutex_connections;
extern connection_t *node_mapper_connections;

int initialize_node_mapper (void)
{
    say_debug("Verbum Node Mapper started.");

    if (!ignore_sigpipe())
        say_ret(0, "Error ignoring SIGPIPE.");

    if (!prepare_mutex())
        say_ret(0, "Error preparing mutex.");

    if (!prepare_data())
        say_ret(0, "Error preparing data control.");

    if (!prepare_interface())
        say_ret(0, "Error preparing Node Mapper interface.");

    if (!prepare_timeout())
        say_ret(0, "Error preparing timeout control.");

    return 1;
}

static int prepare_mutex (void)
{
    if (pthread_mutex_init(&mutex_workers, NULL) != 0) 
        say_ret(0, "Mutex initializing failed - Workers.");

    if (pthread_mutex_init(&node_mapper_mutex_nodes, NULL) != 0) 
        say_ret(0, "Mutex initializing failed - Nodes.");

    if (pthread_mutex_init(&node_mapper_mutex_connections, NULL) != 0) 
        say_ret(0, "Mutex initializing failed - Connections.");

    return 1;
}

static int prepare_data (void)
{
    workers = create_worker(0);
    if (!workers)
        say_ret(0, "Error create worker control.");
    
    node_mapper_nodes = create_node();
    if (!node_mapper_nodes)
        say_ret(0, "Error create node control.");

    node_mapper_connections = nm_connection_create_item();
    if (!node_mapper_connections)
        say_ret(0, "Error create connection control.");

    return 1;
}

static int prepare_interface (void)
{
    pthread_t tid;
    param_t *param;

    mem_alloc_ret(param, sizeof(param_t), param_t *, 0);

    param->max_connections = SERVERS_MAX_CONNECTION;
    param->port            = global.configuration.node_mapper.server_port;
    mem_scopy_ret(global.configuration.node_mapper.id, param->id, 0);

    if (pthread_create(&tid, NULL, prepare_server, param) != 0)
        say_ret(0, "Error creating thread - control of Node Mapper interface.");

    return 1;
}

static void *prepare_server (void *_param)
{
    param_t *param = (param_t *) _param;
    
    int sock = prepare_server_socket(param->port, param->max_connections);
    if (sock == -1)
        say_exit("Error creating server socket.");

    if (!prepare_workers(param->id))
        say_exit("Error preparing workers.");

    say("Node Mapper ID: %s",   param->id);
    say("Node Mapper port: %d", param->port);

    server_connections(sock);
}

static int server_connections (int ssock)
{
    sockaddr_in_t client;
    socklen_t size;
    int sock;

    if (!ssock)
        return 0;

    while (1) {        
        size = sizeof(client);
        sock = accept(ssock, (struct sockaddr*) &client, &size);
        
        if (sock == -1) 
            show_accept_error();
        else {
            set_recv_timeout(sock);

            if (!process_client(sock))
                close(sock);
        }
    }
}

static int process_client (int sock)
{
    worker_t *worker;
    int status = 0;

    if (!sock)
        return 0;

    pthread_mutex_lock(&mutex_workers);
    
    for (worker=workers; worker!=NULL; worker=worker->next) {
        if (worker->status == 0) {

            // Send signal do worker.
            worker->status = 1;
            worker->sock   = sock;

            status = 1;
            break;
        }
    }

    pthread_mutex_unlock(&mutex_workers);
    return status;
}

static int prepare_workers (char *node_mapper_id)
{
    worker_t *worker;
    wparam_t *param;

    if (!node_mapper_id)
        return 0;

    // Prepare items.
    for (int a=1; a<VNM_WORKER_THREAD_LIMIT; a++) {
        worker = create_worker(a);
        if (!worker) 
            say_ret(0, "Error creating worker item.");

        if (!insert_worker(worker))
            say_ret(0, "Error inserting worker item.");
    }

    // Prepare worker threads.
    pthread_mutex_lock(&mutex_workers);
    
    for (worker=workers; worker!=NULL; worker=worker->next) {
        param = (wparam_t *) malloc(sizeof(wparam_t));
        if (!param)
            say_ret(0, "Error allocating memory (worker param).");
        
        mem_salloc_scopy(node_mapper_id, param->node_mapper_id);
        param->wid = worker->wid;
        
        if (pthread_create(&worker->tid, NULL, worker_controller, param) != 0) 
            say_ret(0, "Error creating thread - worker controller.");
    }

    pthread_mutex_unlock(&mutex_workers);
    return 1;
}

static worker_t *create_worker (int wid)
{
    worker_t * worker;
    mem_alloc_ret(worker, sizeof(worker_t), worker_t *, NULL);

    worker->wid    = wid;
    worker->sock   = -1;
    worker->status = 0;
    worker->next   = NULL;

    return worker;
}

static int insert_worker (worker_t *n_worker)
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

static void *worker_controller (void *_param)
{
    wparam_t *param = (wparam_t *) _param;
    worker_t *worker;
    int wid, run, sock;

    do {
        // Checks if there is order to execute thread.
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

        if (!run) {
            usleep(VERBUM_USLEEP_GENERAL);
            continue;
        }

        // Process actions.
        if (send_handshake(sock, VERBUM_NODE_MAPPER_HANDSHAKE))
            node_mapper_communication(sock, param->node_mapper_id);

        // Finish.
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
    } while (1);
}


