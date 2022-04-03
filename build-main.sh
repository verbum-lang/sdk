
COMPILER_PATH=c++

clear
cd sdk

echo "Clean temporary files."
rm -rf ../build/verbum
rm -rf verbum.o loader.o help.o lexer-syntactic.o ast-visitor.o

echo "Compile: help.cc"
$COMPILER_PATH -c help.cc -I../dependencies/ANTLR4/runtime/src -I./parser -Wno-overloaded-virtual

echo "Compile: loader.cc"
$COMPILER_PATH -c loader.cc -I../dependencies/ANTLR4/runtime/src -I./parser -Wno-overloaded-virtual

echo "Compile: lexer-syntactic.cc"
$COMPILER_PATH -c lexer-syntactic.cc -I../dependencies/ANTLR4/runtime/src -I./parser -Wno-overloaded-virtual

echo "Compile: ast-visitor.cc"
$COMPILER_PATH -c ast-visitor.cc -I../dependencies/ANTLR4/runtime/src -I./parser -Wno-overloaded-virtual

echo "Compile: error.cc"
$COMPILER_PATH -c error.cc -I../dependencies/ANTLR4/runtime/src -I./parser -Wno-overloaded-virtual

echo "Compile: semantics.cc"
$COMPILER_PATH -c semantics.cc -I../dependencies/ANTLR4/runtime/src -I./parser -Wno-overloaded-virtual

echo "Compile: verbum.cc"
$COMPILER_PATH -c verbum.cc -I../dependencies/ANTLR4/runtime/src -I./parser -Wno-overloaded-virtual

echo "Linking files..."
$COMPILER_PATH -Wall -pedantic -W -O3 -DNDEBUG -O3 -DNDEBUG -rdynamic verbum.o ./parser/TLexer.o \
    ./parser/TParser.o ./parser/TParserBaseListener.o ./parser/TParserBaseVisitor.o \
    ./parser/TParserListener.o ./parser/TParserVisitor.o \
    ./help.o ./loader.o ./lexer-syntactic.o ./ast-visitor.o ./error.o ./semantics.o \
    -o ../build/verbum ../dependencies/ANTLR4/dist/libantlr4-runtime.a -luuid 

echo "Finished!"
echo ""
echo "Verbum Programming Language <3"
echo ""


