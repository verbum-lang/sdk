
#ifndef _H_SETTINGS_
#define _H_SETTINGS_

#define VERBUM_LANGUAGE_VERSION             "1.0.0"

/**
 * Default interface settings.
 */

#define VERBUM_DEFAULT_NODE_MAPPER_ID       "VNM-IHS"
#define VERBUM_DEFAULT_NODE_MAPPER_S_PORT   3333
#define VERBUM_FORK_CONTROLLER_PORT 	    3331

#define VERBUM_CHECK_DELETION_LIMIT         10

// General configurations.
#define LOCALHOST                           "127.0.0.1"
#define SERVERS_MAX_CONNECTION              SOMAXCONN

// Timeout.
#define CONNECTION_TIMEOUT_LIMIT            10
#define CONNECTION_TIMEOUT_SELECT           2
#define CONNECTION_TIMEOUT_RECV             60

// Default response (socket).
#define VERBUM_DEFAULT_SUCCESS              "verbum-node-ok"
#define VERBUM_DEFAULT_ERROR                "verbum-node-fail"
#define VERBUM_EOH                          "\r\n\r\n"


#endif /* _H_SETTINGS_ */


