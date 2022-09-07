
#include "ping-node-mapper.h"

extern pthread_mutex_t  mutex_gconfig;
extern node_config_t   *gconfig;

int ping_node_action (void)
{
    int status = -1;
    pthread_t tid;

    status = pthread_create(&tid, NULL, ping_node_handler, NULL);
    if (status != 0)
        say_ret(0, "error while creating thread - ping node controller.");

    return 1;
}

void *ping_node_handler (void *tparam)
{
    char address [] = LOCALHOST;
    char *id = NULL;
    int node_mapper_port = 0, interface_port = 0, size = 0;
    
    pthread_mutex_lock(&mutex_gconfig);

    say("node ping controller:");
    say("node id: %s", gconfig->information.id);
    say("node port (interface): %d", gconfig->information.core_port);

    // Ports.
    node_mapper_port = gconfig->node_mapper_port;
    interface_port   = gconfig->information.core_port;

    // Node ID.
    size = sizeof(char) * (strlen(gconfig->information.id) + 1);
    id = (char *) malloc(size);

    if (!id) {
        pthread_mutex_unlock(&mutex_gconfig);
        debug_print("error allocating memory.");
        return NULL;
    }

    memset(id, 0x0, strlen(gconfig->information.id));
    memcpy(id, gconfig->information.id, strlen(gconfig->information.id));

    pthread_mutex_unlock(&mutex_gconfig);

    while (1) {
        char *response = 
            process_ping_node(address, node_mapper_port, id, interface_port);
        
        if (response) {
            #ifdef NCDBG_PING
                say("ping response: %s", response);
            #endif

            mem_sfree(response);
        }

        sleep(NODE_PING_LOOP_SEC_DELAY);
    }
}


