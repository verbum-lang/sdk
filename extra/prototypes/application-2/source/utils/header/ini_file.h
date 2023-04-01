
/**
 * Copyright (c) 2022, the Verbum project authors. 
 * 
 * Please see the AUTHORS file for details. All rights reserved. Use of this source 
 * code is governed by a BSD-style license that can be found in the LICENSE file.
 */

#ifndef _H_UTILS_INI_FILE_
#define _H_UTILS_INI_FILE_

#include "global.h"

typedef struct { 
    int ivalue;
    char *svalue;
} ini_data_t;

ini_data_t  ini_read        (char *content, char *section, char *param, int type);
char       *ini_read_string (char *content, char *section, char *param);
int         ini_read_number (char *content, char *section, char *param);

#endif /* _H_UTILS_INI_FILE_ */


