
#ifndef VERBUM_LIBRARY_DEBUG
#define VERBUM_LIBRARY_DEBUG

#define PACKAGE_NAME            "Verbum Network"
#define PACKAGE_PREFIX_ARROW    " -> "

#include <sys/time.h>

/**
 * Internal macros.
 */

// Debug macro.
#define lib_debug_print_internal(DEBUG_FLAG, fmt, ...)                                  \
    do {                                                                                \
        time_t now     = time(NULL);                                                    \
        struct tm *tms = localtime(&now);                                               \
        char hour[5], min[5], sec[5];                                                   \
                                                                                        \
        memset(hour, 0x0, 5);                                                           \
        memset(min,  0x0, 5);                                                           \
        memset(sec,  0x0, 5);                                                           \
                                                                                        \
        sprintf(hour, "%d", tms->tm_hour);                                              \
        sprintf(min,  "%d", tms->tm_min);                                               \
        sprintf(sec,  "%d", tms->tm_sec);                                               \
                                                                                        \
        if (DEBUG_FLAG == 1)                                                            \
            printf("[%s:%s:%s] -> %s:%d:%s(): " fmt "\n",                               \
                hour, min, sec,                                                         \
                __FILE__, __LINE__, __func__, ##__VA_ARGS__ );                          \
        else                                                                            \
            printf("[%s:%s:%s]: " fmt "\n",                                             \
                hour, min, sec, ##__VA_ARGS__ );                                        \
    } while (0)

#define lib_debug_print(fmt, ...)                                                       \
    do {                                                                                \
        lib_debug_print_internal(1, fmt, ##__VA_ARGS__);                                \
    } while(0)

#define lib_say(fmt, ...)                                                               \
    do {                                                                                \
        lib_debug_print_internal(0, fmt, ##__VA_ARGS__);                                \
    } while(0)

/**
 * External macros.
 */

#define debug_print(fmt, ...)                                                           \
    do {                                                                                \
        lib_debug_print(PACKAGE_NAME PACKAGE_PREFIX_ARROW fmt, ##__VA_ARGS__);          \
    } while (0)

#define say(fmt, ...)                                                                   \
    do {                                                                                \
        lib_say(PACKAGE_NAME PACKAGE_PREFIX_ARROW fmt, ##__VA_ARGS__);                  \
    } while(0)

#define say_ret(RETURN, fmt, ...)                                                       \
    do {                                                                                \
        lib_say(PACKAGE_NAME PACKAGE_PREFIX_ARROW fmt, ##__VA_ARGS__);                  \
        return RETURN;                                                                  \
    } while(0)

#define say_noret(fmt, ...)                                                             \
    do {                                                                                \
        lib_say(PACKAGE_NAME PACKAGE_PREFIX_ARROW fmt, ##__VA_ARGS__);                  \
        return;                                                                         \
    } while(0)

/**
 * Macros with return value.
 */

#define debug_ret(RETURN, fmt, ...)                                                     \
    do {                                                                                \
        debug_print(fmt, ##__VA_ARGS__);                                                \
        return RETURN;                                                                  \
    } while (0)
    
#define debug_noret(fmt, ...)                                                           \
    do {                                                                                \
        debug_print(fmt, ##__VA_ARGS__);                                                \
        return;                                                                         \
    } while (0)
    
#endif


