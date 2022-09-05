
#include "ping-node.h"
#include "node-control.h"

extern node_control_t *nodes;
extern pthread_mutex_t mutex_nodes;

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
    node_control_t *node_information;
    node_control_t *node;

    date = make_datetime();
    if (!date)
        return 0;

    ptr = strstr(content, prefix);
    if (!ptr) 
        goto upn_end;

    node_information = node_create_item();
    if (!node_information)
        goto upn_end;

    node_information->status = 1;
    sprintf(node_information->last_connect_date, "%s", date);

    // Extract request node informations.
    ptr += strlen(prefix);
    memset(tmp, 0x0, 1024);

    for (int a=0,b=0; ptr[a] != '\0'; a++) {
        if (ptr[a] == ':') {
            mem_scopy_ret(tmp, node_information->id, 0);

            b = 0;
            a++;
            memset(tmp, 0x0, 1024);
        }

        tmp[b++] = ptr[a];
    }

    node_information->port = atoi(tmp);

    // Search node.
    pthread_mutex_lock(&mutex_nodes);

    for (node=nodes; node!=NULL; node=node->next) {
        if (node->status != 1)
            continue;
        if (!node->id) 
            continue;
        if (!node_information->id)
            continue;

        if (strcmp(node->id, node_information->id) == 0) {
            
            // Update node information.
            memset(node->last_connect_date, 0x0, 100);
            sprintf(node->last_connect_date, "%s", date);
            found = 1;

            break;
        }
    }

    pthread_mutex_unlock(&mutex_nodes);

    // New existing node.
    if (found == 0) {
        if (!node_insert_item(node_information))
            say_ret(0, "error insert node item.");
    }
    else {
        mem_sfree(node_information->id);
        free(node_information);
    }

    bytes = send(sock, response, strlen(response), 0);

    upn_end:
    mem_sfree(date);
    return 1;
}


