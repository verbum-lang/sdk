
#ifndef VERBUM_NODE
#define VERBUM_NODE

#include "global.h"
#include "node-global.h"

// #define create_thread_controller(PREFIX) \
//     do { \
//         int status = 0; \
//         pthread_t tid##PREFIX; \
//         \
//         param##PREFIX.node_mapper_port = global.configuration.node_mapper.server_port; \
//         param##PREFIX.fault_tolerance_port = global.configuration.fault_tolerance.server_port; \
//         memory_scopy(global.configuration.path, param##PREFIX.path); \
//         \
//         if ((status = pthread_create(&tid##PREFIX, NULL, node_##PREFIX, &param##PREFIX)) !=0) \
//             debug_exit("error while creating thread - Verbum Node interface, client and server."); \
//     } while (0)

// #define create_thread_params(P1, P2, P3) \
//     node_param_t param##P1; \
//     node_param_t param##P2; \
//     node_param_t param##P3  \

// create_thread_params(interface, client, server);

void verbum_node (void);

#endif


