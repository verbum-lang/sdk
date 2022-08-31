
#ifndef VERBUM_NODE_MAPPER
#define VERBUM_NODE_MAPPER

#include "global.h"

// Show/hide debug messages.
#define NMDBG

#define NM_THREAD_LIMIT 10

// Thread param control.
typedef struct {
    int port;                           // Server port.
    int max_connections;                // Server max connections.
} interface_param_t;

typedef struct {
    int wid;                            // Worker ID.
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

void node_mapper (void);
void * node_mapper_interface (void *tparam);
void prepare_workers (void);
thread_worker_t * worker_create_item (int wid);
void worker_insert_item (thread_worker_t *new_worker);
void * worker_handler (void *tparam);

#endif


