
#include "delete-connection.h"

int delete_connection (int sock, char *content)
{
    char prefix [] = "delete-verbum-connection:";
    char tmp [1024];
    char *ptr = NULL;

    char *connection_id = NULL;
    char *src_node_id   = NULL;
    char *dst_node_id   = NULL;
    int connection_type = -1; // 0 = Input, 1 = Output.

    if (!sock || !content)
        return 0;

    ptr = strstr(content, prefix);
    if (!ptr)
        return 0;

    ptr += strlen(prefix);
    memset(tmp, 0x0, 1024);

    // Request informations.
    for (int a=0,b=0,c=0; ; a++) {
        if (ptr[a] == ':' || ptr[a] == '\0') {
            
            switch (c) {
                // Connection ID.
                case 0:
                    mem_salloc_scopy(tmp, connection_id);
                    break;
                // Source node ID.
                case 1:
                    mem_salloc_scopy(tmp, src_node_id);
                    break;
                // Destination/target node ID.
                case 2:
                    mem_salloc_scopy(tmp, dst_node_id);
                    break;
                // Connection type.
                case 3:
                    connection_type = atoi(tmp);
                    break;
            }

            b = 0;
            c ++ ;
            memset(tmp, 0x0, 1024);

            if (ptr[a] == '\0')
                break;
        }

        else
            tmp[b++] = ptr[a];
    }

    if (!connection_id || !src_node_id || !dst_node_id || connection_type == -1)
        return 0;
    
    say("Connection type: \"%d\"", connection_type);
    say("Connection ID..: \"%s\"", connection_id);
    say("Src node ID....: \"%s\"", src_node_id);
    say("Dst node ID....: \"%s\"", dst_node_id);

    return 1;
}


