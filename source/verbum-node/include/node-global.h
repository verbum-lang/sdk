
#ifndef VERBUM_NODE_N_GLOBAL
#define VERBUM_NODE_N_GLOBAL

#include "global.h"

// Verbum node interfaces handshake.
#define VERBUM_NODE_HANDSHAKE "Verbum Node - v1.0.0 - I Love Jesus <3\r\n\r\n"

// Thread workers limit (Node Core, Node Server).
#define NC_THREAD_LIMIT 10

// Global configurations.
typedef struct {

    // General information.
    char *path;                         // Configuration file path.
    char *node_mapper_id;               // Node Mapper ID.
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
    char *cid;                          // Connection ID.
} node_worker_param_t, node_connection_param_t;

#endif


