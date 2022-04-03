
clear
cd sdk

echo "Clean temporary files."
rm -rf ../build/verbum
rm -rf parser/*
rm -rf verbum.o loader.o help.o lexer-syntactic.o \
        ast-visitor.o error.o semantics.o use.o


