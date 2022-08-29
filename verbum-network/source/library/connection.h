
#ifndef VERBUM_LIBRARY_CONNECTION
#define VERBUM_LIBRARY_CONNECTION

#include "global.h"

// Show/hide connections debug messages.
// #define CONDBG

int check_connection_banner_nm (char *address, int port);
int check_connection_banner_nm_blocking (char *laddr, int port);
int check_connection_banner_nm_non_blocking (char *laddr, int port);
char * send_message_nm (char *laddr, int port, char *message, int message_size);
char * generate_node_id (char *address, int node_mapper_port, int node_port);
char * ping_node (char *address, int node_mapper_port, char *id);

#endif


