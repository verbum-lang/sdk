
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

int   create_connection        (char *address, int port, int enable_timeout);
int   check_protocol           (char *address, int port, int enable_timeout);
char *get_recv_content         (int sock);
int   send_handshake           (int sock, char *handshake);
char *send_raw_data            (int sock, char *message);
char *process_generate_node_id (char *address, int nm_port, int node_port);
char *process_ping_node        (char *address, int nm_port, char *node_id, int node_port);
char *process_delete_node      (char *address, int node_port, char *node_id);

#endif


