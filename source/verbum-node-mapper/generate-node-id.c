
#include "generate-node-id.h"
#include "node-control.h"

extern node_control_t *nm_nodes;
extern pthread_mutex_t nm_mutex_nodes;

char *generate_new_id (void)
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

    pthread_mutex_lock(&nm_mutex_nodes);

    for (node=nm_nodes; node!=NULL; node=node->next) {
        if (node->status != 1)
            continue;
        if (!node->id) 
            continue;

        if (strcmp(node->id, tmp) == 0) {
            found = 1;
            break;
        }
    }

    pthread_mutex_unlock(&nm_mutex_nodes);

    if (found == 1)
        return generate_new_id();

    mem_scopy_ret(tmp, id, NULL);
    memset(tmp, 0x0, 1024);

    return id;    
}

