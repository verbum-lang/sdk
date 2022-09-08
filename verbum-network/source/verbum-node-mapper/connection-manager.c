
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
    node_connection_t *ncon = connection_create_item();
    node_connection_t *con;
    char tmp[1024], name[256], value[256];
    int found = 0;
    
    if (!ncon)
        return 0;
    
    if (!connection)
        return 0;

    memset(tmp, 0x0, 1024);
    ncon->status = 1;

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
                        ncon->type = 0;
                    else
                        ncon->type = 1;
                }

                // Connection ID.
                else if (strcmp(name, "id") == 0) 
                    mem_salloc_scopy(value, ncon->id);

                // Source node ID.
                else if (strcmp(name, "src-node-id") == 0) 
                    mem_salloc_scopy(value, ncon->src_node_id);

                // Destination/target node ID.
                else if (strcmp(name, "dst-node-id") == 0) 
                    mem_salloc_scopy(value, ncon->dst_node_id);

                // Destination/target Node Mapper ID.
                else if (strcmp(name, "dst-nm-id") == 0) 
                    mem_salloc_scopy(value, ncon->dst_nm_id);

                // Destination/target Node Mapper address.
                else if (strcmp(name, "dst-nm-addr") == 0) 
                    mem_salloc_scopy(value, ncon->dst_nm_address);

                // Destination/target Node Mapper port.
                else if (strcmp(name, "dst-nm-port") == 0) 
                    ncon->dst_nm_port = atoi(value);

                // Last connection date.
                else if (strcmp(name, "last-date") == 0) {
                    memset(ncon->last_connect_date, 0x0, 100);
                    memcpy(ncon->last_connect_date, value, strlen(value));
                }
            }

            if (connection[a] == '\0')
                break;

            b = 0;
            memset(tmp, 0x0, 1024);
        } 

        else
            tmp[b++] = connection[a];
    }

    // say("item: \"%s\"", ncon->id);
    // say("item: \"%d\"", ncon->type);
    // say("item: \"%s\"", ncon->src_node_id);
    // say("item: \"%s\"", ncon->dst_node_id);
    // say("item: \"%s\"", ncon->dst_nm_id);
    // say("item: \"%s\"", ncon->dst_nm_address);
    // say("item: \"%d\"", ncon->dst_nm_port);
    // say("item: \"%s\"", ncon->last_connect_date);

    pthread_mutex_lock(&mutex_connections);

    // Search connection.
    for (con=connections; con!=NULL; con=con->next) {
        if (con->status != 1)
            continue;
        if (!con->id)
            continue;

        // Update data.
        if (strcmp(con->id, ncon->id) == 0) {
            found = 1;

            // Date.
            memset(con->last_connect_date, 0x0, 100);
            memcpy(con->last_connect_date, 
                ncon->last_connect_date, strlen(ncon->last_connect_date));

            break;
        }
    }

    pthread_mutex_unlock(&mutex_connections);

    // Not found, insert new item.
    if (!found)
        connection_insert_item(ncon);

    return 1;
}


