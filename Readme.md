**Full Name :** 
Erhan BATU
**Project Title :**
CASE STUDY/AliExpress – TEST AUTOMATION ENGINEER
**Installation guide:** 
This is a maven project. So it's assumed that the host running this code have Java and maven installed and JAVA_HOME already set. 
Here is the guide for maven installation just in case : https://maven.apache.org/install.htmlProject get all dependencies from maven repository. So no additional installation needed.
**Below are the dependencies are being used for this project :** 
Cucumber,
Cucumber-Junit,
Selenium Webdriver, 
Bonigarcia Webdrivermanager
 **Credentials :** 
For Create an Account: 
Email:yisoti3017@httptuan.com    Password:Ww12345678
(This email address and password will be created only once. When you run the test, these data will not be valid)

For End-to-End Testing for User Experience:  
Email:g.sallyaddress@outlook.com     Password:Ww12345678

**Build and run your project :** 
This is maven project and tests are written in JUnit . So we use maven command line commands to run the project as below to pick up JUnit tests:  
mvn clean testFramework can be built with using TestNg or Cucumber BDD but preferred to use Junit.
It is created basic Page Object Model design pattern but it can be improved if needed. 

When you run the project from Maven verify, if it fails, Cucumber will rerun automatically failed test case.

 **Test Reports Locations :** 
1- Cucumber HTML Plugin Reports target -> cucumber-html-reports > overview-steps.html (Right Click and Open in any Browser )

2- When you run the project from Maven verify, Cucumber will create automatically online report link.