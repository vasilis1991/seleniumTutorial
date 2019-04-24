package uk.gov.bptds.seleniumtutorial.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WhatIsYourNationalInsuranceNumberFactory {
    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"applicant-national-insurance-number\"]")
    WebElement natInsNum;

    @FindBy(xpath ="//*[@id=\"main-content\"]/div/div/details/summary/span")
    WebElement linkNIForgotLink;

    @FindBy(className ="govuk-button")
    WebElement continueButtonElement;


    public WhatIsYourNationalInsuranceNumberFactory(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void setNatInsNum(String nationalInsurance){
        natInsNum.click();
        natInsNum.sendKeys(nationalInsurance);
    }
    public void setLinkNIForgotLink(){
        linkNIForgotLink.click();
    }
    public void setContinueButtonElement(){
        continueButtonElement.click();
    }
}

