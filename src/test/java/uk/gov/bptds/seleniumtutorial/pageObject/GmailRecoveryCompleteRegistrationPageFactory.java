package uk.gov.bptds.seleniumtutorial.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class GmailRecoveryCompleteRegistrationPageFactory {
    WebDriver driver;

    @FindBy(id = "phoneNumberId")
    WebElement recoveryPhoneNumber;

    @FindBy(css = "#view_container > form > div.mbekbe.bxPAYd > div > div.fQxwff.cDSmF.OcVpRe > div > div.aCsJod.oJeWuf > div > div.Xb9hP > input")
    WebElement recoveryEmailAddress;

    @FindBy(css = "#day")
    WebElement recoveryDayOfBirth;

    @FindBy(css = "#year")
    WebElement recoveryYearOfBirth;

    @FindBy(css = "#month")
    WebElement recoveryMonthOfBirth;

    @FindBy(css = "#gender")
    WebElement recoveryGender;

    @FindBy(id = "personalDetailsNext")
    WebElement personalDetailsNextButton;


    public GmailRecoveryCompleteRegistrationPageFactory(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void setRecoveryPhoneNumber(String recoveryNumber){
        recoveryPhoneNumber.click();
        recoveryPhoneNumber.clear();
        recoveryPhoneNumber.sendKeys(recoveryNumber);
    }

    public void setRecoveryEmailAddress(String recoveryEmail){
        recoveryEmailAddress.click();
        recoveryEmailAddress.sendKeys(recoveryEmail);
    }

    public void setRecoveryDayOfBirth(String recoveryDOB){
        recoveryDayOfBirth.click();
        recoveryDayOfBirth.sendKeys(recoveryDOB);
    }

    public void setRecoveryYearOfBirth(String recoveryYOB){
        recoveryYearOfBirth.click();
        recoveryYearOfBirth.sendKeys(recoveryYOB);
    }

    public void setRecoveryMonthOfBirth(String specificMonth){
        recoveryMonthOfBirth.click();
        Select sel = new Select(recoveryMonthOfBirth);
        sel.selectByValue(specificMonth);
    }

    public void setRecoveryGender(String specificGender){
        recoveryGender.click();
        Select sel1 = new Select(recoveryGender);
        sel1.selectByValue(specificGender);
    }

    public void clickDetailsNextButton(){
        personalDetailsNextButton.click();
    }



}
