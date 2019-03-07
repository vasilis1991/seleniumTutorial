package uk.gov.bptds.seleniumtutorial.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CodeVerificationPageFactory {
    WebDriver driver;

    @FindBy(css = "#code")
    WebElement gmailVerificationCode;

    @FindBy(css = "#gradsIdvVerifyNext")
    WebElement gmailVerificationCodeButton;

    public CodeVerificationPageFactory(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void setGmailVerificationCode(String newVerificationCode){
        gmailVerificationCode.click();
        gmailVerificationCode.sendKeys(newVerificationCode);
    }

    public void clickVerificationCodeButton(){
        gmailVerificationCodeButton.click();
    }


}
