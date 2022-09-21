
#include "application.h"
#include "memory.h"
#include "debug.h"

#include "../verbum-node/node.h"
#include "../verbum-node-mapper/node-mapper.h"

void *verbum_node_mapper_open_process (void *_param);
void *verbum_node_open_process (void *_param);

void system_open_bg_application (char *cmd)
{
    pid_t pid = 0;
    int fd    = -1;

    if (!cmd)
        debug_noret("invalid command.");

    // Fork off the parent process.
    pid = fork();

    // Error.
    if (pid < 0)
        debug_noret("error open fork.");

    // Success: Let the parent terminate.
    if (pid > 0)
       return;

    // On success: New session. The child process becomes session leader.
    if (setsid() < 0)
        debug_noret("error setsid.");       

    // Fork off the parent process.
    pid = fork();

    if (pid < 0)
        debug_noret("error open fork.");
    if (pid > 0) 
        exit(0);

    // Close all open file descriptors.
    for (fd = sysconf(_SC_OPEN_MAX); fd > 0; fd--)
        close(fd);

    // Reopen stdin (fd = 0), stdout (fd = 1), stderr (fd = 2).
    stdin  = fopen("/dev/null", "r" );
    stdout = fopen("/dev/null", "w+");
    stderr = fopen("/dev/null", "w+");
    
    system(cmd);
    exit(0);
}

int open_application (int application)
{
    int fd, fd_limit;
    pthread_t tid;
    pid_t pid;

    pid = fork();

    if (pid < 0)
        say_ret(0, "error open fork.");    
    if (pid > 0)
       return 0;

    if (setsid() < 0)
        say_ret(0, "error setsid.");       

    pid = fork();

    if (pid < 0)
        say_exit("error open fork.");
    if (pid > 0)
        exit(0);

    // Close all file descriptors.
    fd_limit = (int) sysconf(_SC_OPEN_MAX);

    for (int fd = STDERR_FILENO + 1; fd < fd_limit; fd++) {
#ifndef BLOCK_FORK_STDOUT
        if (fd != 1)
#endif
        close(fd);
    }

    stdin  = fopen("/dev/null", "r" );
    stderr = fopen("/dev/null", "w+");
    
#ifndef BLOCK_FORK_STDOUT
    stdout = fopen("/dev/null", "w+");
#endif

    // Ignore child and tty signals.
    signal(SIGCHLD, SIG_IGN);
    signal(SIGTSTP, SIG_IGN);
    signal(SIGTTOU, SIG_IGN);
    signal(SIGTTIN, SIG_IGN);

    switch (application) {
        case VERBUM_NODE_APPLICATION:
            pthread_create(&tid, NULL, verbum_node_open_process, NULL);
            // if (!verbum_node())
            //     exit(0);
            break;

        case VERBUM_NODE_MAPPER_APPLICATION:
            pthread_create(&tid, NULL, verbum_node_mapper_open_process, NULL);
            // if (!node_mapper())
            //     exit(0);
            break;

        default:
            exit(0);
            break;
    }

    infinite_loop();
}

void *verbum_node_open_process (void *_param)
{
    verbum_node();
}

void *verbum_node_mapper_open_process (void *_param)
{
    node_mapper();
}

char *get_relative_path (void)
{
    char tmp[PATH_MAX];
    char *cwd = NULL;
    int size  = 0;

    memset(tmp, 0x0, PATH_MAX);

    if (!getcwd(tmp, sizeof(tmp)))
        return NULL;

    size = strlen(tmp);
    if (!size || size <= 0)
        return NULL;

    mem_scopy_ret(tmp, cwd, NULL);
    return cwd;
}

char *get_real_path (char *path)
{
    char tmp[PATH_MAX];
    char *cwd = NULL;
    int size  = 0;

    if (!path)
        return NULL;
        
    memset(tmp, 0x0, PATH_MAX);

    if (!realpath(path, tmp))
        return NULL;

    size = strlen(tmp);
    if (!size || size <= 0)
        return NULL;

    mem_scopy_ret(tmp, cwd, NULL);
    return cwd;
}


