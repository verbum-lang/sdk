
#include "connection-manager.h"
#include "connection-control.h"
#include "timeout-control.h"

extern pthread_mutex_t    node_mapper_mutex_connections;
extern node_connection_t *node_mapper_connections;

static int process_connection_item (char *connection);

int node_mapper_check_connections_request (char *response)
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

int node_mapper_update_connections (int sock, char *content)
{
    char success_message [] = VERBUM_DEFAULT_SUCCESS VERBUM_EOH;
    char header [] = "ping-verbum-connection:IHS\n\n";
    char tmp [1024];
    int s1 = strlen(header);
    int s2 = strlen(content);
    int item = 0, bytes = 0, request_error = 0, request_count = 0;

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

            request_count ++;
            if (process_connection_item(tmp) == 0)
                request_error ++;

            b = 0;
            a++;
            memset(tmp, 0x0, 1024);
        }

        else
            tmp[b++] = content[a];
    }
    

    // Send success message.
    if (request_count != 0 && request_error >= request_count)
        return 0;

    bytes = send(sock, success_message, strlen(success_message), VERBUM_SEND_FLAGS);
    return 1;
}

static int process_connection_item (char *connection)
{
    node_connection_t *ncon = node_mapper_connection_create_item();
    node_connection_t *con, *last;
    char tmp[1024], name[256], value[256];
    char *ptr = NULL, *current_date = NULL;
    int found = 0, auto_remove = 0, status = 0;
    
    if (!ncon)
        return 0;
    
    if (!connection)
        return 0;

    memset(tmp, 0x0, 1024);

    for (int a=0,b=0; ; a++) {
        if (connection[a] == '\n' || connection[a] == '\0') {
            if (strstr(tmp, ":")) {
                
                // Extract name and value.
                memset(name,  0x0, 256);
                memset(value, 0x0, 256);

                for (int c=0; tmp[c]!='\0'; c++) {
                    if (tmp[c] == '\n' || 
                        tmp[c] == '\r' || 
                        tmp[c] == '\t'  )
                    {
                        tmp[c] = '\0';
                        break;
                    }
                }

                for (int c=0; tmp[c]!='\0'; c++) {
                    if (tmp[c] == ':')
                        break;
                    else
                        name[c] = tmp[c];
                }

                ptr = strstr(tmp, ":");
                ptr++;
                memcpy(value, ptr, strlen(ptr));

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

                // Connection error.
                else if (strcmp(name, "error") == 0) 
                    ncon->connection_error = atoi(value);

                // Connection error count.
                else if (strcmp(name, "error-count") == 0) 
                    ncon->connection_error_count = atoi(value);

                // Destination node server interface port.
                else if (strcmp(name, "dst-node-sv-port") == 0) 
                    ncon->dst_node_sv_port = atoi(value);

                // Destination Node Mapper accepts direct connection.
                else if (strcmp(name, "dst-nm-direct") == 0) 
                    ncon->dst_nm_direct = atoi(value);

            }

            if (connection[a] == '\0')
                break;

            b = 0;
            memset(tmp, 0x0, 1024);
        } 

        else
            tmp[b++] = connection[a];
    }

    #ifdef NMDBG
        say("item: \"%s\"", ncon->id);
        say("item: \"%d\"", ncon->type);
        say("item: \"%s\"", ncon->src_node_id);
        say("item: \"%s\"", ncon->dst_node_id);
        say("item: \"%s\"", ncon->dst_nm_id);
        say("item: \"%s\"", ncon->dst_nm_address);
        say("item: \"%d\"", ncon->dst_nm_port);
        say("item: \"%s\"", ncon->last_connect_date);
        say("item: \"%d\"", ncon->connection_error);
        say("item: \"%d\"", ncon->connection_error_count);
        say("item: \"%d\"", ncon->dst_node_sv_port);
        say("item: \"%d\"", ncon->dst_nm_direct);
    #endif

    // Status flag.
    ncon->status = 1;
    auto_remove  = 0;
    current_date = make_datetime();
    
    if (current_date) {

        // Check input connections timeout.
        if (date_difference(ncon->last_connect_date, 
                current_date, VERBUM_CONNECTION_SEC_TIMEOUT_ERROR)) 
        {
            #ifdef NMDBG
                say("Enable error flag - timeout - update connections.");
                say("Timeout: %s, %s", ncon->last_connect_date, current_date);
                say("Type: %d, Src: %s, Dst: %s\n", 
                    ncon->type, ncon->src_node_id, ncon->dst_node_id);
            #endif

            ncon->connection_error = 1;
            ncon->connection_error_count++;

            if (ncon->connection_error_count >= 1000000)
                ncon->connection_error_count = 0;
        }

        // Checks auto-remove.
        #ifdef VERBUM_CONNECTION_AUTO_REMOVE
            if (date_difference(ncon->last_connect_date, 
                    current_date, VERBUM_CONNECTION_SEC_TIMEOUT_AUTO_REMOVE)) 
            {
                #ifdef NMDBG
                    say("Auto remove - timeout - update connections.");
                    say("Timeout: %s, %s", ncon->last_connect_date, current_date);
                    say("Type: %d, Con ID: %s", ncon->type, ncon->id);
                    say("Src: %s, Dst: %s\n", ncon->src_node_id, ncon->dst_node_id);
                #endif

                status = 0;

                // Output.
                #ifdef VERBUM_CONNECTION_AUTO_REMOVE_OUTPUT
                    if (ncon->type == 0)
                        status = 1;
                #endif
                
                // Input.
                #ifdef VERBUM_CONNECTION_AUTO_REMOVE_INPUT
                    if (ncon->type == 1)
                        status = 1;
                #endif

                if (status == 1)
                    auto_remove = 1;
            }
        #endif
        
        mem_sfree(current_date);
    }

    if (auto_remove == 1)
        return 0;

    pthread_mutex_lock(&node_mapper_mutex_connections);

    // Search connection.
    for (con=node_mapper_connections; con!=NULL; con=con->next) {
        if (con->status != 1 || !con->id || !con->dst_node_id) {
            last = con;
            continue;
        }

        if (strcmp(con->id, ncon->id)                   == 0 &&
            strcmp(con->src_node_id, ncon->src_node_id) == 0 &&
            strcmp(con->dst_node_id, ncon->dst_node_id) == 0 &&
            con->type == ncon->type                           ) 
        {
            found = 1;

            // Replace item.
            if (!con->next) 
                last->next = ncon;
            else {
                last->next = ncon;
                ncon->next = con->next;
            }

            mem_sfree(con->id);
            mem_sfree(con->src_node_id);
            mem_sfree(con->dst_node_id);
            mem_sfree(con->dst_nm_id);
            mem_sfree(con->dst_nm_address);
            free(con);

            break;
        }

        last = con;
    }

    pthread_mutex_unlock(&node_mapper_mutex_connections);

    // Not found, insert new item.
    if (!found)
        node_mapper_connection_insert_item(ncon);

    #ifdef NMDBG
        say("Update connection success!");
    #endif

    return 1;
}


