
#include "node-control.h"

p_mutex_t  node_mapper_mutex_nodes = PTHREAD_MUTEX_INITIALIZER;
node_t  *node_mapper_nodes       = NULL;

node_t *create_node (void)
{
    node_t *node;
    mem_alloc_ret(node, sizeof(node_t), node_t *, NULL);

    node->status                = 0;
    node->core_port             = 0;
    node->server_port           = 0;
    node->id                    = NULL;
    node->next                  = NULL;
    node->offline_by_timeout    = 0;
    memset(node->last_connect_date, 0x0, 100);

    return node;
}

int insert_node (node_t *new_node)
{
    if (!new_node)
        return 0;

    pthread_mutex_lock(&node_mapper_mutex_nodes);
    node_t *node = node_mapper_nodes;

    while (1) {
        if (!node->next) {
            node->next = new_node;
            break;
        }

        node = node->next;
    }

    pthread_mutex_unlock(&node_mapper_mutex_nodes);
    return 1;
}


