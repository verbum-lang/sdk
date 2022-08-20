
#ifndef VERBUM_G_GLOBAL
#define VERBUM_G_GLOBAL

#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <stdarg.h>

// Configurations e definations.
#define initialization main // Entry point.
#define CNULL (char *) NULL

// Global data control.
typedef struct {
    struct {
        int argc;
        char **argv;
    } instance;

    struct {
        char *path;
        char *content;
    } configuration;
} global_t;

global_t global;

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

// Check file exists.
int file_exists (char *path);
char *file_read (char *path);

#endif

