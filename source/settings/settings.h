
#ifndef _H_SETTINGS_
#define _H_SETTINGS_

/**
 * General settings.
 */

#define LANGUAGE_VERSION                                        "1.0.0"


/**
 * Default interface settings.
 */

#define DEFAULT_NODE_MAPPER_ID                                  "VNM-IHS"
#define DEFAULT_NODE_MAPPER_SERVER_PORT                         3333
#define DEFAULT_FORK_CONTROLLER_SERVER_PORT                     3331


/**
 * Workers limit.
 */

#define FORK_CONTROLLER_WORKERS_LIMIT                           33


/**
 * Delay control.
 */

#define FORK_CONTROLLER_DELAY_SECS_MONITOR                      1
#define FORK_CONTROLLER_DELAY_CLOSE_CONNECTIONS                 100000
#define FORK_CONTROLLER_DELAY_NEXT_ORDER                        100000
#define FORK_CONTROLLER_DELAY_CREATE_NODE                       100000


/**
 * Servers configurations.
 */
#define SERVERS_MAX_CONNECTIONS                                 SOMAXCONN


/**
 * Debug flags.
 */

// #define DBG_DATETIME
// #define DBG_CONNECTION



// Debug settings.
#define VERBUM_DEBUG_ENABLED
#define VERBUM_DEBUG_SERVER_PORT            1337
#define VERBUM_DEBUG_R_ADDRESS              "127.0.0.1"
#define VERBUM_DEBUG_CONNECTION_TIMEOUT     1


#define VERBUM_CHECK_DELETION_LIMIT         10

// General configurations.
#define LOCALHOST                           "127.0.0.1"

// Timeout.
#define CONNECTION_TIMEOUT_LIMIT            10
#define CONNECTION_TIMEOUT_SELECT           2
#define CONNECTION_TIMEOUT_RECV             60

// Default response (socket).
#define VERBUM_DEFAULT_SUCCESS              "verbum-node-ok"
#define VERBUM_DEFAULT_ERROR                "verbum-node-fail"
#define VERBUM_EOH                          "\r\n\r\n"

#define HANDSHAKE_FORK_CONTROLLER           "Verbum Node Fork Controller - v1.0.0 - I Love Jesus <3\r\n\r\n"

#endif /* _H_SETTINGS_ */


