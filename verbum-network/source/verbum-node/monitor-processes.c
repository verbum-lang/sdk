
#include "monitor-processes.h"

int monitor_processes (void)
{
    int status = -1;
    pthread_t tid;
    prepare_param_t *prepare_param;

    #ifdef MONITOR_ENABLE_NODE_MAPPER
        say("Monitor Processes started!");

        mem_alloc_ret(prepare_param, sizeof(prepare_param_t), prepare_param_t *, 0);

        prepare_param->path             = NULL;
        prepare_param->node_mapper_port = global.configuration.node_mapper.server_port;    
        mem_scopy_ret(global.configuration.path, prepare_param->path, 0);

        status = pthread_create(&tid, NULL, monitor_processes_handler, prepare_param);
        if (status != 0)
            say_ret(0, "error while creating thread - control of Node Mapper and Fault Tolerance.");
    #endif

    return 1;
}

void *monitor_processes_handler (void *param)
{
    prepare_param_t *prepare_param = (prepare_param_t *) param;
    open_processes(prepare_param->path);

    #ifdef MONITOR_ENABLE_PERSISTENCE
        while (1) {            
            check_connection_interface(
                prepare_param->path, prepare_param->node_mapper_port);
            sleep(1);
        }
    #endif
}

void open_processes (char *path)
{
    pid_t pid = check_process_running("verbum-node-mapper");
    if (pid == -1)
        system_execution_noret("verbum-node-mapper -c \"%s\" &", path);
}

void check_connection_interface (char *path, int node_mapper_port)
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

        pid_t pid = check_process_running("verbum-node-mapper");
        if (pid == -1)
            system_execution_noret("verbum-node-mapper -c \"%s\" &", path);
        else {
            sleep(MONITOR_DELAY_TO_KILL);
            status = check_protocol(address, node_mapper_port, 1);

            if (status == 0) {
                #ifdef MONITOR_DBG
                    say("Node Mapper kill process.");
                #endif
                
                kill(pid, SIGKILL);
            } else {
                #ifdef MONITOR_DBG
                    say("success check protocol.");
                #endif
            }
        }

        usleep(1000);
    }

    #ifdef MONITOR_DBG
        say("Node Mapper online.");
    #endif
}


