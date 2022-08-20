
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

typedef struct { 
    int ivalue;
    char *svalue;
} ini_data_t;

ini_data_t ini_read (char *content, char *section, char *param, int type)
{
    int content_size  = 0;
    int line_size     = 0;
    int number        = 0;
    int step_check    = 0;
    char *line        = CNULL;
    char *tmp         = CNULL;

    ini_data_t result = { .ivalue = 0, .svalue = CNULL };

    if (!content || !section || !param)
        return result;

    content_size = strlen(content);
    line_size = sizeof(char) * PATH_MAX;
    memory_alloc(line, line_size);
    memory_alloc(tmp, line_size);

    for (int a=0,b=0; a<content_size; a++) {
        if (content[a] == '\n') {
            if (strlen(line) > 0) {

                // Check section.
                if (step_check == 0) {
                    memset(tmp, 0x0, line_size);
                    
                    for (int c=0,d=0; c<strlen(line); c++) {
                        if (c >= 1)
                            tmp[d++] = line[c];
                    }

                    tmp[strlen(tmp)-1] = '\0';

                    if (strcmp(section, tmp) == 0)
                        step_check = 1;
                }

                // Check param.
                else if (step_check == 1) {
                    if (strstr(line, "=")) {
                        memset(tmp, 0x0, line_size);
                        
                        for (int c=0,d=0,e=0; c<strlen(line); c++) {
                            if (line[c] == '=')
                                d = 1;
                            else if (d == 1)
                                tmp[e++] = line[c];
                        }

                        tmp[strlen(tmp)-1] = '\0';
                        number = atoi(tmp);
                    } else
                        step_check = 0;
                }
            }

            b = 0;
            memset(line, 0x0, line_size);
            memset(tmp, 0x0, line_size);
        }

        else if (content[a] != '\r' && content[a] != '\t') {
            line[b++] = content[a];
        }
    }

    memset(line, 0x0, line_size);
    memset(tmp, 0x0, line_size);

    free(line);
    free(tmp);

    return result;
}


char *ini_read_string (char *content, char *section, char *param)
{
    return CNULL;
}

int ini_read_number (char *content, char *section, char *param)
{
    return 0;
}


