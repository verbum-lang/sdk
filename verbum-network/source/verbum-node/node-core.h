
#ifndef VERBUM_NODE_INTERFACE
#define VERBUM_NODE_INTERFACE

#include "global.h"
#include "node-global.h"

// Debug messages.
#define NCDBG
// #define NCDBG_PING

void *node_core               (void *tparam);
int   add_node_on_node_mapper (void);
int   ping_node_action        (void);
void *ping_node_handler       (void *tparam);
void  delete_node             (int sock, char *content);

#endif


