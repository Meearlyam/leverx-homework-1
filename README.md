## Hello, LeverX app

* To compile this app use the following command:
javac src/by/meearlyam/helloleverx/HelloLeverX.java

* To run the app use
java -cp ./src by.meearlyam.helloleverx.HelloLeverX

* src directory is supposed to store pachages with java source files, so to separate source code and binary files (with .class extension) you need to create bin deirctory
(mkdir bin) and run the following command:
javac -d bin src/by/meearlyam/helloleverx/HelloLeverX.java

* To run then use
java -cp ./bin by.meearlyam.helloleverx.HelloLeverX

### If you want to create a jar

* First, create MANIFEST.MF to point java to main class:
echo Main-Class: by.meearlyam.helloleverx.HelloLeverX > MANIFEST.MF

* Then, to create a jar that preserves the package structure use command:
jar -cfm helloleverx.jar manifest.mf -C bin .

* Command to run the jar:
java -jar helloleverx.jar

### If you want to create a documentation

* Create doc directory:
mkdir doc 

* Use javadoc:
javadoc -d doc by.meearlyam.helloleverx -sourcepath src -author