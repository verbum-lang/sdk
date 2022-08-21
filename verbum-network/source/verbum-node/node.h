
#ifndef VERBUM_NODE
#define VERBUM_NODE

#include "global.h"

typedef struct {
    char *path;
    int node_mapper_port;
    int fault_tolerance_port;
} prepare_param_t;

void verbum_node                            (void);
void prepare_node_mapper_fault_tolerance    (void);
void check_connection_interface             (char *path, int node_mapper_port, int fault_tolerance_port);
void * prepara_nm_ft_handler                (void *param);
void open_nm_ft_process                     (char *path);

#endif


