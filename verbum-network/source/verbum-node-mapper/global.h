
#ifndef VERBUM_GLOBAL
#define VERBUM_GLOBAL

#define CURRENT_PACKAGE_NAME            "Verbum Node Mapper"
#define CONNECTIONS_TIMEOUT1            3
#define LOCALHOST                       "127.0.0.1"
#define SERVERS_MAX_CONNECTION          1000

#include "../library/global.h"
#include "../library/memory.h"
#include "../library/debug.h"
#include "../library/application.h"
#include "../library/file.h"
#include "../library/ini_file.h"

// Re-define macros.
#ifdef      PACKAGE_NAME
    #undef  PACKAGE_NAME
    #define PACKAGE_NAME CURRENT_PACKAGE_NAME
#endif
#ifndef     PACKAGE_NAME
    #define PACKAGE_NAME CURRENT_PACKAGE_NAME
#endif

#endif


