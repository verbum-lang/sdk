
#ifndef VERBUM_UTILS_APPLICATION
#define VERBUM_UTILS_APPLICATION

#include "global.h"
#include "memory.h"

/**
 * System execution.
 * Based on https://github.com/jirihnidek/daemon/blob/master/src/daemon.c
 * And on tips from my friends.
 */

#define system_execution_ret(RETURN, fmt, ...)                                          \
    do {                                                                                \
        char *buffer = NULL;                                                            \
        mem_salloc_ret(buffer, strlen(fmt) + 1024, RETURN);                             \
        sprintf(buffer, fmt, ##__VA_ARGS__);                                            \
        system_open_bg_application(buffer);                                             \
    } while(0)

#define system_execution_noret(fmt, ...)                                                \
    do {                                                                                \
        char *buffer = NULL;                                                            \
        mem_salloc_noret(buffer, strlen(fmt) + 1024);                                   \
        sprintf(buffer, fmt, ##__VA_ARGS__);                                            \
        system_open_bg_application(buffer);                                             \
    } while(0)

void system_open_bg_application (char *cmd);
char *get_relative_path         (void);
char *get_real_path             (char *path);

#endif


