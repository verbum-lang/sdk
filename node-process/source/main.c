
/**
 * Copyright (c) 2022, the Verbum project authors. 
 * 
 * Please see the AUTHORS file for details. All rights reserved. Use of this source 
 * code is governed by a BSD-style license that can be found in the LICENSE file.
 */

#include "global.h"

static void help (void);

int main (int argc, char *argv[])
{
    configuration_t *configuration = alloc_configuration();
    int option = -1, size = 0;

    struct option long_options []= {
        {"help", no_argument, NULL, 'h'},
        {"id", required_argument, NULL, 'i'},
        {"interface-port", required_argument, NULL, 't'},
        {"connection-port", required_argument, NULL, 'c'},
        {NULL, 0, NULL, 0}
    };

    while ((option = getopt_long(argc, argv, ":hi:t:c:", long_options, NULL)) != -1) {
        switch (option) {
            case 't':
                configuration->interface_port = atoi(optarg);
                break;
            case 'c':
                configuration->connection_port = atoi(optarg);
                break;
            case 'i':
                size = strlen(optarg) + 1;
                configuration->node_id = (char *) vmalloc(size);
                memcpy(configuration->node_id, optarg, size);
                break;
            case 'h':
                help();
                break;
            case '?':
                printf("Unknown option: %c\n\n", optopt);
                help();
                break;
            case ':':
                printf("Option requires an argument: %c\n\n", optopt);
                help();
                break;
        }
    }

    if (argc == 1)
        help();

    else if (!configuration->node_id || !configuration->interface_port ||
             !configuration->connection_port || configuration->interface_port < 0 || 
             configuration->connection_port < 0)
        help();

    if (!ignore_sigpipe())
        dbg("error set ignore SIGPIPE.");
        
    node(configuration);
    
    return 0;
}

static void help (void) {
    printf(
        "Usage:\n\n"
        "   -h, --help                   Help.\n"
        "   -i, --id                     Node ID.\n"
        "   -c, --connection-port        Node connection port (inter-node communication).\n"
        "   -t, --interface-port         Node server port (API manager).\n\n");
    exit(EXIT_SUCCESS);
}


