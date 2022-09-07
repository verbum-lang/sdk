
#ifndef VERBUM_NODE
#define VERBUM_NODE

#include "global.h"
#include "node-global.h"

#define create_thread_controller(HANDLER)                                                                   \
    do {                                                                                                    \
        int status = -1;                                                                                    \
        pthread_t tid;                                                                                      \
                                                                                                            \
        status = pthread_create(&tid, NULL, HANDLER, NULL);                                                 \
        if (status != 0)                                                                                    \
            say_ret(0, "error creating thread - Verbum Node interface, client and server.");                \
    } while (0)

int verbum_node (void);

#endif


