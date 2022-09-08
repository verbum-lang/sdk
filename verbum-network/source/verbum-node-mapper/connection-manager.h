
#ifndef VERBUM_CONNECTION_MANAGER
#define VERBUM_CONNECTION_MANAGER

#include "global.h"

int check_connections_request       (char *response);
int update_connections              (int sock, char *content);

#endif


