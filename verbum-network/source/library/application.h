
#ifndef VERBUM_LIBRARY_APPLICATION
#define VERBUM_LIBRARY_APPLICATION

#include "global.h"
#include "memory.h"

// System execution.
#define system_execution(fmt, ...)                                                      \
    do {                                                                                \
        char *buffer = NULL;                                                            \
        int size = 512 * 10;                                                            \
        memory_alloc(buffer, strlen(fmt) + size);                                       \
        sprintf(buffer, fmt, ##__VA_ARGS__);                                            \
        system(buffer);                                                                 \
    } while(0)

char *get_relative_path (void);
char *get_real_path     (char *path);

#endif


