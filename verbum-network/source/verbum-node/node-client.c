
#include "node-client.h"

void * node_client (void *tparam)
{
    node_param_t param = *( (node_param_t *) (tparam) );

    say("node client controller - started!");
}


