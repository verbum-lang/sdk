
#ifndef VERBUM_NM
#define VERBUM_NM

#include "global.h"

// Thread param.
typedef struct {
    char *id;                           // Node Mapper ID.
    int port;                           // Server port.
    int max_connections;                // Server max connections.
} param_t;

// Thread param.
typedef struct {
    int wid;                            // Worker ID.
    char *node_mapper_id;
} nm_worker_param_t;

int initialize_node_mapper (void);

#endif


