package uk.gov.bptds.seleniumtutorial.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WhatIsTheOtherParentsHomeAddressFactory {
    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"other-parent-address-line-1\"]")
    WebElement buildingAndStreetDetails;

    @FindBy(xpath = "//*[@id=\"other-parent-address-line-2\"]")
    WebElement buildingAndStreetDetailsTwo;

    @FindBy(xpath = "//*[@id=\"other-parent-address-town\"]")
    WebElement townOrCity;

    @FindBy(xpath = "//*[@id=\"other-parent-address-county\"]")
    WebElement county;

    @FindBy(xpath = "//*[@id=\"other-parent-address-postcode\"]")
    WebElement postcode;

    @FindBy(className ="govuk-button")
    WebElement continueButtonElement;

    public WhatIsTheOtherParentsHomeAddressFactory(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public void setBuildingAndStreetDetails(String buildingAndStreetDetails1){
        buildingAndStreetDetails.click();
        buildingAndStreetDetails.sendKeys(buildingAndStreetDetails1);
    }
    public void setBuildingAndStreetDetailsTwo(String buildingAndStreetDetailsTwo1){
        buildingAndStreetDetailsTwo.click();
        buildingAndStreetDetailsTwo.sendKeys(buildingAndStreetDetailsTwo1);
    }
    public void setTownOrCity(String townOrCity1){
        townOrCity.click();
        townOrCity.sendKeys(townOrCity1);
    }
    public void setCounty(String county1){
        county.click();
        county.sendKeys(county1);
    }
    public void setPostcode(String postcode1){
        postcode.click();
        postcode.sendKeys(postcode1);
    }
    public void setContinueButtonElement() {
        continueButtonElement.click();
    }
}
