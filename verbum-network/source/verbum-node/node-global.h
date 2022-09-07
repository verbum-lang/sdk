
#ifndef VERBUM_NODE_GLOBAL
#define VERBUM_NODE_GLOBAL

// Verbum node interfaces handshake.
#define VERBUM_NODE_HANDSHAKE "Verbum Node - v1.0.0 - I Love Jesus <3\r\n\r\n"

// Thread workers limit.
#define NC_THREAD_LIMIT 10

// Global configurations.
typedef struct {

    // General information.
    char *path;                         // Configuration file path.
    int node_mapper_port;               // Node Mapper interface port.
    int max_connections;                // Max connection support to created servers.

    // Node information.
    struct {
        char *id;                       // Node ID.
        int core_port;                  // Node Core interface port.
        int server_port;                // Node server connection interface port.
    } information;
} node_config_t;

// Worker types.
typedef struct {
    int wid;                            // Worker ID.
} worker_param_t;

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

// Connections types.
typedef struct node_connection_st {
    int id;                             // Connection ID.
    int status;                         // Status (struct item):
                                        //  0 = free to use.
                                        //  1 = started by controller.
                                        //  2 = running (in use).

    // Control / flags.
    int connection_status;              // Status (connection):
                                        //  0 = waiting response.
                                        //  1 = success.
                                        //  2 = error.

    // Connection informations.
    int type;                           // Type:
                                        //  0 = output.
                                        //  1 = input.
    char *src_node_id;                  // Source node ID.
    char *dst_node_id;                  // Destination node ID.
    char *dst_nm_id;                    // Destination Node Mapper ID. 
    char *dst_nm_address;               // Destination Node Mapper address (IP).
    char *dst_nm_port;                  // Destination Node Mapper interface port.

    struct node_connection_st *next;    // Next node pointer.
} node_connection_t;

#endif


