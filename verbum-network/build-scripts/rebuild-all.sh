#!/bin/bash

# ***
# Clean files.
#

cd ../../../sdk-binaries
rm -rf verbum-network verbum-node-mapper verbum-fault-tolerance


# ***
# Build verbum-network
#

cp ../sdk/verbum-network/source/verbum-network/verbum-network ./


# ***
# Build verbum-node-mapper
#

cd ../sdk/verbum-network/source/verbum-node-mapper
rm -rf *.o

# Compile.
gcc -o verbum-node-mapper verbum-node-mapper.c

# Move to install directory.
mv verbum-node-mapper ../../../../sdk-binaries


# ***
# Build verbum-fault-tolerance
#

cd ../verbum-fault-tolerance
rm -rf *.o

# Compile.
gcc -o verbum-fault-tolerance verbum-fault-tolerance.c

# Move to install directory.
mv verbum-fault-tolerance ../../../../sdk-binaries



