
/*
** Copyright (c) 2022, the Verbum project authors.  Please see the AUTHORS file
** for details. All rights reserved. Use of this source code is governed by a
** BSD-style license that can be found in the LICENSE file.
**
** In principio erat Verbum et Verbum erat apud Deum et Deus erat Verbum - John 1
**
** Banner de ajuda e inicialização da linguagem.
*/

#include <stdio.h>
#include <stdlib.h>

#include "help.h"

using namespace verbum;

VerbumHelp::VerbumHelp (int pargc, const char **pargv) {
    argc = pargc;
    argv = pargv;
}

void VerbumHelp::check () {
    printf("oi: %d", argc);
    if (argc <= 1) {
        banner();
        exit(0);
    }
}

void VerbumHelp::banner () {
    printf(
        "\n\nThe Verbum Programming Language\n\n"
        "Use: %s source.verbum\n\n",
            argv[0]
    );
}



