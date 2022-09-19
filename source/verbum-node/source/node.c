
#include "node.h"
#include "monitor-processes.h"
#include "node-core.h"
#include "node-client.h"
#include "node-server.h"

pthread_mutex_t    node_mutex_gconfig     = PTHREAD_MUTEX_INITIALIZER;
node_config_t     *node_gconfig;

pthread_mutex_t    node_mutex_connections = PTHREAD_MUTEX_INITIALIZER;
node_connection_t *node_connections;

int verbum_node (void)
{
    say_debug("Verbum Node started!");

    if (!ignore_sigpipe())
        say_ret(0, "ignore_sigpipe() error.");

    // Prepare global configurations.
    mem_alloc_ret(node_gconfig, sizeof(node_config_t), node_config_t *, 0);

    node_gconfig->path             = NULL;
    node_gconfig->max_connections  = SERVERS_MAX_CONNECTION;
    node_gconfig->node_mapper_port = global.configuration.node_mapper.server_port;



    // Get Node Mapper ID...
    mem_scopy_ret(global.configuration.node_mapper.id, node_gconfig->node_mapper_id, 0);



    // Prepare mutex.
    if (pthread_mutex_init(&node_mutex_gconfig, NULL) != 0) 
        say_ret(0, "mutex initialization failed - global configuration.");

    if (pthread_mutex_init(&node_mutex_connections, NULL) != 0) 
        say_ret(0, "mutex initialization failed - connections.");
    
    if (!monitor_processes())
        return 0; 
    
    /**
     * Node Core interface.
     */
    create_thread_controller(node_core);

    /**
     * Node client connections control.
     */
    create_thread_controller(node_client);

    /**
     * Node Server interface.
     */
    create_thread_controller(node_server);

    return 1;
}

int create_verbum_node (void)
{
    pid_t pid = 0;
    int fd    = -1, fdlimit = -1;

    // Fork off the parent process.
    pid = fork();

    // Error.
    if (pid < 0)
        say_ret(0, "error open fork.");

    // Success: Let the parent terminate.
    if (pid > 0)
       return 0;

    // On success: New session. 
    // The child process becomes session leader.
    if (setsid() < 0)
        say_ret(0, "error setsid.");       

    // Fork off the parent process.
    pid = fork();

    if (pid < 0)
        say_ret(0, "error open fork.");
    if (pid > 0) 
        exit(0);

    // Close all open file descriptors.
    fdlimit = (int) sysconf(_SC_OPEN_MAX);
    for (int fd = STDERR_FILENO + 1; fd < fdlimit; fd++)
        if (fd != 1)
            close(fd);

    // Reopen stdin (fd = 0), stdout (fd = 1), stderr (fd = 2).
    stdin  = fopen("/dev/null", "r" );
    stderr = fopen("/dev/null", "w+");

    #ifdef VN_BLOCK_FORK_STDOUT
        stdout = fopen("/dev/null", "w+");
    #endif
    
    signal(SIGCHLD, SIG_IGN); // ignore child.
    signal(SIGTSTP, SIG_IGN); // ignore tty signals.
    signal(SIGTTOU, SIG_IGN);
    signal(SIGTTIN, SIG_IGN);

    if (!verbum_node())
        exit(0);

    infinite_loop();
    return 0;
}


