
#ifndef VERBUM_NODE_MAPPER
#define VERBUM_NODE_MAPPER

#include "global.h"

// Show/hide debug messages.
#define NMDBG

typedef struct {
    char *id;
    char last_connect_date[100]; // d-m-Y h:m:s
} node_control_t;

typedef struct {
    char *path;
    int port;
    int max_connections;
} interface_param_t;

void node_mapper                        (void);
void node_mapper_interface              (void);
void * node_mapper_interface_handler    (void *tparam);
void nm_process_communication           (int sock);
void add_new_node                       (int sock, char *content);
char * generate_new_id                  (void);
void update_ping_node                   (int sock, char *content);

#endif


