
#ifndef VERBUM_UTILS_INI_FILE
#define VERBUM_UTILS_INI_FILE

#include "global.h"

typedef struct { 
    int ivalue;
    char *svalue;
} ini_data_t;

ini_data_t  ini_read        (char *content, char *section, char *param, int type);
char       *ini_read_string (char *content, char *section, char *param);
int         ini_read_number (char *content, char *section, char *param);

#endif


