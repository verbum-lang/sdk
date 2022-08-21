
#ifndef VERBUM_DEBUG
#define VERBUM_DEBUG

#define PACKAGE_NAME "Verbum Node"
#define PACKAGE_PREFIX_ARROW " -> "

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


