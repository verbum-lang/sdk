
#include "node-mapper.h"
#include "node-control.h"
#include "connection-control.h"
#include "communication.h"
#include "timeout-control.h"

static int                prepare_mutex           (void);
static int                prepare_data_control    (void);
static int                prepare_interface       (void);
static int                prepare_timeout_control (void);
static void              *worker_interface        (void *tparam);


static int                prepare_workers         (char *nm_id);
static worker_t          *worker_create_item      (int wid);
static int                worker_insert_item      (worker_t *new_worker);
static void              *worker_handler          (void *tparam);

static pthread_mutex_t    mutex_workers           = PTHREAD_MUTEX_INITIALIZER;
static worker_t          *workers                 = NULL;

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

    if (!prepare_data_control())
        say_ret(0, "Error preparing data control.");

    if (!prepare_interface())
        say_ret(0, "Error preparing Node Mapper interface.");

    if (!prepare_timeout_control())
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

static int prepare_data_control (void)
{
    workers = worker_create_item(0);
    if (!workers)
        say_ret(0, "Error create worker control.");
    
    node_mapper_nodes = nm_node_create_item();
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

    if (pthread_create(&tid, NULL, worker_interface, param) != 0)
        say_ret(0, "Error creating thread - control of Node Mapper interface.");

    return 1;
}

static int prepare_timeout_control (void)
{
    pthread_t tid;

    if (pthread_create(&tid, NULL, timeout_control, NULL) != 0)
        say_ret(0, "Error creating thread - timeout control (nodes and connections).");

    return 1;
}

static void *worker_interface (void *tparam)
{
    say("Node mapper interface - started!");

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
        say_ret(NULL, "setsockopt (SO_REUSEADDR) failed.");

    status = bind(ssock, (struct sockaddr*) &address, sizeof(address));
    if (status != 0)
        say_exit("error bind server.");

    if (listen(ssock, param->max_connections) != 0) 
        say_exit("error listen server.");

    if (!prepare_workers(param->id))
        say_exit("error prepare workers.");

    say("ID: %s", param->id);
    say("Server port: %d", param->port);

    while (1) {
        
        // Process connection.
        client_size = sizeof(client);
        nsock       = accept(ssock, (struct sockaddr*) &client, &client_size);
        
        if (nsock != -1) {

            #ifdef NMDBG
                say("connection accepted!");
            #endif

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

        } else {
            char strerr [256];
            #define case_item(ITEM) case ITEM: sprintf(strerr, #ITEM); break

            switch (errno) {
                case_item(EAGAIN);
                case_item(EBADF);
                case_item(ECONNABORTED);
                case_item(EFAULT);
                case_item(EINTR);
                case_item(EINVAL);
                case_item(EMFILE);
                case_item(ENFILE);
                case_item(ENOBUFS);
                case_item(ENOMEM);
                case_item(ENOTSOCK);
                case_item(EOPNOTSUPP);
                case_item(EPERM);
                case_item(EPROTO);
                case_item(ENOSR);
                case_item(ESOCKTNOSUPPORT);
                case_item(EPROTONOSUPPORT);
                case_item(ETIMEDOUT);
            }

            say("Verbum Node Mapper, error accept client: %s - %s", strerr, strerror(errno));
        }
    }

    close(ssock);
    return NULL;
}

static int prepare_workers (char *nm_id)
{
    worker_t *worker;
    int status = -1, size = 0, result = 1;

    if (!nm_id)
        return 0;

    // Prepare items.
    for (int a=1; a<VNM_WORKER_THREAD_LIMIT; a++) {
        worker_t *new_worker = worker_create_item(a);

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
        nm_worker_param_t *param = (nm_worker_param_t *) malloc(sizeof(nm_worker_param_t));

        if (!param) {
            say("error allocating memory.");
            result = 0;
            break;
        }
        
        // Node Mapper ID.
        mem_salloc_scopy(nm_id, param->nm_id);

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

static worker_t *worker_create_item (int wid)
{
    worker_t * worker;
    mem_alloc_ret(worker, sizeof(worker_t), worker_t *, NULL);

    worker->wid    = wid;
    worker->sock   = -1;
    worker->status = 0;
    worker->next   = NULL;

    return worker;
}

static int worker_insert_item (worker_t *new_worker)
{
    if (!new_worker)
        return 0;

    pthread_mutex_lock(&mutex_workers);
    worker_t *worker = workers;

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

static void *worker_handler (void *tparam)
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
            node_mapper_process_communication(sock, nm_id);

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


