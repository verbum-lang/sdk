
#ifndef VERBUM_NODE_CONNECTION
#define VERBUM_NODE_CONNECTION

#include "global.h"
#include "node-global.h"

#define VERBUM_NODE_CONNECTION_SEC_TIMEOUT 100000

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

    int checking_direct;                // Checking direct Node Mapper connection
                                        //  0 = Check wait.
                                        //  1 = Check complete.
                                        
    int delete_enabled;                 // Delete connection, kill thread handle.

    pthread_t tid_ping_controller;      // Thread handle - Ping controller.
    int tr_ping_controller_enabled;     // 0 = Disabled, 1 = Enabled.
    int tr_kill_thread;                 // 0 = No, 1 = Yes (kill).

    int running;                        // Connection ping in use.
    struct node_connection_st *next;    // Next node pointer.

    // Connection informations.
    char *id;                           // Connection ID.
    char *remote_id;                    // Remote client connection ID (server connections).
    int type;                           // Type:
                                        //  0 = output.
                                        //  1 = input.
    char *dst_node_id;                  // Destination / target node ID.
    char *dst_nm_id;                    // Destination Node Mapper ID. 
    char *dst_nm_address;               // Destination Node Mapper address (IP).
    int   dst_nm_port;                  // Destination Node Mapper interface port.
    int dst_node_sv_port;               // Destination node server port.
    int dst_nm_direct;                  // Checks if Node Mapper accepts direct connection.
                                        //  0 = No.
                                        //  1 = Yes.

    char last_connect_date [100];       // Last connected date.
} node_connection_t;

void              *node_connection        (void *tparam);
node_connection_t *connection_create_item (int prepare_thread);
int                connection_insert_item (node_connection_t *new_connection);

#endif


