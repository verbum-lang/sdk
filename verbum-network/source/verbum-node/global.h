
#ifndef VERBUM_GLOBAL
#define VERBUM_GLOBAL

#define CURRENT_PACKAGE_NAME                "Verbum Node"
#define NODE_PING_LOOP_SEC_DELAY            1
#define VERBUM_CONNECTION_PING_SEC_DELAY    1

#include "../library/global.h"
#include "../library/memory.h"
#include "../library/debug.h"
#include "../library/application.h"
#include "../library/file.h"
#include "../library/ini_file.h"
#include "../library/connection.h"
#include "../library/process.h"
#include "../library/datetime.h"

// Re-define macros.
#ifdef      PACKAGE_NAME
    #undef  PACKAGE_NAME
    #define PACKAGE_NAME CURRENT_PACKAGE_NAME
#endif
#ifndef     PACKAGE_NAME
    #define PACKAGE_NAME CURRENT_PACKAGE_NAME
#endif

// Debug messages.
// #define NCDBG
#define NCDBG_CON

#endif


