
#include "create-node.h"

int node_mapper_create_node (int sock, char *path)
{
    pthread_t tid;

    if (!sock)
        return 0;

    say("creating verbum node...");

    char response [] = VERBUM_DEFAULT_SUCCESS VERBUM_EOH;
    int status       = -1;
    char address []= LOCALHOST;
    
	while (1) {
		if (process_create_node(address, VERBUM_FORK_CONTROLLER_PORT))
			break;
		else
			say("Error creating new node by Verbum Node Mapper.");
	}

    status = send(sock, response, strlen(response), VERBUM_SEND_FLAGS);
    return 1;
}


