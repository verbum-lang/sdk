
#include "ping-node-mapper.h"

extern node_param_t *nc_param;

int ping_node_action (void)
{
    int status = -1;
    node_param_t *lparam;
    pthread_t tid;

    mem_alloc_ret(lparam, sizeof(node_param_t), node_param_t *, 0);
    mem_scopy_ret(nc_param->information.id, lparam->information.id, 0);

    lparam->information.port = nc_param->information.port;
    lparam->node_mapper_port = nc_param->node_mapper_port;

    status = pthread_create(&tid, NULL, ping_node_handler, lparam);
    if (status != 0)
        say_ret(0, "error while creating thread - ping node controller.");

    return 1;
}

void *ping_node_handler (void *tparam)
{
    node_param_t *lparam = (node_param_t *) tparam;
    char address [] = LOCALHOST;
    
    say("node ping handler:");
    say("node id: %s", lparam->information.id);
    say("node port (interface): %d", lparam->information.port);

    while (1) {
        char *response = 
            process_ping_node(address, lparam->node_mapper_port, 
                lparam->information.id, lparam->information.port);
        
        if (response) {
            #ifdef NCDBG_PING
                say("ping response: %s", response);
            #endif

            mem_sfree(response);
        }

        sleep(NODE_PING_LOOP_SEC_DELAY);
    }
}


