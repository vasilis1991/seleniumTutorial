package uk.gov.bptds.seleniumtutorial.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WhatIsYourRollNumberFactory {
    WebDriver driver;

    @FindBy(xpath ="//*[@id=\"roll-number\"]")
    WebElement enterRollNum;

    @FindBy(className ="govuk-button")
    WebElement continueButtonElement;

    public WhatIsYourRollNumberFactory(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public void setEnterRollNum(String enterRollNum1) {
        enterRollNum.click();
        enterRollNum.sendKeys(enterRollNum1);
    }
    public void setContinueButtonElement(){
        continueButtonElement.click();
    }
}

