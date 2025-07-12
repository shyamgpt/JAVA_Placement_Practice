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
	 * -->Running Maven from Command line->
	 * 
	 * a) mvn clean install
	 * - Firstly it will execute all the 4 maven life cycle
	 * -it will create the build in form of jar files, along with the 
	 * testcase execution
	 * - when you run this cmd then it will generate the build.
	 * 
	 * b) mvn test -->
	 * It will execute only your test case
	 * and it will not generate the build.
	 * 
	 * c) mvn package -DskipTests
	 * What if i dont want to execute the test cases and just want to generate 
	 * the build and want to ignore the test case execution.
	 * 
	 */
	
	
	
	 /* 
	 * How to Run Selenium Maven Project from Console/Command line-->
	 * Video Url-->https://www.youtube.com/watch?v=lQCyVy-g1e8
	 * 
	 * 
	 *.
	 * 
	 * a) mvn clean test-->it will do the clean process
	 * firstly it will clean/delete the existing jars and again download the jars
	 * and trigger the automation project and then it will exit.
	 * 
	 *  b) mvn clean--> You can skip this step if you your build get succesfull
	 *  on running mvn clean test
	 * 
	 * c) Let suppose you have differnt runner file
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
	 * 
	 * 
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
	
}
