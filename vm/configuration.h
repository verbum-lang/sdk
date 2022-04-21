
/*
** Copyright (c) 2022, the Verbum project authors.  Please see the AUTHORS file
** for details. All rights reserved. Use of this source code is governed by a
** BSD-style license that can be found in the LICENSE file.
**
** In principio erat Verbum et Verbum erat apud Deum et Deus erat Verbum - John 1
**
** Configurações globais da aplicação.
*/

#ifndef VERBUM_CONFIGURATION
#define VERBUM_CONFIGURATION

// Language version.
#define LANGUAGE_VERSION "1.0"

/*
** Controle das mensagens de debug.
*/
// Debug flag - comentar linha para desabilitar o modo debug.
// #define DBG         // Debug geral.
// #define DBG_TOKENS  // Debug dos tokens (exibe-os).
#define DBG_CLOCK   // Debug do tempo de execução da VM.

/*
** Erros a respeito do processamento dos erros.
*/

// Número máximo de linhas de código que se pode imprimir nas mensagens de erro de sintaxe (ANTLR).
#define VERBUM_MAX_ERROR_PRINT_LINES 10

// Número máximo de caracteres que pode possuir uma mensagem de erro ANTLR (léxica e sintática).
#define VERBUM_MAX_CHARS_ERROR_ANTLR 283

// Mesma regra acima, mas para o número máximo de caracteres por linha.
#define VERBUM_MAX_CHARS_ERROR_ANTLR_LINES_A 70  // Primeira linha.
#define VERBUM_MAX_CHARS_ERROR_ANTLR_LINES_B 108 // Demais linhas.

/*
** Controles da análise sintática (personalizada).
*/

// Número máximo da fila de tokens no Error Node (syntax-analisys.*).
// Quando chega neste limite, o processamento da árvore é interrompida.
#define VERBUM_ERROR_INDEX_COUNT_LIMIT 10

#endif


