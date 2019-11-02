NOTE: Before you copy/paste commands below, make sure you add ASIC_100k.mtx to current folder and set own library paths.

export LD_LIBRARY_PATH=$LD_LIBRARY_PATH:/home/nifrick/Documents/NICSLU_FILES/nicslu
swig -java  -o nicslu_readfile_wrap.c nicslu_readfile.i
gcc -c -fPIC nicslu_readfile.c nicslu_readfile_wrap.c  -I"/usr/lib/jvm/java-8-openjdk-amd64/include" -I"/usr/lib/jvm/java-8-openjdk-amd64/include/linux"
gcc -shared   nicslu_readfile.o  nicslu_readfile_wrap.o -o libnicslu_readfile.so -lrt -lpthread -lm
swig -java  -o nicslu_wrap.c nicslu.i
gcc -c -fPIC nicslu.c nicslu_wrap.c  -I"/usr/lib/jvm/java-8-openjdk-amd64/include" -I"/usr/lib/jvm/java-8-openjdk-amd64/include/linux"
gcc -shared  nicslu.o  nicslu_wrap.o libnicslu_readfile.so -o libdemop.so -lrt -lpthread -lm
javac runme.java
java runme
