@echo off
chcp 65001 > nul
javac -encoding UTF-8 test1.java
java -Dfile.encoding=UTF-8 test1
pause