
#include "ping-node.h"
#include "node-control.h"

extern node_t *node_mapper_nodes;
extern p_mutex_t node_mapper_mutex_nodes;

int update_ping_node (int sock, char *content)
{
    if (!sock || !content)
        return 0;

    #ifdef NMDBG
        say("ping verbum node.");
    #endif
    
    char prefix   [] = "ping-verbum-node:";
    char response [] = VERBUM_DEFAULT_SUCCESS VERBUM_EOH;
    char tmp [1024];
    char *ptr = NULL, *date = NULL;
    int bytes = 0, index = -1, found = 0, size = 0;
    int brk = 0;
    node_t *node_information;
    node_t *node;

    date = make_datetime();
    if (!date)
        return 0;

    ptr = strstr(content, prefix);
    if (!ptr) 
        goto error;

    node_information = create_node();
    if (!node_information)
        goto error;

    node_information->status = 1;
    sprintf(node_information->last_connect_date, "%s", date);

    // Extract request node informations.
    memset(tmp, 0x0, 1024);

    for (int a=0,b=0,c=0,d=0; content[a] != '\0'; a++) {
        if (b == 0 && content[a] == ':')
            b = 1; // Enable.

        else if (b == 1) {
            if (content[a] == ':') {
                switch (d) {

                    // Node ID.
                    case 0:
                        mem_scopy_ret(tmp, node_information->id, 0);
                        break;
                    
                    // Core port.
                    case 1:
                        node_information->core_port = atoi(tmp);
                        break;
                    
                    default:
                        brk = 1;
                }

                if (brk == 1)
                    break;

                c = 0;
                d++;
                memset(tmp, 0x0, 1024);
            } 

            else
                tmp[c++] = content[a];
        }
    }

    // Server port.
    if (tmp)
        if (strlen(tmp) > 0)
            node_information->server_port = atoi(tmp);

    // Search node.
    pthread_mutex_lock(&node_mapper_mutex_nodes);

    for (node=node_mapper_nodes; node!=NULL; node=node->next) {
        if (node->status != 1)
            continue;
        if (!node->id) 
            continue;
        if (!node_information->id)
            continue;

        // Update node information.
        if (strcmp(node->id, node_information->id) == 0) {
            
            // Date.
            memset(node->last_connect_date, 0x0, 100);
            sprintf(node->last_connect_date, "%s", date);

            // Core port.
            node->core_port = node_information->core_port;

            // Server port.
            node->server_port = node_information->server_port;

            found = 1;
            break;
        }
    }

    pthread_mutex_unlock(&node_mapper_mutex_nodes);

    // New node.
    if (found == 0) {
        if (!insert_node(node_information)) {
            say("error add node.");

            mem_sfree(node_information->id);
            free(node_information);
        }
    }
    
    else {
        mem_sfree(node_information->id);
        free(node_information);
    }

    bytes = send(sock, response, strlen(response), VERBUM_SEND_FLAGS);
    
    success:
    mem_sfree(date);
    return 1;

    error:
    mem_sfree(date);
    return 0;
}


