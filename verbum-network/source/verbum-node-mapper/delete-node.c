
#include "delete-node.h"
#include "node-control.h"

extern node_control_t *nodes;
extern pthread_mutex_t mutex_nodes;

int delete_node (int sock, char *content)
{
    if (!sock || !content)
        return 0;

    #ifdef NMDBG
        say("delete verbum node.");
    #endif

    char tmp[1024], prefix [] = "delete-verbum-node:";
    char response_success  [] = VERBUM_DEFAULT_SUCCESS VERBUM_EOH;
    char response_error    [] = VERBUM_DEFAULT_ERROR   VERBUM_EOH;
    char address           [] = LOCALHOST;
    char *ptr = NULL;
    int bytes = 0, status = 0, counter = 0;
    node_control_t *node;

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
            
            // Send request to node.
            while (1) {
                char *response = process_delete_node(address, node->port, node->id);
                if (response) {
                    if (strstr(response, VERBUM_DEFAULT_SUCCESS)) {
                        mem_sfree(response);
                        break;
                    }

                    mem_sfree(response);
                }
 
                usleep(1000);
                counter++;
                if (counter >= 3)
                    break;
            }

            status = 1;
            node->status = 0;
            break;
        }
    }

    pthread_mutex_unlock(&mutex_nodes);

    // Finish.
    dn_end:

    if (!status) {
        bytes = send(sock, response_error, strlen(response_error), 0);
        return 0;
    }

    bytes = send(sock, response_success, strlen(response_success), 0);
    return 1;
}


