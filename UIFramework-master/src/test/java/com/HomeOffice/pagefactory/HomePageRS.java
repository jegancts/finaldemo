package com.HomeOffice.pagefactory;
import static org.junit.Assert.assertEquals;
import java.util.List;
import org.openqa.selenium.*;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://www.gov.uk/check-uk-visa/y")
public class HomePageRS extends PageObject {

    @FindBy(xpath = "/html/body/div[6]/main/div/div/form/div/div/div/select")
    @CacheLookup
    WebElement dropdown;

    @FindBy(xpath = "/html[1]")
    @CacheLookup
    WebElement scrollbar;

    @FindBy(xpath = "//select[@id='response']")
    @CacheLookup
    WebElement selcountry;

    @FindBy(xpath = "//*[@id=\"current-question\"]/button")
    @CacheLookup
    WebElement countrybutton;

    @FindBy(name = "response")
    @CacheLookup
    WebElement selstudy;

    @FindBy(xpath = "/html/body/div[6]/main/div/div/form/div/button")
    @CacheLookup
    WebElement tourismbutton;

    @FindBy(xpath = "//input[@id='response-1']")
    @CacheLookup
    WebElement family;

    @FindBy(xpath = "//button[@class='gem-c-button govuk-button gem-c-button--bottom-margin']")
    @CacheLookup
    WebElement familybutton;

    @FindBy(xpath = "//h2[contains(@class,'govuk-!-margin-bottom-6')]")
    @CacheLookup
    WebElement validatetitle;

    public void clickdropdown() throws InterruptedException {
           dropdown.click();
    }
    public void selectcountry(String countryname) throws InterruptedException {
        Select cntrysel = new Select(selcountry);
        cntrysel.selectByIndex(161);

    }
    public void clicknextpage() throws InterruptedException {

        countrybutton.click();
    }
    public void selecttourism() throws InterruptedException {
        ((JavascriptExecutor) getDriver()).executeScript("window.scrollBy(200,600)", "");
        List<WebElement> radiobuttons = getDriver().findElements(By.name("response"));
        for(WebElement radiobutton: radiobuttons) {
        if(radiobutton.getAttribute("value").equals("tourism"))
        radiobutton.click();
        }

    }
    public void clicktourismbutton() throws InterruptedException {
        tourismbutton.click();
    }
    public void selectfamilyno() throws InterruptedException {
        ((JavascriptExecutor) getDriver()).executeScript("window.scrollBy(200,300)", "");
        List<WebElement> radiobuttons = getDriver().findElements(By.name("response"));
        for(WebElement radiobutton: radiobuttons) {
        if(radiobutton.getAttribute("value").equals("no"))
        radiobutton.click();  }

    }
    public void selectfamily() throws InterruptedException {
        familybutton.click();
    }
    public void visavalidation() throws InterruptedException {
        String titlevalid_act ="You’ll need a visa to come to the UK";
        String titlevalid_exp = validatetitle.getText();
        assertEquals(titlevalid_exp, titlevalid_act);System.out.println("Actual and Expected Success response is matching ");
    }

}