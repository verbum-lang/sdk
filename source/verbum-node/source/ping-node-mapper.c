
#include "ping-node-mapper.h"
#include "node-client.h"

static void *ping_node_handler (void *tparam);

extern pthread_mutex_t    node_mutex_gconfig;
extern node_config_t     *node_gconfig;

extern node_connection_t *node_connections;
extern pthread_mutex_t    node_mutex_connections;

int ping_node_action (void)
{
    int status = -1;
    pthread_t tid;

    status = pthread_create(&tid, NULL, ping_node_handler, NULL);
    if (status != 0)
        say_ret(0, "error creating thread - ping node controller.");

    return 1;
}

static void *ping_node_handler (void *tparam)
{
    char address [] = LOCALHOST, default_value [] = "not specified";
    char *response1 = NULL, *response2 = NULL;
    char *id = NULL, *tmp = NULL, *data = NULL;
    int node_mapper_port = 0, size = 0, total_size = 0;
    int core_port = 0, server_port = 0;
    node_connection_t *connection;
    
    wait_config:
    pthread_mutex_lock(&node_mutex_gconfig);

    say("node ping controller:");
    say("node id: %s", node_gconfig->information.id);
    say("node port (interface): %d", node_gconfig->information.core_port);
    say("node port (server): %d", node_gconfig->information.server_port);

    // Ports.
    node_mapper_port = node_gconfig->node_mapper_port;
    core_port        = node_gconfig->information.core_port;
    server_port      = node_gconfig->information.server_port;

    // Node ID.
    size = sizeof(char) * (strlen(node_gconfig->information.id) + 1);
    id = (char *) malloc(size);

    if (!id) {
        pthread_mutex_unlock(&node_mutex_gconfig);
        debug_print("error allocating memory.");
        return NULL;
    }

    memset(id, 0x0, strlen(node_gconfig->information.id));
    memcpy(id, node_gconfig->information.id, strlen(node_gconfig->information.id));

    pthread_mutex_unlock(&node_mutex_gconfig);

    if (!node_mapper_port || !core_port || !server_port)
        goto wait_config;

    while (1) {
        
        // Ping updater.
        response1 = 
            process_ping_node(address, node_mapper_port, id, core_port, server_port);
        
        if (response1) {
            #ifdef NCDBG_PING
                say("ping response: %s", response1);
            #endif

            mem_sfree(response1);
        }

        // Connection updater.
        pthread_mutex_lock(&node_mutex_connections);
        
        if (node_connections) {
            total_size = 0;
            size = 1024;

            for (connection=node_connections; connection != NULL; connection=connection->next) {
                if (connection->status != 2)
                    continue;
                if (!connection->id)
                    continue;
                if (connection->type == 1 && connection->checking_direct == 0)
                    continue;
                if (connection->delete_enabled == 1)
                    continue;
                
                // Prepare current data.
                if (id)                             size += strlen(id);
                if (connection->id)                 size += strlen(connection->id);
                if (connection->dst_node_id)        size += strlen(connection->dst_node_id);
                if (connection->dst_nm_id)          size += strlen(connection->dst_nm_id);
                if (connection->dst_nm_address)     size += strlen(connection->dst_nm_address);
                if (connection->last_connect_date)  size += strlen(connection->last_connect_date);
                
                tmp = (char *) realloc(tmp, sizeof(char) * size);
                if (tmp) {
                    memset(tmp, 0x0, sizeof(char) * size);
                    sprintf(tmp, 

                        "type:%d\n"
                        "id:%s\n"
                        "src-node-id:%s\n"
                        "dst-node-id:%s\n"
                        "dst-nm-id:%s\n"
                        "dst-nm-addr:%s\n"
                        "dst-nm-port:%d\n"
                        "last-date:%s\n"
                        "error:%d\n"
                        "error-count:%d\n"
                        "dst-node-sv-port:%d\n"
                        "dst-nm-direct:%d\n"
                        "\n", 
                        
                        connection->type,
                        connection->id                ? connection->id                : default_value,
                                    id                ? id                            : default_value,
                        connection->dst_node_id       ? connection->dst_node_id       : default_value,
                        connection->dst_nm_id         ? connection->dst_nm_id         : default_value,
                        connection->dst_nm_address    ? connection->dst_nm_address    : default_value,
                        connection->dst_nm_port,
                        connection->last_connect_date ? connection->last_connect_date : default_value,
                        connection->connection_error,
                        connection->connection_error_count,
                        connection->dst_node_sv_port,
                        connection->dst_nm_direct
                    );

                    // Append data to full header data.
                    size = strlen(tmp);
                    data = (char *) realloc(data, sizeof(char) * (total_size + size + 1));

                    if (data) {
                        memcpy(&data[total_size], tmp, size);
                        total_size += size;
                        data[total_size] = '\0';
                    }

                    // Check...
                    if (connection->connection_error == 1) {
                        #ifdef NCDBG_PING
                            say("Connection error!");
                            say("connection id.: %s", connection->id);
                            say("connection src: %s", id);
                            say("connection dst: %s\n", connection->dst_node_id);
                        #endif
                    }
                }
            }
        }

        pthread_mutex_unlock(&node_mutex_connections);

        if (data && total_size > 0) {
            response2 = 
                process_ping_connections(address, node_mapper_port, data);
            
            if (response2) {
                #ifdef NCDBG_PING
                    say("ping connections response: %s", response2);
                #endif

                mem_sfree(response2);
            }
        }

        sleep(1);
    }
}


