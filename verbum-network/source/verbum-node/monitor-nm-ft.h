
#ifndef VERBUM_MONITOR_NM_FT
#define VERBUM_MONITOR_NM_FT

#include "global.h"

// Show/hide monitor debug messages.
// Show = defined, hide = undefined.
// #define MONITOR_DBG

// Enable/disable Node Mapper and Fault Tolerance.
#define MONITOR_ENABLE_NODE_MAPPER

// Delay (sec) to kill a process (NM, FT).
#define MONITOR_DELAY_TO_KILL 3

typedef struct {
    char *path;
    int node_mapper_port;
} prepare_param_t;

void monitor_processes          (void);
void check_nm_ft                (void);
void * prepara_nm_ft_handler    (void *param);
void open_processes             (char *path);
void check_connection_interface (char *path, int node_mapper_port);

#endif


