package uk.gov.bptds.seleniumtutorial.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WhatIsTheChildsDOBFactory {
    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"child-1-date-of-birth-day\"]")
    WebElement dayOfBirth;

    @FindBy(xpath ="//*[@id=\"child-1-date-of-birth-month\"]")
    WebElement monthOfBirth;

    @FindBy(xpath ="//*[@id=\"child-1-date-of-birth-year\"]")
    WebElement yearOfBirth;

    @FindBy(className ="govuk-button")
    WebElement continueButtonElement;

    public WhatIsTheChildsDOBFactory(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void setDayOfBirth(String dayOfBirth1){
        dayOfBirth.click();
        dayOfBirth.sendKeys(dayOfBirth1);
    }
    public void setMonthOfBirth(String monthOfBirth1){
        monthOfBirth.click();
        monthOfBirth.sendKeys(monthOfBirth1);
    }
    public void setYearOfBirth(String yearOfBirth1){
        yearOfBirth.click();
        yearOfBirth.sendKeys(yearOfBirth1);
    }
    public void setContinueButtonElement() {
        continueButtonElement.click();
    }
}
