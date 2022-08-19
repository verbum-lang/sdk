#!/bin/bash

# ***
# Clean files.
#

cd ../../../sdk-binaries
rm -rf verbum-network verbum-node-mapper verbum-fault-tolerance


# ***
# Build verbum-network
#

cd ../sdk/verbum-network/source/verbum-network
rm -rf *.o

# Compile.
gcc -o verbum-network verbum-network.c

# Move to install directory.
mv verbum-network ../../../../sdk-binaries


# ***
# Build verbum-node-mapper
#

cd ../verbum-node-mapper
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



