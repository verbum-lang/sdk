
#include "prepare-settings.h"

static void usage (int invalid, int option);

int prepare_settings (int argc, char *argv[])
{
    int opt = -1;
	opterr  = 0;

	global.configuration.node.id		 		 = NULL;
	global.configuration.node_mapper.id 		 = NULL;
	global.configuration.node_mapper.server_port = 0;

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

	if (!global.configuration.node.id)
		usage(0, 0);

    return 1;
}

static void usage (int invalid, int option)
{
	say("Verbum Programming Language - v" VERBUM_LANGUAGE_VERSION "\n");

	if (invalid) 
		say("Unknown option: %c\n", option);

	say("Options: ");
	say("\t-i    - Node ID.");
	say("\t-m    - Node Mapper ID.");
	say("\t-p    - Node Mapper server port.\n");

	exit(0);
}


