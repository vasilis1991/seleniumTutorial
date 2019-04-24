package uk.gov.bptds.seleniumtutorial.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YourBankAccountDetailsFactory {
    WebDriver driver;
    @FindBy(xpath ="//*[@id=\"account-holder\"]")
    WebElement accountHolderName;

    @FindBy(xpath ="//*[@id=\"sort-code-number-1\"]")
    WebElement sortCodeFirstDigits;

    @FindBy(xpath ="//*[@id=\"sort-code-number-2\"]")
    WebElement sortCodeMiddleDigits;

    @FindBy(xpath ="//*[@id=\"sort-code-number-3\"]")
    WebElement sortCodeLastDigits;

    @FindBy(xpath ="//*[@id=\"account-number\"]")
    WebElement accountDetails;

    @FindBy(className ="govuk-button")
    WebElement continueButtonElement;

    public YourBankAccountDetailsFactory(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void setAccountHolderName(String accountHolderName1) {
        accountHolderName.click();
        accountHolderName.sendKeys(accountHolderName1);
    }
    public void setSortCodeFirstDigits(String sortCodeFirstDigits1){
        sortCodeFirstDigits.click();
        sortCodeFirstDigits.sendKeys(sortCodeFirstDigits1);
    }
    public void setSortCodeMiddleDigits(String sortCodeMiddleDigits1){
        sortCodeMiddleDigits.click();
        sortCodeMiddleDigits.sendKeys(sortCodeMiddleDigits1);
    }
    public void setSortCodeLastDigits(String sortCodeLastDigits1){
        sortCodeLastDigits.click();
        sortCodeLastDigits.sendKeys(sortCodeLastDigits1);
    }
    public void setAccountDetails(String accountDetails1){
        accountDetails.click();
        accountDetails.sendKeys(accountDetails1);
    }
    public void setContinueButtonElement(){
        continueButtonElement.click();
    }
}
