
/**
 * Copyright (c) 2022, the Verbum project authors. 
 * 
 * Please see the AUTHORS file for details. All rights reserved. Use of this source 
 * code is governed by a BSD-style license that can be found in the LICENSE file.
 */

#include "debug.h"

int verbum_debug_send_data (char *content)
{
    struct sockaddr_in address;
    int sock, flags, status = 0, counter = 0, limit = 10;

    if (!content)
        return 0;

    address.sin_family      = AF_INET;
    address.sin_addr.s_addr = INADDR_ANY;
    address.sin_port        = htons(VERBUM_DEBUG_SERVER_PORT);

    if (inet_pton(AF_INET, VERBUM_DEBUG_REMOTE_ADDRESS, &address.sin_addr) <= 0)
        say_ret(0, "error set IP address - socket configuration.");

    sock = socket(AF_INET, SOCK_STREAM, 0);
    if (sock == -1) 
        say_ret(0, "creating socket error.");
    
    // Enable non-blocking.
    flags = fcntl(sock, F_GETFL, 0); 
    if (fcntl(sock, F_SETFL, flags | O_NONBLOCK) == -1)
        say_ret(0, "error set non-blocking socket.");

    // Connect.
    if (connect(sock, (struct sockaddr*) &address, sizeof(address)) == -1) {
        if (errno != EINPROGRESS) 
            say_ret(0, "connect error");
    }

    // Disable non blocking.
    if (fcntl(sock, F_SETFL, flags) == -1) {
        close(sock);
        say_ret(0, "error remove non-blocking socket.");
    }

    // Send data.
    while (counter <= limit) {
        if (send(sock, content, strlen(content), MSG_NOSIGNAL) == strlen(content)) {
            status = 1;
            break;
        }

        counter++;
    }

    if (!status) {
        close(sock);
        return 0;
    }

    close(sock);
    return 1;
}

