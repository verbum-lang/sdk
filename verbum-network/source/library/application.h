
#ifndef VERBUM_LIBRARY_APPLICATION
#define VERBUM_LIBRARY_APPLICATION

#include "global.h"
#include "memory.h"

// System execution.
#define system_execution_df(fmt, ...)                                                   \
    do {                                                                                \
        char *buffer = NULL;                                                            \
        int size = -1024;                                                               \
        memory_alloc(buffer, strlen(fmt) + size);                                       \
        sprintf(buffer, fmt, ##__VA_ARGS__);                                            \
        system(buffer);                                                                 \
    } while(0)

// Based on https://github.com/jirihnidek/daemon/blob/master/src/daemon.c
// And on tips from my friends.
#define system_execution(fmt, ...)                                                      \
    do {                                                                                \
        char *buffer = NULL;                                                            \
        int size = 1024;                                                                \
        memory_alloc(buffer, strlen(fmt) + size);                                       \
        sprintf(buffer, fmt, ##__VA_ARGS__);                                            \
        system_open_bg_application(buffer);                                             \
    } while(0)

void system_open_bg_application (char *cmd);
char *get_relative_path         (void);
char *get_real_path             (char *path);

#endif


