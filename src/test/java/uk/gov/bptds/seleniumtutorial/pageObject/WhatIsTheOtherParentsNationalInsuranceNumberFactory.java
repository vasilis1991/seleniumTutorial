package uk.gov.bptds.seleniumtutorial.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WhatIsTheOtherParentsNationalInsuranceNumberFactory {
    WebDriver driver;

    @FindBy(xpath = "/*[@id=\"other-parent-national-insurance-number\"]")
    WebElement otherParentsNationalInsurance;

    @FindBy(className ="govuk-button")
    WebElement continueButtonElement;

    public WhatIsTheOtherParentsNationalInsuranceNumberFactory(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public void setOtherParentsNationalInsurance(String nationalInsurance){
        otherParentsNationalInsurance.click();
        otherParentsNationalInsurance.sendKeys(nationalInsurance);
    }
    public void setContinueButtonElement() {
        continueButtonElement.click();
    }
}

