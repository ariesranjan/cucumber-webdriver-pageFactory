# Task: Automate test scenarios for Sign-up, Login and Checkout for Shopping application

##Framework Development Environment:
Framework is developed considering following system requirements
- OS - Windos 10/MacOS Mojave 10.14.6	
- Java Version - 1.8.0_211
- IDE - Eclipse Neon.3 Release (4.6.3)
- Maven Version - Apache Maven 3.6.2

##Framework Features:
- Framework is designed using Page Object Model and PageFactory with WebDriver and Cucumber in JAVA.
- Implementation of tests is segregated from the tests.
- Used reporting-plugin of cucumber to generate the Cucumber reports. Also, screenshot is attached in the report itself in case of failure.
- WebdriverManager is used to remove the driver binaries dependency to be available in the repo. No need to provide the drivers binary path in the code.
- URL of the application can be changed in configurations.properties 
- Parallel execution is achieved through Maven Surefire plugin. You can change the thread count in pom.xml to run the parallel instances.
- Reading test data for matching the available texts on the page from property file. Also, used Cucumber Example table feature to run the same scenario for different sets of data.
- Random data is generated using javafaker where we generated account creation data.

##How to RUN:
There are two ways to execute it
First Way:
- Import project into IDE Eclipse as maven project. Cucumber plugin should be present in eclipse.
- Right click on TestRunner.java file and you will get option to RUN as JUNIT Test. Click on it and it will start execution.
- Result can be found in target/cucumber/cucumber-html-reports. Click on overview-features.html and you will see results.
- You may need to do refresh after run to see latest cucumber report
   
Second Way:
- **Maven should be installed in the machine and path needs to be set if not.
- Go to command prompt.
- Run the following command where pom.xml resides.
- **mvn clean test  - it will run all the features available in functionalTests folder. It will create three instances of the browser and run all the three scenarios in parallel.
- **mvn test -Dcucumber.options="--tags @<tag_name>" - this is to run feature files having the particular tag (there are three tags at the moment - @Login, @Checkout, @CreateAccount in feature files)


##Future Enhancement: 
- Compatibility check for IE and Edge browser.
- Implement parallel execution on different browsers for the same scripts.
- Implement exception handling
- Implement logs support in the framework
- Implement ExtentReport functionality as at the moment Extent Reporter 1.7 version is not supported with cucumber v4.
- Creative testing support
- Accessibility Testing support