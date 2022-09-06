
#ifndef VERBUM_CREATE_NODE_CONNECTION
#define VERBUM_CREATE_NODE_CONNECTION

#include "global.h"

int create_node_connection        (int sock, char *content, int type, char *id);
int create_node_output_connection (int sock, char *dst_node_id, char *dst_nm_address, int dst_nm_port);

#endif


