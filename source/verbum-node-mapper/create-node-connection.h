
#ifndef VERBUM_NM_CREATE_NODE_CONNECTION
#define VERBUM_NM_CREATE_NODE_CONNECTION

#include "global.h"

int node_mapper_create_node_connection        (int sock, char *content, int type);
int node_mapper_create_node_output_connection (int   sock, 
                                   char *src_node_id, int   src_node_interface_port, 
                                   char *dst_node_id, char *dst_nm_address, int dst_nm_port);
                                   
#endif


