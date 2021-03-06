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
public class HomePageUK extends PageObject {

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

    @FindBy(xpath = "/html/body/div[6]/main/div/div/form/div/button")
    @CacheLookup
    WebElement studybutton;

    @FindBy(xpath = "//label[contains(text(),'longer than 6 months')]")
    @CacheLookup
    WebElement duration;

    @FindBy(xpath = "//button[@class='gem-c-button govuk-button gem-c-button--bottom-margin']")
    @CacheLookup
    WebElement durationbutton;

    @FindBy(xpath = "//h1[contains(@class,'gem-c-title__text')]")
    @CacheLookup
    WebElement validatetitle;

    public void clickdropdown() throws InterruptedException {
        dropdown.click();
    }
    public void selectcountry(String countryname) throws InterruptedException {
        Select cntrysel = new Select(selcountry);
        cntrysel.selectByIndex(99);
    }
    public void clicknextpage() throws InterruptedException {

        countrybutton.click();
    }
    public void selectstudy() throws InterruptedException {
      ((JavascriptExecutor) getDriver()).executeScript("window.scrollBy(200,600)", "");
       List<WebElement> radiobuttons = getDriver().findElements(By.name("response"));
       for(WebElement radiobutton: radiobuttons) {
       if(radiobutton.getAttribute("value").equals("study"))
       radiobutton.click();
        }

    }
    public void clickstudybutton() throws InterruptedException {
        studybutton.click();
    }
    public void selectmorethan6months() throws InterruptedException {
        duration.click();
    }
    public void selectduration() throws InterruptedException {
        durationbutton.click();
    }
    public void visavalidation() throws InterruptedException {
        String titlevalid_act ="Check if you need a UK visa";
        String titlevalid_exp = validatetitle.getText();
        assertEquals(titlevalid_exp, titlevalid_act);System.out.println("Actual and Expected Success response is matching ");
    }

}