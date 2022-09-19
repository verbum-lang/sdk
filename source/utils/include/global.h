
#ifndef VERBUM_UTILS_GLOBAL
#define VERBUM_UTILS_GLOBAL

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


/**
 * Connection settings.
 */

// General configurations.
#define LOCALHOST                           "127.0.0.1"
#define SERVERS_MAX_CONNECTION              SOMAXCONN

// Send function flags.
#define VERBUM_SEND_FLAGS                   MSG_NOSIGNAL

// Information represented in seconds.
#define CONNECTION_TIMEOUT_LIMIT            10  // Connect.
#define CONNECTION_TIMEOUT_SELECT           2   // Select.
#define CONNECTION_TIMEOUT_RECV             60  // Recv.

// Default response (protocol).
#define VERBUM_DEFAULT_SUCCESS              "verbum-node-ok"
#define VERBUM_DEFAULT_ERROR                "verbum-node-fail"

// End of header.
#define VERBUM_EOH                          "\r\n\r\n"

// Limit of attempts to delete a connection.
#define VERBUM_CHECK_DELETION_LIMIT         10


/**
 * Global application settings.
 */

typedef struct {
    struct {

        struct {
            char *id;
        } node;
        
        struct {
            int server_port;
            char *id;
        } node_mapper;
        
    } configuration;
} global_t;

global_t global;


/**
 * Global macros.
 */

#define initialization main

#ifndef PATH_MAX
#define PATH_MAX 4096
#endif

#ifndef MSG_NOSIGNAL
#define MSG_NOSIGNAL 0
#endif

#define infinite_loop()         \
    do {                        \
        while (1)               \
            sleep(3);           \
    } while (0)

#endif

#define case_item_a(ITEM) case ITEM: sprintf(str, #ITEM); break


/**
 * Prototypes.
 */

int random_number      (int min, int max);
int ignore_sigpipe     (void);
void show_accept_error (void);


