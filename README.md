## Hello, LeverX app

* To compile this app use the following command:
<br>javac src/by/meearlyam/helloleverx/HelloLeverX.java

* To run the app use
<br>java -cp ./src by.meearlyam.helloleverx.HelloLeverX

* src directory is supposed to store pachages with java source files, so to separate source code and binary files (with .class extension) you need to create bin deirctory
(mkdir bin) and run the following command:
<br>javac -d bin src/by/meearlyam/helloleverx/HelloLeverX.java

* To run then use
<tr>java -cp ./bin by.meearlyam.helloleverx.HelloLeverX

### If you want to create a jar

* First, create MANIFEST.MF to point java to main class:
<tr>echo Main-Class: by.meearlyam.helloleverx.HelloLeverX > MANIFEST.MF

* Then, to create a jar that preserves the package structure use command:
<tr>jar -cfm helloleverx.jar manifest.mf -C bin .

* Command to run the jar:
<tr>java -jar helloleverx.jar

### If you want to create a documentation

* Create doc directory:
<tr>mkdir doc 

* Use javadoc:
<tr>javadoc -d doc by.meearlyam.helloleverx -sourcepath src -author