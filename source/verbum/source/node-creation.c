
#include "node-creation.h"

static void *start_new_node (void *_param);

void initialize_node_creation (void)
{
	// Create new node.
	pthread_t tid2;
	nm_param_t *param = (nm_param_t *) malloc (sizeof(nm_param_t));

	param->node_mapper_port = global.configuration.node_mapper.server_port;
	param->node_id = NULL;

	if (global.configuration.node.id)
		mem_salloc_scopy(global.configuration.node.id, param->node_id);
	
	pthread_create(&tid2, NULL, start_new_node, param);
}

static void *start_new_node (void *_param)
{
	nm_param_t *param = (nm_param_t *) _param;
	char address []= LOCALHOST;

	say("Creating new node by Verbum...");
	say("NM port: %d", param->node_mapper_port);

	while (1) {
		if (process_create_node(address, param->node_mapper_port, param->node_id))
			break;
		else
			say("Error creating new node by Verbum.");

		usleep(100000);
	}

	say("New node created by Verbum.");
	exit(0);
}


