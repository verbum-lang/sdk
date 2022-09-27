
/**
 * Copyright (c) 2022, the Verbum project authors. 
 * 
 * Please see the AUTHORS file for details. All rights reserved. Use of this source 
 * code is governed by a BSD-style license that can be found in the LICENSE file.
 */

#include "datetime.h"
#include "memory.h"

char *make_datetime (void) 
{
    time_t now      = time(NULL);
    struct tm *tms  = localtime(&now);
    char *date      = NULL;
    char day[5], mon[5], year[5], hour[5], min[5], sec[5];
    
    mem_salloc_ret(date, 100, NULL);

    memset(day,  '\0', 5);
    memset(mon,  '\0', 5);
    memset(year, '\0', 5);
    memset(hour, '\0', 5);
    memset(min,  '\0', 5);
    memset(sec,  '\0', 5);

    sprintf(day,  "%d", tms->tm_mday);
    sprintf(mon,  "%d", (tms->tm_mon + 1));
    sprintf(year, "%d", (1900 + tms->tm_year));
    sprintf(hour, "%d", tms->tm_hour);
    sprintf(min,  "%d", tms->tm_min);
    sprintf(sec,  "%d", tms->tm_sec);

    if (strlen(day) == 1)
        sprintf(day, "0%d",  tms->tm_mday);
    if (strlen(mon) == 1)
        sprintf(mon, "0%d",  (tms->tm_mon + 1));
    if (strlen(hour) == 1)
        sprintf(hour, "0%d", tms->tm_hour);
    if (strlen(min) == 1)
        sprintf(min, "0%d",  tms->tm_min);
    if (strlen(sec) == 1)
        sprintf(sec, "0%d",  tms->tm_sec);

    sprintf(date, "%s-%s-%s %s:%s:%s", 
                day, mon, year, hour, min, sec);

    return date;
}

/**
 * This function returns an approximate value, and not exactly 
 * according to the Gregorian calendar.
 * 
 * Format: 11-09-2022 01:50:00
 * 
 * start_date - minor date.
 * end_date   - major date.
 * 
 * Result:
 *  1 = Success, >= interval.
 *  0 = Errror, date not >= interval.
 */

int date_difference (char *start_date, char *end_date, double interval_seconds)
{
    double day  = 0, mon = 0, year = 0, date_seconds = 0;
    double hour = 0, min = 0, sec  = 0, hour_seconds = 0;
    double final_seconds = 0;
    diff_t start, end;

    if (!start_date || !end_date || !interval_seconds)
        return 0;
    
    start = prepare_date(start_date);
    end   = prepare_date(end_date);

    #ifdef DBG_DATETIME
        say("start(%d): %s - end(%d): %s", 
            start.status, start_date, end.status, end_date);
    #endif

    if (!start.status || !end.status)
        return 0;

    if (strcmp(start_date, end_date) == 0)
        return 0;

    // Date validation.
    if (start.year > end.year)
        return 0;
    if (start.year == end.year && start.mon > end.mon)
        return 0;
    if (start.year == end.year && start.mon == end.mon && 
        start.day > end.day)
        return 0;

    #ifdef DBG_DATETIME
        say("start: %d-%d-%d %d:%d:%d"
            "end..: %d-%d-%d %d:%d:%d",
                    start.day, start.mon, start.year, start.hour, start.min, start.sec,
                    end.day, end.mon, end.year, end.hour, end.min, end.sec);
    #endif

    // Date difference.
    year = end.year - start.year;
    mon  = end.mon  - start.mon;
    day  = end.day  - start.day;

    year = 365      * year;
    mon  = 30.4167  * mon;

    date_seconds = (year + mon + day) * 86400;

    // Hour difference.
    hour = end.hour - start.hour;
    min  = end.min  - start.min;
    sec  = end.sec  - start.sec;

    hour_seconds = (hour * 3600) + (min * 60) + sec; 

    if (date_seconds == 0 && hour_seconds < 0)
        return 0;

    // Final seconds difference.
    final_seconds = date_seconds + hour_seconds;

    #ifdef DBG_DATETIME
        say("%d %d %d - %d %d %d", 
            (int) day,  (int) mon, (int) year, 
            (int) hour, (int) min, (int) sec);
        say("total date secs: %f", date_seconds);
        say("total hour secs: %f", hour_seconds);
        say("final secs: %f - %f", final_seconds, interval_seconds);
    #endif

    // Check interval.
    if (final_seconds >= interval_seconds)
        return 1;

    return 0;
}

diff_t prepare_date (char *idate)
{
    diff_t date;
    char tmp [100];

    date.day    = 0;
    date.mon    = 0;
    date.year   = 0;
    date.hour   = 0;
    date.min    = 0;
    date.sec    = 0;
    date.status = 0;

    memset(tmp, '\0', 100);

    if (!idate)
        return date;

    if (!strstr(idate, "-") || !strstr(idate, " ") || !strstr(idate, ":")  )
        return date;

    for (int a=0,b=0,c=0; ; a++) {

        if (idate[a] == '-' || idate[a] == ' ' || 
            idate[a] == ':' || idate[a] == '\0' )
        {
            switch (c) {
                case 0:
                    date.day = prepare_atoi(tmp);
                    break;
                case 1:
                    date.mon = prepare_atoi(tmp);
                    break;
                case 2:
                    date.year = prepare_atoi(tmp);
                    break;
                case 3:
                    date.hour = prepare_atoi(tmp);
                    break;
                case 4:
                    date.min = prepare_atoi(tmp);
                    break;
                case 5:
                    date.sec = prepare_atoi(tmp);
                    date.status = 1;
                    break;
            }

            c ++ ;
            b = 0;
            memset(tmp, '\0', 100);

            if (idate[a] == '\0')
                break;
        }

        else
            tmp[b++] = idate[a];
    }

    return date;
}

int prepare_atoi (char *number)
{
    char *ptr = number;

    if (!number)
        return 0;

    if (number[0] == '0')
        ptr++;

    return atoi(ptr);
}


