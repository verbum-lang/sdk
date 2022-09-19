
#ifndef VERBUM_NODE_MONITOR_PROCESSES
#define VERBUM_NODE_MONITOR_PROCESSES

#include "global.h"

// #define MONITOR_DBG

// Enable/disable Node Mapper.
#define MONITOR_ENABLE_NODE_MAPPER

// Enable/disable persistence (process).
#define MONITOR_ENABLE_PERSISTENCE

typedef struct {
    int node_mapper_port;
} prepare_param_t;

int monitor_processes (void);

#endif


