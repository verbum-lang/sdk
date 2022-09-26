
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

#ifndef MSG_NOSIGNAL
#define MSG_NOSIGNAL 0
#endif

#define VERBUM_LANGUAGE_VERSION             "1.0.0"
#define VERBUM_DEFAULT_NODE_MAPPER_ID       "VNM-IHS"
#define VERBUM_DEFAULT_NODE_MAPPER_S_PORT   3333
#define VERBUM_FORK_CONTROLLER_PORT 	    3331

#define VERBUM_SEND_FLAGS                   MSG_NOSIGNAL
#define VERBUM_CHECK_DELETION_LIMIT         10

// General configurations.
#define LOCALHOST                           "127.0.0.1"
#define SERVERS_MAX_CONNECTION              SOMAXCONN

// Timeout.
#define CONNECTION_TIMEOUT_LIMIT            10
#define CONNECTION_TIMEOUT_SELECT           2
#define CONNECTION_TIMEOUT_RECV             60

// Default response (socket).
#define VERBUM_DEFAULT_SUCCESS              "verbum-node-ok"
#define VERBUM_DEFAULT_ERROR                "verbum-node-fail"
#define VERBUM_EOH                          "\r\n\r\n"

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

        // Node.
        struct {
            char *id;
        } node;
    } configuration;
} global_t;

global_t global;

int random_number  (int min, int max);
int ignore_sigpipe (void);

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


