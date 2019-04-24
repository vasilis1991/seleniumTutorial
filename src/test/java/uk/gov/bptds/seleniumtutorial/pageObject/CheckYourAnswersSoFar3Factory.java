package uk.gov.bptds.seleniumtutorial.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckYourAnswersSoFar3Factory {
    WebDriver driver;

    @FindBy(className ="govuk-button")
    WebElement continueButtonElement;

    public CheckYourAnswersSoFar3Factory(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void setContinueButtonElement(){
        continueButtonElement.click();
    }
}
