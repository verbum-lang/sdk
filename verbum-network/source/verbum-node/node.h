
#ifndef VERBUM_NODE
#define VERBUM_NODE

#include "global.h"
#include "node-global.h"

#define create_thread_controller(HANDLER)                                                                   \
    do {                                                                                                    \
        int status = -1;                                                                                    \
        pthread_t tid;                                                                                      \
        node_param_t *param;                                                                                \
                                                                                                            \
        mem_alloc_ret(param, sizeof(node_param_t), node_param_t *, 0);                                      \
                                                                                                            \
        param->path             = NULL;                                                                     \
        param->max_connections  = SERVERS_MAX_CONNECTION;                                                   \
        param->node_mapper_port = global.configuration.node_mapper.server_port;                             \
                                                                                                            \
        mem_scopy_ret(global.configuration.path, param->path, 0);                                           \
                                                                                                            \
        status = pthread_create(&tid, NULL, HANDLER, param);                                                \
        if (status != 0)                                                                                    \
            say_ret(0, "error while creating thread - Verbum Node interface, client and server.");          \
    } while (0)

int verbum_node (void);

#endif


