
#include "prepare-settings.h"

static void set_default_options (void);
static void check_params (int argc, char *argv[]);
static void usage (void);

extern global_t global;

void prepare_settings (int argc, char *argv[])
{
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
			strcmp(option, "-help")  == 0 ||
			strcmp(option, "--h")    == 0 ||
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


