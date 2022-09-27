
#ifndef VERBUM_TYPES
#define VERBUM_TYPES

#include "global.h"

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

// Thread param.
typedef struct {
    int wid;                            // Worker ID.
    char *nm_id;                        // Node Mapper ID.
    char *path;                         // Configuration file path.
    char *cid;                          // Connection ID.
} worker_param_t, node_connection_param_t;


/**
 * General purpose type for parameters in threads.
 */

typedef struct {
	int node_mapper_port;
	char *node_id;
} param_t;

#define prepare_thread_param(PARAM)                                            \
    do {                                                                       \
        PARAM = (param_t *) malloc(sizeof(param_t));                           \
        if (!PARAM)                                                            \
            say_exit("Error allocating parameter to thread.");              \
                                                                               \
        PARAM->node_mapper_port = 0;                                           \
        PARAM->node_id          = NULL;                                        \
    } while (0)

#endif


