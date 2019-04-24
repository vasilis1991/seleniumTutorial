package uk.gov.bptds.seleniumtutorial.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HowWouldYouLikeChildMaintenanceToBePaidFactory {
    WebDriver driver;

    @FindBy(xpath ="//*[@id=\"service-choice-2\"]")
    WebElement getTheChildMaintanceColletPaymentService;

    @FindBy(xpath ="//*[@id=\"service-choice-1\"]")
    WebElement directPayment;

    @FindBy(className ="govuk-button")
    WebElement continueButtonElement;

    public HowWouldYouLikeChildMaintenanceToBePaidFactory(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public void setGetTheChildMaintanceColletPaymentService(){
        getTheChildMaintanceColletPaymentService.click();
    }
    public void setDirectPayment(){
        directPayment.click();
    }
    public void setContinueButtonElement(){
        continueButtonElement.click();
    }
}

