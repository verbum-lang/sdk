
#ifndef VERBUM_UTILS_DEBUG
#define VERBUM_UTILS_DEBUG

// #define ENABLE_DEBUG_DETAILS

/**
 * Internal macros.
 */

#define lib_say_internal(fmt, ...)                                                      \
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
        if (strlen(hour) == 1)                                                          \
            sprintf(hour, "0%d", tms->tm_hour);                                         \
        if (strlen(min) == 1)                                                           \
            sprintf(min, "0%d",  tms->tm_min);                                          \
        if (strlen(sec) == 1)                                                           \
            sprintf(sec, "0%d",  tms->tm_sec);                                          \
                                                                                        \
        printf("[%s:%s:%s] -> %s:%d:%s(): " fmt "\n",                                   \
                    hour, min, sec, __FILE__, __LINE__, __func__, ##__VA_ARGS__ );      \
    } while (0)

#ifdef ENABLE_DEBUG_DETAILS
    #define lib_say(fmt, ...) lib_say_internal(fmt, ##__VA_ARGS__)
#else
    #define lib_say(fmt, ...) printf(fmt "\n", ##__VA_ARGS__) 
#endif


/**
 * External macros.
 */

#define say(fmt, ...)                                                                   \
    do {                                                                                \
        lib_say(fmt, ##__VA_ARGS__);                                                    \
    } while(0)

#define say_ret(RETURN, fmt, ...)                                                       \
    do {                                                                                \
        lib_say(fmt, ##__VA_ARGS__);                                                    \
        return RETURN;                                                                  \
    } while(0)

#define say_noret(fmt, ...)                                                             \
    do {                                                                                \
        lib_say(fmt, ##__VA_ARGS__);                                                    \
        return;                                                                         \
    } while(0)

#define say_exit(fmt, ...)                                                              \
    do {                                                                                \
        lib_say(fmt, ##__VA_ARGS__);                                                    \
        exit(0);                                                                        \
    } while(0)

#define say_goto(GOTO, fmt, ...)                                                        \
    do {                                                                                \
        lib_say(fmt, ##__VA_ARGS__);                                                    \
        goto GOTO;                                                                      \
    } while (0)

#endif


