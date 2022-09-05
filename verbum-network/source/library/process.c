
#include "process.h"
#include "memory.h"

/**
 * Check process is running (check by name).
 * 
 * Success: return process PID. Error: return -1.
 * 
 * https://stackoverflow.com/questions/6898337/determine-programmatically-if-a-program-is-running
 */

pid_t check_process_running (char *name)
{
    DIR *directory;
    struct dirent *dirdata;
    char *endptr = NULL;
    char buffer [512];

    directory = opendir("/proc");
    if (!directory)
        debug_ret((pid_t) -1, "can't open /proc.");

    while ((dirdata = readdir(directory)) != NULL) {

        // If endptr is not a null character, the directory is not
        // entirely numeric, so ignore it.
        long lpid = strtol(dirdata->d_name, &endptr, 10);
        if (*endptr != '\0')
            continue;

        // Try to open the cmdline file.
        snprintf(buffer, sizeof(buffer), "/proc/%ld/cmdline", lpid);
        FILE *fp = fopen(buffer, "r");

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


