
#include "application.h"

char *get_relative_path (void)
{
    char tmp[PATH_MAX];
    char *cwd = CNULL;
    int size  = 0;

    memset(tmp, 0x0, PATH_MAX);

    if (!getcwd(tmp, sizeof(tmp)))
        return CNULL;

    size = strlen(tmp);
    if (!size || size <= 0)
        return CNULL;

    memory_scopy(tmp, cwd);
    return cwd;
}

char *get_real_path (char *path)
{
    char tmp[PATH_MAX];
    char *cwd = CNULL;
    int size  = 0;

    if (!path)
        return CNULL;
        
    memset(tmp, 0x0, PATH_MAX);

    if (!realpath(path, tmp))
        return CNULL;

    size = strlen(tmp);
    if (!size || size <= 0)
        return CNULL;

    memory_scopy(tmp, cwd);
    return cwd;
}


