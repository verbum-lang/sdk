
#include "monitor-processes.h"
#include "../../verbum-node-mapper/include/node-mapper.h"

static void *monitor_processes_handler  (void *param);
static void  check_connection_interface (int node_mapper_port);

int monitor_processes (void)
{
    int status = -1;
    pthread_t tid;
    prepare_param_t *prepare_param;

    #ifdef MONITOR_ENABLE_NODE_MAPPER
        say("Monitor Processes started!");

        mem_alloc_ret(prepare_param, sizeof(prepare_param_t), prepare_param_t *, 0);
        prepare_param->node_mapper_port = global.configuration.node_mapper.server_port;    

        status = pthread_create(&tid, NULL, monitor_processes_handler, prepare_param);
        if (status != 0)
            say_ret(0, "error creating thread - control of Monitor Processes.");
    #endif

    return 1;
}

static void *monitor_processes_handler (void *param)
{
    prepare_param_t *prepare_param = (prepare_param_t *) param;

    initialize_node_mapper();

    #ifdef MONITOR_ENABLE_PERSISTENCE
        while (1) {            
            check_connection_interface(prepare_param->node_mapper_port);
            sleep(1);
        }
    #endif
}

static void check_connection_interface (int node_mapper_port)
{
    char address [] = LOCALHOST;
    int status      = -1, sock = -1;

    // Node Mapper.
    #ifdef MONITOR_DBG
        say("Node Mapper - checking...");
        say("Node Mapper - server port: %d", node_mapper_port);
    #endif

    while (!check_protocol(address, node_mapper_port, 1))
    {
        #ifdef MONITOR_DBG
            say("failed check protocol.");
        #endif

        initialize_node_mapper();
        sleep(1);
    }

    #ifdef MONITOR_DBG
        say("Node Mapper online.");
    #endif
}


