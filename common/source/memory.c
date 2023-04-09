
/**
 * Copyright (c) 2022, the Verbum project authors. 
 * 
 * Please see the AUTHORS file for details. All rights reserved. Use of this source 
 * code is governed by a BSD-style license that can be found in the LICENSE file.
 */

#include "global.h"

void * vmalloc (size_t size)
{
    void * ptr = NULL;

    if (!size)
        return NULL;

    ptr = malloc(size);

    if (!ptr) {
        printf("Error alloc memory.\n");
        exit(EXIT_FAILURE);
    }

    memset(ptr, 0, size);
    return ptr;
}


