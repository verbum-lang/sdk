
/**
 * Copyright (c) 2022, the Verbum project authors. 
 * 
 * Please see the AUTHORS file for details. All rights reserved. Use of this source 
 * code is governed by a BSD-style license that can be found in the LICENSE file.
 */

#include "process.h"
#include "memory.h"


/**
 * Check process is running (check by name).
 * Success: return process PID. Error: return -1.
 * https://stackoverflow.com/questions/6898337/determine-programmatically-if-a-program-is-running
 */

pid_t check_process_running (char *name)
{
    DIR *directory;
    FILE *fp;
    struct dirent *dirdata;
    char *endptr = NULL;
    char buffer [512];

    directory = opendir("/proc");
    if (!directory) {
        say("Can't open /proc.");
        return -1;
    }

    while ((dirdata = readdir(directory)) != NULL) {

        // If endptr is not a null character, the directory is not
        // entirely numeric, so ignore it.
        long lpid = strtol(dirdata->d_name, &endptr, 10);
        if (*endptr != '\0')
            continue;

        // Try to open the cmdline file.
        snprintf(buffer, sizeof(buffer), "/proc/%ld/cmdline", lpid);

        fp = fopen(buffer, "r");
        if (fp) {
            if (fgets(buffer, sizeof(buffer), fp) != NULL) {

                // Check the first token in the file, the program name.
                char *first = strtok(buffer, " ");

                if (!strcmp(first, name)) {
                    fclose(fp);
                    closedir(directory);
                    return (pid_t) lpid;
                }
            }

            fclose(fp);
        }
    }

    closedir(directory);
    return -1;
}


