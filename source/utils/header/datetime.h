
/**
 * Copyright (c) 2022, the Verbum project authors. 
 * 
 * Please see the AUTHORS file for details. All rights reserved. Use of this source 
 * code is governed by a BSD-style license that can be found in the LICENSE file.
 */

#ifndef _H_UTILS_DATETIME_
#define _H_UTILS_DATETIME_

#include "global.h"

// #define DBG_DATETIME

typedef struct {
    int day;
    int mon;
    int year;
    int hour;
    int min;
    int sec;
    int status;
} date_diff_t;

char        *make_datetime     (void);
int          date_difference   (char *start_date, char *end_date, double interval_seconds);
date_diff_t  prepare_date_data (char *idate);
int          prepare_atoi      (char *number);

#endif /* _H_UTILS_DATETIME_ */


