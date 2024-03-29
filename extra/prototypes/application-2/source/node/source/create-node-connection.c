
#include "create-node-connection.h"
#include "node-client.h"

extern pthread_mutex_t    mutex_gconfig;
extern node_config_t     *gconfig;

extern node_connection_t *node_connections;
extern pthread_mutex_t    node_mutex_connections;

/**
 * type:
 *  0 = OUTPUT
 *  1 = INPUT
 */

int node_create_node_connection(int sock, char *content, int type)
{
    char response_error [] = VERBUM_DEFAULT_ERROR VERBUM_EOH;
    char tmp [1024];

    char *id = NULL;
    char *src_node_id      = NULL;
    char *dst_node_id      = NULL;
    char *dst_nm_address   = NULL;
 
    int result = 0, dst_nm_port = 0, brk = 0, size = 0;
    int bytes = 0, status = 0, src_node_interface_port = 0;
        
    if (!sock || !content)
        goto error;

    // Copy node information.
    pthread_mutex_lock(&mutex_gconfig);

    size = sizeof(char) * (strlen(gconfig->information.id) + 1);
    id = (char *) malloc(size);

    if (!id) {
        pthread_mutex_unlock(&mutex_gconfig);
        return 0;
    }

    memset(id, 0x0, size);
    memcpy(id, gconfig->information.id, strlen(gconfig->information.id));
    
    pthread_mutex_unlock(&mutex_gconfig);

    // Extract request information
    memset(tmp, 0x0, 1024);

    for (int a=0,b=0,c=0,d=0; content[a] != '\0'; a++) {
        if (b == 0 && content[a] == ':')
            b = 1; // Enable.

        else if (b == 1) {
            if (content[a] == ':') {
                switch (d) {

                    // Source node ID.
                    case 0:
                        mem_scopy_ret(tmp, src_node_id, 0);
                        break;
                    
                    // Destination node ID.
                    case 1:
                        mem_scopy_ret(tmp, dst_node_id, 0);
                        break;
                    
                    // Destination Node Mapper address.
                    case 2:
                        mem_scopy_ret(tmp, dst_nm_address, 0);
                        break;
                    
                    default:
                        brk = 1;
                }

                if (brk == 1)
                    break;

                c = 0;
                d++;
                memset(tmp, 0x0, 1024);
            } 

            else
                tmp[c++] = content[a];
        }
    }

    // Destination Node Mapper port.
    if (tmp) 
        if (strlen(tmp) > 0) 
            dst_nm_port = atoi(tmp);

    if (!src_node_id    || !dst_node_id || 
        !dst_nm_address || !dst_nm_port  )
        goto error;

    #ifdef NCDBG_CON
        say("src_node_id....: \"%s\"", src_node_id);
        say("dst_node_id....: \"%s\"", dst_node_id);
        say("dst_nm_address.: \"%s\"", dst_nm_address);
        say("dst_nm_port....: \"%d\"", dst_nm_port);
    #endif

    // Check node is valid.
    if (strcmp(id, src_node_id) != 0)
        goto error;
    
    switch (type) {
        case 0:
            result = node_create_node_output_connection(
                sock, dst_node_id, dst_nm_address, dst_nm_port);
            break;
        case 1:
            // Input connections...
            break;
    }

    // Success.
    if (result) {
        mem_sfree(id);
        mem_sfree(src_node_id);
        mem_sfree(dst_node_id);
        mem_sfree(dst_nm_address);

        return 1;
    }
    
    // Error.
    error:

    mem_sfree(id);
    mem_sfree(src_node_id);
    mem_sfree(dst_node_id);
    mem_sfree(dst_nm_address);

    return 0;
}

int node_create_node_output_connection (
    int sock, char *dst_node_id, char *dst_nm_address, int dst_nm_port)
{
    node_connection_t *nconnection = node_connection_create_item(1);
    node_connection_t *connection;
    char response_success [] = VERBUM_DEFAULT_SUCCESS VERBUM_EOH;
    char *current_id = NULL;
    int status = 0;

    if (!sock || !dst_node_id || !dst_nm_address || 
        !dst_nm_port || !nconnection)
        return 0;

    // Copy connection ID to use.
    mem_scopy_ret(nconnection->id, current_id, 0);

    // Enable connection manager flag.
    nconnection->status            = 1;
    nconnection->connection_status = 0;

    // Prepare informations.
    nconnection->type              = 0; // Output connection.
    nconnection->dst_nm_port       = dst_nm_port;

    mem_scopy_ret(dst_node_id, nconnection->dst_node_id, 0);
    mem_scopy_ret(dst_nm_address, nconnection->dst_nm_address, 0);

    // Insert connection in controller.
    if (!node_connection_insert_item(nconnection))
        say_ret(0, "error insert connection item.");
    
    #ifdef NCDBG_CON
        say("start connection process.");
    #endif

    // Wait response.
    while (1) {
        pthread_mutex_lock(&node_mutex_connections);

        for (connection=node_connections; connection != NULL; connection=connection->next) {
            if (connection->status != 2)
                continue;
            if (!connection->id)
                continue;
            if (connection->type != 0)
                continue;
            
            if (strcmp(connection->id, current_id) == 0) {
                if (connection->connection_status == 2 ||
                    connection->connection_status == 3  )
                {
                    #ifdef NCDBG_CON
                        say("end connection control, status: %d", 
                                    connection->connection_status);
                    #endif

                    status = connection->connection_status;
                    break;
                }
            }
        }

        pthread_mutex_unlock(&node_mutex_connections);

        if (status != 0) 
            break;
            
        usleep(100000);
    }

    // Error.
    if (status == 3) {
        #ifdef NCDBG_CON
            say("end (error) connection process.");
        #endif

        mem_sfree(current_id);
        return 0;
    }

    // Success.
    send(sock, response_success, strlen(response_success), VERBUM_SEND_FLAGS);
    mem_sfree(current_id);
    
    #ifdef NCDBG_CON
        say("end (success) connection process.");
    #endif

    return 1;
}


