
#ifndef VERBUM_UTILS_TYPES
#define VERBUM_UTILS_TYPES

/**
 * Used to control Workers (threads).
 * It is mainly used in Node Mapper, for managing connections.
 * And in the management of Node Core interface connections, and Node Server.
 */

typedef struct worker_s {
    pthread_t tid;             // Thread ID.
    int wid;                   // Worker ID.
    int status;                // Status:
                               //  0 = free to use.
                               //  1 = started by controller.
                               //  2 = running.
    int sock;                  // Current client socket.
    struct worker_s *next;     // Next item pointer.
} worker_t;

#endif


