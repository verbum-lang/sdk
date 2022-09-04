
#ifndef VERBUM_NODE_MAPPER
#define VERBUM_NODE_MAPPER

#include "global.h"

// Show/hide debug messages.
// #define NMDBG

// Thread workers limit.
#define NM_THREAD_LIMIT 100

// Thread param control.
typedef struct {
    int port;                           // Server port.
    int max_connections;                // Server max connections.
    char *path;                         // Configuration file path.
} interface_param_t;

typedef struct {
    int wid;                            // Worker ID.
    char *path;                         // Configuration file path.
} worker_param_t;

// Thread workers control.
typedef struct thread_worker_st {
    pthread_t tid;                      // Thread ID.
    int wid;                            // Worker ID.
    int status;                         // Status:
                                        //  0 = free to use.
                                        //  1 = started by controller.
                                        //  2 = running.
    int sock;                           // Current client socket.
    struct thread_worker_st *next;      // Next node pointer.
} thread_worker_t;

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

void node_mapper                        (void);
void * node_mapper_interface            (void *tparam);
void prepare_workers                    (char *path);
thread_worker_t * worker_create_item    (int wid);
void worker_insert_item                 (thread_worker_t *new_worker);
void * worker_handler                   (void *tparam);
int send_handshake                      (int sock);
void process_communication              (int sock, char *path);
char * get_client_request               (int sock);
node_control_t * node_create_item       (void);
void node_insert_item                   (node_control_t *new_node);
void add_new_node                       (int sock, char *content);
char * generate_new_id                  (void);
void update_ping_node                   (int sock, char *content);
void get_node_list                      (int sock);
void create_node                        (int sock, char *path);
void delete_node                        (int sock, char *content);
void create_node_client_connection      (int sock, char *content);
void create_node_server_connection      (int sock, char *content);

#endif


