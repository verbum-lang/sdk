
#include "connection-manager.h"
#include "connection-control.h"

extern pthread_mutex_t    mutex_connections;
extern node_connection_t *connections;

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

static int process_connection_item (char *connection)
{
    char tmp[1024], name[256], value[256];
    
    char *connection_id  = NULL;
    char *src_node_id    = NULL;
    char *dst_node_id    = NULL;
    char *dst_nm_id      = NULL;
    char *dst_nm_address = NULL;
    char *last_date      = NULL;
    int connection_type  = -1;
    int dst_nm_port      = 0;
    
    if (!connection)
        return 0;

    memset(tmp, 0x0, 1024);

    for (int a=0,b=0; ; a++) {
        if (connection[a] == '\n' || connection[a] == '\0') {
            if (strstr(tmp, ":")) {
                
                // Extract name and value.
                memset(name,  0x0, 256);
                memset(value, 0x0, 256);

                for (int c=0,d=0,e=0; tmp[c]!='\0'; c++) {
                    if (d == 0 && tmp[c] == ':')
                        d = 1;
                    else if (d == 1)
                        value[e++] = tmp[c];
                    else
                        name[c] = tmp[c];
                }

                /**
                 * Save data.
                 */

                // Connection type.
                if (strcmp(name, "type") == 0) {
                    if (value[0] == '0')
                        connection_type = 0;
                    else
                        connection_type = 1;
                }

                // Connection ID.
                else if (strcmp(name, "id") == 0) 
                    mem_salloc_scopy(value, connection_id);

                // Source node ID.
                else if (strcmp(name, "src-node-id") == 0) 
                    mem_salloc_scopy(value, src_node_id);

                // Destination/target node ID.
                else if (strcmp(name, "dst-node-id") == 0) 
                    mem_salloc_scopy(value, dst_node_id);

                // Destination/target Node Mapper ID.
                else if (strcmp(name, "dst-nm-id") == 0) 
                    mem_salloc_scopy(value, dst_nm_id);

                // Destination/target Node Mapper address.
                else if (strcmp(name, "dst-nm-addr") == 0) 
                    mem_salloc_scopy(value, dst_nm_address);

                // Destination/target Node Mapper port.
                else if (strcmp(name, "dst-nm-port") == 0) 
                    dst_nm_port = atoi(value);

                // Last connection date.
                else if (strcmp(name, "last-date") == 0) 
                    mem_salloc_scopy(value, last_date);
            }

            if (connection[a] == '\0')
                break;

            b = 0;
            memset(tmp, 0x0, 1024);
        } 

        else
            tmp[b++] = connection[a];
    }

    say("item: \"%s\"", connection_id);
    say("item: \"%d\"", connection_type);
    say("item: \"%s\"", src_node_id);
    say("item: \"%s\"", dst_node_id);
    say("item: \"%s\"", dst_nm_id);
    say("item: \"%s\"", dst_nm_address);
    say("item: \"%d\"", dst_nm_port);
    say("item: \"%s\"", last_date);

    pthread_mutex_lock(&mutex_connections);
    
    pthread_mutex_unlock(&mutex_connections);

    mem_sfree(connection_id);
    mem_sfree(connection_type);
    mem_sfree(src_node_id);
    mem_sfree(dst_node_id);
    mem_sfree(dst_nm_id);
    mem_sfree(dst_nm_address);
    mem_sfree(dst_nm_port);
    mem_sfree(last_date);

    return 1;
}


