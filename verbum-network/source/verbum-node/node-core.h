
#ifndef VERBUM_NODE_INTERFACE
#define VERBUM_NODE_INTERFACE

#include "global.h"
#include "node-global.h"

// Debug messages.
#define NCDBG
// #define NCDBG_PING

void * node_core             (void *tparam);
void add_node_on_node_mapper (void);
void ping_node_action        (void);
void * ping_node_handler     (void *tparam);
char * get_client_request    (int sock);
int send_handshake           (int sock);
void delete_node             (int sock, char *content);

#endif


