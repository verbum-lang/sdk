
#ifndef _H_VERBUM_FORK_CONTROLLER_
#define _H_VERBUM_FORK_CONTROLLER_

#include "global.h"

#define _w_continue(FREE_DATA)                                                 \
    {                                                                          \
        if (FREE_DATA)                                                         \
            free(order);                                                       \
                                                                               \
        usleep(100000);                                                        \
        continue;                                                              \
    }

int initialize_fork_controller           (void);
int initialize_fork_controller_interface (void);

#endif /* _H_VERBUM_FORK_CONTROLLER_ */


