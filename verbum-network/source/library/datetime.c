
#include <unistd.h>

#include "datetime.h"
#include "memory.h"

char * make_datetime (void) 
{
    time_t now      = time(NULL);
    struct tm *tms  = localtime(&now);
    char * date     = CNULL;
    char day[5], mon[5], year[5], hour[5], min[5], sec[5];
    
    memory_alloc(date, 100);
    memset(day,  0x0, 5);
    memset(mon,  0x0, 5);
    memset(year, 0x0, 5);
    memset(hour, 0x0, 5);
    memset(min,  0x0, 5);
    memset(sec,  0x0, 5);

    sprintf(day,  "%d", tms->tm_mday);
    sprintf(mon,  "%d", tms->tm_mon);
    sprintf(year, "%d", (1900 + tms->tm_year));
    sprintf(hour, "%d", tms->tm_hour);
    sprintf(min,  "%d", tms->tm_min);
    sprintf(sec,  "%d", tms->tm_sec);

    if (strlen(day) == 1)
        sprintf(day, "0%d", tms->tm_mday);
    if (strlen(mon) == 1)
        sprintf(mon, "0%d", tms->tm_mon);
    if (strlen(hour) == 1)
        sprintf(hour, "0%d", tms->tm_hour);
    if (strlen(min) == 1)
        sprintf(min, "0%d", tms->tm_min);
    if (strlen(sec) == 1)
        sprintf(sec, "0%d", tms->tm_sec);

    sprintf(date, "%s-%s-%s %s-%s-%s", 
        day, mon, year, hour, min, sec);

    return date;
}


