package uk.gov.bptds.seleniumtutorial.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IsThereACourtOrderOrConsentOrderForChildMaintenanceInPlaceFactory {
    WebDriver driver;

    @FindBy(xpath = "//input[@value='no']")
    WebElement noButton;

    @FindBy(xpath ="//input[@value='yes']")
    WebElement yesButton;

    @FindBy(xpath ="//div//input[@name='child-1-court-order-day']")
    WebElement courtOrderDay;

    @FindBy(xpath ="//div//input[@name='child-1-court-order-month']")
    WebElement courtOrderMonth;

    @FindBy(xpath ="//div//input[@name='child-1-court-order-year']")
    WebElement courtOrderYear;

    @FindBy(className ="govuk-button")
    WebElement continueButtonElement;


    public IsThereACourtOrderOrConsentOrderForChildMaintenanceInPlaceFactory(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public void setNoButton(){
        noButton.click();
    }
    public void setYesButton(){
        yesButton.click();
    }
    public void setCourtOrderDay(String dayOfCourtOrder){
        courtOrderDay.click();
        courtOrderDay.sendKeys(dayOfCourtOrder);
    }
    public void setCourtOrderMonth(String monthOfCourtOrder){
        courtOrderMonth.click();
        courtOrderMonth.sendKeys(monthOfCourtOrder);
    }
    public void setCourtOrderYear(String yearOfCourtOrder){
        courtOrderYear.click();
        courtOrderYear.sendKeys(yearOfCourtOrder);
    }
    public void setContinueButtonElement(){
        continueButtonElement.click();
    }

}
