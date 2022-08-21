
#ifndef VERBUM_NODE
#define VERBUM_NODE

#include "global.h"

typedef struct {
    char *path;
    int node_mapper_port;
    int fault_tolerance_port;
} node_param_t;

void verbum_node        (void);
void create_node        (void);
void * node_handler     (void *tparam);

#endif


