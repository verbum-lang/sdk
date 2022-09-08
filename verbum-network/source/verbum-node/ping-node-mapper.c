
#include "ping-node-mapper.h"
#include "node-connection.h"

extern pthread_mutex_t    mutex_gconfig;
extern node_config_t     *gconfig;

extern node_connection_t *connections;
extern pthread_mutex_t    mutex_connections;

int ping_node_action (void)
{
    int status = -1;
    pthread_t tid;

    status = pthread_create(&tid, NULL, ping_node_handler, NULL);
    if (status != 0)
        say_ret(0, "error while creating thread - ping node controller.");

    return 1;
}

void *ping_node_handler (void *tparam)
{
    char *response1 = NULL, *response2 = NULL;
    char address [] = LOCALHOST;
    char *id = NULL;
    int node_mapper_port = 0, size = 0;
    int core_port = 0, server_port = 0;
    node_connection_t *connection;
    
    wait_config:
    pthread_mutex_lock(&mutex_gconfig);

    say("node ping controller:");
    say("node id: %s", gconfig->information.id);
    say("node port (interface): %d", gconfig->information.core_port);
    say("node port (server): %d", gconfig->information.server_port);

    // Ports.
    node_mapper_port = gconfig->node_mapper_port;
    core_port        = gconfig->information.core_port;
    server_port      = gconfig->information.server_port;

    // Node ID.
    size = sizeof(char) * (strlen(gconfig->information.id) + 1);
    id = (char *) malloc(size);

    if (!id) {
        pthread_mutex_unlock(&mutex_gconfig);
        debug_print("error allocating memory.");
        return NULL;
    }

    memset(id, 0x0, strlen(gconfig->information.id));
    memcpy(id, gconfig->information.id, strlen(gconfig->information.id));

    pthread_mutex_unlock(&mutex_gconfig);

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
        pthread_mutex_lock(&mutex_connections);
        
        if (connections) {
            for (connection=connections; connection != NULL; connection=connection->next) {
                if (connection->status != 2)
                    continue;
                if (!connection->id)
                    continue;
                if (connection->enable_delete_item == 1)
                    continue;

                say("connection type: \"%d\"", connection->type);
                say("connection id..: \"%s\"", connection->id);
                say("src_node_id....: \"%s\"", id);
                say("dst_node_id....: \"%s\"", connection->dst_node_id);
                say("dst_nm_id......: \"%s\"", connection->dst_nm_id);
                say("dst_nm_address.: \"%s\"", connection->dst_nm_address);
                say("dst_nm_port....: \"%d\"", connection->dst_nm_port);
                say("last date......: \"%s\"", connection->last_connect_date);
            }
        }

        pthread_mutex_unlock(&mutex_connections);

        sleep(NODE_PING_LOOP_SEC_DELAY);
    }
}


