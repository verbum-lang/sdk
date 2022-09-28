
/**
 * Copyright (c) 2022, the Verbum project authors. 
 * 
 * Please see the AUTHORS file for details. All rights reserved. Use of this source 
 * code is governed by a BSD-style license that can be found in the LICENSE file.
 */

#include "global.h"

int random_number (int min, int max)
{
    return min + rand() / (RAND_MAX / (max - min + 1) + 1);
}

int ignore_sigpipe (void)
{
    // signal(SIGPIPE, SIG_IGN);
    // sigaction(SIGPIPE, &(struct sigaction){SIG_IGN}, NULL);

    struct sigaction act;
    act.sa_handler = SIG_IGN;
    act.sa_flags   = 0;

    if (sigaction(SIGPIPE, &act, NULL) == -1)
        return 0;

    return 1;
}


