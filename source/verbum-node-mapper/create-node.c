
#include "create-node.h"
#include "node-control.h"
#include "generate-node-id.h"

extern node_control_t *node_mapper_nodes;
extern pthread_mutex_t node_mapper_mutex_nodes;

int node_mapper_create_node (int sock, char *content)
{
    pthread_t tid;
    node_control_t *node;

    char response [] = VERBUM_DEFAULT_SUCCESS VERBUM_EOH;
    int status       = -1, found = 0, size = 0;
    char address []= LOCALHOST;
    char *node_param = NULL;
    char *ptr = NULL, *id = NULL;
    char prefix []= "create-verbum-node:";

    if (!sock || !content)
        return 0;

    say("creating verbum node...");

    ptr = strstr(content, prefix);
    if (!ptr)
        return 0;

    ptr += strlen(prefix);
    
    // Check node ID exists.
    if (ptr && strlen(ptr) > 0) {
        mem_salloc_scopy(ptr, node_param);
        
        pthread_mutex_lock(&node_mapper_mutex_nodes);

        for (node=node_mapper_nodes; node!=NULL; node=node->next) {
            if (node->status != 1)
                continue;
            if (!node->id) 
                continue;

            if (strcmp(node->id, ptr) == 0) {
                found = 1;
                break;
            }
        }

        pthread_mutex_unlock(&node_mapper_mutex_nodes);

        if (found) {
            make_id:
            id = node_mapper_generate_new_id();
            if (!id) 
                goto make_id;

            size = sizeof(char) * (strlen(id) + 1);
            node_param = (char *) realloc(node_param, size);
            
            if (!node_param) {
                mem_sfree(id);
                goto make_id;
            }

            memset(node_param, 0, size);
            memcpy(node_param, id, strlen(id));

            mem_sfree(id);
        }
    }

	while (1) {
		if (process_create_node(address, VERBUM_FORK_CONTROLLER_PORT, node_param))
			break;
		else
			say("Error creating new node by Verbum Node Mapper.");

        // usleep(100000);
	}

    status = send(sock, response, strlen(response), VERBUM_SEND_FLAGS);
    mem_sfree(node_param);

    return 1;
}


