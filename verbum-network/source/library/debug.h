
#ifndef VERBUM_LIBRARY_DEBUG
#define VERBUM_LIBRARY_DEBUG

// Debug macro.
#define debug_print(fmt, ...)                                                           \
    do {                                                                                \
        fprintf(stderr, "%s:%d:%s(): " fmt "\n",                                        \
            __FILE__, __LINE__, __func__, ##__VA_ARGS__ );                              \
    } while (0)

#define debug_exit(fmt, ...)                                                            \
    do {                                                                                \
        debug_print(fmt, ##__VA_ARGS__);                                                \
        exit(0);                                                                        \
    } while (0)

// Print macro.
#define say(fmt, ...)                                                                   \
    do {                                                                                \
        printf(fmt "\n", ##__VA_ARGS__);                                                \
    } while(0)

#define say_exit(fmt, ...)                                                              \
    do {                                                                                \
        say(fmt, ##__VA_ARGS__);                                                        \
        exit(0);                                                                        \
    } while(0)

#endif


