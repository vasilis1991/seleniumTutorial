package uk.gov.bptds.seleniumtutorial.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WhatIsYourHomeAddressFactory {
    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"idpc_input\"]")
    WebElement homePostCode;

    @FindBy(className ="govuk-button")
    WebElement findAddressButton;

    @FindBy(xpath ="//*[@id=\"idpc_error_message\"]/a")
    WebElement linkManualAddress;

    @FindBy(xpath ="//*[@id=\"customButton_proto_print_1\"]")
    WebElement continueButtonElement;


    public WhatIsYourHomeAddressFactory(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void setHomePostCode(String validPostcode){
        homePostCode.click();
        homePostCode.sendKeys(validPostcode);
    }
    public void setHomePostCode1(String inValidPostcode){
        homePostCode.click();
        homePostCode.sendKeys(inValidPostcode);
    }
    public void setLinkManualAddress(){
        linkManualAddress.click();
    }
    public void setContinueButtonElement(){
        continueButtonElement.click();
    }
}

