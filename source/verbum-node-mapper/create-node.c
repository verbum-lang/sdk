
#include "create-node.h"

static void *start_verbum_node (void *_param);

int node_mapper_create_node (int sock, char *path)
{
    pthread_t tid;

    if (!sock)
        return 0;

    say("creating verbum node...");

    char response [] = VERBUM_DEFAULT_SUCCESS VERBUM_EOH;
    int status       = -1;

    pthread_create(&tid, NULL, start_verbum_node, NULL);

    status = send(sock, response, strlen(response), VERBUM_SEND_FLAGS);
    return 1;
}

static void *start_verbum_node (void *_param)
{
	open_application(VERBUM_NODE_APPLICATION);
}


