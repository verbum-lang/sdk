
#ifndef _H_UTILS_APPLICATION_
#define _H_UTILS_APPLICATION_

#include "global.h"

#define APPLICATION_FORK_CONTROLLER             1
#define APPLICATION_NODE_MAPPER                 2
#define APPLICATION_NODE                        3

int   open_application  (int application);
char *get_relative_path (void);
char *get_real_path     (char *path);

#endif /* _H_UTILS_APPLICATION_ */


