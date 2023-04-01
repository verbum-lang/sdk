
/**
 * Copyright (c) 2022, the Verbum project authors. 
 * 
 * Please see the AUTHORS file for details. All rights reserved. Use of this source 
 * code is governed by a BSD-style license that can be found in the LICENSE file.
 */

#include "ini_file.h"
#include "memory.h"

ini_data_t ini_read (char *content, char *section, char *param, int type)
{
    int content_size  = 0, step_check = 0, size = 0, line_size = 1024;
    char *line        = NULL, *section_name = NULL;
    char *param_name  = NULL, *param_value  = NULL;
    ini_data_t result = { .ivalue = 0, .svalue = NULL };

    if (!content || !section || !param)
        return result;

    content_size = strlen(content);

    mem_salloc_ret(line,         line_size, result);
    mem_salloc_ret(section_name, line_size, result);
    mem_salloc_ret(param_name,   line_size, result);
    mem_salloc_ret(param_value,  line_size, result);

    for (int a=0,b=0; a<content_size; a++) {
        if (content[a] == '\n') {
            if (strlen(line) > 0) {

                // Search section.
                if (step_check == 0) {
                    memset(section_name, '\0', line_size);
                    
                    for (int c=0,d=0; c<strlen(line); c++)
                        if (c >= 1)
                            section_name[d++] = line[c];

                    section_name[strlen(section_name)-1] = '\0';

                    if (strcmp(section, section_name) == 0 &&
                        line[0] == '[' && line[ strlen(line) - 1 ] == ']')
                        step_check = 1;
                }

                // Search param.
                else if (step_check == 1) {
                    if (strstr(line, "=")) {
                        memset(param_name,  '\0', line_size);
                        memset(param_value, '\0', line_size);
                        
                        for (int c=0,d=0,e=0; c<strlen(line); c++) {
                            if (line[c] == '=')
                                d = 1;
                            else if (d == 1)
                                param_value[e++] = line[c];
                            else 
                                param_name[c] = line[c];
                        }
                        
                        if (strcmp(param, param_name) == 0) {
                            switch (type) {
                                case 0:
                                    size          = sizeof(char) * (strlen(param_value) + 1);
                                    result.svalue = (char *) malloc(size);

                                    if (!result.svalue) {
                                        say("error allocating memory.");
                                        goto ir_end;
                                    }

                                    memset(result.svalue, '\0', size);
                                    memcpy(result.svalue, param_value, strlen(param_value));
                                    break;
                                case 1:
                                    result.ivalue = atoi(param_value);
                                    break;
                            }
                        }
                    } else
                        step_check = 0;
                }
            }

            b = 0;
            memset(line, '\0', line_size);
        }

        else if (content[a] != '\r' && content[a] != '\t') 
            line[b++] = content[a];
    }

    ir_end:

    memset(line,         '\0', line_size);
    memset(section_name, '\0', line_size);
    memset(param_name,   '\0', line_size);
    memset(param_value,  '\0', line_size);

    free(line);
    free(section_name);
    free(param_name);
    free(param_value);

    return result;
}

char *ini_read_string (char *content, char *section, char *param)
{
    ini_data_t result = ini_read(content, section, param, 0);
    return result.svalue;
}

int ini_read_number (char *content, char *section, char *param)
{
    ini_data_t result = ini_read(content, section, param, 1);
    return result.ivalue;
}


