
#ifndef VERBUM_NODE_NODE_CONTROL
#define VERBUM_NODE_NODE_CONTROL

#include "global.h"

// Client-node struct control.
typedef struct node_control_st {
    int status;                         // Status node (1: enabled, 0: disabled).
    char *id;                           // Node unique identification.
    int core_port;                      // Node core interface port.
    int server_port;                    // Node server interface port.
    char last_connect_date [100];       // d-m-Y h:m:s
    int offline_by_timeout;             // Offline by timeout (0 = not, 1 = yes).
    struct node_control_st *next;       // Next node pointer.
} node_control_t;

node_control_t *node_create_item (void);
int             node_insert_item (node_control_t *new_node);

#endif


