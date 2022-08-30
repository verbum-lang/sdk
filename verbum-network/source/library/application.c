
#include "application.h"
#include "memory.h"
#include "debug.h"

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


