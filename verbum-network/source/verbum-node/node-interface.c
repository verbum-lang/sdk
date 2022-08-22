
#include "node-interface.h"

void * node_interface (void *tparam)
{
    node_param_t param = *( (node_param_t *) (tparam) );

    say("node interface controller - started!");
}


