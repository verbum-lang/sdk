
#include "verbum.h"
#include "fork-controller.h"

#define VERBUM_LANGUAGE_VERSION "1.0.0"

static void prepare_settings (int argc, char *argv[]);
static void set_default_options (void);
static void check_params (int argc, char *argv[]);
static void usage (void);
static void *start_new_node (void *_param);

int initialization (int argc, char *argv[]) 
{
    say("Verbum started.");

    prepare_settings(argc, argv);

    print("Node ID.........: %s", global.configuration.node.id);
    print("Node Mapper ID..: %s", global.configuration.node_mapper.id);
    print("Node Mapper port: %d", global.configuration.node_mapper.server_port);

	// Start fork controller.
	initialize_fork_controller();

	// Create new node.
	pthread_t tid2;
	nm_param_t *param = (nm_param_t *) malloc (sizeof(nm_param_t));

	param->node_mapper_port = global.configuration.node_mapper.server_port;
	param->node_id = NULL;

	if (global.configuration.node.id)
		mem_salloc_scopy(global.configuration.node.id, param->node_id);
	
	pthread_create(&tid2, NULL, start_new_node, param);

	infinite_loop();
    return 0;
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
	}

	say("New node created by Verbum.");
	exit(0);
}

static void prepare_settings (int argc, char *argv[])
{
	global.configuration.node.id = NULL;
	global.configuration.node_mapper.id = NULL;
	global.configuration.node_mapper.server_port = 0;

	check_params(argc, argv);
	set_default_options();
}

static void set_default_options (void)
{
	char node_mapper_id []= VERBUM_DEFAULT_NODE_MAPPER_ID;

	if (!global.configuration.node_mapper.server_port)
		global.configuration.node_mapper.server_port = VERBUM_DEFAULT_NODE_MAPPER_S_PORT;
	
	if (!global.configuration.node_mapper.id)
		mem_salloc_scopy(node_mapper_id, global.configuration.node_mapper.id);
}

static void check_params (int argc, char *argv[])
{
	char *option = NULL;
	char *value  = NULL;
	
	for (int a=1; a < argc; a++) {
		option = argv[a];

		if (strcmp(option, "--help") == 0 ||
			strcmp(option, "-h")     == 0  )
			usage();

		if ( (a+1) < argc ) {
			value = argv[a+1];

			if (strcmp(option, "--node-id") == 0) 
				mem_salloc_scopy(value, global.configuration.node.id);
			
			else if (strcmp(option, "--node-mapper-id") == 0) 
				mem_salloc_scopy(value, global.configuration.node_mapper.id);
			
			else if (strcmp(option, "--node-mapper-port") == 0) 
				global.configuration.node_mapper.server_port = atoi(value);
			
			a++;
		}
	}
}

static void usage (void)
{
	print("\nVerbum Programming Language - v" VERBUM_LANGUAGE_VERSION "\n");

	print("Options:");
	print("\t--node-id            - Custom Node ID.");
	print("\t--node-mapper-id     - Custom Node Mapper ID.");
	print("\t--node-mapper-port   - Custom Node Mapper server port.\n");

	print("Examples:");
	print("\tverbum");
	print("\tverbum --node-id IESUS --node-mapper-id IHS --node-mapper-port 3333\n");

	exit(0);
}


