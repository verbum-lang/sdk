
#include "check-node-exists.h"

int check_node_exists (int sock, char *content, char *id)
{
    char tmp[1024], prefix [] = "check-verbum-node-exists:";
    char response_success  [] = VERBUM_DEFAULT_SUCCESS VERBUM_EOH;
    char response_error    [] = VERBUM_DEFAULT_ERROR   VERBUM_EOH;
    char *ptr = NULL;
    int bytes = 0, status = 0;

    if (!sock || !content || !id)
        return 0;

    // Extract node ID.
    ptr = strstr(content, prefix);
    if (!ptr) 
        goto cne_end;

    ptr += strlen(prefix);
    memset(tmp, 0x0, 1024);
    memcpy(tmp, ptr, strlen(ptr));

    // Check node.
    if (strcmp(id, tmp) == 0)
        status = 1;

    cne_end:

    return 1;
}


