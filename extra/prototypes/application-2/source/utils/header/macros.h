
/**
 * Copyright (c) 2022, the Verbum project authors. 
 * 
 * Please see the AUTHORS file for details. All rights reserved. Use of this source 
 * code is governed by a BSD-style license that can be found in the LICENSE file.
 */

#ifndef _H_UTILS_MACROS_
#define _H_UTILS_MACROS_

#define initialization main

#ifndef PATH_MAX
#define PATH_MAX 4096
#endif

#ifndef MSG_NOSIGNAL
#define MSG_NOSIGNAL 0
#endif

#define infinite_loop()         \
    do {                        \
        while (1)               \
            sleep(3);           \
    } while (0)

#endif /* _H_UTILS_MACROS_ */


