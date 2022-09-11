
#include "timeout-control.h"
#include "node-control.h"
#include "connection-control.h"

extern node_control_t    *nodes;
extern pthread_mutex_t    mutex_nodes;

extern pthread_mutex_t    mutex_connections;
extern node_connection_t *connections;

void *timeout_control (void *tparam)
{
    node_control_t *node, *last_node;
    node_connection_t *connection, *last_connection;
    char *current_date = NULL;

    while (1) {
        current_date = make_datetime();
        if (!current_date) {
            sleep(1);
            continue;
        }

        // Nodes.
        pthread_mutex_lock(&mutex_nodes);

        for (node=nodes; node!=NULL; node=node->next) {
            if (node->status != 1) {
                last_node = node;
                continue;
            }

            /**
             * Checks node timeout - enable offline flag.
             */

            if (date_difference(node->last_connect_date, 
                    current_date, VERBUM_NODE_SEC_TIMEOUT_ERROR))
            {
                node->offline_by_timeout = 1;

                #ifdef DBGTC
                    say("Enable offline flag - timeout.");
                    say("node -> id: %s - date: %s", node->id, node->last_connect_date);
                #endif
            }

            /**
             * Auto remove node.
             */

            #ifdef VERBUM_NODE_AUTO_REMOVE
                if (date_difference(node->last_connect_date, 
                        current_date, VERBUM_NODE_SEC_TIMEOUT_AUTO_REMOVE))
                {
                    #ifdef DBGTC
                        say("Auto remove node - timeout.");
                        say("node -> id: %s - date: %s", node->id, node->last_connect_date);
                    #endif

                    if (!node->next)
                        last_node->next = NULL;
                    else 
                        last_node->next = node->next;

                    mem_sfree(node->id);
                    free(node);

                    break;
                }
            #endif

            last_node = node;
        }

        pthread_mutex_unlock(&mutex_nodes);

        pthread_mutex_lock(&mutex_connections);

        for (connection=connections; connection!=NULL; connection=connection->next) {
            if (connection->status != 1) {
                last_connection = connection;
                continue;
            } else if (!connection->id) {
                last_connection = connection;
                continue;
            }

            /**
             * Check input connections timeout.
             */

            if (date_difference(connection->last_connect_date, 
                current_date, VERBUM_CONNECTION_SEC_TIMEOUT_ERROR)) 
            {
                #ifdef DBGTC
                    say("Enable error flag - timeout.");
                    say("Timeout: %s, %s", connection->last_connect_date, current_date);
                    say("Type: %d, Src: %s, Dst: %s\n", 
                        connection->type, connection->src_node_id, connection->dst_node_id);
                #endif

                connection->connection_error = 1;
                connection->connection_error_count++;

                if (connection->connection_error_count >= 1000000)
                    connection->connection_error_count = 0;
            }

            /**
             * Check connections to auto-remove.
             */
            
            #ifdef VERBUM_CONNECTION_AUTO_REMOVE
                if (date_difference(connection->last_connect_date, 
                    current_date, VERBUM_CONNECTION_SEC_TIMEOUT_AUTO_REMOVE)) 
                {
                    #ifdef DBGTC
                        say("Auto remove connection - timeout.");
                        say("Timeout: %s, %s", connection->last_connect_date, current_date);
                        say("Type: %d, Src: %s, Dst: %s\n", 
                            connection->type, connection->src_node_id, connection->dst_node_id);
                    #endif
                    
                    if (!connection->next)
                        last_connection->next = NULL;
                    else 
                        last_connection->next = connection->next;

                    mem_sfree(connection->id);
                    mem_sfree(connection->src_node_id);
                    mem_sfree(connection->dst_node_id);
                    mem_sfree(connection->dst_nm_id);
                    mem_sfree(connection->dst_nm_address);
                    free(connection);

                    // Closes the loop as connection->next is null.
                    break;
                }
            #endif

            last_connection = connection;
        }

        pthread_mutex_unlock(&mutex_connections);

        mem_sfree(current_date);
        sleep(1);
    }

    return NULL;
}


