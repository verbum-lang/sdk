
/**
 * License: 
 *  In the LICENSE.txt file in the project root directory, or: 
 *  SPDX-License-Identifier: BSD-3-Clause.
 * 
 * Author(s):
 *  Copyright (C) 2022 Jessé Silva.
 */

#include "verbum.h"
#include "initialization.h"
#include "prepare-settings.h"
#include "fork-controller.h"
#include "node-creation.h"

extern global_t global;

int initialization (int argc, char *argv[]) 
{
    say("Verbum started.");

    if (!initializations())
        say_ret(0, "Error performing initialization.");

    prepare_settings(argc, argv);

    print("Node ID.........: %s", global.configuration.node.id);
    print("Node Mapper ID..: %s", global.configuration.node_mapper.id);
    print("Node Mapper port: %d", global.configuration.node_mapper.server_port);

    initialize_fork_controller();
    initialize_node_creation();
    infinite_loop();

    return 0;
}


