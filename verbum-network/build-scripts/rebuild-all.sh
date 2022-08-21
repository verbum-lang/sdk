#!/bin/bash

# ***
# Clean files.
#

cd ../../../sdk-binaries
rm -rf verbum-network verbum-node-mapper verbum-fault-tolerance


# ***
# Build global sources
#

cd ../sdk/verbum-network/source/global
rm -rf *.o

gcc -o g-global.o -c global.c
gcc -o g-application.o -c application.c
gcc -o g-file.o -c file.c
gcc -o g-ini_file.o -c ini_file.c

# ***
# Build verbum-node
#

cd ../verbum-node
rm -rf *.o

# Compile.
gcc -o global.o -c global.c
gcc -o help.o -c help.c
gcc -o configuration.o -c configuration.c
gcc -o verbum-node.o -c verbum-node.c

gcc -o verbum-node verbum-network.c global.o help.o configuration.o              \
    verbum-node.o                                                                   \
    ../global/g-global.o ../global/g-application.o ../global/g-file.o               \
    ../global/g-ini_file.o

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

gcc -o verbum-node-mapper verbum-node-mapper.c global.o help.o configuration.o      \
    node-mapper.o                                                                   \
    ../global/g-global.o ../global/g-application.o ../global/g-file.o               \
    ../global/g-ini_file.o

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
gcc -o verbum-fault-tolerance verbum-fault-tolerance.c global.o help.o              \
    configuration.o ../global/g-global.o ../global/g-application.o                  \
    ../global/g-file.o ../global/g-ini_file.o

rm -rf *.o

# Move to install directory.
mv verbum-fault-tolerance ../../../../sdk-binaries

# Clean global source files (.o files).
cd ../global
rm -rf *.o


