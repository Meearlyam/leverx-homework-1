## Hello, LeverX app

* src directory is supposed to store packages with java source files, so to separate source code and binary files (with .class extension) you need to create bin directory
(mkdir bin) and run the following command:
~~~
javac -d bin -cp lib/commons-text-1.9.jar src/by/meearlyam/helloleverx/HelloLeverX.java
~~~
* To run then use
~~~
java -cp ./bin;lib/commons-text-1.9.jar;lib/commons-lang3-3.12.0.jar by.meearlyam.helloleverx.HelloLeverX
~~~
### If you want to create a jar

* First, fill MANIFEST.MF to point java to main class and all dependencies. It is IMPORTANT that this file ends with empty line:
~~~
Main-Class: by.meearlyam.helloleverx.HelloLeverX
class-path: lib/commons-text-1.9.jar lib/commons-lang3-3.12.0.jar

~~~
* Then, to create a jar that preserves the package structure use command:
~~~
jar -cmf manifest.mf helloleverx.jar -C bin .
~~~
* Command to run the jar:
~~~
java -jar helloleverx.jar
~~~
### If you want to create a documentation

* Create doc directory:
~~~
mkdir doc 
~~~
* Use javadoc:
~~~
javadoc -d doc by.meearlyam.helloleverx -sourcepath src -author
~~~