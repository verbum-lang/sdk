
#ifndef VERBUM_NODE_INTERFACE
#define VERBUM_NODE_INTERFACE

#include "global.h"
#include "node-global.h"

// Debug messages.
// #define NCDBG
// #define NCDBG_PING

// Thread workers limit.
#define NC_THREAD_LIMIT 10

// Thread param.
typedef struct {
    int wid;                            // Worker ID.
    char *nid;                          // Node ID.
    int interface_port;                 // Node interface port.
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

void            *node_core               (void *tparam);
int              add_node_on_node_mapper (void);
int              ping_node_action        (void);
void            *ping_node_handler       (void *tparam);
int              prepare_workers         (char *id, int interface_port);
thread_worker_t *worker_create_item      (int wid);
int              worker_insert_item      (thread_worker_t *new_worker);
void            *worker_handler          (void *tparam);

#endif


