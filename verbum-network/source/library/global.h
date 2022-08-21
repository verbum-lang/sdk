
#ifndef VERBUM_LIBRARY_GLOBAL
#define VERBUM_LIBRARY_GLOBAL

#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <stdarg.h>
#include <unistd.h>
#include <limits.h>
#include <pthread.h>

// Configurations e definations.
#define initialization main // Entry point.
#define CNULL (char *) NULL

// Global application data control.
typedef struct {
    struct {
        int argc;
        char **argv;
        char *path;     // Running application path.
    } instance;

    struct {
        char *path;     // Directory path of configuration file.
        char *content;  // Data content of configuration file.

        // Node Mapper configuration.
        struct {
            int server_port;
        } node_mapper;
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

#endif


