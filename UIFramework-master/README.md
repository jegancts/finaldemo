# UKGOV visa procesing demo note

1. Technologies Used:

Programing Launguage : JAVA , Selenium 
Build Tool           : MAVEN
SDK                  : SDK 11.0.0
Style                : BDD Framwork
Integration          : Browerstack 
Framework Followed   : Serenity ( Framework), Cucumber(BDD)
API Utilised         : REST ASSURED
API Tested           : POSTMAN (offline Ref https://api.postcodes.io/postcodes/SW1P4JA)
Design Pattern       : POM (Page Object Model - using PAGE FACTORY)
Locators Used        : XPATH,ID,NAME
Unit Test            : Serenity Class, JUNIT
MAVEN commands       : MVN CLEAN,TEST,INSTALL,BUILD

2. Application under test: Features Implemented:

    A)Feature – Confirm whether a visa is required for Japan student in the UK: Please execute the UK_Study_Japan 
    feature file using StudyJapanRunner class
  
    B)Feature – Confirm whether a visa is required to visit the UK from JAPAN: Pease execute the UK_Tourim_Japan 
     feature file using StudyTourismRunner class   

    C)Feature – Confirm whether a visa is required to visit the UK from Rissia: Pease execute the UK_Tourism_Russia 
     feature file using TourismRussiaRunner class  

    D)Feature – Postcodes Api : Please execute the postcodeapi.feature using PostCodeRunner class
    
3. Execution Procedure:

    Manual : Right click the respective runner class and run
    Automated : Go to project folder where POM file is visible, run the following commands
        step1: MVN CLEAR  - To delete the target folder
        Step2: MVN TEST   - To run the unit test
        step3: MVN BUID   - To create the production build
        step4: MVN INSTALL -To install dependencies




        
          
          


 

