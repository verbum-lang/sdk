
#include "global.h"

int file_exists (char *path)
{
    FILE *fp = NULL;

    if (!path)
        return 0;

    fp = fopen(path, "rb");
    if (!fp)
        return 0;

    fclose(fp);
    return 1;
}

char *file_read (char *path)
{
    FILE *fp      = NULL;
    long size     = 0;
    char *content = CNULL;

    if (!path)
        return CNULL;

    fp = fopen(path, "rb");
    if (!fp)
        return CNULL;

    fseek(fp, 0, SEEK_END);
    size = ftell(fp);
    fseek(fp, 0, SEEK_SET);

    if (!size || size <= 0) {
        fclose(fp);
        return CNULL;
    }

    memory_alloc(content, size);
    fread(content, 1, size, fp);
    fclose(fp);

    return content;
}

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


