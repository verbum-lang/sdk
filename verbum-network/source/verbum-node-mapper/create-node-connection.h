
#ifndef VERBUM_CREATE_NODE_CONNECTION
#define VERBUM_CREATE_NODE_CONNECTION

#include "global.h"

int create_node_connection        (int sock, char *content, int type);
int create_node_output_connection (int   sock, 
                                   char *src_node_id, int   src_node_interface_port, 
                                   char *dst_node_id, char *dst_nm_address, int dst_nm_port);
                                   
#endif


