
#include "delete-connection.h"

extern pthread_mutex_t  mutex_gconfig;
extern node_config_t   *gconfig;

int delete_connection (int sock, char *content)
{
    char prefix [] = "delete-verbum-connection:";
    char response_success  [] = VERBUM_DEFAULT_SUCCESS "-IHS-" VERBUM_EOH;
    char response_error    [] = VERBUM_DEFAULT_ERROR   VERBUM_EOH;
    int bytes = 0;

    if (!sock || !content)
        goto error;



    // Finish.
    success:
    bytes = send(sock, response_success, strlen(response_success), 0);
    return 1;

    error:
    bytes = send(sock, response_error, strlen(response_error), 0);
    return 0;
}


