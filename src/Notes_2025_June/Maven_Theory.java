package Notes_2025_June;

public class Maven_Theory {

	/*Maven Lecture→Naveen Automation
https://www.youtube.com/watch?v=tyLSFciTU-s
https://www.youtube.com/watch?v=t5hoD4D0Jo0
*/
	
	//URL --> https://docs.google.com/document/d/1RoyDggDtbhEDTOolFFnorcYxMROOGJpmYqXfk4QICqg/edit?tab=t.21qcy8pz87ki
	
	
	/*  Lear Maven- My First Maven Project
	 * 
	 * What is Maven?
	 * Maven Setup?
	 * Maven Life Cycle
	 * Maven Dependencies
	 * Maven Plugin
	 * Maven Commands
	 * -Run Maven from Eclipse
	 * -Run Maven from Command Line
	 * 
	 * 1- What is Maven?
	 * Maven is a build automation tool, it generates the Builds
	 * It's a central respository where all the jar files are
	 * present in the form of dependencies
	 * Eg like-> Selenium, testNg, Apache POI etc
	 * In dependencies we have 3 attribute-
	 * i). groupId
	 * ii). artifactId
	 * iii). versions
	 * 
	 * 2- Maven Setup?
	 * Visit- mkyong.com
	 * 
	 * 3- Maven Life Cycle?
	 * Maven is a build automation tool.
	 * It has 3 main life cycle-->
	 * a. Maven compile
	 * b. Maven Test
	 * c. Maven Resource-Jar/ or Generate Jar files.
	 * 
	 * a. Maven Compile--it will compile the Java classes/Code
	 * and this compile will happen by using- compiler plugin
	 * 
	 * b. Maven test-- it can be functional testcases, Integration test cases, 
	 * unit testcases etc,
	 * 
	 * Maven Test is done by Maven Surefire Plugin
	 * 
	 * c. Generating/Creating Jar files--
	 * It can create 3 types of resource
	 * JARs/WARs/EARs files
	 * and this is done by Maven Resources Plugin
	 * 
	 * 4- Maven Dependencies -->
	 * Jar files which are available in Maven central repository in the form of
	 * dependencies are known as maven dependencies.
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * Build is sucssfull means--all the artifacts/ jars are downloaded properly
	 * and build is cleaned and the latest build is available now.
	 * 
	 * 
	 * 
	 * 
	 * 
	 * -> to run the code in eclipse we will click on "maven test" then it will
	 * run and will give the output, but it will not gererates the TestNg report as we 
	 * run from Maven.
	 * 
	 *  
	 *  Make notes from chatGpt-->
	 *  
	 * -->Running Maven from Command line->
	 * 
	 * 
	 * preference no--2-->
	 * 
	 * a) mvn clean install-->
	 * -firstly it will clean/delete the existing jars and again download the jars
	 * and trigger the automation project.
	 * -it will create the build in form of jar files, along with the testcase execution
	 * 
	 * - when you run this cmd then it will generate the build.
	 * 
	 * clean-->compile-->test--> Generate jar file/Package-- install to local repo
	 * 
	 * b) mvn clean test-->it will do the clean process
	 * firstly it will clean/delete the existing jars and again download the jars
	 * and trigger the automation project and then it will exit.\
	 * 
	 * -this cmd will not generate the build
	 * 
	 * clean-->compile-->test--> Not Generate jar file
	 * 
	 * c) mvn test -->
	 * It will execute only your test case
	 * and it will not generate the build.
	 * 
	 * d) mvn package -DskipTests
	 * What if i dont want to execute the test cases and just want to generate 
	 * the build and want to ignore the test case execution.
	 * 
	 * * 
	 * e) mvn clean--> You can skip this step if you your build get succesfull
	 *  on running mvn clean test/install
	 * 
	 * f) Let suppose you have differnt runner file
	 * like- 
	 * Testng1.xml
	 * Testng2.xml
	 * Testng3.xml
	 * Testng4.xml
	 * 
	 * Then how run one testng.xml file at a time..
	 * 
	 * for this you have to do one configuration in pom.xml file
	 * <suiteXmlFile> ${testngFile} <suiteXmlFile>
	 * 
	 * Now, maven cmd to run each file-->
	 * 
	 * mvn clean test -DfileName=Testng4.xml
	 * 
	 * mvn clean test -DfileName=Testng2.xml  ...
	 * 
	 * and so on ...
	 * 
	 * 
	 */
	
	
	
