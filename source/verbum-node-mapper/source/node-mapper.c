
#include "node-mapper.h"
#include "node-control.h"
#include "connection-control.h"
#include "communication.h"
#include "timeout-control.h"

static int                prepare_mutex     (void);
static int                prepare_data      (void);
static int                prepare_interface (void);
static int                prepare_timeout   (void);
static void              *prepare_server    (void *_param);
static int                prepare_workers   (char *node_mapper_id);
static worker_t          *create_worker     (int worker_id);
static int                insert_worker     (worker_t *n_worker);
static void              *worker_controller (void *_param);

static pthread_mutex_t    mutex_workers     = PTHREAD_MUTEX_INITIALIZER;
static worker_t          *workers           = NULL;

extern node_control_t    *node_mapper_nodes;
extern pthread_mutex_t    node_mapper_mutex_nodes;
extern pthread_mutex_t    node_mapper_mutex_connections;
extern node_connection_t *node_mapper_connections;

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

int open_node_mapper_process (void)
{
    int fd, fd_limit;
    pid_t pid;

    pid = fork();

    if (pid < 0)
        say_ret(0, "error open fork.");    
    if (pid > 0)
       return 0;

    if (setsid() < 0)
        say_ret(0, "error setsid.");       

    pid = fork();

    if (pid < 0)
        say_ret(0, "error open fork.");
    if (pid > 0) 
        exit(0);

    // Close all file descriptors.
    fd_limit = (int) sysconf(_SC_OPEN_MAX);

    for (int fd = STDERR_FILENO + 1; fd < fd_limit; fd++) {
#ifndef VNM_BLOCK_FORK_STDOUT
        if (fd != 1)
#endif
        close(fd);
    }

    stdin  = fopen("/dev/null", "r" );
    stderr = fopen("/dev/null", "w+");
    
#ifndef VNM_BLOCK_FORK_STDOUT
    stdout = fopen("/dev/null", "w+");
#endif

    // Ignore child and tty signals.
    signal(SIGCHLD, SIG_IGN);
    signal(SIGTSTP, SIG_IGN);
    signal(SIGTTOU, SIG_IGN);
    signal(SIGTTIN, SIG_IGN);

    if (!initialize_node_mapper())
        exit(0);

    infinite_loop();
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

static int prepare_timeout (void)
{
    pthread_t tid;

    if (pthread_create(&tid, NULL, timeout_controller, NULL) != 0)
        say_ret(0, "Error creating thread - timeout control (nodes and connections).");

    return 1;
}

static void *prepare_server (void *_param)
{
    param_t *param = (param_t *) _param;
    sockaddr_in_t client;
    socklen_t client_size;
    worker_t *worker;
    int ssock, nsock, status;
    
    ssock = prepare_server_socket(param->port, param->max_connections);
    if (ssock == -1)
        say_exit("Error creating server socket.");

    if (!prepare_workers(param->id))
        say_exit("Error preparing workers.");

    say("Node Mapper ID: %s",   param->id);
    say("Node Mapper port: %d", param->port);

    while (1) {
        
        // Process connection.
        client_size = sizeof(client);
        nsock       = accept(ssock, (struct sockaddr*) &client, &client_size);
        
        if (nsock == -1) 
            show_accept_error();
        else {

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

            if (status == 0)
                close(nsock);
        }
    }

    close(ssock);
    return NULL;
}

static int prepare_workers (char *node_mapper_id)
{
    worker_t *worker;
    nm_worker_param_t *param;

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
        param = (nm_worker_param_t *) malloc(sizeof(nm_worker_param_t));
        if (!param)
            say_ret(0, "Error allocating memory (worker param).");
        
        mem_salloc_scopy(node_mapper_id, param->nm_id);
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

static void *worker_controller (void *tparam)
{
    nm_worker_param_t  *param = (nm_worker_param_t *) tparam;
    worker_t *worker;
    int wid = -1, run = 0, sock = -1;
    int status = 0, size = 0;
    char *path = NULL, *nm_id = NULL;

    mem_scopy_ret(param->nm_id, nm_id, NULL);

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

        #ifdef NMDBG
            say("task started!");
        #endif

        /**
         * Process actions.
         */

        status = send_handshake(sock, 
            "Verbum Node Mapper - v1.0.0 - I Love Jesus <3\r\n\r\n");

        if (status == 1)
            node_mapper_communication(sock, nm_id);

        /**
         * Finish.
         */

        w_finish:
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


