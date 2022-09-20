
#ifndef VERBUM_NM_TIMEOUT_CONTROL
#define VERBUM_NM_TIMEOUT_CONTROL

#include "global.h"

// #define VERBUM_DEBUG_TIMEOUT

// Update offline flag.
#define VERBUM_TIMEOUT_NODE_ERROR                   10//60

// Auto remove node.
#define VERBUM_NODE_AUTO_REMOVE
#define VERBUM_TIMEOUT_NODE_AUTO_REMOVE             15//120

// Update error connection flag.
#define VERBUM_TIMEOUT_CON_ERROR                    60

// Auto remove connection.
#define VERBUM_CONNECTION_AUTO_REMOVE
#define VERBUM_CONNECTION_AUTO_REMOVE_INPUT
// #define VERBUM_CONNECTION_AUTO_REMOVE_OUTPUT
#define VERBUM_TIMEOUT_CON_AUTO_REMOVE              5 //120

int prepare_timeout (void);

#endif


