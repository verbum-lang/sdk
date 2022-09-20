
#ifndef VERBUM_NM_CONNECTION_CONTROL
#define VERBUM_NM_CONNECTION_CONTROL

#include "global.h"

// Node connections struct control.
typedef struct connection_s {
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
    int dst_node_sv_port;               // Destination node server port.
    char last_connect_date [100];       // Last connection date.
    int connection_error;               // Error.
    int connection_error_count;         // Error count.
    int dst_nm_direct;                  // Checks if Node Mapper accepts direct connection.
                                        //  0 = No.
                                        //  1 = Yes.

    struct connection_s *next;          // Next item.
} connection_t;

connection_t *nm_connection_create_item (void);
int           nm_connection_insert_item (connection_t *new_connection);

#endif


