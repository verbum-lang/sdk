
#ifndef VERBUM_NM_NODE_CONTROL
#define VERBUM_NM_NODE_CONTROL

#include "global.h"

// Client-node struct control.
typedef struct node_s {
    int status;                     // Status node (1: enabled, 0: disabled).
    char *id;                       // Node unique identification.
    int core_port;                  // Node core interface port.
    int server_port;                // Node server interface port.
    char last_connect_date [100];   // d-m-Y h:m:s
    int offline_by_timeout;         // Offline by timeout (0 = not, 1 = yes).
    struct node_s *next;            // Next item.
} node_t;

node_t *create_node (void);
int     insert_node (node_t *new_node);

#endif


