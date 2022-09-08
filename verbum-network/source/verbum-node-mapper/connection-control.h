
#ifndef VERBUM_CONNECTION_CONTROL
#define VERBUM_CONNECTION_CONTROL

#include "global.h"

// Node connections struct control.
typedef struct node_connection_st {
    int status;                         // Status control.
    char *id;                           // Connection ID.
    int type;                           // Type:
                                        //  0 = output.
                                        //  1 = input.
    char *src_node_id;                  // Source node ID.
    char *dst_node_id;                  // Destination / target node ID.
    char *dst_nm_id;                    // Destination Node Mapper ID. 
    char *dst_nm_address;               // Destination Node Mapper address (IP).
    int   dst_nm_port;                  // Destination Node Mapper interface port.
    char *last_connect_date;            // Last connection date.

    struct node_connection_st *next;    // Next node pointer.
} node_connection_t;

node_connection_t *connection_create_item (void);
int                connection_insert_item (node_connection_t *new_connection);

#endif


