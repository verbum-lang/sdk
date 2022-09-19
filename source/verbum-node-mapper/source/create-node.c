
#include "create-node.h"
#include "../../verbum-node/include/node.h"

int create_new_node (int sock)
{
    if (!sock)
        return 0;

    #ifdef NMDBG
        say("create verbum node - called.");
    #endif

    char response [] = VERBUM_DEFAULT_SUCCESS VERBUM_EOH;
    int status       = -1;

    open_application(VERBUM_NODE_APPLICATION);

    status = send(sock, response, strlen(response), VERBUM_SEND_FLAGS);
    return 1;
}


