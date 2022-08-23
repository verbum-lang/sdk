
#ifndef VERBUM_NODE_GLOBAL
#define VERBUM_NODE_GLOBAL

typedef struct {
    char *path;
    int node_mapper_port;
    int max_connections;

    // Node information.
    struct {
        char *id;
        int port; // Interface port.
    } information;
} node_param_t;

#endif


