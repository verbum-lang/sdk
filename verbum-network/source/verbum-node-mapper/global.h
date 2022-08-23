
#ifndef VERBUM_GLOBAL
#define VERBUM_GLOBAL

#define CURRENT_PACKAGE_NAME            "Verbum Node Mapper"

#include "../library/global.h"
#include "../library/memory.h"
#include "../library/debug.h"
#include "../library/application.h"
#include "../library/file.h"
#include "../library/ini_file.h"

#include "../dependencies/cvector.h"
#include "../dependencies/cvector_utils.h"

// Re-define macros.
#ifdef      PACKAGE_NAME
    #undef  PACKAGE_NAME
    #define PACKAGE_NAME CURRENT_PACKAGE_NAME
#endif
#ifndef     PACKAGE_NAME
    #define PACKAGE_NAME CURRENT_PACKAGE_NAME
#endif

#endif


