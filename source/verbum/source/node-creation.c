
#include "node-creation.h"

static void *start_new_node (void *_param);

extern global_t global;

void initialize_node_creation (void)
{
	pthread_t tid;
	param_t *param;

	prepare_thread_param(param);
	param->node_mapper_port = global.configuration.node_mapper.server_port;

	if (global.configuration.node.id)
		mem_salloc_scopy(global.configuration.node.id, param->node_id);
	
	pthread_create(&tid, NULL, start_new_node, param);
}

static void *start_new_node (void *_param)
{
	param_t *param = (param_t *) _param;

	say("Creating a new node using the Verbum utility...");
	say("Connecting to Node Mapper server port: %d", param->node_mapper_port);

	while (1) {
		if (process_create_node(LOCALHOST, param->node_mapper_port, param->node_id))
			break;
		else
			say("Error creating node using Verbum utility.");

		usleep(100000);
	}

	say("New node successfully created using the Verbum utility.");
	exit(0);
}


