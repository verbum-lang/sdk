
#include "datetime.h"
#include "memory.h"

char *make_datetime (void) 
{
    time_t now      = time(NULL);
    struct tm *tms  = localtime(&now);
    char * date     = NULL;
    char day[5], mon[5], year[5], hour[5], min[5], sec[5];
    
    mem_salloc_ret(date, 100, NULL);

    memset(day,  0x0, 5);
    memset(mon,  0x0, 5);
    memset(year, 0x0, 5);
    memset(hour, 0x0, 5);
    memset(min,  0x0, 5);
    memset(sec,  0x0, 5);

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

    sprintf(date, "%s-%s-%s %s-%s-%s", 
        day, mon, year, hour, min, sec);

    return date;
}

double date_difference_now (char *start)
{
    struct tm tm_start, *tm_end;
    time_t time_start, time_end, now;
    double time_difference = 0;

    memset(&tm_start, 0x0, sizeof(tm_start));
    memset(&tm_end, 0x0, sizeof(tm_end));
    memset(&time_start, 0x0, sizeof(time_start));
    memset(&time_end, 0x0, sizeof(time_end));
    memset(&now, 0x0, sizeof(now));

    now    = time(NULL);
    tm_end = localtime(&now);

    strptime(start, "%d-%m-%Y %H:%M:%S", &tm_start);

    time_start = mktime(&tm_start);
    time_end   = mktime(tm_end);

    return difftime(time_end, time_start);
}

double date_difference (char *start, char *end)
{
    struct tm tm_start, tm_end;
    time_t time_start, time_end;
    double time_difference = 0;

    memset(&tm_start, 0x0, sizeof(tm_start));
    memset(&tm_end, 0x0, sizeof(tm_end));

    strptime(start, "%d-%m-%Y %H:%M:%S", &tm_start);
    strptime(end, "%d-%m-%Y %H:%M:%S", &tm_end);

    time_start = mktime(&tm_start);
    time_end   = mktime(&tm_end);

    return difftime(time_end, time_start);
}


