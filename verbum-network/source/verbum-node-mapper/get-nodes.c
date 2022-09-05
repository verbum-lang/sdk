
#include "get-nodes.h"

extern node_control_t *nodes;
extern pthread_mutex_t mutex_nodes;

int get_node_list (int sock)
{
    if (!sock)
        return 0;

    #ifdef NMDBG
        say("get verbum node list - called.");
    #endif

    char *message = NULL;
    char tmp [1024];
    int size = 0, sts = 0, a = 1;
    node_control_t *node;

    pthread_mutex_lock(&mutex_nodes);
    
    for (node=nodes; node!=NULL; node=node->next) {
        if (node->status != 1)
            continue;

        memset(tmp, 0x0, 1024);
        sprintf(tmp, "node: %d\nid: %s\nport: %d\nlast connection date: %s\n\n", 
            a, node->id, node->port, node->last_connect_date);

        message = (char *) realloc(message, sizeof(char) * (size + strlen(tmp) + 1));
        if (!message)
            say_ret(0, "error alloc memory.");

        memcpy(&message[size], tmp, strlen(tmp));
        size += strlen(tmp);
        sts++;
        a++;
    }

    pthread_mutex_unlock(&mutex_nodes);

    if (sts)
        message[size] = '\0';
    else {
        size = 256;
        mem_salloc_ret(message, size, 0);
        sprintf(message, "nodes not found.\n");
        size = strlen(message);
    }

    sts = send(sock, message, size, 0);
    mem_sfree(message);
    return 1;
}


