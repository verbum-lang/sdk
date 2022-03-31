
clear
echo "Clean temporary files."
rm -rf verbum

echo "Compiling Verbum"
cd ..
c++ -c verbum.cpp -I../dependencies/ANTLR4/runtime/src -I./parser -Wno-overloaded-virtual

echo "Linking file..."
c++ -Wall -pedantic -W -O3 -DNDEBUG -O3 -DNDEBUG -rdynamic verbum.o ./parser/TLexer.o \
    ./parser/TParser.o ./parser/TParserBaseListener.o ./parser/TParserBaseVisitor.o \
    ./parser/TParserListener.o ./parser/TParserVisitor.o  -o verbum ../dependencies/ANTLR4/dist/libantlr4-runtime.a -luuid 

echo "Clean temporary files"
rm -rf verbum.o

echo "Finished!"
echo ""