void verbum_debug_print_error (void)
{
	struct error {
		int   code;
		char *name;
	};

	struct error errors [] = {
		{ EPERM,            "EPERM"             },
		{ ENOENT,           "ENOENT"            },
		{ ESRCH,            "ESRCH"             },
		{ EINTR,            "EINTR"             },
		{ EIO,              "EIO"               },
		{ ENXIO,            "ENXIO"             },
		{ E2BIG,            "E2BIG"             },
		{ ENOEXEC,          "ENOEXEC"           },
		{ EBADF,            "EBADF"             },
		{ ECHILD,           "ECHILD"            },
		{ EAGAIN,           "EAGAIN"            },
		{ EWOULDBLOCK,      "EWOULDBLOCK"       },
		{ ENOMEM,           "ENOMEM"            },
		{ EACCES,           "EACCES"            },
		{ EFAULT,           "EFAULT"            },
		{ ENOTBLK,          "ENOTBLK"           },
		{ EBUSY,            "EBUSY"             },
		{ EEXIST,           "EEXIST"            },
		{ EXDEV,            "EXDEV"             },
		{ ENODEV,           "ENODEV"            },
		{ ENOTDIR,          "ENOTDIR"           },
		{ EISDIR,           "EISDIR"            },
		{ EINVAL,           "EINVAL"            },
		{ ENFILE,           "ENFILE"            },
		{ EMFILE,           "EMFILE"            },
		{ ENOTTY,           "ENOTTY"            },
		{ ETXTBSY,          "ETXTBSY"           },
		{ EFBIG,            "EFBIG"             },
		{ ENOSPC,           "ENOSPC"            },
		{ ESPIPE,           "ESPIPE"            },
		{ EROFS,            "EROFS"             },
		{ EMLINK,           "EMLINK"            },
		{ EPIPE,            "EPIPE"             },
		{ EDOM,             "EDOM"              },
		{ ERANGE,           "ERANGE"            },
		{ EDEADLK,          "EDEADLK"           },
		{ EDEADLOCK,        "EDEADLOCK"         },
		{ ENAMETOOLONG,     "ENAMETOOLONG"      },
		{ ENOLCK,           "ENOLCK"            },
		{ ENOSYS,           "ENOSYS"            },
		{ ENOTEMPTY,        "ENOTEMPTY"         },
		{ ELOOP,            "ELOOP"             },
		{ ENOMSG,           "ENOMSG"            },
		{ EIDRM,            "EIDRM"             },
		{ ECHRNG,           "ECHRNG"            },
		{ EL2NSYNC,         "EL2NSYNC"          },
		{ EL3HLT,           "EL3HLT"            },
		{ EL3RST,           "EL3RST"            },
		{ ELNRNG,           "ELNRNG"            },
		{ EUNATCH,          "EUNATCH"           },
		{ ENOCSI,           "ENOCSI"            },
		{ EL2HLT,           "EL2HLT"            },
		{ EBADE,            "EBADE"             },
		{ EBADR,            "EBADR"             },
		{ EXFULL,           "EXFULL"            },
		{ ENOANO,           "ENOANO"            },
		{ EBADRQC,          "EBADRQC"           },
		{ EBADSLT,          "EBADSLT"           },
		{ EBFONT,           "EBFONT"            },
		{ ENOSTR,           "ENOSTR"            },
		{ ENODATA,          "ENODATA"           },
		{ ETIME,            "ETIME"             },
		{ ENOSR,            "ENOSR"             },
		{ ENONET,           "ENONET"            },
		{ ENOPKG,           "ENOPKG"            },
		{ EREMOTE,          "EREMOTE"           },
		{ ENOLINK,          "ENOLINK"           },
		{ EADV,             "EADV"              },
		{ ESRMNT,           "ESRMNT"            },
		{ ECOMM,            "ECOMM"             },
		{ EPROTO,           "EPROTO"            },
		{ EMULTIHOP,        "EMULTIHOP"         },
		{ EDOTDOT,          "EDOTDOT"           },
		{ EBADMSG,          "EBADMSG"           },
		{ EOVERFLOW,        "EOVERFLOW"         },
		{ ENOTUNIQ,         "ENOTUNIQ"          },
		{ EBADFD,           "EBADFD"            },
		{ EREMCHG,          "EREMCHG"           },
		{ ELIBACC,          "ELIBACC"           },
		{ ELIBBAD,          "ELIBBAD"           },
		{ ELIBSCN,          "ELIBSCN"           },
		{ ELIBMAX,          "ELIBMAX"           },
		{ ELIBEXEC,         "ELIBEXEC"          },
		{ EILSEQ,           "EILSEQ"            },
		{ ERESTART,         "ERESTART"          },
		{ ESTRPIPE,         "ESTRPIPE"          },
		{ EUSERS,           "EUSERS"            },
		{ ENOTSOCK,         "ENOTSOCK"          },
		{ EDESTADDRREQ,     "EDESTADDRREQ"      },
		{ EMSGSIZE,         "EMSGSIZE"          },
		{ EPROTOTYPE,       "EPROTOTYPE"        },
		{ ENOPROTOOPT,      "ENOPROTOOPT"       },
		{ EPROTONOSUPPORT,  "EPROTONOSUPPORT"   },
		{ ESOCKTNOSUPPORT,  "ESOCKTNOSUPPORT"   },
		{ EOPNOTSUPP,       "EOPNOTSUPP"        },
		{ ENOTSUP,          "ENOTSUP"           },
		{ EPFNOSUPPORT,     "EPFNOSUPPORT"      },
		{ EAFNOSUPPORT,     "EAFNOSUPPORT"      },
		{ EADDRINUSE,       "EADDRINUSE"        },
		{ EADDRNOTAVAIL,    "EADDRNOTAVAIL"     },
		{ ENETDOWN,         "ENETDOWN"          },
		{ ENETUNREACH,      "ENETUNREACH"       },
		{ ENETRESET,        "ENETRESET"         },
		{ ECONNABORTED,     "ECONNABORTED"      },
		{ ECONNRESET,       "ECONNRESET"        },
		{ ENOBUFS,          "ENOBUFS"           },
		{ EISCONN,          "EISCONN"           },
		{ ENOTCONN,         "ENOTCONN"          },
		{ ESHUTDOWN,        "ESHUTDOWN"         },
		{ ETOOMANYREFS,     "ETOOMANYREFS"      },
		{ ETIMEDOUT,        "ETIMEDOUT"         },
		{ ECONNREFUSED,     "ECONNREFUSED"      },
		{ EHOSTDOWN,        "EHOSTDOWN"         },
		{ EHOSTUNREACH,     "EHOSTUNREACH"      },
		{ EALREADY,         "EALREADY"          },
		{ EINPROGRESS,      "EINPROGRESS"       },
		{ ESTALE,           "ESTALE"            },
		{ EUCLEAN,          "EUCLEAN"           },
		{ ENOTNAM,          "ENOTNAM"           },
		{ ENAVAIL,          "ENAVAIL"           },
		{ EISNAM,           "EISNAM"            },
		{ EREMOTEIO,        "EREMOTEIO"         },
		{ EDQUOT,           "EDQUOT"            },
		{ ENOMEDIUM,        "ENOMEDIUM"         },
		{ EMEDIUMTYPE,      "EMEDIUMTYPE"       },
		{ ECANCELED,        "ECANCELED"         },
		{ ENOKEY,           "ENOKEY"            },
		{ EKEYEXPIRED,      "EKEYEXPIRED"       },
		{ EKEYREVOKED,      "EKEYREVOKED"       },
		{ EKEYREJECTED,     "EKEYREJECTED"      },
		{ EOWNERDEAD,       "EOWNERDEAD"        },
		{ ENOTRECOVERABLE,  "ENOTRECOVERABLE"   },
		{ ERFKILL,          "ERFKILL"           },
		{ EHWPOISON,        "EHWPOISON"         },
		{ -1,                NULL               },
	};

    for (int a=0; errors[a].code != -1; a++) {
        if (errors[a].code == errno)
            say("Error %d (%s): %s", 
                    errors[a].code, errors[a].name, strerror(errors[a].code));
    }
}


