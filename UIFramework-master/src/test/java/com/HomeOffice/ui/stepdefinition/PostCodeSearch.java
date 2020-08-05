package com.HomeOffice.ui.stepdefinition;
import cucumber.api.java.en.Given;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class PostCodeSearch {
    public Response response;
    int ActResponseCode = 200;
    @Given("^I send a query to post code api \"([^\"]*)\"$")
    public void I_send_a_query_to_post_code_api(String url)
    {
        RestAssured.baseURI = url;
        RestAssured.basePath = "";
        response = given().contentType(ContentType.JSON).log().all().get(url);
        System.out.println("Response :" + response.asString());
    }

    @Given("^I will get a successful response code$")
    public void I_will_get_a_successful_response_code()
    {
        int ExpResponseCode = response.getStatusCode();
        assertEquals(ActResponseCode, ExpResponseCode);
        System.out.println("Expected Response Code :" + ExpResponseCode);

    }
}
