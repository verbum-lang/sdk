
/*
** Copyright (c) 2022, the Verbum project authors.  Please see the AUTHORS file
** for details. All rights reserved. Use of this source code is governed by a
** BSD-style license that can be found in the LICENSE file.
**
** In principio erat Verbum et Verbum erat apud Deum et Deus erat Verbum - John 1
**
** Realização da análise semântica.
*/

#ifndef VERBUM_STRUCT
#define VERBUM_STRUCT

// Modalidades do comando 'use'.
#define VERBUM_USE_UNKNOWN      0
#define VERBUM_USE_MODULE       1
#define VERBUM_USE_PATH         2
#define VERBUM_USE_ARCHIVE      3

// Controle dos nodes/hierarquização da própria estrutura AST.
typedef struct verbum_ast_t 
{
    int value;
}  verbum_ast_t;

// Controle da estrutura AST.
// Controle da quantidade de elementos e coisas semelhantes.
typedef struct verbum_ast_control_t 
{
    int size;
} verbum_ast_control_t;

#endif