	 /* 
	 * How to Run Selenium Maven Project from Console/Command line-->
	 * Video Url-->https://www.youtube.com/watch?v=lQCyVy-g1e8
	 * 
	 * 
	 *preference no--1-->
	 * 

	 
	 * 
	 *Refer to this docs as well-->
	 * https://docs.google.com/document/d/1VLTPEPm7mbJtgGqQ9ss3uuZy03JgIzi3h0kK7NR9fEw/edit?tab=t.0
	 * 
	 * 
	 * 
	 * */
	
	/* Different phases of Maven life cycle-->
	 * video Url-->https://www.youtube.com/watch?v=-HIP0heHtEE
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * */
	
	/**
	 * The command

mvn clean test


is a Maven build lifecycle command. It does two things in sequence:

clean phase

Deletes the target/ directory (or whatever build output folder is configured).

This removes previously compiled classes, packaged JAR/WAR files, reports, etc.

Ensures you start with a "fresh" build environment.

test phase

Compiles the main code (src/main/java).

Compiles the test code (src/test/java).

Runs unit tests (usually with JUnit or TestNG) using the Surefire plugin.

Generates test reports in target/surefire-reports/.

👉 So, in short:
It first wipes out old build files and then runs all your project's tests from scratch.

Do you want me to also explain what happens step by step inside Maven’s lifecycle when you run this?

You said:
this cmd?
 mvn clean install
ChatGPT said:

The command

mvn clean install


does a bit more than mvn clean test. Here’s what happens:

clean phase

Deletes the target/ directory (removes all old build outputs).

install phase

This runs through the entire Maven default lifecycle up to install.

Steps include:

validate → checks if project is correct.

compile → compiles the main code (src/main/java).

test-compile → compiles the test code (src/test/java).

test → runs unit tests.

package → packages compiled code into a JAR/WAR (depending on project type).

install → copies the built package (JAR/WAR) into your local Maven repository (usually ~/.m2/repository).

👉 This makes the artifact available for use as a dependency in other projects on your system.

So the difference from mvn clean test is:

clean test → just cleans and runs tests.

clean install → cleans, builds, runs tests, packages, and installs the artifact locally.

Would you like me to also compare install vs deploy? (Many people get confused there.)

You said:
this cmd?
 mvn test
ChatGPT said:

The command

mvn test


does the following:

Runs the Maven default lifecycle up to the test phase (but without cleaning first).
That means:

validate → checks project structure.

compile → compiles the main source (src/main/java).

test-compile → compiles the test source (src/test/java).

test → runs unit tests using the Surefire plugin (JUnit/TestNG, etc.).

Unlike mvn clean test, it does not delete old build output before running.
So if there are stale classes or artifacts in the target/ directory, they remain.

👉 In short:

mvn test → compile + run tests.

mvn clean test → wipe out old outputs, then compile + run tests fresh.

Do you want me to make you a quick comparison table of mvn test, mvn clean test, and mvn clean install for easy reference?

You said:
yes
ChatGPT said:

Here’s a quick comparison table of the three Maven commands:

Command	What it does	Key Points
mvn test	Compiles main + test code, then runs unit tests.	Doesn’t clean old build files first, so stale classes/artifacts may remain.
mvn clean test	Deletes the target/ folder, then compiles main + test code, runs unit tests.	Ensures a fresh build before running tests.
mvn clean install	Deletes the target/ folder, then compiles, tests, packages the project (JAR/WAR), and installs it into your local Maven repo (~/.m2/repository).	Used when you want the artifact to be available for other projects on your machine.

👉 Think of it this way:

test = just test.

clean test = fresh test run.

clean install = full clean build + package + make it reusable for other projects.

Do you want me to also include mvn package in the table (since it often comes up right next to these)?
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * */
	
}
