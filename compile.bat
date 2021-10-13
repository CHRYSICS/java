@echo off
echo List of java files found in src folder available for compiling:
dir src /b /a-d
:loop
set /P fileName="Enter file name to compile into bin folder: "
javac -d bin src\%fileName%
echo %fileName% class added to bin folder
set /P continue="Continue? (Y)"
if /i "%continue%" == "Y" goto loop
if /i "%continue%" == "y" goto loop
