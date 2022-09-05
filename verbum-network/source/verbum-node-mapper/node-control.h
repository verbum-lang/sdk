
#ifndef VERBUM_NODE_NODE_CONTROL
#define VERBUM_NODE_NODE_CONTROL

#include "global.h"

// Client-node struct control.
typedef struct node_control_st {
    int status;                         // Status node (1: enabled, 0: disabled).
    char *id;                           // Node unique identification.
    int port;                           // Node interface port.
    char last_connect_date [100];       // d-m-Y h:m:s
    struct node_control_st *next;       // Next node pointer.
} node_control_t;

// Connections struct control.
typedef struct node_connection_st {
    int id;                             // Connection ID.
    char *node_id;                      // Node unique identification.
    int type;                           // Connection type.
                                        //  0 = input.
                                        //  1 = output.
    char *dst_node_id;                  // Destination node ID.
    char *node_mapper_address;          // Destination Node Mapper IP address.
    int node_mapper_port;               // Destination Node Mapper port.
    struct node_connection_st *next;    // Next node pointer.
} node_connection_t;

node_control_t *node_create_item (void);
int             node_insert_item (node_control_t *new_node);

#endif


