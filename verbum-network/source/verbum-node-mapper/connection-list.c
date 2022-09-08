
#include "connection-list.h"

int check_connections_list (char *response)
{
    char header [] = "ping-verbum-connection:IHS\n\n";
    char tmp [1024];
    int size = 0, hsize = 0;

    if (!response)
        return 0;

    hsize = strlen(header);

    for (size=0; response[size]!='\0'; size++) {
        if (size == hsize)
            break;
    }

    if (size != hsize)
        return 0;
    
    memset(tmp, 0x0, 1024);
    memcpy(tmp, response, hsize);

    if (strcmp(tmp, header) == 0)
        return 1;
    
    return 0;
}

int update_connections (int sock, char *content)
{
    if (!sock || !content)
        return 0;

    say("full data:");
    say("%s", content);

    return 1;
}


