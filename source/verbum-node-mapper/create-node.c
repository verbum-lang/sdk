
#include "create-node.h"
#include "../verbum-node/node.h"

int create_node (int sock)
{
    if (!sock)
        return 0;

    #ifdef NMDBG
        say("create verbum node - called.");
    #endif

    char response [] = VERBUM_DEFAULT_SUCCESS VERBUM_EOH;
    int status       = -1;

    create_new_verbum_node();

    status = send(sock, response, strlen(response), VERBUM_SEND_FLAGS);
    return 1;
}


