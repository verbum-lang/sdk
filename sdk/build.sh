
clear
echo "Clean temporary files."
rm -rf verbum
rm -rf parser/*

echo "Generate grammar files."
cd grammar
java -jar ../../dependencies/ANTLR4/jar/antlr-4.9.2-complete.jar -Werror -Dlanguage=Cpp -listener -visitor -o ../parser/ -package verbum ./TLexer.g4 ./TParser.g4

cd ../parser/
echo "Compile: TLexer.cpp"
c++ -c TLexer.cpp -I../../dependencies/ANTLR4/runtime/src  -Wno-overloaded-virtual
echo "Compile: TParserBaseListener.cpp"
c++ -c TParserBaseListener.cpp -I../../dependencies/ANTLR4/runtime/src  -Wno-overloaded-virtual
echo "Compile: TParserBaseVisitor.cpp"
c++ -c TParserBaseVisitor.cpp -I../../dependencies/ANTLR4/runtime/src  -Wno-overloaded-virtual
echo "Compile: TParser.cpp"
c++ -c TParser.cpp -I../../dependencies/ANTLR4/runtime/src  -Wno-overloaded-virtual
echo "Compile: TParserListener.cpp"
c++ -c TParserListener.cpp -I../../dependencies/ANTLR4/runtime/src  -Wno-overloaded-virtual
echo "Compile: TParserVisitor.cpp"
c++ -c TParserVisitor.cpp -I../../dependencies/ANTLR4/runtime/src  -Wno-overloaded-virtual

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


