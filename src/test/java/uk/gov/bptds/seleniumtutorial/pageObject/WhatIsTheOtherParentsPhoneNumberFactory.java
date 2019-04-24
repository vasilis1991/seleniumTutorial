package uk.gov.bptds.seleniumtutorial.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WhatIsTheOtherParentsPhoneNumberFactory {
    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"other-parent-contact-work-phone\"]")
    WebElement otherParentPhoneDetails;

    @FindBy(className ="govuk-button")
    WebElement continueButtonElement;

    public WhatIsTheOtherParentsPhoneNumberFactory(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public void setOtherParentPhoneDetails(String otherParentPhoneDetails1){
        otherParentPhoneDetails.click();
        otherParentPhoneDetails.sendKeys(otherParentPhoneDetails1);
    }
    public void setContinueButtonElement() {
        continueButtonElement.click();
    }
}

