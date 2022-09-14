
#ifndef VERBUM_TIMEOUT_CONTROL
#define VERBUM_TIMEOUT_CONTROL

#include "global.h"

// #define DBGTC

// Update offline flag.
#define VERBUM_NODE_SEC_TIMEOUT_ERROR               30

// Auto remove node.
// #define VERBUM_NODE_AUTO_REMOVE
#define VERBUM_NODE_SEC_TIMEOUT_AUTO_REMOVE         60

// Update error connection flag.
#define VERBUM_CONNECTION_SEC_TIMEOUT_ERROR         30

// Auto remove connection.
#define VERBUM_CONNECTION_AUTO_REMOVE
#define VERBUM_CONNECTION_AUTO_REMOVE_INPUT
// #define VERBUM_CONNECTION_AUTO_REMOVE_OUTPUT
#define VERBUM_CONNECTION_SEC_TIMEOUT_AUTO_REMOVE   60

void *timeout_control (void *tparam);

#endif


