
#ifndef VERBUM_MONITOR_PROCESSES
#define VERBUM_MONITOR_PROCESSES

#include "global.h"

// Show/hide monitor debug messages.
// Show = defined, hide = undefined.
// #define MONITOR_DBG

// Enable/disable Node Mapper.
#define MONITOR_ENABLE_NODE_MAPPER

// Enable/disable persistence (process).
// #define MONITOR_ENABLE_PERSISTENCE

// Delay (sec) to kill a process (Node Mapper).
#define MONITOR_DELAY_TO_KILL 3

typedef struct {
    char *path;
    int node_mapper_port;
} prepare_param_t;

void monitor_processes              (void);
void check_processes                (void);
void * monitor_processes_handler    (void *param);
void open_processes                 (char *path);
void check_connection_interface     (char *path, int node_mapper_port);

#endif


