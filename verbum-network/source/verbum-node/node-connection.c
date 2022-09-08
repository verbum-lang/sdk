
#include "node-connection.h"
#include "generate-connection-id.h"

static void *connection_ping_controller    (void *tparam);
static int   ping_controller_communication (char *dst_node_id, char *dst_nm_address, 
                                            int dst_nm_port, char *connection_id);

extern pthread_mutex_t  mutex_gconfig;
extern node_config_t   *gconfig;

pthread_mutex_t         mutex_connections = PTHREAD_MUTEX_INITIALIZER;
node_connection_t      *connections;

void *node_connection (void *tparam)
{
    node_connection_t *connection;
    char address [] = LOCALHOST;
    char *response = NULL, *connection_id = NULL;
    int node_mapper_port = 0;
    int action = 0;

    #ifdef NCDBG_CON
        say("Node connection started!");
    #endif

    /**
     * Initialization.
     */

    pthread_mutex_lock(&mutex_gconfig);
    node_mapper_port = gconfig->node_mapper_port;
    pthread_mutex_unlock(&mutex_gconfig);

    // Prepare mutex.
    if (pthread_mutex_init(&mutex_connections, NULL) != 0) 
        say_ret(NULL, "mutex init failed - connections.");
    
    // Initialize connections struct.
    connections = connection_create_item();

    /**
     * Controller.
     */

    while (1) {
        action = 0;
        pthread_mutex_lock(&mutex_connections);

        for (connection=connections; connection != NULL; connection=connection->next) {

            // Enable connection to work.
            if (connection->status == 1) {
                connection->status = 2;
                
                // Check data exists and enable ping controller.
                if (connection->dst_node_id     && 
                    connection->dst_nm_address  &&
                    connection->dst_nm_port      )
                {
                    #ifdef NCDBG_CON
                        say("data exists, enable connection_status flag.");
                    #endif

                    connection->connection_status = 1;
                }
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
    connection->connection_error        = 0;
    connection->connection_error_count  = 0;
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

    char *date = NULL;
    int status = 0, valid = 0, error = 0;
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

                if (!valid) {
                    #ifdef NCDBG_CON
                        say("flag error - ping controller.");
                    #endif
                }

                else {

                    // Src node.
                    mem_salloc(dst_node_id, strlen(connection->dst_node_id));
                    if (dst_node_id) {
                        mem_scopy(connection->dst_node_id, dst_node_id);
                        
                        // Dst node.
                        mem_salloc(dst_nm_address, strlen(connection->dst_node_id));
                        if (dst_nm_address) {
                            mem_scopy(connection->dst_nm_address, dst_nm_address);
                            dst_nm_port = connection->dst_nm_port;

                            error = 1;
                        }
                    }

                    break;
                }
            }
        }
        
        pthread_mutex_unlock(&mutex_connections);

        if (error == 0 || !dst_node_id || !dst_nm_address || !dst_nm_port) {
            mem_sfree(dst_node_id);
            mem_sfree(dst_nm_address);
            sleep(VERBUM_CONNECTION_PING_SEC_DELAY);
            continue;
        }

        /**
         * Process action.
         */

        status = ping_controller_communication(dst_node_id, dst_nm_address, dst_nm_port, connection_id);

        pthread_mutex_lock(&mutex_connections);

        for (connection=connections; connection != NULL; connection=connection->next) {
            if (connection->status != 2)
                continue;
            if (!connection->id)
                continue;

            if (strcmp(connection->id, connection_id) == 0) {

                // Success.
                if (status == 1) {
                    connection->connection_status       = 2;
                    connection->connection_error        = 0;
                    connection->connection_error_count  = 0;
                }

                // Error.
                else {
                    connection->connection_status = 3;

                    // Enable error connection flag.
                    connection->connection_error = 1;
                    connection->connection_error_count++;

                    #ifdef NCDBG_CON
                        say("connection error - ping controller.");
                    #endif
                }

                // Enable re-check.
                connection->ping_controller_enabled = 1;

                // Update connection date.
                date = make_datetime();
                if (date) {
                    memset(connection->last_connect_date, 0x0, 100);
                    sprintf(connection->last_connect_date, "%s", date);
                    mem_sfree(date);
                }

                break;
            }
        }

        pthread_mutex_unlock(&mutex_connections);
        
        mem_sfree(dst_node_id);
        mem_sfree(dst_nm_address);

        sleep(VERBUM_CONNECTION_PING_SEC_DELAY);
    }

    return NULL;
}

static int ping_controller_communication (
    char *dst_node_id, char *dst_nm_address, int dst_nm_port, char *connection_id)
{
    int counter = 0, result = 0, valid = 0, server_port = 0;
    char *response1 = NULL, *response2 = NULL;
    char *ptr = NULL, *date = NULL;
    char tmp[1024];
    node_connection_t *connection;

    if (!dst_node_id || !dst_nm_address || !dst_nm_port || !connection_id)
        return 0;

    // Connect to destination Node Mapper, and 
    // check destination Verbum Node exists.
    response1 = process_check_node_exists(dst_nm_address, dst_nm_port, dst_node_id);
    if (response1) {
        if (strstr(response1, VERBUM_DEFAULT_SUCCESS)) 
            valid = 1;
    }

    if (!valid) 
        goto end_error;
    
    // Extract server node port.
    ptr = strstr(response1, "verbum-node-information:");
    if (!ptr)
        goto end_error;

    ptr += strlen("verbum-node-information:");
    memset(tmp, 0x0, 1024);

    for (int a=0,b=0,c=0; ptr[a]!='\0'; a++) {
        if (ptr[a] == ':') {
            switch (c) {
                /* Node ID.        */ case 0: break;
                /* Node Core port. */ case 1: break;
            }

            c++;
            b = 0;
            memset(tmp, 0x0, 1024);
        } 
        
        else
            tmp[b++] = ptr[a];
    }

    if (tmp) {
        if (strlen(tmp) > 0)
            server_port = atoi(tmp);
    }

    if (!server_port)
        goto end_error;

    // Connect to Node Server interface.
    valid     = 0;
    response2 = process_connection_ping(dst_nm_address, server_port, dst_node_id);

    if (response2) {
        if (strstr(response2, VERBUM_DEFAULT_SUCCESS)) 
            valid = 1;
    }

    if (!valid) 
        goto end_error;

    // Finish.
    mem_sfree(response1);
    mem_sfree(response2);
    return 1;

    end_error:
    mem_sfree(response1);
    mem_sfree(response2);

    return 0;
}


