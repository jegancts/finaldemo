package com.HomeOffice.ui.stepdefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import com.HomeOffice.pagefactory.HomePageRS;


public class UKTourismRussia {


    HomePageRS homePageRS;

    @Given("^I provide a nationality \"([^\"]*)\"$")
    public void i_provide_a_nationality_of(String countryname) throws InterruptedException {
        homePageRS.open();
        homePageRS.clickdropdown();
        homePageRS.selectcountry(countryname);
        homePageRS.clicknextpage();

    }
    @And("^I select the reason of \"([^\"]*)\"$")
    public void i_select_the_reason_of(String arg2) throws InterruptedException {
        homePageRS.selecttourism();
        homePageRS.clicktourismbutton();
    }

    @And("^I state I am not travelling or visiting a partner or family$")
    public void I_state_I_am_not_travelling_or_visiting_a_partner_family() throws InterruptedException {
        homePageRS.selectfamilyno();

    }
    @When("^I submit form in portal")
    public void i_submit_the_form_in_portal() throws InterruptedException {
        homePageRS.selectfamily();
    }

    @Then("^I will be informed I need a visa to come to the UK$")
    public void i_will_be_informed_i_need_a_visa_to_come_UK() throws InterruptedException {
        homePageRS.visavalidation();
    }
}
