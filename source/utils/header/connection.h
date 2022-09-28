
#ifndef _H_UTILS_CONNECTION_
#define _H_UTILS_CONNECTION_

#include "global.h"

#define VERBUM_SEND_FLAGS MSG_NOSIGNAL

#define VERBUM_CON_GENERATE_NODE_ID                     0
#define VERBUM_CON_PING_NODE                            1
#define VERBUM_CON_DELETE_NODE                          2
#define VERBUM_CON_CHECK_NODE_EXISTS                    3
#define VERBUM_CON_CREATE_NODE_OUTPUT_CONNECTION        4
#define VERBUM_CON_CONNECTION_PING_NODE                 5
#define VERBUM_CON_CONNECTION_PING_NODE_MAPPER          6
#define VERBUM_CON_DELETE_CONNECTION                    7
#define VERBUM_CON_DELETE_CONNECTION_SERVER             8
#define VERBUM_CON_CHECK_DIRECT_NODE_MAPPER             9

#define say_end_con(RETURN, fmt, ...)       \
    do {                                    \
        say(fmt, ##__VA_ARGS__);            \
        close(sock);                        \
        return RETURN;                      \
    } while(0)

int   create_connection                     (char *address,        int   port,            int enable_timeout, int one_connection);
int   check_protocol                        (char *address,        int   port,            int enable_timeout, int one_connection);
char *get_recv_content                      (int   sock);
int   send_handshake                        (int   sock,           char *handshake);
char *send_raw_data                         (int   sock,           char *message);
int   check_interface                       (int   port);
int   configure_recv_timeout                (int   sock);
char *process_request                       (int   type,           int   timeout,
                                             char *src_nm_id,      char *src_nm_address,  int   src_nm_port, 
                                             char *src_node_id,    int   src_core_port,   int   src_server_port, 
                                             char *dst_nm_id,      char *dst_nm_address,  int   dst_nm_port,
                                             char *dst_node_id,    int   dst_server_port,
                                             char *connection_id,  int   connection_type, char *connection_list);
char *process_generate_node_id              (char *src_nm_address, int   src_nm_port,     int   src_core_port);
char *process_ping_node                     (char *src_nm_address, int   src_nm_port,     char *src_node_id, 
                                             int   src_core_port,  int   src_server_port);
char *process_delete_node                   (char *src_nm_address, int   src_nm_port,     char *src_node_id);
char *process_check_node_exists             (char *src_nm_address, int   src_nm_port,     char *src_node_id);
char *process_create_connection             (char *src_nm_address, 
                                             char *src_node_id,    int   src_core_port, 
                                             char *dst_node_id,    char *dst_nm_address,  int   dst_nm_port);
char *process_connection_ping               (char *src_nm_id,      char *src_nm_address,  int   src_nm_port, 
                                             char *src_node_id,    char *dst_node_id,     int   dst_server_port, 
                                             char *connection_id);
char *process_ping_connections              (char *src_nm_address, int   src_nm_port,     char *connections_list);
char *process_delete_connection             (char *src_nm_address, char *src_node_id,     int   src_core_port, 
                                             char *dst_node_id,    char *connection_id,   int   connection_type);
char *process_delete_connection_sv      (char *src_nm_address, int   src_nm_port, 
                                             char *src_node_id,    char *dst_node_id,     char *connection_id);
int   process_check_direct_nm               (char *src_nm_address, int   src_nm_port);
int   process_create_node                   (char *address,        int   port, char *node_param);

#endif /* _H_UTILS_CONNECTION_ */


