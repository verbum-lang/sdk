#!/bin/bash

# ***
# Clean files.
#

cd ../../../sdk-binaries
rm -rf verbum-network verbum-node-mapper verbum-fault-tolerance


# ***
# Build library
#

cd ../sdk/verbum-network/source/library
rm -rf *.o

gcc -o global.o -c global.c
gcc -o application.o -c application.c
gcc -o file.o -c file.c
gcc -o ini_file.o -c ini_file.c

LIBRARY_OBJECTS="../library/global.o ../library/application.o ../library/file.o ../library/ini_file.o"

# ***
# Build verbum-node
#

cd ../verbum-node
rm -rf *.o

# Compile.
gcc -o global.o -c global.c
gcc -o help.o -c help.c
gcc -o configuration.o -c configuration.c
gcc -o node.o -c node.c

gcc -o verbum-node verbum-node.c        \
                   global.o             \
                   help.o               \
                   configuration.o      \
                   node.o               \
                   $LIBRARY_OBJECTS

rm -rf *.o

# Move to install directory.
mv verbum-node ../../../../sdk-binaries


# ***
# Build verbum-node-mapper
#

cd ../verbum-node-mapper
rm -rf *.o

# Compile.
gcc -o global.o -c global.c
gcc -o help.o -c help.c
gcc -o configuration.o -c configuration.c
gcc -o node-mapper.o -c node-mapper.c

gcc -o verbum-node-mapper verbum-node-mapper.c  \
                          global.o              \
                          help.o                \
                          configuration.o       \
                          node-mapper.o         \
                          $LIBRARY_OBJECTS

rm -rf *.o

# Move to install directory.
mv verbum-node-mapper ../../../../sdk-binaries


# ***
# Build verbum-fault-tolerance
#

cd ../verbum-fault-tolerance
rm -rf *.o

# Compile.
gcc -o global.o -c global.c
gcc -o help.o -c help.c
gcc -o configuration.o -c configuration.c
gcc -o verbum-fault-tolerance verbum-fault-tolerance.c  \
                              global.o                  \
                              help.o                    \
                              configuration.o           \
                              $LIBRARY_OBJECTS

rm -rf *.o

# Move to install directory.
mv verbum-fault-tolerance ../../../../sdk-binaries

# Clean library files (.o files).
cd ../library
rm -rf *.o


