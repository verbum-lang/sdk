
#ifndef VERBUM_LIBRARY_GLOBAL
#define VERBUM_LIBRARY_GLOBAL

#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <stdarg.h>
#include <unistd.h>
#include <limits.h>
#include <time.h>
#include <errno.h> 
#include <dirent.h>
#include <signal.h>
#include <locale.h>

#include <sys/time.h>
#include <sys/types.h> 
#include <sys/socket.h> 
#include <sys/wait.h> 
#include <netinet/in.h> 
#include <arpa/inet.h>
#include <fcntl.h>

#include <pthread.h>

// General configurations.
#define CONNECTIONS_TIMEOUT1            10
#define LOCALHOST                       "127.0.0.1"
#define SERVERS_MAX_CONNECTION          1000

// Default response (socket).
#define VERBUM_DEFAULT_SUCCESS          "verbum-node-ok"
#define VERBUM_DEFAULT_ERROR            "verbum-node-fail"
#define VERBUM_EOH                      "\r\n\r\n"

// Configurations e definations.
#define initialization main // Entry point.

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
            char *id;
        } node_mapper;
    } configuration;
} global_t;

global_t global;

int random_number (int min, int max);

// Macros.
#ifndef PATH_MAX
#define PATH_MAX 4096
#endif

#define infinite_loop()         \
    do {                        \
        while (1)               \
            sleep(3);           \
    } while (0)

#endif


