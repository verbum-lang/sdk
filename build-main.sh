
COMPILER_PATH=c++
JAVA_PATH=java

clear
cd sdk

echo "Clean temporary files."
rm -rf ../build/verbum
rm -rf verbum.o

echo "Compile: verbum.cc"
c++ -c verbum.cc -I../dependencies/ANTLR4/runtime/src -I./parser -Wno-overloaded-virtual

echo "Linking files..."
c++ -Wall -pedantic -W -O3 -DNDEBUG -O3 -DNDEBUG -rdynamic verbum.o ./parser/TLexer.o \
    ./parser/TParser.o ./parser/TParserBaseListener.o ./parser/TParserBaseVisitor.o \
    ./parser/TParserListener.o ./parser/TParserVisitor.o  -o ../build/verbum ../dependencies/ANTLR4/dist/libantlr4-runtime.a -luuid 

echo "Finished!"
echo ""
echo "Verbum Programming Language <3"
echo ""


