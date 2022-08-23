
#ifndef VERBUM_LIBRARY_CONNECTION
#define VERBUM_LIBRARY_CONNECTION

#include "global.h"

int check_connection_banner_nm (char *prefix, char *address, int port, char *header, int timeout);
int check_connection_banner_nm_blocking (char *prefix, char *laddr, int port, char *header);
int check_connection_banner_nm_non_blocking (char *prefix, char *laddr, int port, char *header, int timeout);
char * generate_node_id (char *address, int node_mapper_port, int timeout);

#endif


