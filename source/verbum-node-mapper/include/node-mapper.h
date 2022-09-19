
#ifndef VERBUM_NM_NODE_MAPPER
#define VERBUM_NM_NODE_MAPPER

#include "global.h"

// Thread workers limit.
#define NM_THREAD_LIMIT 200

// Thread param.
typedef struct {
    char *id;                           // Node Mapper ID.
    int port;                           // Server port.
    int max_connections;                // Server max connections.
} interface_param_t;

// Thread param.
typedef struct {
    int wid;                            // Worker ID.
    char *nm_id;                        // Node Mapper ID.
} nm_worker_param_t;

int node_mapper (void);
int verbum_node_mapper (void);

#endif


