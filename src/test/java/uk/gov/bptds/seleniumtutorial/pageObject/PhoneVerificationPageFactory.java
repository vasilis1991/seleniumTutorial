package uk.gov.bptds.seleniumtutorial.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PhoneVerificationPageFactory {
    WebDriver driver;

    @FindBy(id = "phoneNumberId")
    WebElement gmailPhoneNumberId;

    @FindBy(id ="gradsIdvPhoneNext")
    WebElement gmailRegNextButton;


    public PhoneVerificationPageFactory(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void setGmailPhoneNumberId(String newPhoneNumber){
        gmailPhoneNumberId.click();
        gmailPhoneNumberId.sendKeys(newPhoneNumber);
    }

    public void setGmailRegNextButton(){

        gmailRegNextButton.click();
    }
}

