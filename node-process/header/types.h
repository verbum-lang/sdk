
/**
 * Copyright (c) 2022, the Verbum project authors. 
 * 
 * Please see the AUTHORS file for details. All rights reserved. Use of this source 
 * code is governed by a BSD-style license that can be found in the LICENSE file.
 */

#ifndef _H_NP_TYPES_
#define _H_NP_TYPES_

#include "global.h"

/**
 * Information received via command line when starting the application.
 */
typedef struct configuration_s {
    int interface_port;
    int connection_port;
    char *node_id;
} configuration_t;

/**
 * Prepare type allocations.
 */
configuration_t * alloc_configuration (void);

#endif /* _H_NP_TYPES_ */


