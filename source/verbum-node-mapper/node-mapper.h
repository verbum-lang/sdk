
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
    char *path;                         // Configuration file path.
} interface_param_t;

int node_mapper (void);

#endif


