
#include "node-control.h"

pthread_mutex_t  nm_mutex_nodes = PTHREAD_MUTEX_INITIALIZER;
node_control_t  *nm_nodes       = NULL;

node_control_t *nm_node_create_item (void)
{
    node_control_t *node;
    mem_alloc_ret(node, sizeof(node_control_t), node_control_t *, NULL);

    node->status                = 0;
    node->core_port             = 0;
    node->server_port           = 0;
    node->id                    = NULL;
    node->next                  = NULL;
    node->offline_by_timeout    = 0;
    memset(node->last_connect_date, 0x0, 100);

    return node;
}

int nm_node_insert_item (node_control_t *new_node)
{
    if (!new_node)
        return 0;

    pthread_mutex_lock(&nm_mutex_nodes);
    node_control_t *node = nm_nodes;

    while (1) {
        if (!node->next) {
            node->next = new_node;
            break;
        }

        node = node->next;
    }

    pthread_mutex_unlock(&nm_mutex_nodes);
    return 1;
}


