package com.HomeOffice.runner;
import com.browserstack.BrowserStackSerenityTest;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		 features = {"src/test/resources/features/UI_Automation/HomeOffice/UK_Study_Japan.feature"}
		 ,glue= "com/HomeOffice/ui/stepdefinition"
		 
		 )
public class StudyJapanRunner extends BrowserStackSerenityTest {
}
		








	

	
	
		
	
	
		
	
	
		

	
