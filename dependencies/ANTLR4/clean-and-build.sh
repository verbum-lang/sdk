
./clean.sh

ANTLR_JAR_FILE=$(pwd)/jar/antlr-4.9.2-complete.jar

mkdir build
cd build

cmake ..  -DANTLR_JAR_LOCATION=$ANTLR_JAR_FILE
make



