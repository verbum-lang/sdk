
#include "prepare-settings.h"

static void usage (void);

int prepare_settings (int argc, char *argv[])
{
    int opt = -1;

	global.configuration.node_mapper.id 		 = NULL;
	global.configuration.node_mapper.server_port = 0;

	while ((opt = getopt(argc, argv, "p:i:")) != -1) {
		switch (opt) {
			case 'i':
				mem_salloc_scopy(optarg, global.configuration.node_mapper.id);
				if (!global.configuration.node_mapper.id) 
					say_exit("Cannot alloc memory for -i Node Mapper ID.");
				break;

			case 'p':
				global.configuration.node_mapper.server_port = atoi(optarg);
				break;

			case '?':
				say("Unknown option: '%c'\n", optopt);
				usage();
				break;
		}
	}

	if (!global.configuration.node_mapper.server_port || 
		!global.configuration.node_mapper.id		   )
		usage();

    return 1;
}

static void usage (void)
{
	say("Verbum Programming Language - v" VERBUM_LANGUAGE_VERSION "\n");
	say("Options: \n");
	say("\t-i    - Node Mapper ID.");
	say("\t-p    - Node Mapper server port.\n");

	exit(0);
}


