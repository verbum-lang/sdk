
#ifndef VERBUM_NODE_INTERFACE
#define VERBUM_NODE_INTERFACE

#include "global.h"
#include "node-global.h"

// Debug messages.
#define NCDBG

void * node_core             (void *tparam);
void add_node_on_node_mapper (void);
void ping_node_action        (void);
void * ping_node_handler     (void *tparam);

#endif


