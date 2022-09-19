
#include "add-on-node-mapper.h"

extern pthread_mutex_t  node_mutex_gconfig;
extern node_config_t   *node_gconfig;

int add_node_on_node_mapper (void)
{
    char nm_address [] = LOCALHOST;
    char *id           = NULL;
    int result         = 0, size = 0;
    int node_mapper_port = 0, core_port = 0;

    pthread_mutex_lock(&node_mutex_gconfig);
    node_mapper_port = node_gconfig->node_mapper_port;
    core_port        = node_gconfig->information.core_port;
    pthread_mutex_unlock(&node_mutex_gconfig);

    while (1) {
        id = process_generate_node_id(nm_address, node_mapper_port, core_port);
        if (id) {

            // Check is valid Verbum Node ID.
            if (strstr(id, "verbum-node-")) {
                for (int a=0; id[a]!='\0'; a++) {
                    switch (id[a]) {
                        case '0': case '1': case '2': case '3': case '4':
                        case '5': case '6': case '7': case '8': case '9': 
                            result = 1;
                            break;
                    }

                    if (result)
                        break;
                }
                
                if (result)
                    break;
            }

            mem_sfree(id);
        }

        usleep(1000);
    }

    // Save generated ID.
    pthread_mutex_lock(&node_mutex_gconfig);   

    size = sizeof(char) * (strlen(id) + 1);
    node_gconfig->information.id = (char *) malloc(size);

    if (!node_gconfig->information.id) {
        say("error allocating memory - Verbum Node ID.");
    } else {
        memset(node_gconfig->information.id, 0x0, size);
        memcpy(node_gconfig->information.id, id, strlen(id));
        result = 1;
    }

    pthread_mutex_unlock(&node_mutex_gconfig);
    
    mem_sfree(id);
    return result;
}


