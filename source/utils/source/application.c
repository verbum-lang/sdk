
#include "application.h"
#include "memory.h"
#include "debug.h"

#include "../../verbum-node/include/node.h"
#include "../../verbum-node-mapper/include/node-mapper.h"

void system_open_bg_application (char *cmd)
{
    int fd, fd_limit;
    pid_t pid;

    if (!cmd)
        say_noret("invalid command.");

    // Fork off the parent process.
    pid = fork();

    // Error.
    if (pid < 0)
        say_noret("error open fork.");

    // Success: Let the parent terminate.
    if (pid > 0)
       return;

    // On success: New session.
    // The child process becomes session leader.
    if (setsid() < 0)
        say_noret("error setsid.");       

    // Fork off the parent process.
    pid = fork();

    if (pid < 0)
        say_noret("error open fork.");
    if (pid > 0) 
        exit(0);

    // Close all open file descriptors.
    fd_limit = (int) sysconf(_SC_OPEN_MAX);
    for (fd = STDERR_FILENO + 1; fd < fd_limit; fd++)
        close(fd);

    // Reopen stdin (fd = 0), stdout (fd = 1), stderr (fd = 2).
    stdin  = fopen("/dev/null", "r" );
    stdout = fopen("/dev/null", "w+");
    stderr = fopen("/dev/null", "w+");
    
    signal(SIGCHLD, SIG_IGN); // ignore child.
    signal(SIGTSTP, SIG_IGN); // ignore tty signals.
    signal(SIGTTOU, SIG_IGN);
    signal(SIGTTIN, SIG_IGN);

    system(cmd);
    exit(0);
}

int open_application (int application)
{
    int fd, fd_limit;
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
        say_ret(0, "error open fork.");
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
            if (!initialize_node())
                exit(0);
            break;

        case VERBUM_NODE_MAPPER_APPLICATION:
            if (!initialize_node_mapper())
                exit(0);
            break;

        default:
            exit(0);
            break;
    }

    infinite_loop();
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


