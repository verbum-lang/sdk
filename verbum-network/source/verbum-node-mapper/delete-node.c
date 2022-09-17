
#include "delete-node.h"
#include "node-control.h"
#include "connection-control.h"

extern node_control_t    *nodes;
extern pthread_mutex_t    mutex_nodes;

extern pthread_mutex_t    mutex_connections;
extern node_connection_t *connections;

int delete_node (int sock, char *content)
{
    if (!sock || !content)
        return 0;

    #ifdef NMDBG
        say("delete verbum node.");
    #endif

    char tmp[1024], prefix [] = "delete-verbum-node:";
    char response_success  [] = VERBUM_DEFAULT_SUCCESS VERBUM_EOH;
    char response_error    [] = VERBUM_DEFAULT_ERROR   VERBUM_EOH;
    char address           [] = LOCALHOST;
    char *ptr = NULL, *response = NULL;
    int bytes = 0, status = 0, counter = 0, core_port = 0;
    node_control_t *node, *nlast;
    node_connection_t *con, *last;

    // Extract node ID.
    ptr = strstr(content, prefix);
    if (!ptr) 
        return 0;

    ptr += strlen(prefix);
    memset(tmp, 0x0, 1024);
    memcpy(tmp, ptr, strlen(ptr));

    // Remove node (struct node control).
    pthread_mutex_lock(&mutex_nodes);
    
    for (node=nodes; node!=NULL; node=node->next) {
        if (node->status != 1) {
            nlast = node;
            continue;
        }

        if (strcmp(node->id, tmp) == 0) {
            core_port = node->core_port;
            status = 1;
            
            if (!node->next)
                nlast->next = NULL;
            else
                nlast->next = node->next;

            mem_sfree(node->id);
            free(node);
            break;
        }

        nlast = node;
    }

    pthread_mutex_unlock(&mutex_nodes);

    // Remove node connections.
    if (status == 1) {
        pthread_mutex_lock(&mutex_connections);
        
        for (con=connections; con!=NULL; con=con->next) {
            if (con->status != 1 || !con->id || !con->dst_node_id) {
                last = con;
                continue;
            }

            // Remove item.
            if (strcmp(con->src_node_id, tmp) == 0) {
                if (!con->next)
                    last->next = NULL;
                else 
                    last->next = con->next;

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

        pthread_mutex_unlock(&mutex_connections);
    }

    // Send request to node auto-close.
    if (status == 1) {
        response = process_delete_node(address, core_port, tmp);
        if (response)
            mem_sfree(response);
    }

    // Finish.
    dn_end:

    if (!status) 
        return 0;

    bytes = send(sock, response_success, strlen(response_success), VERBUM_SEND_FLAGS);
    return 1;
}


