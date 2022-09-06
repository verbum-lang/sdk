
#include "create-node-connection.h"
#include "node-control.h"

extern node_control_t *nodes;
extern pthread_mutex_t mutex_nodes;

/**
 * type:
 *  0 = OUTPUT
 *  1 = INPUT
 * 
 * Request:
 *  create-verbum-node-output-connection:SRC-NODE-ID:DST-NODE-ID:DST-NODE-MAPPER-ID:DST-NODE-MAPPER-IP:DST-NODE-MAPPER-PORT
 *  create-verbum-node-input-connection :SRC-NODE-ID:DST-NODE-ID:DST-NODE-MAPPER-ID:DST-NODE-MAPPER-IP:DST-NODE-MAPPER-PORT
 */

int create_node_connection(int sock, char *content, int type)
{
    char response_error [] = VERBUM_DEFAULT_ERROR VERBUM_EOH;
    char tmp [1024];
    
    char *src_node_id      = NULL;
    char *dst_node_id      = NULL;
    char *dst_nm_id        = NULL;
    char *dst_nm_address   = NULL;
 
    int result = 0, dst_nm_port = 0, brk = 0;
    int bytes = 0, status = 0;
    
    node_control_t *node;
    
    if (!sock || !content)
        goto cnc_error;

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
                    
                    // Destination Node Mapper ID.
                    case 2:
                        mem_scopy_ret(tmp, dst_nm_id, 0);
                        break;

                    // Destination Node Mapper address.
                    case 3:
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

    if (!src_node_id || !dst_node_id    || 
        !dst_nm_id   || !dst_nm_address || !dst_nm_port)
        goto cnc_error;

    #ifdef NMDBG
        say("src_node_id....: \"%s\"", src_node_id);
        say("dst_node_id....: \"%s\"", dst_node_id);
        say("dst_nm_id......: \"%s\"", dst_nm_id);
        say("dst_nm_address.: \"%s\"", dst_nm_address);
        say("dst_nm_port....: \"%d\"", dst_nm_port);
    #endif

    // Check node exists.
    pthread_mutex_lock(&mutex_nodes);
    
    for (node=nodes; node!=NULL; node=node->next) {
        if (node->status != 1)
            continue;

        if (strcmp(node->id, src_node_id) == 0) {
            status = 1;
            break;
        }
    }

    pthread_mutex_unlock(&mutex_nodes);

    if (!status) 
        goto cnc_error;

    switch (type) {
        case 0:
            result = create_node_output_connection(
                sock, src_node_id, dst_node_id, dst_nm_address, dst_nm_port);
            break;
        case 1:
            // Input connections...
            break;
    }

    // Success.
    return result;

    // Error.
    cnc_error:
    bytes = send(sock, response_error, strlen(response_error), 0);
    return 0;
}

int create_node_output_connection (int sock, char *src_node_id, char *dst_node_id, 
                                   char *dst_nm_address, int dst_nm_port)
{
    int result = 0;

    if (!sock || !src_node_id || !dst_node_id ||
        !dst_nm_address || !dst_nm_port)
        return 0;

    say("process data...");
    say("src_node_id....: \"%s\"", src_node_id);
    say("dst_node_id....: \"%s\"", dst_node_id);
    say("dst_nm_address.: \"%s\"", dst_nm_address);
    say("dst_nm_port....: \"%d\"", dst_nm_port);

    return result;
}



