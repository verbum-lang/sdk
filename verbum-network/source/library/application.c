
#include <stdarg.h>                      

#include "application.h"
#include "memory.h"
#include "debug.h"

void system_open_bg_application (char *cmd)
{
    pid_t pid = 0;
    int fd;

    /* Fork off the parent process. */
    pid = fork();

    /* Error. */
    if (pid < 0)
        debug_exit("error open fork.");

    /* Success: Let the parent terminate. */
    if (pid > 0)
       return;

    /* On success: New session. The child process becomes session leader. */
    if (setsid() < 0)
        debug_exit("error setsid.");       

    /* Fork off the parent process. */
    pid = fork();

    if (pid < 0)
        debug_exit("error open fork.");
    if (pid > 0) 
        exit(0);

    /* Close all open file descriptors. */
    for (fd = sysconf(_SC_OPEN_MAX); fd > 0; fd--)
        close(fd);

    /* Reopen stdin (fd = 0), stdout (fd = 1), stderr (fd = 2). */
    stdin  = fopen("/dev/null", "r");
    stdout = fopen("/dev/null", "w+");
    stderr = fopen("/dev/null", "w+");
    
    system(cmd);
    exit(0);
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

    memory_scopy(tmp, cwd);
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

    memory_scopy(tmp, cwd);
    return cwd;
}


