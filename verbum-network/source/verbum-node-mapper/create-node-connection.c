
#include "create-node-connection.h"

/**
 * type:
 *  0 = OUTPUT
 *  1 = INPUT
 * 
 * Request:
 *  create-verbum-node-output-connection:SRC-NODE-ID:DST-NODE-ID:DST-NODE-MAPPER-IP:DST-NODE-MAPPER-PORT
 */

int create_node_connection(int sock, char *content, int type)
{
    int result = 0, dst_nm_port = 0, brk = 0;
    char *src_node_id = NULL;
    char *dst_node_id = NULL;
    char *dst_nm_ip   = NULL;
    char tmp [1024];
    
    if (!sock || !content)
        return 0;

    memset(tmp, 0x0, 1024);

    // Extract node ID.
    for (int a=0,b=0,c=0,d=0; content[a] != '\0'; a++) {
        if (b == 0 && content[a] == ':')
            b = 1; // Enable.

        else if (b == 1) {
            if (content[a] == ':') {
                switch (d) {

                    // Source node ID.
                    case 0:
                        mem_scopy_ret(tmp, src_node_id, 0);
                        break;
                    
                    default:
                        brk = 1;
                }

                if (brk == 1)
                    break;

                c = 0;
                d++;
                memset(tmp, 0x0, 1024);
            }

            tmp[c++] = content[a];
        }
    }

    say("> source node id: \"%s\"", src_node_id);

    switch (type) {
        case 0:
            // result = create_node_output_connection(sock, id);
            break;
        case 1:
            // Input connections...
            break;
    }

    return result;
}

int create_node_output_connection (int sock, char *id)
{
    int result = 0;

    if (!sock || !id)
        return 0;

    // Extract 

    return result;
}



