
#ifndef VERBUM_NODE_MAPPER_INTERFACE
#define VERBUM_NODE_MAPPER_INTERFACE

#include "global.h"

typedef struct {
    char *path;
    int port;
    int max_connections;
} nm_interface_param_t;

void node_mapper_interface (void);
void * node_mapper_interface_handler (void *tparam);

#endif


