#!/bin/bash

clear
echo "$(date '+%H:%M:%S'): Build started!"


#
# General settings.
#

LIBRARIES=" -lpthread "
HEADER="-I../header"


#
# Preparations.
#
current_date=$(date '+%H:%M:%S')
start_date=$(date -u -d "$current_date" +"%s")


# 
# Build utils.
#

echo "$(date '+%H:%M:%S'): Building utils..."
cd ../source/utils/source
rm -rf *.o

gcc -o global.o                     -c global.c                     $HEADER
gcc -o memory.o                     -c memory.c                     $HEADER
gcc -o debug.o                      -c debug.c                      $HEADER
gcc -o application.o                -c application.c                $HEADER
gcc -o datetime.o                   -c datetime.c                   $HEADER
gcc -o file.o                       -c file.c                       $HEADER
gcc -o ini_file.o                   -c ini_file.c                   $HEADER
gcc -o process.o                    -c process.c                    $HEADER
gcc -o connection.o                 -c connection.c                 $HEADER

UP=" ../../utils/source"
UTILS_OBJ="  $UP/global.o   $UP/memory.o   $UP/debug.o      $UP/application.o"
UTILS_OBJ+=" $UP/file.o     $UP/ini_file.o $UP/connection.o $UP/process.o"
UTILS_OBJ+=" $UP/datetime.o "


# 
# Build Verbum Node.
#

echo "$(date '+%H:%M:%S'): Building Verbum Node..."
cd ../../node/source
rm -rf *.o

gcc -o global.o                     -c global.c                     $HEADER
gcc -o node.o                       -c node.c                       $HEADER
gcc -o monitor-processes.o          -c monitor-processes.c          $HEADER
gcc -o node-core.o                  -c node-core.c                  $HEADER
gcc -o add-on-node-mapper.o         -c add-on-node-mapper.c         $HEADER
gcc -o ping-node-mapper.o           -c ping-node-mapper.c           $HEADER
gcc -o communication.o              -c communication.c              $HEADER
gcc -o delete-node.o                -c delete-node.c                $HEADER
gcc -o check-node-exists.o          -c check-node-exists.c          $HEADER
gcc -o node-server.o                -c node-server.c                $HEADER
gcc -o node-client.o                -c node-client.c                $HEADER
gcc -o create-node-connection.o     -c create-node-connection.c     $HEADER
gcc -o node-global.o                -c node-global.c                $HEADER
gcc -o generate-connection-id.o     -c generate-connection-id.c     $HEADER
gcc -o node-server-ping.o           -c node-server-ping.c           $HEADER
gcc -o delete-connection.o          -c delete-connection.c          $HEADER

NP=" ../../node/source"

NODE_OBJ="  $NP/global.o                  $NP/node.o" 
NODE_OBJ+=" $NP/node-core.o               $NP/add-on-node-mapper.o"
NODE_OBJ+=" $NP/ping-node-mapper.o        $NP/communication.o"
NODE_OBJ+=" $NP/node-server.o             $NP/node-client.o"
NODE_OBJ+=" $NP/generate-connection-id.o  $NP/node-server-ping.o"
NODE_OBJ+=" $NP/node-global.o             $NP/delete-connection.o"
NODE_OBJ+=" $NP/monitor-processes.o       $NP/check-node-exists.o"
NODE_OBJ+=" $NP/delete-node.o             $NP/create-node-connection.o"


# 
# Build Verbum Node Mapper.
#

echo "$(date '+%H:%M:%S'): Building Verbum Node Mapper..."
cd ../../node-mapper/source
rm -rf *.o

gcc -o global.o                     -c global.c                     $HEADER
gcc -o node-mapper.o                -c node-mapper.c                $HEADER
gcc -o node-control.o               -c node-control.c               $HEADER
gcc -o communication.o              -c communication.c              $HEADER
gcc -o add-node.o                   -c add-node.c                   $HEADER
gcc -o create-node.o                -c create-node.c                $HEADER
gcc -o delete-node.o                -c delete-node.c                $HEADER
gcc -o generate-node-id.o           -c generate-node-id.c           $HEADER
gcc -o get-nodes.o                  -c get-nodes.c                  $HEADER
gcc -o ping-node.o                  -c ping-node.c                  $HEADER
gcc -o check-node-exists.o          -c check-node-exists.c          $HEADER
gcc -o create-node-connection.o     -c create-node-connection.c     $HEADER
gcc -o connection-manager.o         -c connection-manager.c         $HEADER
gcc -o connection-control.o         -c connection-control.c         $HEADER
gcc -o timeout-control.o            -c timeout-control.c            $HEADER
gcc -o delete-connection.o          -c delete-connection.c          $HEADER

NNP=" ../../node-mapper/source"

NODE_MAPPER_OBJ="  $NNP/global.o              $NNP/node-mapper.o"
NODE_MAPPER_OBJ+=" $NNP/node-control.o        $NNP/communication.o"
NODE_MAPPER_OBJ+=" $NNP/add-node.o            $NNP/create-node.o"
NODE_MAPPER_OBJ+=" $NNP/delete-node.o         $NNP/generate-node-id.o"
NODE_MAPPER_OBJ+=" $NNP/get-nodes.o           $NNP/ping-node.o"
NODE_MAPPER_OBJ+=" $NNP/check-node-exists.o   $NNP/create-node-connection.o"
NODE_MAPPER_OBJ+=" $NNP/connection-manager.o  $NNP/connection-control.o"
NODE_MAPPER_OBJ+=" $NNP/timeout-control.o     $NNP/delete-connection.o"


# 
# Build Verbum.
#

echo "$(date '+%H:%M:%S'): Building Verbum..."
cd ../../verbum/source

gcc -o initialization.o             -c initialization.c             $HEADER
gcc -o prepare-settings.o           -c prepare-settings.c           $HEADER
gcc -o fork-controller.o            -c fork-controller.c            $HEADER
gcc -o node-creation.o              -c node-creation.c              $HEADER

VERBUM_OBJ="initialization.o prepare-settings.o fork-controller.o node-creation.o"

rm -rf verbum
gcc -o verbum verbum.c $HEADER $UTILS_OBJ $NODE_OBJ $NODE_MAPPER_OBJ $VERBUM_OBJ $LIBRARIES 

rm -rf ../../../../sdk-binaries/verbum
mv verbum ../../../../sdk-binaries/verbum


#
# Clean files (.o files).
#

echo "$(date '+%H:%M:%S'): Cleaning files..."

rm -rf *.o
cd ../../utils/source
rm -rf *.o
cd ../../node/source
rm -rf *.o
cd ../../node-mapper/source
rm -rf *.o


#
# Finish.
#

current_date=$(date '+%H:%M:%S')
end_date=$(date -u -d "$current_date" +"%s")
echo "$(date '+%H:%M:%S'): Total time: $(date -u -d "0 $end_date sec - $start_date sec" +"%H:%M:%S")."
echo "$(date '+%H:%M:%S'): Build completed."


