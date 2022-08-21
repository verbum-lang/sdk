
#include "file.h"
#include "memory.h"

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


