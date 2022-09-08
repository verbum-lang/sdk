
#include "node-connection.h"
#include "generate-connection-id.h"

static void *connection_ping_controller    (void *tparam);
static int   ping_controller_communication (char *dst_node_id, char *dst_nm_address, int dst_nm_port);

node_connection_t *connections;
pthread_mutex_t    mutex_connections = PTHREAD_MUTEX_INITIALIZER;

void *node_connection (void *tparam)
{
    node_connection_t * connection;

    say("Node connection started!");

    /**
     * Initialization.
     */

    // Prepare mutex.
    if (pthread_mutex_init(&mutex_connections, NULL) != 0) 
        say_ret(NULL, "mutex init failed - connections.");
    
    // Initialize connections struct.
    connections = connection_create_item();

    /**
     * Controller.
     */

    while (1) {
        pthread_mutex_lock(&mutex_connections);

        for (connection=connections; connection != NULL; connection=connection->next) {

            // Enable connection to work.
            if (connection->status == 1) {
                connection->status = 2;
                
                // Check data exists and enable ping controller.
                if (connection->dst_node_id     && 
                    connection->dst_nm_address  &&
                    connection->dst_nm_port)
                    connection->connection_status = 1;
            }

            // Delete item.
            else if (connection->enable_delete_item == 1) {
                connection->enable_delete_item = 2;

                // ...
                say("delete item.");
            }
        }

        pthread_mutex_unlock(&mutex_connections);
        usleep(1000);
    }

    return NULL;
}

node_connection_t *connection_create_item (void)
{
    node_connection_t * connection;
    node_connection_param_t *param;
    int status = 0;

    mem_alloc_ret(connection, 
        sizeof(node_connection_t), node_connection_t *, NULL);

    connection->id                      = generate_connection_id();
    connection->status                  = 0;
    connection->connection_status       = 0;
    connection->ping_controller_enabled = 0;
    connection->type                    = -1;

    connection->dst_node_id             = NULL;
    connection->dst_nm_id               = NULL;
    connection->dst_nm_address          = NULL;
    connection->dst_nm_port             = 0;

    connection->next                    = NULL;

    // Prepare thread.
    mem_alloc_ret(param, 
        sizeof(node_connection_param_t), node_connection_param_t *, NULL);

    mem_scopy_ret(connection->id, param->cid, NULL);
    status = pthread_create(
        &connection->tid_ping_controller, NULL, connection_ping_controller, param);
    
    if (status != 0)
        say_ret(NULL, "error creating thread - ping controller.");

    return connection;
}

int connection_insert_item (node_connection_t *new_connection)
{
    if (!new_connection)
        return 0;

    pthread_mutex_lock(&mutex_connections);
    node_connection_t *connection = connections;

    while (1) {
        if (!connection->next) {
            connection->next = new_connection;
            break;
        }

        connection = connection->next;
    }

    pthread_mutex_unlock(&mutex_connections);
    return 1;
}

static void *connection_ping_controller (void *tparam)
{
    node_connection_param_t *param = (node_connection_param_t *) tparam;
    node_connection_t *connection;

    char *connection_id  = NULL;
    char *dst_node_id    = NULL;
    char *dst_nm_address = NULL;
    int   dst_nm_port    = 0;

    int status = 0, valid = 0, error = 0, size = 0;

    mem_scopy_ret(param->cid, connection_id, NULL);

    while (1) {
        pthread_mutex_lock(&mutex_connections);
        valid  = 0;
        error  = 0;

        for (connection=connections; connection != NULL; connection=connection->next) {
            if (connection->status != 2)
                continue;
            if (!connection->id)
                continue;

            if (strcmp(connection->id, connection_id) == 0) {
                
                // Data exists - process connection.
                if (connection->connection_status == 1)
                    valid = 1;

                // Check ping controller.
                else if (connection->ping_controller_enabled == 1) 
                    valid = 1;

                if (valid == 1) {

                    // Src node.
                    size = sizeof(char) * (strlen(connection->dst_node_id) + 1);
                    dst_node_id = (char *) malloc(size);

                    if (dst_node_id) {
                        memset(dst_node_id, 0x0, strlen(connection->dst_node_id));
                        memcpy(dst_node_id, connection->dst_node_id, strlen(connection->dst_node_id));
                        
                        // Dst node.
                        size = sizeof(char) * (strlen(connection->dst_node_id) + 1);
                        dst_nm_address = (char *) malloc(size);

                        if (dst_nm_address) {
                            memset(dst_nm_address, 0x0, strlen(connection->dst_nm_address));
                            memcpy(dst_nm_address, connection->dst_nm_address, strlen(connection->dst_nm_address));

                            dst_nm_port = connection->dst_nm_port;
                            error = 1;
                        }
                    }

                    break;
                }
            }
        }
        
        pthread_mutex_unlock(&mutex_connections);

        if (error == 0) {
            mem_sfree(dst_node_id);
            mem_sfree(dst_nm_address);
            sleep(VERBUM_CONNECTION_PING_SEC_DELAY);
            continue;
        }

        if (!dst_node_id || !dst_nm_address || !dst_nm_port) {
            mem_sfree(dst_node_id);
            mem_sfree(dst_nm_address);
            sleep(VERBUM_CONNECTION_PING_SEC_DELAY);
            continue;
        }

        /**
         * Process action.
         */

        error  = 0;
        status = ping_controller_communication(dst_node_id, dst_nm_address, dst_nm_port);

        // Success.
        pthread_mutex_lock(&mutex_connections);

        for (connection=connections; connection != NULL; connection=connection->next) {
            if (connection->status != 2)
                continue;
            if (!connection->id)
                continue;

            if (strcmp(connection->id, connection_id) == 0) {

                // Success.
                if (status == 1) {
                    connection->connection_status = 2;
                    connection->ping_controller_enabled = 1;
                }

                // Error.
                else {
                    error = 1;
                    connection->connection_status = 3;
                }
            }
        }

        pthread_mutex_unlock(&mutex_connections);
        
        mem_sfree(dst_node_id);
        mem_sfree(dst_nm_address);

        if (error == 1)
            break;

        sleep(VERBUM_CONNECTION_PING_SEC_DELAY);
    }

    return NULL;
}

static int ping_controller_communication (char *dst_node_id, char *dst_nm_address, int dst_nm_port)
{
    int counter = 0;
    int result  = 0;

    if (!dst_node_id || !dst_nm_address || !dst_nm_port)
        return 0;

    // Send request to node.
    char *response = process_connection_ping(dst_nm_address, dst_nm_port, dst_node_id);

    if (response) {
        if (strstr(response, VERBUM_DEFAULT_SUCCESS)) {
            mem_sfree(response);
            result = 1;
        }

        mem_sfree(response);
    }

    return result;
}


