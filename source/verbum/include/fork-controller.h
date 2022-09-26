
#ifndef VERBUM_FORK_CONTROLLER
#define VERBUM_FORK_CONTROLLER

#include "global.h"


// Thread workers limit.
#define FC_THREAD_LIMIT 33

// Thread param.
typedef struct {
    int port;
    int max_connections;                // Server max connections.
} interface_param_t;

typedef struct {
	int node_mapper_port;
	char *node_id;
} nm_param_t;

int initialize_fork_controller (void);

#endif


