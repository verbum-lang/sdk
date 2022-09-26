#!/bin/bash

# ***
# Clean files.
#

cd ../../sdk-binaries
rm -rf verbum


# # ***
# # Build library
# #

cd ../sdk/source/library
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

LIBRARY_OBJECTS="  ../../library/global.o ../../library/memory.o ../../library/debug.o ../../library/application.o  "
LIBRARY_OBJECTS+=" ../../library/file.o   ../../library/ini_file.o ../../library/connection.o ../../library/process.o "
LIBRARY_OBJECTS+=" ../../library/datetime.o "

LIBRARY_LIBS=" -lpthread "


# ***
# Build verbum-node
#

cd ../verbum-node
rm -rf *.o

# Compile.
gcc -o global.o                 -c global.c
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
gcc -o create-node-connection.o -c create-node-connection.c
gcc -o node-global.o            -c node-global.c
gcc -o generate-connection-id.o -c generate-connection-id.c
gcc -o node-server-ping.o       -c node-server-ping.c
gcc -o delete-connection.o      -c delete-connection.c

NP=" ../../verbum-node"
LIBRARY_VN="$NP/global.o $NP/node.o $NP/monitor-processes.o $NP/node-core.o $NP/add-on-node-mapper.o"
LIBRARY_VN+="$NP/ping-node-mapper.o $NP/communication.o $NP/delete-node.o $NP/check-node-exists.o"
LIBRARY_VN+="$NP/node-server.o $NP/node-client.o $NP/create-node-connection.o $NP/node-global.o"
LIBRARY_VN+="$NP/generate-connection-id.o $NP/node-server-ping.o $NP/delete-connection.o"


# ***
# Build verbum-node-mapper
#

cd ../verbum-node-mapper
rm -rf *.o

# Compile.
gcc -o global.o                 -c global.c
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
gcc -o create-node-connection.o -c create-node-connection.c
gcc -o connection-manager.o     -c connection-manager.c
gcc -o connection-control.o     -c connection-control.c
gcc -o timeout-control.o        -c timeout-control.c
gcc -o delete-connection.o      -c delete-connection.c

NNP=" ../../verbum-node-mapper"
LIBRARY_NM="$NNP/global.o $NNP/node-mapper.o $NNP/node-control.o $NNP/communication.o"
LIBRARY_NM+="$NNP/add-node.o $NNP/create-node.o $NNP/delete-node.o $NNP/generate-node-id.o"
LIBRARY_NM+="$NNP/get-nodes.o $NNP/ping-node.o $NNP/check-node-exists.o $NNP/create-node-connection.o"
LIBRARY_NM+="$NNP/connection-manager.o $NNP/connection-control.o $NNP/timeout-control.o $NNP/delete-connection.o"


# ***
# Build verbum
#

cd ../verbum/source

LIBRARY_V=" -I../include"

gcc -o fork-controller.o -c fork-controller.c $LIBRARY_V

gcc -o verbum verbum.c fork-controller.o $LIBRARY_OBJECTS $LIBRARY_VN $LIBRARY_NM $LIBRARY_V $LIBRARY_LIBS 

rm -rf ../../../../sdk-binaries/verbum
mv verbum ../../../../sdk-binaries/verbum

rm -rf *.o
cd ../../verbum-node
rm -rf *.o
cd ../verbum-node-mapper
rm -rf *.o
cd ../library
rm -rf *.o


