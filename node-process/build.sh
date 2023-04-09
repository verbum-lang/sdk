#/bin/bash

COMPILER="gcc"
HEADER="header"
SOURCE="source"
OUTPUT="../binaries"
COMMON="../common"

rm -rf "$OUTPUT/node-process" "$OUTPUT/objects"
mkdir -p "$OUTPUT/objects/common" "$OUTPUT/objects/node-process"

# Build common library.
$COMPILER "$COMMON/$SOURCE/memory.c" -I "$COMMON/$HEADER" -c -o "$OUTPUT/objects/common/memory.o"

# Build application.
$COMPILER "$SOURCE/types.c" -I "./$HEADER" -c -o "$OUTPUT/objects/node-process/types.o"
$COMPILER "$SOURCE/node.c" -I "./$HEADER" -c -o "$OUTPUT/objects/node-process/node.o"

$COMPILER -o "$OUTPUT/node-process" "$SOURCE/main.c" -I "./$HEADER" \
    \
    "$OUTPUT/objects/node-process/types.o" \
    "$OUTPUT/objects/node-process/node.o" \
    \
    "$OUTPUT/objects/common/memory.o"


