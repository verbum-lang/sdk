
#ifndef VERBUM_FAULT_TOLERANCE
#define VERBUM_FAULT_TOLERANCE

#include "global.h"

typedef struct {
    char *path;
    int port;
    int max_connections;
} interface_param_t;

void fault_tolerance                        (void);
void fault_tolerance_interface              (void);
void * fault_tolerance_interface_handler    (void *tparam);

#endif


