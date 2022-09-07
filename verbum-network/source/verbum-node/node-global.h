
#ifndef VERBUM_NODE_GLOBAL
#define VERBUM_NODE_GLOBAL

// Thread workers limit.
#define NC_THREAD_LIMIT 10

typedef struct {
    char *path;
    int node_mapper_port;
    int max_connections;

    // Node information.
    struct {
        char *id;
        int port; // Interface port.
    } information;
} node_param_t;

// Thread param.
typedef struct {
    int wid;                            // Worker ID.
    char *nid;                          // Node ID.
    int interface_port;                 // Node interface port.
    int server_port;                    // Node server port.
} worker_param_t;

// Thread workers control.
typedef struct thread_worker_st {
    pthread_t tid;                      // Thread ID.
    int wid;                            // Worker ID.
    int status;                         // Status:
                                        //  0 = free to use.
                                        //  1 = started by controller.
                                        //  2 = running.
    int sock;                           // Current client socket.
    struct thread_worker_st *next;      // Next node pointer.
} thread_worker_t;

#endif


