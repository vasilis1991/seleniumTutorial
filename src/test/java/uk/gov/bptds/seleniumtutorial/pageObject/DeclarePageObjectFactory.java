package uk.gov.bptds.seleniumtutorial.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeclarePageObjectFactory {
    WebDriver driver;
    @FindBy(className ="govuk-link")
    WebElement returnToStartPageLink;

    @FindBy(className ="govuk-button")
    WebElement continueButtonElement;

    public DeclarePageObjectFactory(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public void setReturnToStartPageLink() {
        returnToStartPageLink.click();
    }
    public void setContinueButtonElement(){
        continueButtonElement.click();
    }
}

