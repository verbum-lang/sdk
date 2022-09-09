
#include "node-server-ping.h"
#include "node-connection.h"

int server_ping (int sock, char *content)
{
    char message_success [] = VERBUM_DEFAULT_SUCCESS VERBUM_EOH;
    char message_error   [] = VERBUM_DEFAULT_ERROR   VERBUM_EOH;
    char prefix          [] = "connection-ping-verbum-node:";

    char *src_node_id = NULL;
    char *dst_node_id = NULL;
    int   src_nm_port = 0;

    char tmp [1024];
    char *ptr = NULL;
    int bytes = 0;

    if (!sock || !content) 
        goto error;

    // Extract informations.
    ptr = strstr(content, prefix);
    if (!ptr)
        goto error;

    ptr += strlen(prefix);
    memset(tmp, 0x0, 1024);

    for (int a=0,b=0,c=0; ; a++) {
        if (ptr[a] == ':' || ptr[a] == '\0') {

            switch (c) {
                // Dst node ID.
                case 0:
                    mem_salloc_scopy(tmp, dst_node_id);
                    break;

                // Src node ID.
                case 1:
                    mem_salloc_scopy(tmp, src_node_id);
                    break;

                // Src Node Mapper port.
                case 2:
                    src_nm_port = atoi(tmp);
                    break;
            }

            if (ptr[a] == '\0')
                break;

            b = 0;
            c ++;
            memset(tmp, 0x0, 1024);
        } else 
            tmp[b++] = ptr[a];
    }

    if (!dst_node_id || !src_node_id || !src_nm_port)
        goto error;

    say("> 1: \"%s\"", dst_node_id);
    say("> 2: \"%s\"", src_node_id);
    say("> 3: \"%d\"", src_nm_port);

    // Finish.
    success:
    bytes = send(sock, message_success, strlen(message_success), 0);
    return 1;

    error:
    bytes = send(sock, message_error, strlen(message_error), 0);
    return 0;
}


