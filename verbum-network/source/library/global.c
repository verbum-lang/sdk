
#include "global.h"

int random_number (int min, int max)
{
    return min + rand() / (RAND_MAX / (max - min + 1) + 1);
}


