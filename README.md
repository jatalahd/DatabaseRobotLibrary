DatabaseRobotLibrary
==================

Exploratory Database Java library for Robot Framework, built upon the AnnotationLibrary provided by the Robot's javalib-core distribution. Please note that this project is currently in a preliminary version status and needs many improvements! The DatabaseRobotLibrary.html provides the current keyword documentation for the library.

This is a basic Maven project. To create a standalone jar package with dependencies, just type: "mvn clean package" in the directory where the pom.xml is located

NOTE! The licensed jdbc-drivers can be included to the build by making a local installation of the driver jar file, for example for the DB2 driver:

mvn install:install-file -Dfile=db2jcc4.jar -DgroupId=db2x -DartifactId=db2jcc4 -Dversion=3.61 -Dpackaging=jar

After this the resulting jar with dependencies will contain also the DB2 driver, however, the build does not require it to finish successfully.

To make things roll with Robot Framework, one can use jybot or the .jar distribution of Robot Framework. When using the .jar distribution, one should set the CLASSPATH as:

set CLASSPATH=robotframework-2.x.x.jar;DatabaseRobotLibrary-1.0-SNAPSHOT-jar-with-dependencies.jar;

and then run the test case file with the command:

java org.robotframework.RobotFramework run test.txt

Happy testing!
