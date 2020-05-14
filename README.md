# Task - Ceremonial Assembly Line Startup

## Table of contents
* [General Info](#general-info)
* [Setup](#setup)
* [Work Summary](#work-summary)
* [Application](#application)

## General Info
This repository contains application that resolve _Ceremonial Assembly Line Startup_ problem.

## Setup
1. Requirements
* To start the application you need JDK 8 installed.

2. Building
* To build the project use following command: mvn clean package

3. Running
* After building the application run the following command to start it: `target/ceremonial-assembly-line-startup-1.0.jar`.
* You can also start the application with following command: `mvn clean compile exec:java`. <br>
* Linux users can start the application by double-click _run.sh_. 

## Work Summary
* Main class displays result for the solution of the problem described in the _Java_Puzzle.pdf_.
* Other cases (e.g. different number of PLCs and employees, negative number of PLCs or employees) have been covered with Unit Tests.

## Application
* For the data from the _Java_Puzzle.pdf_ application produces the following output: <br><br>
![application-output](https://i.imgur.com/Xa92BWr.png) <br> 