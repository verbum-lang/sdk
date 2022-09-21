
#include "generate-node-id.h"
#include "node-control.h"

extern node_control_t *node_mapper_nodes;
extern pthread_mutex_t node_mapper_mutex_nodes;

char *node_mapper_generate_new_id (void)
{
    char *id = NULL;
    char tmp [1024];
    int limit = 24, found = 0, size = 0;
    node_control_t *node;

    memset(tmp, 0x0, 1024);
    sprintf(tmp, "verbum-node-%d%d%d", 
        random_number(100, 999),
        random_number(100, 999),
        random_number(100, 999)
    );

    if (strlen(tmp) > limit)
        tmp[limit] = '\0';

    pthread_mutex_lock(&node_mapper_mutex_nodes);

    for (node=node_mapper_nodes; node!=NULL; node=node->next) {
        if (node->status != 1)
            continue;
        if (!node->id) 
            continue;

        if (strcmp(node->id, tmp) == 0) {
            found = 1;
            break;
        }
    }

    pthread_mutex_unlock(&node_mapper_mutex_nodes);

    if (found == 1)
        return node_mapper_generate_new_id();

    mem_scopy_ret(tmp, id, NULL);
    memset(tmp, 0x0, 1024);

    return id;    
}


