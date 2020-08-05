package com.HomeOffice.ui.stepdefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


import com.HomeOffice.pagefactory.HomePageUK;


public class UKStudyJapan {


    HomePageUK homePageUK;

    @Given("^I provide a nationality of \"([^\"]*)\"$")
    public void i_provide_a_nationality_of(String countryname) throws InterruptedException {
        homePageUK.open();
        homePageUK.clickdropdown();
        homePageUK.selectcountry(countryname);
        homePageUK.clicknextpage();

    }
    @And("^I select the reason \"([^\"]*)\"$")
    public void i_select_the_reason(String arg2) throws InterruptedException {
        homePageUK.selectstudy();
        homePageUK.clickstudybutton();
    }

    @And("^I state I am intending to stay for \"([^\"]*)\"$")
    public void i_state_i_am_intending_to_stay_for(String arg3) throws InterruptedException {
        homePageUK.selectmorethan6months();

    }
    @When("^I submit the form")
    public void i_submit_the_form() throws InterruptedException {
        homePageUK.selectduration();
            }

    @Then("^I will be informed I need a visa to study in the UK$")
    public void i_will_be_informed() throws InterruptedException {
        homePageUK.visavalidation();
    }
}
