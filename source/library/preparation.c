
#include "preparation.h"

#include "../verbum-node/node-global.h"
#include "../verbum-node/node-client.h"
#include "../verbum-node-mapper/node-control.h"
#include "../verbum-node-mapper/connection-control.h"

// Node.
extern pthread_mutex_t    mutex_gconfig;
extern node_config_t     *gconfig;

extern pthread_mutex_t    node_mutex_connections;
extern node_connection_t *node_connections;

// Node Mapper.
extern node_control_t    *node_mapper_nodes;
extern pthread_mutex_t    node_mapper_mutex_nodes;

extern pthread_mutex_t    node_mapper_mutex_connections;
extern node_mapper_connection_t *node_mapper_connections;

int general_preparation (void)
{
    return 1;
    say("general preparations called.");

    // Destroy all mutex.
    pthread_mutex_destroy(&mutex_gconfig);
    pthread_mutex_destroy(&node_mutex_connections);
    pthread_mutex_destroy(&node_mapper_mutex_nodes);
    pthread_mutex_destroy(&node_mapper_mutex_connections);

    // CLear gconfig.
    if (gconfig) {
        say("gconfig data found.");

        mem_sfree(gconfig->path);
        mem_sfree(gconfig->node_mapper_id);
        mem_sfree(gconfig->information.id);
        free(gconfig);

        gconfig = NULL;
    } else
        say("gconfig is empty.");

    // Clear Node Mapper nodes.
    if (node_mapper_nodes) {
        node_control_t *next, *node = node_mapper_nodes;
        say("node_mapper_nodes data found.");

        for (int a=0; node != NULL; a++) {
            say("deleting node [%d]: %s", a, node->id ? node->id : "first struct item");

            mem_sfree(node->id);
            memset(node->last_connect_date, 0, 100);
            next = node->next;
            free(node);

            node = next;
        }

        node_mapper_nodes = NULL;
    } else
        say("node_mapper_nodes is empty.");

    // Clear Node Mapper connections.
    if (node_mapper_connections) {
        node_mapper_connection_t *next, *con = node_mapper_connections;
        say("node_mapper_connections data found.");

        for (int a=0; con != NULL; a++) {
            say("deleting connection [%d]: %s", a, con->id ? con->id : "first struct item");

            mem_sfree(con->id);
            mem_sfree(con->src_node_id);
            mem_sfree(con->dst_node_id);
            mem_sfree(con->dst_nm_id);
            mem_sfree(con->dst_nm_address);
            memset(con->last_connect_date, 0, 100);
            next = con->next;
            free(con);

            con = next;
        }

        node_mapper_connections = NULL;
    } else
        say("node_mapper_connections is empty.");

    // Clear Node connections.
    if (node_connections) {
        node_connection_t *next, *con = node_connections;
        say("node_connections data found.");

        for (int a=0; con != NULL; a++) {
            say("deleting connection [%d]: %s", a, con->id ? con->id : "first struct item");

            mem_sfree(con->id);
            mem_sfree(con->remote_id);
            mem_sfree(con->dst_node_id);
            mem_sfree(con->dst_nm_id);
            mem_sfree(con->dst_nm_address);
            memset(con->last_connect_date, 0, 100);
            next = con->next;
            free(con);

            con = next;
        }

        node_connections = NULL;
    } else
        say("node_connections is empty.");

    return 1;
}


