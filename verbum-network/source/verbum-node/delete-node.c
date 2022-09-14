
#include "delete-node.h"

extern pthread_mutex_t  mutex_gconfig;
extern node_config_t   *gconfig;

int delete_node (int sock, char *content)
{
    char tmp[1024], prefix [] = "delete-verbum-node:";
    char response_success  [] = VERBUM_DEFAULT_SUCCESS VERBUM_EOH;
    char *ptr = NULL;
    int bytes = 0, status = 0;

    if (!sock || !content)
        return 0;

    // Extract node ID.
    ptr = strstr(content, prefix);
    if (!ptr) 
        return 0;

    ptr += strlen(prefix);
    memset(tmp, 0x0, 1024);
    memcpy(tmp, ptr, strlen(ptr));

    // Check node.
    pthread_mutex_lock(&mutex_gconfig);

    if (strcmp(gconfig->information.id, tmp) == 0)
        status = 1;

    pthread_mutex_unlock(&mutex_gconfig);

    // Finish.
    if (!status)
        return 0;

    bytes = send(sock, response_success, strlen(response_success), VERBUM_SEND_FLAGS);
    say("Verbum Node finished.");
    exit(0);
}


