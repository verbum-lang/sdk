
/**
 * Copyright (c) 2022, the Verbum project authors. 
 * 
 * Please see the AUTHORS file for details. All rights reserved. Use of this source 
 * code is governed by a BSD-style license that can be found in the LICENSE file.
 */

#include "global.h"

static int validation (configuration_t *configuration);

void node (configuration_t *configuration)
{
    if (!validation(configuration))
        return;

    dbg("Node started!\n");
    dbg("Node ID: %s\n", configuration->node_id);
    dbg("Node API port: %d\n", configuration->interface_port);
    dbg("Node connection port: %d\n", configuration->connection_port);

    while (1) { sleep(3333); }
}

static int validation (configuration_t *configuration)
{
    if (!configuration) {
        dbg("configuration error.");
        return FALSE;
    }

    return TRUE;
}


