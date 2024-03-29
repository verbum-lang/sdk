
#include "check-node-exists.h"
#include "node-control.h"

extern node_control_t *node_mapper_nodes;
extern pthread_mutex_t node_mapper_mutex_nodes;

int node_mapper_check_node_exists (int sock, char *content)
{
    #ifdef NMDBG
        say("check verbum node exists.");
    #endif

    char tmp[1024], prefix [] = "check-verbum-node-exists:";
    char response_error    [] = VERBUM_DEFAULT_ERROR   VERBUM_EOH;
    char address           [] = LOCALHOST;
    char *ptr = NULL, *response_success = NULL;
    char *response = NULL;
    int bytes = 0, status = 0, counter = 0, limit = 5, core_port = 0;
    node_control_t *node;

    if (!sock || !content)
        return 0;

    // Extract node ID.
    ptr = strstr(content, prefix);
    if (!ptr) 
        return 0;

    ptr += strlen(prefix);
    memset(tmp, 0x0, 1024);
    memcpy(tmp, ptr, strlen(ptr));

    // Search node.
    pthread_mutex_lock(&node_mapper_mutex_nodes);

    for (node=node_mapper_nodes; node!=NULL; node=node->next) {
        if (node->status != 1)
            continue;

        if (strcmp(node->id, tmp) == 0) {
            status = 1;
            core_port = node->core_port;
            break;
        }
    }

    pthread_mutex_unlock(&node_mapper_mutex_nodes);
            
    // Send message to node (core port).
    if (status == 1) {
        status = 0;

        while (1) {
            response = process_check_node_exists(address, core_port, tmp);
            if (response) {
                if (strstr(response, VERBUM_DEFAULT_SUCCESS)) {
                    
                    // Copy response.
                    mem_scopy_goto(response, response_success, error);
                    mem_sfree(response);
                    
                    status = 1;
                    break;
                }

                mem_sfree(response);
            }

            counter++;
            if (counter >= limit)
                break;
        }
    }

    // Finish.
    if (!status) {
        mem_sfree(response_success);
        return 0;
    }

    bytes = send(sock, response_success, strlen(response_success), VERBUM_SEND_FLAGS);
    mem_sfree(response_success);
    return 1;

    error:
    mem_sfree(response_success);
    return 0;
}


