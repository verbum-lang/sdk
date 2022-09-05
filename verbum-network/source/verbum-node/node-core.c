
#include <sys/socket.h>
#include <arpa/inet.h>
#include <unistd.h>

#include "node-core.h"

node_param_t *param;

void *node_core (void *tparam)
{
    say("node core interface started!");

    param = (node_param_t *) tparam;
    struct sockaddr_in address;
    socklen_t address_size;
    int ssock  = -1, nsock = -1;
    int status = -1, port  =  0;
        
    ssock = socket(AF_INET, SOCK_STREAM, 0);
    address.sin_addr.s_addr = INADDR_ANY;
    address.sin_family = AF_INET;

    // Search node interface port.
    while (1) {
        for (port=3333; port<65000; port++) {
            if (port == param->node_mapper_port)
                continue;

            address.sin_port = htons(port);
            status = bind(ssock, (struct sockaddr*) &address, sizeof(address));
            if (status == 0)
                break;
        }

        if (status == -1)
            say_ret(NULL, "error finding available port for node creation (interface).");
        else
            break;
    }

    say("interface port: %d", port);

    if (listen(ssock, param->max_connections) != 0)
        say_ret(NULL, "error listen server.");

    // Add node, and ping controller.
    param->information.port = port;

    if (!add_node_on_node_mapper())
        say_ret(NULL, "error adding node in Node Mapper.");

    if (!ping_node_action())
        say_ret(NULL, "error starting ping controller.");

    // Node core interface communication.
    while (1) {
        nsock = accept(ssock, (struct sockaddr*) &address, &address_size);
        if (nsock != -1) {

            // Send header (handshake).
            status = send_handshake(nsock, "Verbum Node - v1.0.0 - I Love Jesus <3\r\n\r\n");
            if (status == 1) {

                // Node protocol.
                char *response = get_recv_content(nsock);
                if (response) {

                    /**
                     * Delete node.
                     */
                    if (strstr(response, "delete-verbum-node"))
                        delete_node(nsock, response);

                    mem_sfree(response);
                }
            }

            close(nsock);
        }
    }

    close(ssock);
}

int add_node_on_node_mapper (void)
{
    char address [] = LOCALHOST;
    char *id        = NULL;
    
    while (1) {
        id = process_generate_node_id(
                address, param->node_mapper_port, param->information.port);
        
        if (id)
            break;

        usleep(1000);
    }

    mem_scopy_ret(id, param->information.id, 0);
    mem_sfree(id);

    return 1;
}

int ping_node_action (void) 
{
    int status = -1;
    node_param_t *lparam;
    pthread_t tid;

    mem_alloc_ret(lparam, sizeof(node_param_t), node_param_t *, 0);
    mem_scopy_ret(param->information.id, lparam->information.id, 0);

    lparam->information.port = param->information.port;
    lparam->node_mapper_port = param->node_mapper_port;

    status = pthread_create(&tid, NULL, ping_node_handler, lparam);
    if (status != 0)
        say_ret(0, "error while creating thread - ping node controller.");

    return 1;
}

void *ping_node_handler (void *tparam)
{
    node_param_t *lparam = (node_param_t *) tparam;
    char address [] = LOCALHOST;
    
    say("node ping handler:");
    say("node id: %s", lparam->information.id);
    say("node port (interface): %d", lparam->information.port);

    while (1) {
        char *response = 
            process_ping_node(address, lparam->node_mapper_port, 
                lparam->information.id, lparam->information.port);
        
        if (response) {
            #ifdef NCDBG_PING
                say("ping response: %s", response);
            #endif

            mem_sfree(response);
        }

        sleep(NODE_PING_LOOP_SEC_DELAY);
    }
}

void delete_node (int sock, char *content)
{
    char tmp[1024], prefix [] = "delete-verbum-node:";
    char response_success  [] = VERBUM_DEFAULT_SUCCESS VERBUM_EOH;
    char response_error    [] = VERBUM_DEFAULT_ERROR   VERBUM_EOH;
    char *ptr = NULL;
    int bytes = 0, size = 0, status = 0;

    // Extract node ID.
    ptr = strstr(content, prefix);
    if (!ptr) 
        goto dn_end;

    ptr += strlen(prefix);
    memset(tmp, 0x0, 1024);
    memcpy(tmp, ptr, strlen(ptr));

    // Check node.
    if (strcmp(param->information.id, tmp) == 0)
        status = 1;

    // Finish.
    dn_end:

    if (!status) {
        bytes = send(sock, response_error, strlen(response_error), 0);
        return;
    }

    bytes = send(sock, response_success, strlen(response_success), 0);
    say("Verbum Node finished.");
    exit(0);
}


