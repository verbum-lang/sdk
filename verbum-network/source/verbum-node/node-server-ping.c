
#include "node-server-ping.h"
#include "node-connection.h"

extern pthread_mutex_t    mutex_gconfig;
extern node_config_t     *gconfig;

extern pthread_mutex_t    mutex_connections;
extern node_connection_t *connections;

int server_ping (int sock, char *content)
{
    char message_success [] = VERBUM_DEFAULT_SUCCESS VERBUM_EOH;
    char message_error   [] = VERBUM_DEFAULT_ERROR   VERBUM_EOH;
    char prefix          [] = "connection-ping-verbum-node:";

    char *src_node_id = NULL;
    char *dst_node_id = NULL;
    char *src_con_id  = NULL;
    int   src_nm_port = 0;

    char tmp [1024];
    char *ptr = NULL, *date = NULL;
    int bytes = 0, found = 0, status = 0, size = 0;

    struct sockaddr_in client_addr;
    socklen_t addrlen = sizeof(client_addr);
    char client_ip [100];
    int client_port = -1;

    node_connection_t *connection;
    node_connection_t *nconnection;
    node_connection_t *last;

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

                // Src connection ID.
                case 3:
                    mem_salloc_scopy(tmp, src_con_id);
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

    // Check node.
    pthread_mutex_lock(&mutex_gconfig);

    status = 0;
    if (strcmp(gconfig->information.id, dst_node_id) == 0)
        status = 1;

    pthread_mutex_unlock(&mutex_gconfig);

    if (!status)
        goto error;

    #ifdef NCDBG
        say("> dst_node_id: \"%s\"", dst_node_id);
        say("> src_node_id: \"%s\"", src_node_id);
        say("> src_nm_port: \"%d\"", src_nm_port);
        say("> src_con_id.: \"%s\"", src_con_id);
    #endif

    // Prepare new connection element.
    nconnection = connection_create_item();

    mem_salloc_scopy(src_con_id, nconnection->remote_id); 
    mem_salloc_scopy(src_node_id, nconnection->dst_node_id); 

    nconnection->status             = 2;
    nconnection->connection_status  = 2;
    nconnection->type               = 1;
    nconnection->dst_nm_port        = src_nm_port;
    
    date = make_datetime();
    if (date) {
        memset(nconnection->last_connect_date, 0x0, 100);
        sprintf(nconnection->last_connect_date, "%s", date);
        mem_sfree(date);
    }

    // Remote client IP.
    memset(client_ip, 0x0, 100);
    status = getsockname(sock, (struct sockaddr *)&client_addr, &addrlen);

    if (status == 0) {
        client_port = (int) ntohs(client_addr.sin_port);
        if (inet_ntop(AF_INET, &client_addr.sin_addr, client_ip, sizeof(client_ip)) != NULL) 
            mem_salloc_scopy(client_ip, nconnection->dst_nm_address);
    }

    #ifdef NCDBG
        say("> id...............: \"%s\"", nconnection->id);
        say("> remote id........: \"%s\"", nconnection->remote_id);
        say("> type.............: \"%d\"", nconnection->type);
        say("> dst_node_id......: \"%s\"", nconnection->dst_node_id);
        say("> dst_nm_address...: \"%s\"", nconnection->dst_nm_address);
        say("> dst_nm_port......: \"%d\"", nconnection->dst_nm_port);
        say("> last_connect_date: \"%s\"", nconnection->last_connect_date);
    #endif

    // Search connection.
    status = 0;
    pthread_mutex_lock(&mutex_connections);

    for (connection=connections; connection != NULL; connection=connection->next) {
        if (connection->status != 2) {
            last = connection;
            continue;
        } else if (!connection->id) {
            last = connection;
            continue;
        }

        // Input connections.
        if (connection->type != 1) {
            last = connection;
            continue;
        } else if (!connection->remote_id) {
            last = connection;
            continue;
        }

        if (strcmp(connection->remote_id, nconnection->remote_id)     == 0 &&
            strcmp(connection->dst_node_id, nconnection->dst_node_id) == 0  )
        {
            #ifdef NCDBG
                say("replace connection item.");
            #endif

            found = 1;

            // Save current ID.
            mem_sfree(nconnection->id);
            size = sizeof(char) * (strlen(connection->id) + 1);
            nconnection->id = (char *) realloc(nconnection->id, size);

            if (!nconnection->id) {
                status = 1;
                break;
            }

            memset(nconnection->id, 0x0, size);
            memcpy(nconnection->id, connection->id, strlen(connection->id));

            // Replace item.
            if (!connection->next) {
                last->next = nconnection;
            } else {
                last->next = nconnection;
                nconnection->next = connection->next;
            }

            mem_sfree(connection->id);
            mem_sfree(connection->dst_node_id);
            mem_sfree(connection->dst_nm_id);
            mem_sfree(connection->dst_nm_address);
            free(connection);

            break;
        }

        last = connection;
    }

    pthread_mutex_unlock(&mutex_connections);

    if (status == 1)
        goto error;

    // Not found, insert new item.
    if (!found) {
        if (!connection_insert_item(nconnection))
            goto error;
        else {
            #ifdef NCDBG
                say("new connection!");
            #endif
        }
    }

    // Finish.
    success:
    bytes = send(sock, message_success, strlen(message_success), 0);
    return 1;

    error:
    bytes = send(sock, message_error, strlen(message_error), 0);
    return 0;
}


