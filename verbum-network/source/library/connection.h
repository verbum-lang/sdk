
#ifndef VERBUM_LIBRARY_CONNECTION
#define VERBUM_LIBRARY_CONNECTION

#include "global.h"

// Show/hide connections debug messages.
// #define CONDBG

#define VERBUM_GENERATE_NODE_ID                 0
#define VERBUM_PING_NODE                        1
#define VERBUM_DELETE_NODE                      2
#define VERBUM_CHECK_NODE_EXISTS                3
#define VERBUM_CREATE_NODE_OUTPUT_CONNECTION    4
#define VERBUM_CONNECTION_PING_NODE             5
#define VERBUM_CONNECTION_PING_NODE_MAPPER      6
#define VERBUM_DELETE_CONNECTION                7
#define VERBUM_DELETE_CONNECTION_SERVER         8
#define VERBUM_CHECK_DIRECT_NODE_MAPPER         9

#define say_end_con(RETURN, fmt, ...)       \
    do {                                    \
        say(fmt, ##__VA_ARGS__);            \
        close(sock);                        \
        return RETURN;                      \
    } while(0)

int   create_connection                     (char *address, int port, int enable_timeout);
int   check_protocol                        (char *address, int port, int enable_timeout);
char *get_recv_content                      (int sock);
int   send_handshake                        (int sock, char *handshake);
char *send_raw_data                         (int sock, char *message);

char *process_generate_node_id              (char *address, int nm_port, int node_port);
char *process_ping_node                     (char *address, int nm_port, char *node_id, int core_port, int server_port);
char *process_delete_node                   (char *address, int node_port, char *node_id);
char *process_check_node_exists             (char *address, int node_port, char *node_id);
char *process_create_node_output_connection (char *src_node_address, 
                                             char *src_node_id, int src_node_interface_port, 
                                             char *dst_node_id, char *dst_nm_address, int dst_nm_port);
char *process_connection_ping               (char *address, int node_port, char *dst_node_id, 
                                             char *src_node_id, int src_nm_port, char *connection_id, char *node_mapper_id);
char *process_ping_connections              (char *address, int nm_port, char *connections_list);
char *process_delete_connection             (char *address, int core_port, char *connection_id, 
                                             char *src_node_id, char *dst_node_id, int type);
char *process_delete_connection_server      (char *address, int node_port, 
                                             char *connection_id, char *src_node_id, char *dst_node_id);
int   process_check_direct_nm               (char *address, int nm_port);

char *process_request (
    int   type,          int timeout,
    char *src_nm_id,     char *src_nm_address,  int src_nm_port, 
    char *src_node_id,   int   src_core_port,   int src_server_port, 
    char *dst_nm_id,     char *dst_nm_address,  int dst_nm_port,
    char *dst_node_id,   int   dst_server_port,
    char *connection_id, int connection_type,   char *connection_list);

#endif


