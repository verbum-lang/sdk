
#ifndef VERBUM_GLOBAL
#define VERBUM_GLOBAL

/**
 * General.
 */

#define CURRENT_PACKAGE_NAME "Verbum Node Mapper"

#include "../library/global.h"
#include "../library/memory.h"
#include "../library/debug.h"
#include "../library/application.h"
#include "../library/file.h"
#include "../library/ini_file.h"
#include "../library/datetime.h"
#include "../library/connection.h"

#include "../dependencies/cvector.h"
#include "../dependencies/cvector_utils.h"

// Re-define macros.
#ifdef      PACKAGE_NAME
    #undef  PACKAGE_NAME
    #define PACKAGE_NAME CURRENT_PACKAGE_NAME
#endif
#ifndef     PACKAGE_NAME
    #define PACKAGE_NAME CURRENT_PACKAGE_NAME
#endif

/**
 * Global.
 */

#include <sys/socket.h>
#include <arpa/inet.h>
#include <unistd.h>

// Show/hide debug messages.
// #define NMDBG

// Thread workers limit.
#define NM_THREAD_LIMIT 100

// Thread param control.
typedef struct {
    int port;                           // Server port.
    int max_connections;                // Server max connections.
    char *path;                         // Configuration file path.
} interface_param_t;

typedef struct {
    int wid;                            // Worker ID.
    char *path;                         // Configuration file path.
} worker_param_t;

// Thread workers control.
typedef struct thread_worker_st {
    pthread_t tid;                      // Thread ID.
    int wid;                            // Worker ID.
    int status;                         // Status:
                                        //  0 = free to use.
                                        //  1 = started by controller.
                                        //  2 = running.
    int sock;                           // Current client socket.
    struct thread_worker_st *next;      // Next node pointer.
} thread_worker_t;

// Client-node struct control.
typedef struct node_control_st {
    int status;                         // Status node (1: enabled, 0: disabled).
    char *id;                           // Node unique identification.
    int port;                           // Node interface port.
    char last_connect_date [100];       // d-m-Y h:m:s
    struct node_control_st *next;       // Next node pointer.
} node_control_t;

// Connections struct control.
typedef struct node_connection_st {
    int id;                             // Connection ID.
    char *node_id;                      // Node unique identification.
    int type;                           // Connection type.
                                        //  0 = input.
                                        //  1 = output.
    char *dst_node_id;                  // Destination node ID.
    char *node_mapper_address;          // Destination Node Mapper IP address.
    int node_mapper_port;               // Destination Node Mapper port.
    struct node_connection_st *next;    // Next node pointer.
} node_connection_t;

node_control_t  *node_create_item      (void);
int              node_insert_item      (node_control_t *new_node);

#endif


