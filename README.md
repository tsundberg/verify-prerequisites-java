# Verify Prerequisites

This project is used for verifying the prerequisites for the upcoming workshop you are invited to.

It uses Gradle and should download all dependencies you need.

It does require Java to run. Verify your installed version with

    java -version

I got

```
% java -version
openjdk version "11.0.6" 2020-01-14
OpenJDK Runtime Environment AdoptOpenJDK (build 11.0.6+10)
OpenJDK 64-Bit Server VM AdoptOpenJDK (build 11.0.6+10, mixed mode)
```

when I verified my installation.

It also verifies that you can reach Maven central and download dependencies needed for the upcoming workshop.

Clone this repository using Git or download a zip-file that includes everything you need.

Then enter the directory with the source code and run

    ./gradlew clean test

or

    gradlew.bat clean test

You should see Gradle being downloaded, the dependencies needed should be downloaded, and finally a unit test should be
executed with a successful result.

A successful build looks something similar to this:

```
% ./gradlew clean test

BUILD SUCCESSFUL in 1s
4 actionable tasks: 4 executed
```

It will probably take longer time than 1 second.