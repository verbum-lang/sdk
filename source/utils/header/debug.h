
#ifndef VERBUM_DEBUG
#define VERBUM_DEBUG

#include "global.h"

/**
 * Internal macros.
 */

#define lib_debug_print_internal(DEBUG_FLAG, FMT, ...)                         \
    do {                                                                       \
        time_t now     = time(NULL);                                           \
        struct tm *tms = localtime(&now);                                      \
        char *buffer   = NULL;                                                 \
        int size       = 0;                                                    \
        pid_t pid      = getpid();                                             \
        char hour[5], min[5], sec[5];                                          \
                                                                               \
        memset(hour, 0x0, 5);                                                  \
        memset(min,  0x0, 5);                                                  \
        memset(sec,  0x0, 5);                                                  \
                                                                               \
        sprintf(hour, "%d", tms->tm_hour);                                     \
        sprintf(min,  "%d", tms->tm_min);                                      \
        sprintf(sec,  "%d", tms->tm_sec);                                      \
                                                                               \
        if (strlen(hour) == 1)                                                 \
            sprintf(hour, "0%d", tms->tm_hour);                                \
        if (strlen(min) == 1)                                                  \
            sprintf(min, "0%d",  tms->tm_min);                                 \
        if (strlen(sec) == 1)                                                  \
            sprintf(sec, "0%d",  tms->tm_sec);                                 \
                                                                               \
        size   = sizeof(char) * 4096;                                          \
        buffer = (char *) malloc(size);                                        \
                                                                               \
        if (buffer) {                                                          \
            memset(buffer, 0, size);                                           \
                                                                               \
            if (DEBUG_FLAG == 1)                                               \
                sprintf(buffer, "[%s:%s:%s]: %d -> %s:%d:%s(): "               \
                    FMT "\n", hour, min, sec, (int) pid,                       \
                        __FILE__, __LINE__, __func__, ##__VA_ARGS__ );         \
            else                                                               \
                sprintf(buffer, "[%s:%s:%s]: %d -> " FMT "\n",                 \
                    hour, min, sec, (int) pid, ##__VA_ARGS__ );                \
                                                                               \
            verbum_debug_send_data(buffer);                                    \
                                                                               \
            memset(buffer, 0, size);                                           \
            free(buffer);                                                      \
        }                                                                      \
    } while (0)

#ifdef VERBUM_DEBUG_ENABLED
    #define say_debug(FMT, ...)                                                \
        do {                                                                   \
            lib_debug_print_internal(0, FMT, ##__VA_ARGS__);                   \
        } while (0)

    #define say_debug_detail(FMT, ...)                                         \
        do {                                                                   \
            lib_debug_print_internal(1, FMT, ##__VA_ARGS__);                   \
        } while (0)
#else
    #define say_debug(FMT, ...)         do { } while (0)
    #define say_debug_detail(FMT, ...)  do { } while (0)
#endif


/**
 * External macros.
 */

#define print(FMT, ...)                                                        \
    do {                                                                       \
        printf(FMT "\n", ##__VA_ARGS__);                                       \
    } while (0)

#define say(FMT, ...)                                                          \
    do {                                                                       \
        say_debug(FMT "\n", ##__VA_ARGS__);                                    \
    } while (0)

#define say_ret(RETURN, FMT, ...)                                              \
    do {                                                                       \
        say_debug(FMT "\n", ##__VA_ARGS__);                                    \
        return RETURN;                                                         \
    } while (0)

#define say_noret(FMT, ...)                                                    \
    do {                                                                       \
        say_debug(FMT "\n", ##__VA_ARGS__);                                    \
        return;                                                                \
    } while (0)

#define say_exit(FMT, ...)                                                     \
    do {                                                                       \
        say_debug(FMT " Application finished.\n", ##__VA_ARGS__);              \
        exit(0);                                                               \
    } while (0)

#define say_goto(GOTO, FMT, ...)                                               \
    do {                                                                       \
        say_debug(FMT "\n", ##__VA_ARGS__);                                    \
        goto GOTO;                                                             \
    } while (0)

#define say_error(FMT, ...)                                                    \
    do {                                                                       \
        say_debug(FMT "\n", ##__VA_ARGS__);                                    \
        verbum_debug_print_error();                                            \
    } while (0)


int  verbum_debug_send_data   (char *content);
void verbum_debug_print_error (void);

#endif


