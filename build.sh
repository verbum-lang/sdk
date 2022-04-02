
COMPILER_PATH=c++
JAVA_PATH=java

clear
cd sdk

echo "Clean temporary files."
rm -rf ../build/verbum
rm -rf parser/*

echo "Generate grammar files."
cd grammar
$JAVA_PATH -jar ../../dependencies/ANTLR4/jar/antlr-4.9.2-complete.jar -Werror -Dlanguage=Cpp -listener -visitor -o ../parser/ -package verbum ./TLexer.g4 ./TParser.g4

cd ../parser/
echo "Compile: TLexer.cpp"
$COMPILER_PATH -c TLexer.cpp -I../../dependencies/ANTLR4/runtime/src  -Wno-overloaded-virtual
echo "Compile: TParserBaseListener.cpp"
$COMPILER_PATH -c TParserBaseListener.cpp -I../../dependencies/ANTLR4/runtime/src  -Wno-overloaded-virtual
echo "Compile: TParserBaseVisitor.cpp"
$COMPILER_PATH -c TParserBaseVisitor.cpp -I../../dependencies/ANTLR4/runtime/src  -Wno-overloaded-virtual
echo "Compile: TParser.cpp"
$COMPILER_PATH -c TParser.cpp -I../../dependencies/ANTLR4/runtime/src  -Wno-overloaded-virtual
echo "Compile: TParserListener.cpp"
$COMPILER_PATH -c TParserListener.cpp -I../../dependencies/ANTLR4/runtime/src  -Wno-overloaded-virtual
echo "Compile: TParserVisitor.cpp"
$COMPILER_PATH -c TParserVisitor.cpp -I../../dependencies/ANTLR4/runtime/src  -Wno-overloaded-virtual

cd ..

echo "Compile: help.cc"
$COMPILER_PATH -c help.cc -I../dependencies/ANTLR4/runtime/src -I./parser -Wno-overloaded-virtual

echo "Compile: verbum.cc"
$COMPILER_PATH -c verbum.cc -I../dependencies/ANTLR4/runtime/src -I./parser -Wno-overloaded-virtual

echo "Linking files..."
$COMPILER_PATH -Wall -pedantic -W -O3 -DNDEBUG -O3 -DNDEBUG -rdynamic verbum.o ./parser/TLexer.o \
    ./parser/TParser.o ./parser/TParserBaseListener.o ./parser/TParserBaseVisitor.o \
    ./parser/TParserListener.o ./parser/TParserVisitor.o  -o ../build/verbum ../dependencies/ANTLR4/dist/libantlr4-runtime.a -luuid 

echo "Clean temporary files"
rm -rf verbum.o

echo "Finished!"
echo ""
echo "Verbum Programming Language <3"
echo ""


