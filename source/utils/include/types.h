
#ifndef VERBUM_UTILS_TYPES
#define VERBUM_UTILS_TYPES

// Thread workers control.
typedef struct thread_worker_st {
    pthread_t tid;                      // Thread ID.
    int wid;                            // Worker ID.
    int status;                         // Status:
                                        //  0 = free to use.
                                        //  1 = started by controller.
                                        //  2 = running.
    int sock;                           // Current client socket.
    struct thread_worker_st *next;      // Next node pointer.
} thread_worker_t;

#endif


