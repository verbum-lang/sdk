#!/bin/bash

LIBS=" -lpthread "

# ***
# Clean files.
#

cd ../../sdk-binaries
rm -rf verbum


# ***
# Build library
#

cd ../sdk/source/library
rm -rf *.o

gcc -o global.o                         -c global.c
gcc -o memory.o                         -c memory.c
gcc -o debug.o                          -c debug.c
gcc -o application.o                    -c application.c
gcc -o datetime.o                       -c datetime.c
gcc -o file.o                           -c file.c
gcc -o ini_file.o                       -c ini_file.c
gcc -o process.o                        -c process.c
gcc -o connection.o                     -c connection.c

LP=" ../library"
LIBRARY_OBJECTS=""
LIBRARY_OBJECTS+="$LP/global.o $LP/memory.o $LP/debug.o $LP/application.o"
LIBRARY_OBJECTS+="$LP/file.o $LP/ini_file.o $LP/connection.o $LP/process.o $LP/datetime.o"


# ***
# Build verbum-node
#

cd ../verbum-node
rm -rf *.o

gcc -o global.o                         -c global.c
gcc -o node.o                           -c node.c
gcc -o monitor-processes.o              -c monitor-processes.c
gcc -o node-core.o                      -c node-core.c
gcc -o add-on-node-mapper.o             -c add-on-node-mapper.c
gcc -o ping-node-mapper.o               -c ping-node-mapper.c
gcc -o communication.o                  -c communication.c
gcc -o delete-node.o                    -c delete-node.c
gcc -o check-node-exists.o              -c check-node-exists.c
gcc -o node-server.o                    -c node-server.c
gcc -o node-client.o                    -c node-client.c
gcc -o create-node-connection.o         -c create-node-connection.c
gcc -o node-global.o                    -c node-global.c
gcc -o generate-connection-id.o         -c generate-connection-id.c
gcc -o node-server-ping.o               -c node-server-ping.c
gcc -o delete-connection.o              -c delete-connection.c

VNP=" ../verbum-node"
VERBUM_NODE_OBJECTS=""
VERBUM_NODE_OBJECTS+="$VNP/global.o $VNP/node.o $VNP/monitor-processes.o $VNP/node-core.o"
VERBUM_NODE_OBJECTS+="$VNP/add-on-node-mapper.o $VNP/ping-node-mapper.o $VNP/communication.o"
VERBUM_NODE_OBJECTS+="$VNP/delete-node.o $VNP/check-node-exists.o $VNP/node-server.o"
VERBUM_NODE_OBJECTS+="$VNP/node-client.o $VNP/create-node-connection.o $VNP/node-global.o"
VERBUM_NODE_OBJECTS+="$VNP/generate-connection-id.o $VNP/node-server-ping.o $VNP/delete-connection.o"


# ***
# Build verbum-node-mapper
#

cd ../verbum-node-mapper
rm -rf *.o

gcc -o global.o                         -c global.c
gcc -o node-mapper.o                    -c node-mapper.c
gcc -o node-control.o                   -c node-control.c
gcc -o communication.o                  -c communication.c
gcc -o add-node.o                       -c add-node.c
gcc -o create-node.o                    -c create-node.c
gcc -o delete-node.o                    -c delete-node.c
gcc -o generate-node-id.o               -c generate-node-id.c
gcc -o get-nodes.o                      -c get-nodes.c
gcc -o ping-node.o                      -c ping-node.c
gcc -o check-node-exists.o              -c check-node-exists.c
gcc -o create-node-connection.o         -c create-node-connection.c
gcc -o connection-manager.o             -c connection-manager.c
gcc -o connection-control.o             -c connection-control.c
gcc -o timeout-control.o                -c timeout-control.c
gcc -o delete-connection.o              -c delete-connection.c

NMP=" ../verbum-node-mapper"
VERBUM_NM_OBJECTS=""
VERBUM_NM_OBJECTS+="$NMP/global.o $NMP/node-mapper.o $NMP/node-control.o $NMP/communication.o"
VERBUM_NM_OBJECTS+="$NMP/add-node.o $NMP/create-node.o $NMP/delete-node.o $NMP/generate-node-id.o"
VERBUM_NM_OBJECTS+="$NMP/get-nodes.o $NMP/ping-node.o $NMP/check-node-exists.o"
VERBUM_NM_OBJECTS+="$NMP/create-node-connection.o $NMP/connection-manager.o $NMP/connection-control.o"
VERBUM_NM_OBJECTS+="$NMP/timeout-control.o $NMP/delete-connection.o"

# ***
# Build verbum
#

cd ../verbum
rm -rf *.o
rm -rf verbum

gcc -o global.o -c global.c

gcc -o verbum verbum.c global.o $LIBRARY_OBJECTS $VERBUM_NODE_OBJECTS $VERBUM_NM_OBJECTS $LIBS

cp verbum ../../../sdk-binaries/

# Clean files (.o files).
cd ../library
rm -rf *.o
cd ../verbum
rm -rf *.o
rm -rf verbum
cd ../verbum-node
rm -rf *.o
cd ../verbum-node-mapper
rm -rf *.o


