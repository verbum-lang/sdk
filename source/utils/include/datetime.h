
#ifndef VERBUM_UTILS_DATETIME
#define VERBUM_UTILS_DATETIME

#include "global.h"

// #define DATETIME_DEBUG

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

#endif


