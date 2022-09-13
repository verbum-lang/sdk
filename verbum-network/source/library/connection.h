
#ifndef VERBUM_LIBRARY_CONNECTION
#define VERBUM_LIBRARY_CONNECTION

#include "global.h"

// Show/hide connections debug messages.
// #define CONDBG

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

#endif


