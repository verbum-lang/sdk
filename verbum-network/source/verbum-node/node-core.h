
#ifndef VERBUM_NODE_INTERFACE
#define VERBUM_NODE_INTERFACE

#include "global.h"
#include "node-global.h"

void * node_core (void *tparam);
void add_node_on_node_mapper (node_param_t *param);
void * ping_node_handler (void *tparam);

#endif


