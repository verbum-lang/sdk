
#include "timeout-control.h"
#include "node-control.h"
#include "connection-control.h"

static void *timeout_controller     (void *_param);
static int   check_nodes            (void);
static int   check_connections      (void);
static int   timeout_connection     (connection_t *con);
static int   auto_remove_connection (connection_t *con, connection_t *last);

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

static void *timeout_controller (void *_param)
{
    while (1) {
        check_nodes();
        check_connections();
        sleep(1);
    }
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
    connection_t *con, *last;
    
    pthread_mutex_lock(&node_mapper_mutex_connections);

    for (con=node_mapper_connections; con!=NULL; con=con->next) {
        if (con->status == 1 && con->id) {

            // Updates the connection status if it times out.
            timeout_connection(con);

            // Automatically removes connection if it times out.
            #ifdef VERBUM_CONNECTION_AUTO_REMOVE
                auto_remove_connection(con, last);
            #endif
        }

        last = con;
    }

    pthread_mutex_unlock(&node_mapper_mutex_connections);
    return 1;
}

static int timeout_connection (connection_t *con)
{
    char *date = make_datetime();

    if (!date || !con)
        return 0;

    if (date_difference(con->last_connect_date, date, VERBUM_TIMEOUT_CON_ERROR)) {
        #ifdef DBGTC
            say("Enable error flag - timeout control.");
            say("Timeout: %s, %s", con->last_connect_date, date);
            say("Type: %d, Src: %s, Dst: %s\n", 
                con->type, con->src_node_id, con->dst_node_id);
        #endif

        con->connection_error = 1;
        con->connection_error_count++;

        if (con->connection_error_count >= 1000000)
            con->connection_error_count = 0;
    }

    mem_sfree(date);
}

static int auto_remove_connection (connection_t *con, connection_t *last)
{
    char *date = make_datetime();
    int status = 0;

    if (!date || !con || !last)
        return 0;

    if (date_difference(con->last_connect_date, date, VERBUM_TIMEOUT_CON_AUTO_REMOVE))
    {
        #ifdef VERBUM_DEBUG_TIMEOUT
            say("Auto remove connection - timeout control.");
            say("Timeout: %s, %s", con->last_connect_date, date);
            say("Type: %d, Src: %s, Dst: %s\n", 
                con->type, con->src_node_id, con->dst_node_id);
        #endif
        
        // Output.
        #ifdef VERBUM_CONNECTION_AUTO_REMOVE_OUTPUT
            if (con->type == 0)
                status = 1;
        #endif
        
        // Input.
        #ifdef VERBUM_CONNECTION_AUTO_REMOVE_INPUT
            if (con->type == 1)
                status = 1;
        #endif

        if (status) {
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
        }
    }

    mem_sfree(date);
}


