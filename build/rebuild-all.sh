#!/bin/bash

# ***
# Global configurations.
#

LIBS=" -lpthread "
INCLUDE_PARAM=" -I../include/ "


# ***
# Clean files.
#

cd ../../sdk-binaries/
rm -rf verbum


# ***
# Build utils
#

cd ../sdk/source/utils/source/
rm -rf *.o

gcc -o global.o                         -c global.c                     $INCLUDE_PARAM
gcc -o memory.o                         -c memory.c                     $INCLUDE_PARAM
gcc -o debug.o                          -c debug.c                      $INCLUDE_PARAM
gcc -o application.o                    -c application.c                $INCLUDE_PARAM
gcc -o datetime.o                       -c datetime.c                   $INCLUDE_PARAM
gcc -o file.o                           -c file.c                       $INCLUDE_PARAM
gcc -o ini_file.o                       -c ini_file.c                   $INCLUDE_PARAM
gcc -o process.o                        -c process.c                    $INCLUDE_PARAM
gcc -o connection.o                     -c connection.c                 $INCLUDE_PARAM

LP=" ../../utils/source"
UTILS_OBJECTS=""
UTILS_OBJECTS+="$LP/global.o $LP/memory.o $LP/debug.o $LP/application.o"
UTILS_OBJECTS+="$LP/file.o $LP/ini_file.o $LP/connection.o $LP/process.o $LP/datetime.o"


# ***
# Build verbum-node
#

cd ../../verbum-node/source/
rm -rf *.o

gcc -o global.o                         -c global.c                     $INCLUDE_PARAM
gcc -o node.o                           -c node.c                       $INCLUDE_PARAM
gcc -o monitor-processes.o              -c monitor-processes.c          $INCLUDE_PARAM
gcc -o node-core.o                      -c node-core.c                  $INCLUDE_PARAM
gcc -o add-on-node-mapper.o             -c add-on-node-mapper.c         $INCLUDE_PARAM
gcc -o ping-node-mapper.o               -c ping-node-mapper.c           $INCLUDE_PARAM
gcc -o communication.o                  -c communication.c              $INCLUDE_PARAM
gcc -o delete-node.o                    -c delete-node.c                $INCLUDE_PARAM
gcc -o check-node-exists.o              -c check-node-exists.c          $INCLUDE_PARAM
gcc -o node-server.o                    -c node-server.c                $INCLUDE_PARAM
gcc -o node-client.o                    -c node-client.c                $INCLUDE_PARAM
gcc -o create-node-connection.o         -c create-node-connection.c     $INCLUDE_PARAM
gcc -o node-global.o                    -c node-global.c                $INCLUDE_PARAM
gcc -o generate-connection-id.o         -c generate-connection-id.c     $INCLUDE_PARAM
gcc -o node-server-ping.o               -c node-server-ping.c           $INCLUDE_PARAM
gcc -o delete-connection.o              -c delete-connection.c          $INCLUDE_PARAM

VNP=" ../../verbum-node/source"
VERBUM_NODE_OBJECTS=""
VERBUM_NODE_OBJECTS+="$VNP/global.o $VNP/node.o $VNP/monitor-processes.o $VNP/node-core.o"
VERBUM_NODE_OBJECTS+="$VNP/add-on-node-mapper.o $VNP/ping-node-mapper.o $VNP/communication.o"
VERBUM_NODE_OBJECTS+="$VNP/delete-node.o $VNP/check-node-exists.o $VNP/node-server.o"
VERBUM_NODE_OBJECTS+="$VNP/node-client.o $VNP/create-node-connection.o $VNP/node-global.o"
VERBUM_NODE_OBJECTS+="$VNP/generate-connection-id.o $VNP/node-server-ping.o $VNP/delete-connection.o"


# ***
# Build verbum-node-mapper
#

cd ../../verbum-node-mapper/source/
rm -rf *.o

gcc -o global.o                         -c global.c                     $INCLUDE_PARAM
gcc -o node-mapper.o                    -c node-mapper.c                $INCLUDE_PARAM
gcc -o node-control.o                   -c node-control.c               $INCLUDE_PARAM
gcc -o communication.o                  -c communication.c              $INCLUDE_PARAM
gcc -o add-node.o                       -c add-node.c                   $INCLUDE_PARAM
gcc -o create-node.o                    -c create-node.c                $INCLUDE_PARAM
gcc -o delete-node.o                    -c delete-node.c                $INCLUDE_PARAM
gcc -o generate-node-id.o               -c generate-node-id.c           $INCLUDE_PARAM
gcc -o get-nodes.o                      -c get-nodes.c                  $INCLUDE_PARAM
gcc -o ping-node.o                      -c ping-node.c                  $INCLUDE_PARAM
gcc -o check-node-exists.o              -c check-node-exists.c          $INCLUDE_PARAM
gcc -o create-node-connection.o         -c create-node-connection.c     $INCLUDE_PARAM
gcc -o connection-manager.o             -c connection-manager.c         $INCLUDE_PARAM
gcc -o connection-control.o             -c connection-control.c         $INCLUDE_PARAM
gcc -o timeout-control.o                -c timeout-control.c            $INCLUDE_PARAM
gcc -o delete-connection.o              -c delete-connection.c          $INCLUDE_PARAM

NMP=" ../../verbum-node-mapper/source"
VERBUM_NM_OBJECTS=""
VERBUM_NM_OBJECTS+="$NMP/global.o $NMP/node-mapper.o $NMP/node-control.o $NMP/communication.o"
VERBUM_NM_OBJECTS+="$NMP/add-node.o $NMP/create-node.o $NMP/delete-node.o $NMP/generate-node-id.o"
VERBUM_NM_OBJECTS+="$NMP/get-nodes.o $NMP/ping-node.o $NMP/check-node-exists.o"
VERBUM_NM_OBJECTS+="$NMP/create-node-connection.o $NMP/connection-manager.o $NMP/connection-control.o"
VERBUM_NM_OBJECTS+="$NMP/timeout-control.o $NMP/delete-connection.o"

# ***
# Build verbum
#

cd ../../verbum/source/
rm -rf *.o
rm -rf verbum

gcc -o global.o -c     global.c $INCLUDE_PARAM
gcc -o verbum verbum.c global.o $UTILS_OBJECTS $VERBUM_NODE_OBJECTS $VERBUM_NM_OBJECTS $LIBS $INCLUDE_PARAM

cp verbum ../../../../sdk-binaries/

# Clean files (.o files).
cd ../../utils/source/
rm -rf *.o
cd ../../verbum/source/
rm -rf *.o
rm -rf verbum
cd ../../verbum-node/source/
rm -rf *.o
cd ../../verbum-node-mapper/source/
rm -rf *.o


