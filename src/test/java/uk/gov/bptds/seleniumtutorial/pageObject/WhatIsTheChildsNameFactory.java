package uk.gov.bptds.seleniumtutorial.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WhatIsTheChildsNameFactory {
    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"child-1-first-name\"]")
    WebElement childFirstName;

    @FindBy(xpath ="//*[@id=\"child-1-middle-name\"]")
    WebElement childMiddleName;

    @FindBy(xpath ="//*[@id=\"child-1-last-name\"]")
    WebElement childLastName;

    @FindBy(xpath ="//input[@value='no']")
    WebElement noAdditionalChildButton;

    @FindBy(xpath ="//input[@value='yes']")
    WebElement yesAdditionalChildButton;

    @FindBy(xpath ="//div//input[@id='child-2-first-name']")
    WebElement secondChildFirstName;

    @FindBy(xpath ="//div//input[@id='child-2-middle-name']")
    WebElement secondChildMiddleName;

    @FindBy(xpath ="//div//input[@id='child-2-last-name']")
    WebElement secondChildLastName;

    @FindBy(xpath ="//input[@value='No']")
    WebElement no3AdditionalChildButton;

    @FindBy(className ="govuk-button")
    WebElement continueButtonElement;


    public WhatIsTheChildsNameFactory(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public void setChildFirstName(String childFirstNameText){
        childFirstName.click();
        childFirstName.sendKeys(childFirstNameText);
    }
    public void setChildMiddleName(String childMiddleName1){
        childMiddleName.click();
        childMiddleName.sendKeys(childMiddleName1);
    }
    public void setChildLastName(String childLastName1){
        childLastName.click();
        childLastName.sendKeys(childLastName1);
    }
    public void setNoAdditionalChildButton(){
        noAdditionalChildButton.click();
    }
    public void setSecondChildFirstName(String secondChildFirstName1){
        secondChildFirstName.click();
        secondChildFirstName.sendKeys(secondChildFirstName1);
    }
    public void setSecondChildMiddleName(String secondChildMiddleName1){
        secondChildMiddleName.click();
        secondChildMiddleName.sendKeys(secondChildMiddleName1);
    }
    public void setSecondChildLastNameName(String secondChildLastName1){
        secondChildLastName.click();
        secondChildLastName.sendKeys(secondChildLastName1);
    }
    public void setNo3AdditionalChildButton(){
        no3AdditionalChildButton.click();
    }

    public void setContinueButtonElement() {
        continueButtonElement.click();
    }
}
