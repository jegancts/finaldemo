package com.HomeOffice.runner;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;



@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = {"src/test/resources/features/UI_Automation/HomeOffice/postcodeapi.feature"}
        ,glue= "com/HomeOffice/ui/stepdefinition"

)
public class PostCodeRunner  {
}





















