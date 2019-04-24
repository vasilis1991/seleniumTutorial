package uk.gov.bptds.seleniumtutorial.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WhatIsTheOtherParentsDateOfBirthFactory {
    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"other-parent-date-of-birth-day\"]")
    WebElement otherParentDayOfBirth;

    @FindBy(xpath = "//*[@id=\"other-parent-date-of-birth-month\"]")
    WebElement otherParentMonthOfBirth;

    @FindBy(xpath = "//*[@id=\"other-parent-date-of-birth-year\"]")
    WebElement otherParentYearOfBirth;

    @FindBy(className ="govuk-button")
    WebElement continueButtonElement;

    public WhatIsTheOtherParentsDateOfBirthFactory(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public void setOtherParentDayOfBirth(String dayOfBirth){
        otherParentDayOfBirth.click();
        otherParentDayOfBirth.sendKeys(dayOfBirth);
    }
    public void setOtherParentMonthOfBirth(String monthOfBirth){
        otherParentMonthOfBirth.click();
        otherParentMonthOfBirth.sendKeys(monthOfBirth);
    }
    public void setOtherParentYearOfBirth(String yearOfBirth){
        otherParentYearOfBirth.click();
        otherParentYearOfBirth.sendKeys(yearOfBirth);
    }
    public void setContinueButtonElement() {
        continueButtonElement.click();
    }
}

