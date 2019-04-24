package uk.gov.bptds.seleniumtutorial.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WhatIsYourNameFactory {
    WebDriver driver;

    @FindBy(id = "applicants-title")
    WebElement title;

    @FindBy(xpath ="//*[@id=\"applicant-first-name\"]")
    WebElement firstName;

    @FindBy(xpath ="//*[@id=\"applicant-middle-name\"]")
    WebElement middleName;

    @FindBy(xpath ="//*[@id=\"applicant-last-name\"]")
    WebElement lastName;

    @FindBy(className ="govuk-button")
    WebElement continueButtonElement;


    public WhatIsYourNameFactory(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void setTitle(String titlePWC){
        title.click();
        title.sendKeys(titlePWC);
    }
    public void setFirstName(String firstNamePWC){
        firstName.click();
        firstName.sendKeys(firstNamePWC);
    }
    public void setMiddleName(String middleNamePWC){
        middleName.click();
        middleName.sendKeys(middleNamePWC);
    }
    public void setLastName(String lastNamePWC){
        lastName.click();
        lastName.sendKeys(lastNamePWC);
    }
    public void setContinueButtonElement(){

        continueButtonElement.click();
    }

}
