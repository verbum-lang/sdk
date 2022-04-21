
clear
cd vm

echo "Clean temporary files."
rm -rf ../build/verbum
rm -rf parser/*
rm -rf verbum.o loader.o help.o global.o lexer-syntactic.o \
        ast-visitor.o default-ls-erros.o semantics.o use.o \
        syntax-analisys.o


