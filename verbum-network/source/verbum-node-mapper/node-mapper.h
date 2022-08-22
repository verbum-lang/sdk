
#ifndef VERBUM_NODE_MAPPER
#define VERBUM_NODE_MAPPER

#include "global.h"

#define SERVERS_MAX_CONNECTION 1000

typedef struct {
    char *path;
    int port;
    int max_connections;
} interface_param_t;

void node_mapper                        (void);
void node_mapper_interface              (void);
void * node_mapper_interface_handler    (void *tparam);

#endif


