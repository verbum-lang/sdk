
/**
 * Copyright (c) 2022, the Verbum project authors. 
 * 
 * Please see the AUTHORS file for details. All rights reserved. Use of this source 
 * code is governed by a BSD-style license that can be found in the LICENSE file.
 */

#include "global.h"

configuration_t * alloc_configuration (void)
{
    configuration_t *c = (configuration_t *) vmalloc(sizeof(configuration_t));

    c->interface_port = -1;
    c->connection_port = -1;
    c->node_id = NULL;

    return c;
}


