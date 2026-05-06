#!/bin/bash
mvn clean install
mvn dependency:copy-dependencies

java -cp './target/*:./target/dependency/*:./target/classes/*' ./DIApp.java 2> /dev/null
