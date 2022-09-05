
#ifndef VERBUM_NODE_MAPPER
#define VERBUM_NODE_MAPPER

#include "global.h"

int              node_mapper           (void);
void            *node_mapper_interface (void *tparam);
int              prepare_workers       (char *path);
thread_worker_t *worker_create_item    (int wid);
int              worker_insert_item    (thread_worker_t *new_worker);
void            *worker_handler        (void *tparam);

#endif


