package uk.gov.bptds.seleniumtutorial.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HowShouldWeContactYouFactory {
    WebDriver driver;

    @FindBy(xpath = "//input[@value='email']")
    WebElement phoneBox;

    @FindBy(xpath ="//*[@id=\"applicants-contact-home-phone\"]")
    WebElement phoneNumber;

    @FindBy(xpath ="//input[@value='phone']")
    WebElement textBox;

    @FindBy(xpath ="//*[@id=\"applicants-contact-mobile-phone\"]")
    WebElement textMes;

    @FindBy(xpath ="//input[@value='email']")
    WebElement emailBox;

    @FindBy(xpath ="//*[@id=\"applicant-email\"]")
    WebElement emailText;

    @FindBy(xpath ="//input[@value='post']")
    WebElement postBox;

    @FindBy(xpath ="//*[@id=\"applicants-contact-home-phone\"]")
    WebElement postDetails;

    @FindBy(className ="govuk-button")
    WebElement continueButtonElement;


    public HowShouldWeContactYouFactory(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public void setPhoneBox(){
        phoneBox.click();
    }
    public void setPhoneNumber(String phoneNum){
        phoneNumber.click();
        phoneNumber.sendKeys(phoneNum);
    }
    public void setTextBox(){
        textBox.click();
    }
    public void setTextMes(String textMessage){
        textMes.click();
        textMes.sendKeys(textMessage);
    }
    public void setEmailBox(){
        emailBox.click();
    }
    public void setEmailText(String emailText1){
        emailText.click();
        emailText.sendKeys(emailText1);
    }
    public void setPostBox(){
        postBox.click();
    }
    public void setPostDetails(String postAddress){
        postDetails.click();
        postDetails.sendKeys(postAddress);
    }
    public void setContinueButtonElement(){
        continueButtonElement.click();
    }

}
