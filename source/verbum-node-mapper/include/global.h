
#ifndef VERBUM_NM_GLOBAL
#define VERBUM_NM_GLOBAL

#include "../../utils/include/global.h"
#include "../../utils/include/memory.h"
#include "../../utils/include/debug.h"
#include "../../utils/include/application.h"
#include "../../utils/include/file.h"
#include "../../utils/include/ini_file.h"
#include "../../utils/include/connection.h"
#include "../../utils/include/process.h"
#include "../../utils/include/datetime.h"
#include "../../utils/include/types.h"


/**
 * Project macros.
 */

// If defined, blocks STDOUT (fork).
#define VNM_BLOCK_FORK_STDOUT

// Total threads (workers) to process server requests.
#define VNM_WORKER_THREAD_LIMIT 200

#endif


