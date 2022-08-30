
#ifndef VERBUM_NODE
#define VERBUM_NODE

#include "global.h"
#include "node-global.h"

#define create_thread_controller(HANDLER)                                                                   \
    do {                                                                                                    \
        int status = 0;                                                                                     \
        pthread_t tid;                                                                                      \
        node_param_t *param = (node_param_t *) malloc(sizeof(node_param_t));                                \
                                                                                                            \
        if (!param)                                                                                         \
            debug_exit("error allocating memory.");                                                         \
                                                                                                            \
        param->path = NULL;                                                                                \
        param->max_connections = SERVERS_MAX_CONNECTION;                                                    \
        param->node_mapper_port = global.configuration.node_mapper.server_port;                             \
                                                                                                            \
        memory_scopy(global.configuration.path, param->path);                                               \
                                                                                                            \
        if ((status = pthread_create(&tid, NULL, HANDLER, param)) !=0)                                      \
            debug_exit("error while creating thread - Verbum Node interface, client and server.");          \
    } while (0)

void verbum_node (void);

#endif


