
#include "timeout-control.h"
#include "node-control.h"
#include "connection-control.h"

static int check_nodes       (void);
static int check_connections (void);

extern node_t       *node_mapper_nodes;
extern p_mutex_t     node_mapper_mutex_nodes;
extern connection_t *node_mapper_connections;
extern p_mutex_t     node_mapper_mutex_connections;

int prepare_timeout (void)
{
    pthread_t tid;

    if (pthread_create(&tid, NULL, timeout_controller, NULL) != 0)
        say_ret(0, "Error creating thread - timeout control (nodes and connections).");

    return 1;
}

void *timeout_controller (void *tparam)
{
    while (1) {
        sleep(1);
        check_nodes();
        check_connections();
    }

    return NULL;
}

static int check_nodes (void)
{
    node_t *node, *last_node;
    char *date = make_datetime();
    
    if (!date)
        return 0;

    pthread_mutex_lock(&node_mapper_mutex_nodes);

    for (node=node_mapper_nodes; node!=NULL; node=node->next) {
        if (node->status != 1) {
            last_node = node;
            continue;
        }

        // Checks node timeout - enable offline flag.
        if (date_difference(
                node->last_connect_date, date, VERBUM_NODE_SEC_TIMEOUT_ERROR)) 
        {
            node->offline_by_timeout = 1;

            #ifdef VERBUM_DEBUG_TIMEOUT
                say("Enable offline flag - timeout.");
                say("node -> id: %s - date: %s", node->id, node->last_connect_date);
            #endif
        }

        // Auto remove node.
        #ifdef VERBUM_NODE_AUTO_REMOVE
            if (date_difference(
                    node->last_connect_date, date, VERBUM_NODE_SEC_TIMEOUT_AUTO_REMOVE))
            {
                #ifdef VERBUM_DEBUG_TIMEOUT
                    say("Auto remove node - timeout.");
                    say("node -> id: %s - date: %s", 
                            node->id, node->last_connect_date);
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

    pthread_mutex_unlock(&node_mapper_mutex_nodes);
    mem_sfree(date);

    return 1;
}

static int check_connections (void)
{
    connection_t *connection, *last_connection;
    char *date = make_datetime();
    int status;
    
    if (!date)
        return 0;

    pthread_mutex_lock(&node_mapper_mutex_connections);

    for (connection=node_mapper_connections; connection!=NULL; connection=connection->next) {
        if (connection->status != 1 || !connection->id) {
            last_connection = connection;
            continue;
        }

        // Check input connections timeout.
        if (date_difference(connection->last_connect_date, 
                date, VERBUM_CONNECTION_SEC_TIMEOUT_ERROR)) 
        {
            #ifdef DBGTC
                say("Enable error flag - timeout.");
                say("Timeout: %s, %s", connection->last_connect_date, date);
                say("Type: %d, Src: %s, Dst: %s\n", 
                    connection->type, connection->src_node_id, connection->dst_node_id);
            #endif

            connection->connection_error = 1;
            connection->connection_error_count++;

            if (connection->connection_error_count >= 1000000)
                connection->connection_error_count = 0;
        }

        // Check connections to auto-remove.
        #ifdef VERBUM_CONNECTION_AUTO_REMOVE
            if (date_difference(connection->last_connect_date, 
                    date, VERBUM_CONNECTION_SEC_TIMEOUT_AUTO_REMOVE)) 
            {
                #ifdef DBGTC
                    say("Auto remove connection - timeout.");
                    say("Timeout: %s, %s", connection->last_connect_date, date);
                    say("Type: %d, Src: %s, Dst: %s\n", 
                        connection->type, connection->src_node_id, connection->dst_node_id);
                #endif
                
                status = 0;

                // Output.
                #ifdef VERBUM_CONNECTION_AUTO_REMOVE_OUTPUT
                    if (connection->type == 0)
                        status = 1;
                #endif
                
                // Input.
                #ifdef VERBUM_CONNECTION_AUTO_REMOVE_INPUT
                    if (connection->type == 1)
                        status = 1;
                #endif

                if (status) {
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
                    break;
                }
            }
        #endif

        last_connection = connection;
    }

    pthread_mutex_unlock(&node_mapper_mutex_connections);
    mem_sfree(date);

    return 1;
}


