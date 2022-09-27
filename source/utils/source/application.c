
/**
 * Copyright (c) 2022, the Verbum project authors.
 * 
 * Please see the AUTHORS file for details. All rights reserved. Use of this source
 * code is governed by a BSD-style license that can be found in the LICENSE file.
 */

#include "../header/application.h"
#include "../header/memory.h"
#include "../header/debug.h"

#include "../../verbum/header/fork-controller.h"
#include "../../node-mapper/header/node-mapper.h"
#include "../../node/header/node.h"

int open_application (int application)
{
    int   fd_limit;
    pid_t pid;

    switch (application) {
        case APPLICATION_FORK_CONTROLLER:
            say("Starting application: Verbum Fork Controller.");
            break;
        case APPLICATION_NODE_MAPPER:
            say("Starting application: Verbum Node Mapper.");
            break;
        case APPLICATION_NODE:
            say("Starting application: Verbum Node.");
            break;
    }
 
    pid = fork();

    if (pid < 0)
        say_ret(0, "error open fork() 1.");    
    if (pid > 0)
       return 0;

    if (setsid() < 0)
        say_ret(0, "error setsid.");       

    pid = fork();

    if (pid < 0)
        say_exit("error open fork() 2.");
    if (pid > 0) 
        say_exit("fork() 2 - exit.");

    // Close all file descriptors.
    fd_limit = (int) sysconf(_SC_OPEN_MAX);

    for (int fd = STDERR_FILENO + 1; fd < fd_limit; fd++) 
        close(fd);

    stdin  = fopen("/dev/null", "r" );
    stderr = fopen("/dev/null", "w+");
    stdout = fopen("/dev/null", "w+");

    // Ignore child and tty signals.
    signal(SIGCHLD, SIG_IGN);
    signal(SIGTSTP, SIG_IGN);
    signal(SIGTTOU, SIG_IGN);
    signal(SIGTTIN, SIG_IGN);

    switch (application) {
        case APPLICATION_FORK_CONTROLLER:
            say("Started application: Verbum Fork Controller.");
            break;
        case APPLICATION_NODE_MAPPER:
            say("Started application: Verbum Node Mapper.");
            break;
        case APPLICATION_NODE:
            say("Started application: Verbum Node.");
            break;
    }

    switch (application) {
        case APPLICATION_FORK_CONTROLLER:
            if (!initialize_fork_controller_interface())
                exit(0);
            break;

        case APPLICATION_NODE_MAPPER:
            if (!node_mapper())
                exit(0);
            break;

        case APPLICATION_NODE:
            if (!verbum_node())
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
    char  tmp [PATH_MAX];
    char *cwd  = NULL;
    int   size = 0;

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
    char tmp [PATH_MAX];
    char *cwd  = NULL;
    int   size = 0;

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


