
#include "create-node.h"

int create_node (int sock, char *path)
{
    if (!sock || !path)
        return 0;

    #ifdef NMDBG
        say("create verbum node - called.");
    #endif

    char response [] = VERBUM_DEFAULT_SUCCESS "\r\n\r\n";
    int status       = -1;

    system_execution_ret(0, "verbum-node -c \"%s\" &", path);

    status = send(sock, response, strlen(response), VERBUM_SEND_FLAGS);
    return 1;
}


