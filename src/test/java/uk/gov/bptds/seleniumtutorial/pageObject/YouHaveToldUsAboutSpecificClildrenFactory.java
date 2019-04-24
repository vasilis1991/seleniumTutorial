package uk.gov.bptds.seleniumtutorial.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YouHaveToldUsAboutSpecificClildrenFactory {
    WebDriver driver;

    @FindBy(xpath = "//div//input[@value='No']")
    WebElement noButton;

    @FindBy(className ="govuk-button")
    WebElement continueButtonElement;

    public YouHaveToldUsAboutSpecificClildrenFactory(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public void setNoButton(){
        noButton.click();
    }
    public void setContinueButtonElement() {
        continueButtonElement.click();
    }
}

