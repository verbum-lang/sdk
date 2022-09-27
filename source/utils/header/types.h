
#ifndef _H_UTILS_TYPES_
#define _H_UTILS_TYPES_

#include "global.h"

/**
 * Simplifications.
 */

typedef pthread_mutex_t p_mutex_t;


/**
 * General purpose type for parameters in threads.
 */

typedef struct {
	char *id;
    int   port;
    int   max_connections;
} param_t;

#define prepare_thread_param(PARAM)                                            \
    do {                                                                       \
        PARAM = (param_t *) malloc(sizeof(param_t));                           \
        if (!PARAM)                                                            \
            say_exit("Error allocating parameter to thread.");                 \
                                                                               \
        PARAM->max_connections = SERVERS_MAX_CONNECTIONS;                      \
        PARAM->port = 0;                                                       \
        PARAM->id = NULL;                                                      \
    } while (0)


/**
 * Type for workers control.
 */

typedef struct worker_s {
    pthread_t tid;                      // Thread ID.
    int wid;                            // Worker ID.
    int status;                         // Status:
                                        //      0 = free to use.
                                        //      1 = started by controller.
                                        //      2 = running.
    int sock;                           // Current client socket.
    struct worker_s *next;              // Next item.
} worker_t;





// Thread param.
typedef struct {
    int wid;                            // Worker ID.
    char *nm_id;                        // Node Mapper ID.
    char *path;                         // Configuration file path.
    char *cid;                          // Connection ID.
} worker_param_t, node_connection_param_t;


#endif /* _H_UTILS_TYPES_ */


