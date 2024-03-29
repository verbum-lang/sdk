
#include "check-node-exists.h"

extern pthread_mutex_t  mutex_gconfig;
extern node_config_t   *gconfig;

int node_check_node_exists (int sock, char *content)
{
    char tmp[1024], prefix  [] = "check-verbum-node-exists:";
    char response_success_p [] = VERBUM_DEFAULT_SUCCESS;
    char *ptr = NULL, *response_success = NULL, *id = NULL;
    int bytes = 0, status = 0, size = 0, core_port = 0, server_port = 0;

    if (!sock || !content)
        return 0;

    // Extract node ID.
    ptr = strstr(content, prefix);
    if (!ptr) 
        goto error;

    ptr += strlen(prefix);
    memset(tmp, 0x0, 1024);
    memcpy(tmp, ptr, strlen(ptr));

    // Check node.
    pthread_mutex_lock(&mutex_gconfig);

    if (strcmp(gconfig->information.id, tmp) == 0) {
        mem_scopy_goto(gconfig->information.id, id, end_mutex);
        core_port   = gconfig->information.core_port;
        server_port = gconfig->information.server_port;
        status      = 1;
    }

    end_mutex:
    pthread_mutex_unlock(&mutex_gconfig);

    if (!status) 
        goto error;

    status = 0;
    size   = sizeof(char) * (strlen(response_success_p) + strlen(id) + 1024); 

    mem_salloc_goto(response_success, size, error);

    // Return node information.
    sprintf(response_success, 
        "%s\n\n"
        "verbum-node-information:%s:%d:%d", 
            response_success_p, id, core_port, server_port);

    bytes = send(sock, response_success, strlen(response_success), VERBUM_SEND_FLAGS);

    // Success.
    mem_sfree(id);
    mem_sfree(response_success);
    
    return 1;

    // Error.
    error:
    mem_sfree(id);
    mem_sfree(response_success);
    
    return 0;
}


