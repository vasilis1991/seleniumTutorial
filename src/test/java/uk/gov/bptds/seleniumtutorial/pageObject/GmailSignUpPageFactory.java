package uk.gov.bptds.seleniumtutorial.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GmailSignUpPageFactory {
    WebDriver driver;

    @FindBy(id="firstName")
    WebElement gmailFirstName;

    @FindBy(id="lastName")
    WebElement gmailLastName;

    @FindBy(xpath="//*[@id=\"username\"]")
    WebElement gmailUserName;

    @FindBy(css="#passwd > div.aCsJod.oJeWuf > div > div.Xb9hP > input")
    WebElement gmailPassword;

    @FindBy(css="#confirm-passwd > div.aCsJod.oJeWuf > div > div.Xb9hP > input")
    WebElement gmailConfirmPassword;

    @FindBy(id="accountDetailsNext")
    WebElement gmailNextButton;

    public GmailSignUpPageFactory(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void setGmailFirstName(String newFirstName){
        gmailFirstName.click();
        gmailFirstName.sendKeys(newFirstName);
    }

    public void setGmailLastName(String newLastName){
        gmailLastName.click();
        gmailLastName.sendKeys(newLastName);
    }

    public void setGmailUserName(String newUserName){
        gmailUserName.click();
        gmailUserName.sendKeys(newUserName);
    }

    public void setGmailPassword(String newPassword){
        gmailPassword.click();
        gmailPassword.sendKeys(newPassword);
    }

    public void setGmailConfirmPassword(String confirmPassword){
        gmailConfirmPassword.click();
        gmailConfirmPassword.sendKeys(confirmPassword);
    }

    public void clickNextButton(){
        gmailNextButton.click();
    }
}
