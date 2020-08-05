package com.HomeOffice.ui.stepdefinition;

        import cucumber.api.java.en.And;
        import cucumber.api.java.en.Given;
        import cucumber.api.java.en.Then;
        import cucumber.api.java.en.When;
        import com.HomeOffice.pagefactory.HomePageUKT;


public class UKTourismJapan {
    HomePageUKT homePageUKT;

    @Given("^I provide the nationality of japan \"([^\"]*)\"$")
    public void i_provide_the_nationality_of_visa(String countryname) throws InterruptedException {
        homePageUKT.open();
        homePageUKT.clickdropdown();
        homePageUKT.selectcountry(countryname);
        homePageUKT.clicknextpage();

    }
    @And("^I select a reason \"([^\"]*)\"$")
    public void i_select_a_reason_visa(String arg2) throws InterruptedException {
        homePageUKT.selecttourist();
    }

    @When("^I submit a form for tourist$")
    public void i_submit_a_form_for_tourist_visa() throws InterruptedException {
        homePageUKT.clicktouristbutton();
    }

    @Then("^I will be informed You wont need visa to come to UK$")
    public void i_will_be_informed_You_wont_need_a_visa_to_the_uk() throws InterruptedException {
        homePageUKT.visavalidation();
    }
}


