
#ifndef VERBUM_LIBRARY_CONNECTION
#define VERBUM_LIBRARY_CONNECTION

#include "global.h"

int check_connection_banner_nm_ft (char *prefix, char *address, int port, char *header, int timeout);
int check_connection_banner_nm_ft_blocking (char *prefix, char *laddr, int port, char *header);
int check_connection_banner_nm_ft_non_blocking (char *prefix, char *laddr, int port, char *header, int timeout);

#endif


