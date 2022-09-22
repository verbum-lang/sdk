
#include "../../library/global.h"
#include "../../library/debug.h"
#include "../../library/application.h"
#include "../../library/connection.h"
#include "../../library/datetime.h"
#include "../../library/debug.h"
#include "../../library/file.h"
#include "../../library/ini_file.h"
#include "../../library/memory.h"
#include "../../library/process.h"

#include "../../verbum-node/node.h"
#include "../../verbum-node-mapper/node-mapper.h"

#define VERBUM_LANGUAGE_VERSION "1.0.0"

static void usage (int invalid, int option);
static int prepare_settings (int argc, char *argv[]);
static void *start_verbum_node_mapper (void *_param);
static void *start_verbum_node (void *_param);

int initialization (int argc, char *argv[]) 
{
	pthread_t tid1, tid2;

    say("Verbum started.");

    prepare_settings(argc, argv);

    say("Node ID.........: %s", global.configuration.node.id);
    say("Node Mapper ID..: %s", global.configuration.node_mapper.id);
    say("Node Mapper port: %d", global.configuration.node_mapper.server_port);

	pthread_create(&tid1, NULL, start_verbum_node_mapper, NULL);
	pthread_create(&tid2, NULL, start_verbum_node, NULL);

	infinite_loop();
    return 0;
}

static void *start_verbum_node_mapper (void *_param)
{
	open_application(VERBUM_NODE_MAPPER_APPLICATION);
}

static void *start_verbum_node (void *_param)
{
	if (!verbum_node())
		say_exit("Error creating Verbum Node.");
}

static int prepare_settings (int argc, char *argv[])
{
    int opt = -1;
	
	opterr = 0;
	global.configuration.node.id = NULL;
	global.configuration.node_mapper.id = NULL;
	global.configuration.node_mapper.server_port = 0;

	if (argc == 1)
		usage(0, 0);

	while ((opt = getopt(argc, argv, "p:m:i:")) != -1) {
		switch (opt) {
			case 'i':
				mem_salloc_scopy(optarg, global.configuration.node.id);
				if (!global.configuration.node.id) 
					say_exit("Cannot alloc memory for Node ID.");
				break;

			case 'm':
				mem_salloc_scopy(optarg, global.configuration.node_mapper.id);
				if (!global.configuration.node_mapper.id) 
					say_exit("Cannot alloc memory for Node Mapper ID.");
				break;

			case 'p':
				global.configuration.node_mapper.server_port = atoi(optarg);
				break;

			case '?':
				usage(1, optopt);
				break;
		}
	}
	
    return 1;
}

static void usage (int invalid, int option)
{
	say("Verbum Programming Language - v" VERBUM_LANGUAGE_VERSION "\n");

	if (invalid) 
		say("Unknown option: %c\n", option);

	say("Options:");
	say("\t-i    - Node ID.");
	say("\t-m    - Node Mapper ID.");
	say("\t-p    - Node Mapper server port.\n");

	say("Examples:");
	say("\tverbum -m \"IHS-333\" -p 3333                 - Open Node Mapper.");
	say("\tverbum -i \"IESUS\"   -p 3333                 - Open Node.");
	say("\tverbum -m \"IHS-333\" -i \"IESUS\" -p 3333      - Open Node and Node Mapper.\n");

	exit(0);
}


