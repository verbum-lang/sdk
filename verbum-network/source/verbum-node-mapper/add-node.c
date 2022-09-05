
#include "add-node.h"
#include "generate-node-id.h"

int add_new_node (int sock, char *content)
{
    #ifdef NMDBG
        say("generate new verbum node.");
    #endif

    if (!sock || !content)
        return 0;

    char port[256], prefix []= "generate-verbum-node-id:";
    char *id = NULL, *ptr = NULL, *date = NULL, *resp = NULL;
    int bytes = 0, size = 0, result = 1;
    node_control_t *node = node_create_item();

    if (!node)
        say_ret(0, "error create node item.");

    // Enable flag.
    node->status = 1;

    // Extract port.
    ptr = strstr(content, prefix);
    if (!ptr) {
        result = 0;
        goto ann_end;
    }

    ptr += strlen(prefix);
    memset(port, 0x0, 256);
    memcpy(port, ptr, strlen(ptr));

    node->port = atoi(port);

    // Generate ID.
    id = generate_new_id();
    if (!id) {
        result = 0;
        goto ann_end;
    }

    mem_scopy_ret(id, node->id, 0);

    // Generate date.
    date = make_datetime();
    if (!date) {
        result = 0;
        goto ann_end;
    }

    sprintf(node->last_connect_date, "%s", date);

    // Send new node ID to client.
    size = sizeof(char) * (strlen(node->id) + 256);
    mem_alloc_ret(resp, size, char *, 0);

    sprintf(resp, "%s\r\n\r\n", node->id);
    bytes = send(sock, resp, strlen(resp), 0);

    if (bytes == strlen(resp)) {
        if (!node_insert_item(node)) 
            say_ret(0, "error insert node item.");
    } else {
        memset(node->id, 0x0, strlen(node->id));
        free(node->id);
        free(node);
    }

    mem_sfree(resp);

    // Fail.
    ann_end:

    mem_sfree(id);
    mem_sfree(date);

    return result;
}


