
#ifndef VERBUM_NODE_MAPPER
#define VERBUM_NODE_MAPPER

#include "global.h"

// Thread workers limit.
#define NM_THREAD_LIMIT 200

// Thread param.
typedef struct {
    char *id;                           // Node Mapper ID.
    int port;                           // Server port.
    int max_connections;                // Server max connections.
    char *path;                         // Configuration file path.
} interface_param_t;

// Thread param.
typedef struct {
    int wid;                            // Worker ID.
    char *nm_id;                        // Node Mapper ID.
    char *path;                         // Configuration file path.
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

int              node_mapper             (void);
int              prepare_node_mapper     (void);
int              prepare_timeout_control (void);
void            *node_mapper_interface   (void *tparam);
int              prepare_workers         (char *path, char *nm_id);
thread_worker_t *worker_create_item      (int wid);
int              worker_insert_item      (thread_worker_t *new_worker);
void            *worker_handler          (void *tparam);

#endif


