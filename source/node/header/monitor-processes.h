
#ifndef VERBUM_N_MONITOR_PROCESSES
#define VERBUM_N_MONITOR_PROCESSES

#include "global.h"

// Enable/disable Node Mapper.
// #define MONITOR_ENABLE_NODE_MAPPER

// Enable/disable persistence (process).
#define MONITOR_ENABLE_PERSISTENCE

typedef struct {
    char *path;
    int node_mapper_port;
} prepare_param_t;

int monitor_processes (void);

#endif


