
/**
 * Copyright (c) 2022, the Verbum project authors. 
 * 
 * Please see the AUTHORS file for details. All rights reserved. Use of this source 
 * code is governed by a BSD-style license that can be found in the LICENSE file.
 */

#include "node-creation.h"

static void *create_node (void *_param);

extern global_t global;

void initialize_node_creation (void)
{
    pthread_t tid;
    param_t *param;

    prepare_thread_param(param);
    param->port = global.configuration.node_mapper.server_port;

    if (global.configuration.node.id)
        mem_salloc_scopy(global.configuration.node.id, param->id);

    pthread_create(&tid, NULL, create_node, param);
}

static void *create_node (void *_param)
{
    param_t *param = (param_t *) _param;

    say("Creating a new node using the Verbum utility...");
    say("Connecting to Node Mapper server port: %d", param->port);

    while (1) {
        if (process_create_node(LOCALHOST, param->port, param->id))
            break;
        else
            say("Error creating node using Verbum utility.");

        usleep(NODE_CREATION_DELAY_CREATE_NODE);
    }

    say("New node successfully created using the Verbum utility.");
    exit(0);
}


