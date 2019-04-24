package uk.gov.bptds.seleniumtutorial.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WhatIsYourDateOfBirthFactory {
    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"applicant-date-of-birth-day\"]")
    WebElement dayOfBirth;

    @FindBy(xpath ="//*[@id=\"applicant-date-of-birth-month\"]")
    WebElement monthOfBirth;

    @FindBy(xpath ="//*[@id=\"applicant-date-of-birth-year\"]")
    WebElement yearOfBirth;

    @FindBy(className ="govuk-button")
    WebElement continueButtonElement;


    public WhatIsYourDateOfBirthFactory(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void setMonthOfBirth(String monthBirth){
        monthOfBirth.click();
        monthOfBirth.sendKeys(monthBirth);
    }

    public void setYearOfBirth(String yearBirth){
        dayOfBirth.click();
        dayOfBirth.sendKeys(yearBirth);
    }

    public void setDayOfBirth(String dayBirth){
        dayOfBirth.click();
        dayOfBirth.sendKeys(dayBirth);
    }

    public void setContinueButtonElement(){
        continueButtonElement.click();
    }
}
