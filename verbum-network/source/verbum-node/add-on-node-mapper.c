
#include "add-on-node-mapper.h"

extern node_param_t *nc_param;

int add_node_on_node_mapper (void)
{
    char address [] = LOCALHOST;
    char *id        = NULL;
    
    while (1) {
        id = process_generate_node_id(
                address, nc_param->node_mapper_port, nc_param->information.port);
        
        if (id)
            break;

        usleep(1000);
    }

    mem_scopy_ret(id, nc_param->information.id, 0);
    mem_sfree(id);

    return 1;
}


