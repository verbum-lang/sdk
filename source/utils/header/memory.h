
/**
 * Copyright (c) 2022, the Verbum project authors. 
 * 
 * Please see the AUTHORS file for details. All rights reserved. Use of this source 
 * code is governed by a BSD-style license that can be found in the LICENSE file.
 */

#ifndef _H_UTILS_MEMORY_
#define _H_UTILS_MEMORY_

#include "global.h"
#include "debug.h"


/**
 * Simple memory allocation.
 */

#define mem_alloc_ret(DESTINATION, SIZE, CASTING, RETURN)                      \
    do {                                                                       \
        DESTINATION = (CASTING) malloc(SIZE);                                  \
                                                                               \
        if (!DESTINATION)                                                      \
            say_ret(RETURN, "error allocating memory.");                       \
                                                                               \
        memset(DESTINATION, 0x0, SIZE);                                        \
    } while(0)

#define mem_alloc_noret(DESTINATION, SIZE, CASTING)                            \
    do {                                                                       \
        DESTINATION = (CASTING) malloc(SIZE);                                  \
                                                                               \
        if (!DESTINATION)                                                      \
            say_noret("error allocating memory.");                             \
                                                                               \
        memset(DESTINATION, 0x0, SIZE);                                        \
    } while(0)


/**
 * Simple memory allocation and copy.
 */

#define mem_salloc(DESTINATION, SIZE)                                          \
    do {                                                                       \
        int size = sizeof(char) * (SIZE + 1);                                  \
        DESTINATION = (char *) malloc(size);                                   \
        if (DESTINATION) {                                                     \
            memset(DESTINATION, 0x0, size);                                    \
        }                                                                      \
    } while(0)

#define mem_scopy(SOURCE, DESTINATION)                                         \
    do {                                                                       \
        memset(DESTINATION, 0x0, strlen(SOURCE));                              \
        memcpy(DESTINATION, SOURCE, strlen(SOURCE));                           \
    } while(0)

#define mem_salloc_scopy(SOURCE, DESTINATION)                                  \
    do {                                                                       \
        mem_salloc(DESTINATION, strlen(SOURCE));                               \
        if (DESTINATION)                                                       \
            mem_scopy(SOURCE, DESTINATION);                                    \
    } while(0)


/**
 * Memory allocation involving strings.
 */

// String memory alloc.
#define mem_salloc_ret(DESTINATION, SIZE, RETURN)                              \
    do {                                                                       \
        int msize   = sizeof(char) * (SIZE + 1);                               \
        DESTINATION = (char *) malloc(msize);                                  \
                                                                               \
        if (!DESTINATION)                                                      \
            say_ret(RETURN, "error allocating memory.");                       \
                                                                               \
        memset(DESTINATION, 0x0, msize);                                       \
    } while (0)

#define mem_salloc_noret(DESTINATION, SIZE)                                    \
    do {                                                                       \
        int msize   = sizeof(char) * (SIZE + 1);                               \
        DESTINATION = (char *) malloc(msize);                                  \
                                                                               \
        if (!DESTINATION)                                                      \
            say_noret("error allocating memory.");                             \
                                                                               \
        memset(DESTINATION, 0x0, msize);                                       \
    } while (0)

#define mem_salloc_goto(DESTINATION, SIZE, GOTO)                               \
    do {                                                                       \
        int msize   = sizeof(char) * (SIZE + 1);                               \
        DESTINATION = (char *) malloc(msize);                                  \
                                                                               \
        if (!DESTINATION)                                                      \
            say_goto(GOTO, "error allocating memory.");                        \
                                                                               \
        memset(DESTINATION, 0x0, msize);                                       \
    } while (0)

// Alloc memory and copy string.
#define mem_scopy_ret(SOURCE, DESTINATION, RETURN)                             \
    do {                                                                       \
        if (!SOURCE)                                                           \
            say_ret(RETURN, "invalid data.");                                  \
                                                                               \
        mem_salloc_ret(DESTINATION, strlen(SOURCE), RETURN);                   \
        memcpy(DESTINATION, SOURCE, strlen(SOURCE));                           \
    } while (0)

#define mem_scopy_noret(SOURCE, DESTINATION)                                   \
    do {                                                                       \
        if (!SOURCE)                                                           \
            say_noret("invalid data.");                                        \
                                                                               \
        mem_salloc_noret(DESTINATION, strlen(SOURCE));                         \
        memcpy(DESTINATION, SOURCE, strlen(SOURCE));                           \
    } while (0)

#define mem_scopy_goto(SOURCE, DESTINATION, GOTO)                              \
    do {                                                                       \
        if (!SOURCE)                                                           \
            say_goto(GOTO, "invalid data.");                                   \
                                                                               \
        mem_salloc_goto(DESTINATION, strlen(SOURCE), GOTO);                    \
        memcpy(DESTINATION, SOURCE, strlen(SOURCE));                           \
    } while (0)


/**
 * Memory clear.
 */

#define mem_sfree(DESTINATION)                                                 \
    do {                                                                       \
        if (DESTINATION) {                                                     \
            memset(DESTINATION, 0x0, strlen(DESTINATION));                     \
            free(DESTINATION);                                                 \
            DESTINATION = NULL;                                                \
        }                                                                      \
    } while(0)


/**
 * Others.
 */

#define mem_smake_size(SIZE) sizeof(char) * (SIZE)

#endif /* _H_UTILS_MEMORY_ */


