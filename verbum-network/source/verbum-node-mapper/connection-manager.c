
#include "connection-manager.h"
#include "connection-control.h"

static int process_connection_item (char *connection);

int check_connections_request (char *response)
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
    char header [] = "ping-verbum-connection:IHS\n\n";
    char tmp [1024];
    int s1 = strlen(header);
    int s2 = strlen(content);
    int item = 0;

    if (!sock || !content)
        return 0;

    memset(tmp, 0x0, 1024);

    for (int a=s1,b=0; a<s2; a++) {
        if ((a+1) < s2) {
            if (content[a] == '\n' && content[a+1] == '\n') 
                item = 1;
        }

        // Process item.
        if (item) {
            item = 0;

            process_connection_item(tmp);

            b = 0;
            a++;
            memset(tmp, 0x0, 1024);
        }

        else
            tmp[b++] = content[a];
    }
    
    return 1;
}

/*
    type:0
    id:verbum-connection-665529
    src-node-id:verbum-node-804454856
    dst-node-id:verbum-node-277920818
    dst-nm-id:null
    dst-nm-addr:127.0.0.1
    dst-nm-port:3333
    last-date:08-08-2022 04-31-59
*/

static int process_connection_item (char *connection)
{
    char tmp[1024];

    if (!connection)
        return 0;

    memset(tmp, 0x0, 1024);

    for (int a=0,b=0; connection[a]!='\0'; a++) {
        if (connection[a] == '\n') {
            if (strstr(tmp, ":")) {
                
                
            }

            b = 0;
            memset(tmp, 0x0, 1024);
        } 

        else
            tmp[b++] = connection[a];
    }

    return 1;
}


