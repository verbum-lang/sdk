
#ifndef VERBUM_LIBRARY_MEMORY
#define VERBUM_LIBRARY_MEMORY

#include "global.h"

// Simple memory alloc.
#define memory_alloc(DESTINATION, SIZE)                                                 \
    do {                                                                                \
        DESTINATION = (char *) malloc(SIZE + 1);                                        \
                                                                                        \
        if (!DESTINATION)                                                               \
            debug_exit("error allocating memory.");                                     \
                                                                                        \
        memset(DESTINATION, 0x0, SIZE);                                                 \
    } while (0)

// String memory alloc.
#define memory_salloc(SOURCE, DESTINATION)                                              \
    do {                                                                                \
        if (!SOURCE)                                                                    \
            debug_exit("error allocating memory, invalid data/variable.");              \
                                                                                        \
        int size = sizeof(char) * (strlen(SOURCE) + 1);                                 \
        DESTINATION = (char *) malloc(size);                                            \
                                                                                        \
        if (!DESTINATION)                                                               \
            debug_exit("error allocating memory.");                                     \
                                                                                        \
        memset(DESTINATION, 0x0, size);                                                 \
    } while (0)

// String memory copy.
#define memory_scopy(SOURCE, DESTINATION)                                               \
    do {                                                                                \
        memory_salloc(SOURCE, DESTINATION);                                             \
        memcpy(DESTINATION, SOURCE, strlen(SOURCE));                                    \
    } while(0)

// System execution.
#define system_execution(fmt, ...)                                                      \
    do {                                                                                \
        char *buffer = NULL;                                                            \
        int size = 512 * 10;                                                            \
        memory_alloc(buffer, strlen(fmt) + size);                                       \
        sprintf(buffer, fmt, ##__VA_ARGS__);                                            \
        system(buffer);                                                                 \
    } while(0)

#endif


