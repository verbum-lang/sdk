
#ifndef VERBUM_MONITOR_PROCESSES
#define VERBUM_MONITOR_PROCESSES

#include "global.h"

// #define MONITOR_DBG

// Enable/disable Node Mapper.
#define MONITOR_ENABLE_NODE_MAPPER

// Enable/disable persistence (process).
#define MONITOR_ENABLE_PERSISTENCE

typedef struct {
    char *path;
    int node_mapper_port;
} prepare_param_t;

int   monitor_processes          (void);
void *monitor_processes_handler  (void *param);
void  open_processes             (char *path);
void  check_connection_interface (char *path, int node_mapper_port);

#endif


