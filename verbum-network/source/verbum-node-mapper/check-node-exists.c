
#include "check-node-exists.h"
#include "node-control.h"

extern node_control_t *nodes;
extern pthread_mutex_t mutex_nodes;

int check_node_exists (int sock, char *content)
{
    #ifdef NMDBG
        say("check verbum node exists.");
    #endif

    char tmp[1024], prefix [] = "check-verbum-node-exists:";
    char response_error    [] = VERBUM_DEFAULT_ERROR   VERBUM_EOH;
    char address           [] = LOCALHOST;
    char *ptr = NULL, *response_success = NULL;
    int bytes = 0, status = 0, counter = 0;
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
    pthread_mutex_lock(&mutex_nodes);
    
    for (node=nodes; node!=NULL; node=node->next) {
        if (node->status != 1)
            continue;

        if (strcmp(node->id, tmp) == 0) {
            
            // Send message to node.
            while (1) {
                char *response = process_check_node_exists(address, node->port, node->id);
                if (response) {
                    if (strstr(response, VERBUM_DEFAULT_SUCCESS)) {
                        
                        // Copy response.
                        mem_scopy_goto(response, response_success, cne_end);
                        mem_sfree(response);
                        
                        status = 1;
                        break;
                    }

                    mem_sfree(response);
                }
 
                usleep(1000);
                counter++;
                if (counter >= 3)
                    break;
            }
            break;
        }
    }

    pthread_mutex_unlock(&mutex_nodes);

    // Finish.
    cne_end:

    if (!status) {
        bytes = send(sock, response_error, strlen(response_error), 0);
        return 0;
    }

    bytes = send(sock, response_success, strlen(response_success), 0);
    return 1;
}


