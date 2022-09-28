
/**
 * Copyright (c) 2022, the Verbum project authors. 
 * 
 * Please see the AUTHORS file for details. All rights reserved. Use of this source 
 * code is governed by a BSD-style license that can be found in the LICENSE file.
 */

#ifndef _H_SETTINGS_
#define _H_SETTINGS_

/**
 * General settings.
 */

#define LANGUAGE_VERSION                            "1.0.0"


/**
 * Default interface settings.
 */

#define DEFAULT_NODE_MAPPER_ID                      "VNM-IHS"
#define DEFAULT_NODE_MAPPER_SERVER_PORT             3333
#define DEFAULT_FORK_CONTROLLER_SERVER_PORT         3331


/**
 * Workers limit.
 */

#define FORK_CONTROLLER_WORKERS_LIMIT               33


/**
 * Servers configurations.
 */

// General configurations.
#define LOCALHOST                                   "127.0.0.1"
#define SERVERS_MAX_CONNECTIONS                     SOMAXCONN

// Timeout.
#define CONNECTION_TIMEOUT_LIMIT                    10
#define CONNECTION_TIMEOUT_SELECT                   2
#define CONNECTION_TIMEOUT_RECV                     60

// Default response (socket).
#define VERBUM_DEFAULT_SUCCESS                      "verbum-node-ok"
#define VERBUM_DEFAULT_ERROR                        "verbum-node-fail"
#define VERBUM_EOH                                  "\r\n\r\n"

// Handshake.
#define HANDSHAKE_FORK_CONTROLLER                   "Verbum Node Fork Controller - v1.0.0 - I Love Jesus <3\r\n\r\n"


/**
 * Persistence actions.
 */

#define CHECK_DELETION_LIMIT                        10


/**
 * Delay control.
 */

#define CONNECTION_DELAY_CONNECT                    1000
#define CONNECTION_DELAY_SEND_HANDSHAKE             1000
#define CONNECTION_DELAY_PROCESS_REQUEST            1000
#define CONNECTION_DELAY_CREATE_NODE                1000

#define FORK_CONTROLLER_DELAY_SECS_MONITOR          1
#define FORK_CONTROLLER_DELAY_CLOSE_CONNECTIONS     100000
#define FORK_CONTROLLER_DELAY_NEXT_ORDER            100000
#define FORK_CONTROLLER_DELAY_CREATE_NODE           100000

#define NODE_CREATION_DELAY_CREATE_NODE             100000


/**
 * Debug flags.
 */

// Verbum Debug settings.
#define VERBUM_DEBUG_ENABLED
#define VERBUM_DEBUG_SERVER_PORT                    1337
#define VERBUM_DEBUG_REMOTE_ADDRESS                 "127.0.0.1"

// General.
// #define DBG_DATETIME
// #define DBG_CONNECTION

#endif /* _H_SETTINGS_ */


