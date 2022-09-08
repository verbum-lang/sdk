
#ifndef VERBUM_NODE_CONNECTION
#define VERBUM_NODE_CONNECTION

#include "global.h"
#include "node-global.h"

// Connections types.
typedef struct node_connection_st {

    // Control flags, and others.
    int status;                         // Status (struct item):
                                        //  0 = free to use.
                                        //  1 = started by controller.
                                        //  2 = running / active (in use).

    int connection_status;              // Status (connection):
                                        //  0 = inactive.
                                        //  1 = data exists - process connection.
                                        //  2 = success.
                                        //  3 = error.

    int ping_controller_enabled;        // Activate ping controller.
                                        //  0 = Innactive.
                                        //  1 = Active.

    int connection_error;               // Error control.
                                        //  0 = No errors.
                                        //  1 = Error found.
    int connection_error_count;         // Total erros.

    pthread_t tid_ping_controller;      // Thread handle - Ping controller.
    struct node_connection_st *next;    // Next node pointer.

    // Connection informations.
    char *id;                           // Connection ID.
    int type;                           // Type:
                                        //  0 = output.
                                        //  1 = input.
    char *dst_node_id;                  // Destination / target node ID.
    char *dst_nm_id;                    // Destination Node Mapper ID. 
    char *dst_nm_address;               // Destination Node Mapper address (IP).
    int   dst_nm_port;                  // Destination Node Mapper interface port.

    char last_connect_date [100];       // Last connected date.
} node_connection_t;

void              *node_connection        (void *tparam);
node_connection_t *connection_create_item (void);
int                connection_insert_item (node_connection_t *new_connection);

#endif


