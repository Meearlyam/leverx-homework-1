## Hello, LeverX app

* To compile this app use the following command:
<br><br>javac src/by/meearlyam/helloleverx/HelloLeverX.java

* To run the app use

<br><br>java -cp ./src by.meearlyam.helloleverx.HelloLeverX

* src directory is supposed to store pachages with java source files, so to separate source code and binary files (with .class extension) you need to create bin deirctory
(mkdir bin) and run the following command:

<br><br>javac -d bin src/by/meearlyam/helloleverx/HelloLeverX.java

* To run then use
<br><br>java -cp ./bin by.meearlyam.helloleverx.HelloLeverX

### If you want to create a jar

* First, create MANIFEST.MF to point java to main class:
<br><br>echo Main-Class: by.meearlyam.helloleverx.HelloLeverX > MANIFEST.MF

* Then, to create a jar that preserves the package structure use command:
<br><br>jar -cfm helloleverx.jar manifest.mf -C bin .

* Command to run the jar:
<br><br>java -jar helloleverx.jar

### If you want to create a documentation

* Create doc directory:
<br><br>mkdir doc 

* Use javadoc:
<br><br>javadoc -d doc by.meearlyam.helloleverx -sourcepath src -author