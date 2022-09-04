
#ifndef VERBUM_LIBRARY_MEMORY
#define VERBUM_LIBRARY_MEMORY

#include "global.h"
#include "debug.h"

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

// Fill 0x0 string memory.
#define memory_szero(SOURCE)                                                            \
    do {                                                                                \
        if (SOURCE)                                                                     \
            memset(SOURCE, 0x0, strlen(SOURCE));                                        \
    } while(0)

// Zero string memory.
#define memory_sclean(SOURCE)                                                           \
    do {                                                                                \
        memory_szero(SOURCE);                                                           \
        if (SOURCE)                                                                     \
            free(SOURCE);                                                               \
    } while(0)

#endif


