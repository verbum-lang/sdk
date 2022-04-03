
COMPILER_PATH=c++

clear
cd sdk

echo "Clean temporary files."
rm -rf ../build/verbum
rm -rf $1.o

echo "Compile: $1.cc"
$COMPILER_PATH -c $1.cc -I../dependencies/ANTLR4/runtime/src -I./parser -Wno-overloaded-virtual

echo "Linking files..."
$COMPILER_PATH -Wall -pedantic -W -O3 -DNDEBUG -O3 -DNDEBUG -rdynamic verbum.o ./parser/TLexer.o \
    ./parser/TParser.o ./parser/TParserBaseListener.o ./parser/TParserBaseVisitor.o \
    ./parser/TParserListener.o ./parser/TParserVisitor.o \
    ./help.o ./loader.o ./lexer-syntactic.o ./ast-visitor.o ./error.o ./semantics.o \
    ./use.o \
    -o ../build/verbum ../dependencies/ANTLR4/dist/libantlr4-runtime.a -luuid 

echo "Finished!"
echo ""
echo "Verbum Programming Language <3"
echo ""


