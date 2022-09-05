
#include "global.h"

pthread_mutex_t mutex_nodes = PTHREAD_MUTEX_INITIALIZER;
node_control_t *nodes = NULL;

node_control_t *node_create_item (void)
{
    node_control_t *node;
    mem_alloc_ret(node, sizeof(node_control_t), node_control_t *, NULL);

    node->status = 0;
    node->port   = 0;
    node->id     = NULL;
    node->next   = NULL;
    memset(node->last_connect_date, 0x0, 100);

    return node;
}

int node_insert_item (node_control_t *new_node)
{
    if (!new_node)
        return 0;

    pthread_mutex_lock(&mutex_nodes);
    node_control_t *node = nodes;

    while (1) {
        if (!node->next) {
            node->next = new_node;
            break;
        }

        node = node->next;
    }

    pthread_mutex_unlock(&mutex_nodes);
    return 1;
}


