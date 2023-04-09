
/**
 * Copyright (c) 2022, the Verbum project authors. 
 * 
 * Please see the AUTHORS file for details. All rights reserved. Use of this source 
 * code is governed by a BSD-style license that can be found in the LICENSE file.
 */

#ifndef _H_COMMON_GLOBAL_
#define _H_COMMON_GLOBAL_


#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <stdarg.h>
#include <unistd.h>
#include <limits.h>
#include <time.h>
#include <errno.h> 
#include <dirent.h>
#include <signal.h>
#include <locale.h>
#include <getopt.h>
#include <sys/time.h>
#include <sys/types.h> 
#include <sys/socket.h> 
#include <sys/wait.h> 
#include <netinet/in.h> 
#include <arpa/inet.h>
#include <fcntl.h>
#include <pthread.h>

#include "debug.h"
#include "memory.h"

/**
 * Global definitions and macros.
 */

#ifndef TRUE
#define TRUE 1
#endif
#ifndef FALSE
#define FALSE 0
#endif

#ifndef EXIT_SUCCESS
#define	EXIT_SUCCESS 0
#endif
#ifndef EXIT_FAILURE
#define	EXIT_FAILURE 1
#endif

/**
 * Global functions.
 */

int random_number (int min, int max);
int ignore_sigpipe (void);

#endif /* _H_COMMON_GLOBAL_ */


