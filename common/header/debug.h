
/**
 * Copyright (c) 2022, the Verbum project authors. 
 * 
 * Please see the AUTHORS file for details. All rights reserved. Use of this source 
 * code is governed by a BSD-style license that can be found in the LICENSE file.
 */

#ifndef _H_COMMON_DEBUG_
#define _H_COMMON_DEBUG_

#include "global.h"

#ifndef DEBUG_MODE
#define DEBUG_MODE 0
#endif

#if (DEBUG_MODE == 1)
    #define dbg(FMT, ...) do { \
        printf("[%s, %d, %s()]: " FMT, __FILE__, __LINE__, __func__, ##__VA_ARGS__); \
    } while (0)
#else
    #define dbg(FMT, ...) do { } while (0)
#endif

#endif /* _H_COMMON_DEBUG_ */


