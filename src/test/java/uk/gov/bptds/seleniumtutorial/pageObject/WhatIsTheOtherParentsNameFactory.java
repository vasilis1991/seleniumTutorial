package uk.gov.bptds.seleniumtutorial.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WhatIsTheOtherParentsNameFactory {
    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"other-parent-title\"]")
    WebElement otherParentTitle;

    @FindBy(xpath = "//*[@id=\"other-parent-first-name\"]")
    WebElement otherParentFirstName;

    @FindBy(xpath = "//*[@id=\"other-parent-middle-name\"]")
    WebElement otherParentMiddleName;

    @FindBy(xpath = "//*[@id=\"other-parent-last-name\"]")
    WebElement otherParentLastName;

    @FindBy(className ="govuk-button")
    WebElement continueButtonElement;

    public WhatIsTheOtherParentsNameFactory(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public void setOtherParentTitle(String otherParentTitle1){
        otherParentTitle.click();
        otherParentTitle.sendKeys(otherParentTitle1);
    }
    public void setOtherParentFirstName(String otherParentFirstName1){
        otherParentFirstName.click();
        otherParentFirstName.sendKeys(otherParentFirstName1);
    }
    public void setOtherParentMiddleName(String otherParentMiddleName1){
        otherParentMiddleName.click();
        otherParentMiddleName.sendKeys(otherParentMiddleName1);
    }
    public void setOtherParentLastNameName(String otherParentLastName1){
        otherParentLastName.click();
        otherParentLastName.sendKeys(otherParentLastName1);
    }
    public void setContinueButtonElement() {
        continueButtonElement.click();
    }
}

