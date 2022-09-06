#!/bin/bash

# ***
# Clean files.
#

cd ../../../sdk-binaries
rm -rf verbum-node verbum-node-mapper


# ***
# Build library
#

cd ../sdk/verbum-network/source/library
rm -rf *.o

gcc -o global.o         -c global.c
gcc -o memory.o         -c memory.c
gcc -o debug.o          -c debug.c
gcc -o application.o    -c application.c
gcc -o datetime.o       -c datetime.c
gcc -o file.o           -c file.c
gcc -o ini_file.o       -c ini_file.c
gcc -o process.o        -c process.c
gcc -o connection.o     -c connection.c

LIBRARY_OBJECTS=""
LIBRARY_OBJECTS+=" ../library/global.o ../library/memory.o ../library/debug.o ../library/application.o  "
LIBRARY_OBJECTS+=" ../library/file.o ../library/ini_file.o ../library/connection.o ../library/process.o "
LIBRARY_OBJECTS+=" ../library/datetime.o "

LIBRARY_LIBS=" -lpthread "

# ***
# Build verbum-node
#

cd ../verbum-node
rm -rf *.o

# Compile.
gcc -o global.o                 -c global.c
gcc -o help.o                   -c help.c
gcc -o configuration.o          -c configuration.c
gcc -o node.o                   -c node.c
gcc -o monitor-processes.o      -c monitor-processes.c
gcc -o node-core.o              -c node-core.c
gcc -o add-on-node-mapper.o     -c add-on-node-mapper.c
gcc -o ping-node-mapper.o       -c ping-node-mapper.c
gcc -o communication.o          -c communication.c
gcc -o delete-node.o            -c delete-node.c
gcc -o check-node-exists.o      -c check-node-exists.c
gcc -o node-server.o            -c node-server.c
gcc -o node-client.o            -c node-client.c

gcc -o verbum-node        verbum-node.c                    \
                          global.o                         \
                          help.o                           \
                          configuration.o                  \
                          node.o                           \
                          monitor-processes.o              \
                          node-core.o                      \
                          add-on-node-mapper.o             \
                          ping-node-mapper.o               \
                          communication.o                  \
                          delete-node.o                    \
                          check-node-exists.o              \
                          node-server.o                    \
                          node-client.o                    \
                          $LIBRARY_OBJECTS $LIBRARY_LIBS

rm -rf *.o

# Move to install directory.
mv verbum-node ../../../../sdk-binaries


# ***
# Build verbum-node-mapper
#

cd ../verbum-node-mapper
rm -rf *.o

# Compile.
gcc -o global.o                 -c global.c
gcc -o help.o                   -c help.c
gcc -o configuration.o          -c configuration.c
gcc -o node-mapper.o            -c node-mapper.c
gcc -o node-control.o           -c node-control.c
gcc -o communication.o          -c communication.c
gcc -o add-node.o               -c add-node.c
gcc -o create-node.o            -c create-node.c
gcc -o delete-node.o            -c delete-node.c
gcc -o generate-node-id.o       -c generate-node-id.c
gcc -o get-nodes.o              -c get-nodes.c
gcc -o ping-node.o              -c ping-node.c
gcc -o check-node-exists.o      -c check-node-exists.c

gcc -o verbum-node-mapper verbum-node-mapper.c             \
                          global.o                         \
                          help.o                           \
                          configuration.o                  \
                          node-mapper.o                    \
                          node-control.o                   \
                          communication.o                  \
                          add-node.o                       \
                          create-node.o                    \
                          delete-node.o                    \
                          generate-node-id.o               \
                          get-nodes.o                      \
                          ping-node.o                      \
                          check-node-exists.o              \
                          $LIBRARY_OBJECTS $LIBRARY_LIBS

rm -rf *.o

# Move to install directory.
mv verbum-node-mapper ../../../../sdk-binaries


# Clean library files (.o files).
cd ../library
rm -rf *.o


