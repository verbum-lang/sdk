
#include "global.h"
#include "debug.h"

int random_number (int min, int max)
{
    return min + rand() / (RAND_MAX / (max - min + 1) + 1);
}

int ignore_sigpipe (void)
{    
    // signal(SIGPIPE, SIG_IGN);
    // sigaction(SIGPIPE, &(struct sigaction){SIG_IGN}, NULL);

    struct sigaction act;
    act.sa_handler = SIG_IGN;
    act.sa_flags   = 0;

    if (sigaction(SIGPIPE, &act, NULL) == -1)
        return 0;

    return 1;
}

void show_accept_error (void)
{
    char str [256];
    memset(str, 0, 256);
    
    switch (errno) {
        case_item_a(EAGAIN);
        case_item_a(EBADF);
        case_item_a(ECONNABORTED);
        case_item_a(EFAULT);
        case_item_a(EINTR);
        case_item_a(EINVAL);
        case_item_a(EMFILE);
        case_item_a(ENFILE);
        case_item_a(ENOBUFS);
        case_item_a(ENOMEM);
        case_item_a(ENOTSOCK);
        case_item_a(EOPNOTSUPP);
        case_item_a(EPERM);
        case_item_a(EPROTO);
        case_item_a(ENOSR);
        case_item_a(ESOCKTNOSUPPORT);
        case_item_a(EPROTONOSUPPORT);
        case_item_a(ETIMEDOUT);
    }

    say("Error accept client: %s - %s", str, strerror(errno));
}


