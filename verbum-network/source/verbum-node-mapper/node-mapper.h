
#ifndef VERBUM_NODE_MAPPER
#define VERBUM_NODE_MAPPER

#include "global.h"

// Show/hide debug messages.
#define NMDBG

// Client-node struct control.
typedef struct node_control_st {
    int status;                         // Status node (1: enabled, 0: disabled).
    char *id;                           // Node unique identification.
    int port;                           // Node interface port.
    char last_connect_date [100];       // d-m-Y h:m:s
    struct node_control_st *next;       // Next node pointer.
} node_control_t;

// Thread param control.
typedef struct {
    char *path;                         // Configuration file path.
    int port;                           // Server port.
    int max_connections;                // Server max connections.
    int sock;                           // Client socket.
} interface_param_t;

void node_mapper                        (void);
void * node_mapper_interface            (void *tparam);
void * node_mapper_interface_handler    (void *tparam);
char * get_client_request               (int sock);
void add_new_node                       (int sock, char *content);
char * generate_new_id                  (void);
void update_ping_node                   (int sock, char *content);
void get_node_list                      (int sock);

#endif


