
#include "node-connection.h"
#include "generate-connection-id.h"

static void *connection_ping_controller  (void *tparam);
static int ping_controller_communication (char *connection_id, char *src_node_id, int src_nm_port,
                                          char *dst_node_id, char *dst_nm_address, int dst_nm_port);

extern pthread_mutex_t    mutex_gconfig;
extern node_config_t     *gconfig;

extern pthread_mutex_t    mutex_connections;
extern node_connection_t *connections;

void *node_connection (void *tparam)
{
    node_connection_t *connection;

    #ifdef NCDBG_CON
        say("Node connection started!");
    #endif

    /**
     * Initialization.
     */

    // Initialize connections struct.
    connections = connection_create_item(1);

    /**
     * Controller.
     */

    while (1) {
        pthread_mutex_lock(&mutex_connections);

        for (connection=connections; connection != NULL; connection=connection->next) {

            // Enable connection to work (output, ping controller).
            if (connection->status == 1 && connection->type == 0) {
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

node_connection_t *connection_create_item (int prepare_thread)
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
    connection->remote_id               = NULL;

    connection->dst_node_id             = NULL;
    connection->dst_nm_id               = NULL;
    connection->dst_nm_address          = NULL;
    connection->dst_nm_port             = 0;
    connection->dst_node_sv_port        = 0;
    connection->dst_nm_direct           = 0;
    
    connection->next                    = NULL;

    // Prepare thread.
    if (prepare_thread == 1) {
        mem_alloc_ret(param, 
            sizeof(node_connection_param_t), node_connection_param_t *, NULL);

        mem_scopy_ret(connection->id, param->cid, NULL);
        status = pthread_create(
            &connection->tid_ping_controller, NULL, connection_ping_controller, param);
        
        if (status != 0)
            say_ret(NULL, "error creating thread - ping controller.");
    }

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
    char *src_node_id    = NULL;
    char *dst_node_id    = NULL;
    char *dst_nm_address = NULL;
    int   dst_nm_port    = 0;
    int   src_nm_port    = 0;

    char *date = NULL;
    int status = 0, valid = 0, error = 0;
    int count = 0, fmem = 0;

    mem_scopy_ret(param->cid, connection_id, NULL);

    while (1) {
        // Wait node ID.
        if (!src_node_id) {
            pthread_mutex_lock(&mutex_gconfig);

            if (gconfig->information.id) {
                mem_salloc(src_node_id, strlen(gconfig->information.id));

                if (src_node_id) 
                    mem_scopy(gconfig->information.id, src_node_id);

                src_nm_port = gconfig->node_mapper_port;
            }
            
            pthread_mutex_unlock(&mutex_gconfig);
            sleep(1);
            continue;
        }

        // Process actions.
        pthread_mutex_lock(&mutex_connections);
        valid  = 0;
        error  = 0;

        for (connection=connections; connection != NULL; connection=connection->next) {
            if (connection->status != 2)
                continue;
            if (!connection->id)
                continue;
            if (connection->type != 0)
                continue;

            if (strcmp(connection->id, connection_id) == 0) {
                
                // Data exists - process connection.
                if (connection->connection_status == 1)
                    valid = 1;

                // Check ping controller.
                else if (connection->ping_controller_enabled == 1) 
                    valid = 1;

                if (!valid) {
                    #ifdef NCDBG
                        say("flag error - ping controller.");
                    #endif
                }

                else {

                    // Dst node id.
                    fmem = 0;
                    mem_salloc(dst_node_id, strlen(connection->dst_node_id));
                    if (dst_node_id) {
                        mem_scopy(connection->dst_node_id, dst_node_id);
                        fmem = 1;
                    }

                    // Dst NM address.
                    if (fmem) {
                        fmem = 0;
                        mem_salloc(dst_nm_address, strlen(connection->dst_node_id));
                        if (dst_nm_address) {
                            mem_scopy(connection->dst_nm_address, dst_nm_address);
                            fmem = 1;
                        }
                    }

                    // Dst NM port.
                    if (fmem) {
                        dst_nm_port = connection->dst_nm_port;
                        error = 1;
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

        count = 0;

        while (1) {
            status = 
                ping_controller_communication(connection_id, 
                    src_node_id, src_nm_port, dst_node_id, dst_nm_address, dst_nm_port);
            
            if (status == 1)
                break;
            
            count++;
            if (count >= 3)
                break;
        }

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

                    // Error limit.
                    if (connection->connection_error_count >= 1000000)
                        connection->connection_error_count = 0;

                    #ifdef NCDBG_CON
                        say("connection error - ping controller.");
                    #endif
                }

                // Enable re-check.
                connection->ping_controller_enabled = 1;

                // Update connection date.
                if (status == 1) {
                    date = make_datetime();
                    if (date) {
                        memset(connection->last_connect_date, 0x0, 100);
                        sprintf(connection->last_connect_date, "%s", date);
                        mem_sfree(date);
                    }
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
    char *connection_id, char *src_node_id, int src_nm_port,
    char *dst_node_id, char *dst_nm_address, int dst_nm_port)
{
    int counter = 0, result = 0, valid = 0, server_port = 0;
    char *response1 = NULL, *response2 = NULL;
    char *ptr = NULL, *date = NULL, *node_mapper_id = NULL;
    char tmp[1024];
    node_connection_t *connection;

    if (!connection_id || !src_node_id || !src_nm_port ||
        !dst_node_id || !dst_nm_address || !dst_nm_port)
        return 0;

    // Get current Node Mapper ID.
    pthread_mutex_lock(&mutex_gconfig);
    mem_salloc_scopy(gconfig->node_mapper_id, node_mapper_id);
    pthread_mutex_unlock(&mutex_gconfig);

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
    response2 = 
        process_connection_ping(dst_nm_address, server_port, 
            dst_node_id, src_node_id, src_nm_port, connection_id, node_mapper_id);

    if (response2) {
        if (strstr(response2, VERBUM_DEFAULT_SUCCESS ":")) 
            valid = 1;
    }
    
    if (!valid) 
        goto end_error;
    
    // Save informations.
    pthread_mutex_lock(&mutex_connections);

    for (connection=connections; connection != NULL; connection=connection->next) {
        if (connection->status != 2)
            continue;
        if (!connection->id)
            continue;

        if (strcmp(connection->id, connection_id) == 0) {

            // Save node server interface port.
            connection->dst_node_sv_port = server_port;

            // Destination Node Mapper ID.
            ptr  = strstr(response2, VERBUM_DEFAULT_SUCCESS ":");
            ptr += strlen(VERBUM_DEFAULT_SUCCESS ":");
            mem_salloc_scopy(ptr, connection->dst_nm_id);

            break;
        }
    }

    pthread_mutex_unlock(&mutex_connections);

    // Finish.
    mem_sfree(node_mapper_id);
    mem_sfree(response1);
    mem_sfree(response2);
    return 1;

    end_error:
    mem_sfree(node_mapper_id);
    mem_sfree(response1);
    mem_sfree(response2);

    return 0;
}


