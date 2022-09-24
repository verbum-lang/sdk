
#include "monitor-processes.h"

static void *monitor_processes_handler (void *param);
static void  open_process              (void);
static void *start_verbum_node_mapper  (void *param);

int monitor_processes (void)
{
    return 1;
    
    int status = -1;
    pthread_t tid;
    prepare_param_t *prepare_param;

    #ifdef MONITOR_ENABLE_NODE_MAPPER
        say("Monitor Processes started!");

        mem_alloc_ret(prepare_param, sizeof(prepare_param_t), prepare_param_t *, 0);

        prepare_param->path             = NULL;
        prepare_param->node_mapper_port = global.configuration.node_mapper.server_port;    

        status = pthread_create(&tid, NULL, monitor_processes_handler, prepare_param);
        if (status != 0)
            say_ret(0, "error creating thread - control of Node Mapper Monitor.");
    #endif

    return 1;
}

static void *monitor_processes_handler (void *param)
{
    prepare_param_t *prepare_param = (prepare_param_t *) param;
    char address [] = LOCALHOST;

    #ifdef MONITOR_ENABLE_PERSISTENCE
        while (1) {
            if (!check_protocol(address, prepare_param->node_mapper_port, 1)) 
                open_process();

            sleep(1);
        }
    #endif
}

static void open_process (void)
{
    pthread_t tid;
    pthread_create(&tid, NULL, start_verbum_node_mapper, NULL);
}

static void *start_verbum_node_mapper (void *param)
{
    open_application(VERBUM_NODE_MAPPER_APPLICATION);
}


