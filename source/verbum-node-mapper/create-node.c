
#include "create-node.h"

int node_mapper_create_node (int sock, char *content)
{
    pthread_t tid;

    if (!sock || !content)
        return 0;

    say("creating verbum node...");

    char response [] = VERBUM_DEFAULT_SUCCESS VERBUM_EOH;
    int status       = -1;
    char address []= LOCALHOST;
    char *node_param = NULL;
    char *ptr = NULL;
    char prefix []= "create-verbum-node:";

    ptr = strstr(content, prefix);
    if (!ptr)
        return 0;

    ptr += strlen(prefix);
    mem_salloc_scopy(ptr, node_param);

	while (1) {
		if (process_create_node(address, VERBUM_FORK_CONTROLLER_PORT, node_param))
			break;
		else
			say("Error creating new node by Verbum Node Mapper.");
	}

    status = send(sock, response, strlen(response), VERBUM_SEND_FLAGS);
    mem_sfree(node_param);

    return 1;
}


