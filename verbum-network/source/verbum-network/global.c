
#include "global.h"

int file_exists (char *path)
{
    if (!path)
        return 0;

    FILE *fp = fopen(path, "r");

    if (!fp)
        return 0;

    fclose(fp);

    return 1;
}

