
/**
 * Copyright (c) 2022, the Verbum project authors. 
 * 
 * Please see the AUTHORS file for details. All rights reserved. Use of this source 
 * code is governed by a BSD-style license that can be found in the LICENSE file.
 */

#ifndef _H_UTILS_GLOBAL_
#define _H_UTILS_GLOBAL_

#include "libraries.h"
#include "macros.h"
#include "../../settings/settings.h"


/**
 * Global application settings.
 */

typedef struct {
    struct {
        struct {
            char *id;
        } node;
        
        struct {
            char *id;
            int server_port;
        } node_mapper;
    } configuration;
} global_t;

int random_number  (int min, int max);
int ignore_sigpipe (void);

#endif /* _H_UTILS_GLOBAL_ */


