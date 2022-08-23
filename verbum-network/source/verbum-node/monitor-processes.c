
#include <dirent.h>
#include <sys/types.h>
#include <signal.h>

#include "monitor-processes.h"

void monitor_processes (void)
{
    int status = 0;
    pthread_t tid;

    prepare_param_t *prepare_param = (prepare_param_t *) malloc(sizeof(prepare_param_t));
    if (!prepare_param)
        debug_exit("error allocating memory.");

    prepare_param->path = CNULL;
    prepare_param->node_mapper_port = global.configuration.node_mapper.server_port;    
    memory_scopy(global.configuration.path, prepare_param->path);

    if ((status = pthread_create(&tid, NULL, monitor_processes_handler, prepare_param)) !=0)
        debug_exit("error while creating thread - control of Node Mapper and Fault Tolerance.");
}

void check_processes (void) 
{
    check_connection_interface(
        global.configuration.path,
        global.configuration.node_mapper.server_port
    );
}

void * monitor_processes_handler (void *param)
{
    prepare_param_t *prepare_param = (prepare_param_t *) param;
    open_processes(prepare_param->path);

    while (1) {
        check_connection_interface(
            prepare_param->path, prepare_param->node_mapper_port);
        sleep(1);
    }
}

void open_processes (char *path)
{
    #ifdef MONITOR_ENABLE_NODE_MAPPER
        system_execution("verbum-node-mapper -c \"%s\" &", path);
    #endif
}

void check_connection_interface (char *path, int node_mapper_port)
{
    char address []= LOCALHOST;
    int status = 0;

    // Node Mapper.
    #ifdef MONITOR_ENABLE_NODE_MAPPER
    #ifdef MONITOR_DBG
        say("Node Mapper - checking...");
        say("Node Mapper - server port: %d", node_mapper_port);
    #endif

    while(!check_connection_banner_nm(address, node_mapper_port)) 
    {
        pid_t pid = check_process_running("verbum-node-mapper");
        if (pid == -1)
            system_execution("verbum-node-mapper -c \"%s\" &", path);
        else {
            sleep(MONITOR_DELAY_TO_KILL);
            status = check_connection_banner_nm(address, node_mapper_port);

            if (status == 0) {
                #ifdef MONITOR_DBG
                    say("Node Mapper kill process.");
                #endif
                
                kill(pid, SIGKILL);
            }
        }
    }

    #ifdef MONITOR_DBG
        say("Node Mapper online.");
    #endif
    #endif
}


