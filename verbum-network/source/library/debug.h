
#ifndef VERBUM_LIBRARY_DEBUG
#define VERBUM_LIBRARY_DEBUG

#define PACKAGE_NAME "Verbum Network"
#define PACKAGE_PREFIX_ARROW " -> "

/*
 * Internal macros.
 */

// Debug macro.
#define lib_debug_print(fmt, ...)                                                       \
    do {                                                                                \
        time_t now = time(NULL);                                                        \
        struct tm *tms = localtime(&now);                                               \
        fprintf(stderr, "[%d:%d:%d] -> %s:%d:%s(): " fmt "\n",                          \
            tms->tm_hour, tms->tm_min, tms->tm_sec,                                     \
            __FILE__, __LINE__, __func__, ##__VA_ARGS__ );                              \
    } while (0)

#define lib_debug_exit(fmt, ...)                                                        \
    do {                                                                                \
        lib_debug_print(fmt, ##__VA_ARGS__);                                            \
        exit(0);                                                                        \
    } while (0)

// Print macro.
#define lib_say(fmt, ...)                                                               \
    do {                                                                                \
        time_t now = time(NULL);                                                        \
        struct tm *tms = localtime(&now);                                               \
        printf("[%d:%d:%d] -> " fmt "\n",                                               \
            tms->tm_hour, tms->tm_min, tms->tm_sec,                                     \
            ##__VA_ARGS__);                                                             \
    } while(0)

#define lib_say_exit(fmt, ...)                                                          \
    do {                                                                                \
        lib_say(fmt, ##__VA_ARGS__);                                                    \
        exit(0);                                                                        \
    } while(0)

/*
 * External macros.
 */

// Debug macro.
#define debug_print(fmt, ...)                                                           \
    do {                                                                                \
        lib_debug_print(PACKAGE_NAME PACKAGE_PREFIX_ARROW fmt, ##__VA_ARGS__);          \
    } while (0)

#define debug_exit(fmt, ...)                                                            \
    do {                                                                                \
        lib_debug_exit(PACKAGE_NAME PACKAGE_PREFIX_ARROW fmt, ##__VA_ARGS__);           \
    } while (0)

// Print macro.
#define say(fmt, ...)                                                                   \
    do {                                                                                \
        lib_say(PACKAGE_NAME PACKAGE_PREFIX_ARROW fmt, ##__VA_ARGS__);                  \
    } while(0)

#define say_exit(fmt, ...)                                                              \
    do {                                                                                \
        lib_say_exit(PACKAGE_NAME PACKAGE_PREFIX_ARROW fmt, ##__VA_ARGS__);             \
    } while(0)

#endif


