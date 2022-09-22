
#include "create-node.h"

static void *start_verbum_node (void *_param);

int node_mapper_create_node (int sock, char *path)
{
    pthread_t tid;

    if (!sock)
        return 0;

    #ifdef NMDBG
        say("create verbum node - called.");
    #endif

    char response [] = VERBUM_DEFAULT_SUCCESS VERBUM_EOH;
    int status       = -1;

    // open_application(VERBUM_NODE_APPLICATION);
    // system_execution_ret(0, "verbum-node -c \"%s\" &", path);
    pthread_create(&tid, NULL, start_verbum_node, NULL);

    status = send(sock, response, strlen(response), VERBUM_SEND_FLAGS);
    return 1;
}

static void *start_verbum_node (void *_param)
{
	open_application(VERBUM_NODE_APPLICATION);
}


