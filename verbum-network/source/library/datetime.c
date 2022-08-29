
#include <unistd.h>

#include "datetime.h"
#include "memory.h"

char * make_datetime (void) 
{
    char * date = CNULL;
    time_t now = time(NULL);
    struct tm *tms = localtime(&now);

    memory_alloc(date, 100);

    sprintf(date, "%d-%d-%d %d-%d-%d", 
        tms->tm_mday, tms->tm_mon, tms->tm_year,
        tms->tm_hour, tms->tm_min, tms->tm_sec);

    return date;
}


