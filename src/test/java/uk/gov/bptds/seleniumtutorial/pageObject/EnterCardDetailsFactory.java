package uk.gov.bptds.seleniumtutorial.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnterCardDetailsFactory {
    WebDriver driver;

    @FindBy(xpath ="//*[@id=\"card-no\"]")
    WebElement cardNumber;

    @FindBy(xpath ="//*[@id=\"expiry-month\"]")
    WebElement expiryDateMonth;

    @FindBy(xpath ="//*[@id=\"expiry-year\"]")
    WebElement expiryDateYear;

    @FindBy(xpath ="//*[@id=\"cardholder-name\"]")
    WebElement nameOnCardDetails;

    @FindBy(xpath ="//*[@id=\"cvc\"]")
    WebElement cardSecurityNumber;

    @FindBy(xpath ="//*[@id=\"address-country\"]")
    WebElement countryTerritory;

    @FindBy(xpath ="//*[@id=\"address-line-1\"]")
    WebElement buildingNumberOrName;

    @FindBy(xpath ="//*[@id=\"address-line-2\"]")
    WebElement streetName;

    @FindBy(xpath ="//*[@id=\"address-city\"]")
    WebElement townOrCity;

    @FindBy(xpath ="//*[@id=\"address-postcode\"]")
    WebElement postcode;

    @FindBy(xpath ="//*[@id=\"email\"]")
    WebElement emailDetails;

    @FindBy(className ="govuk-button")
    WebElement continueButtonElement;

    public EnterCardDetailsFactory(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public void setCardNumber(String cardNumber1) {
        cardNumber.click();
        cardNumber.sendKeys(cardNumber1);
    }
    public void setExpiryDateMonth(String expiryDateMonth1) {
        expiryDateMonth.click();
        expiryDateMonth.sendKeys(expiryDateMonth1);
    }
    public void setExpiryDateYear(String expiryDateYear1) {
        expiryDateYear.click();
        expiryDateYear.sendKeys(expiryDateYear1);
    }
    public void setNameOnCardDetails(String nameOnCardDetails1) {
        nameOnCardDetails.click();
        nameOnCardDetails.sendKeys(nameOnCardDetails1);
    }
    public void setCardSecurityNumber(String cardSecurityNumber1) {
        cardSecurityNumber.click();
        cardSecurityNumber.sendKeys(cardSecurityNumber1);
    }
    public void setCountryTerritory(String countryTerritory1) {
        countryTerritory.click();
        countryTerritory.sendKeys(countryTerritory1);
    }
    public void setBuildingNumberOrName(String buildingNumberOrName1) {
        buildingNumberOrName.click();
        buildingNumberOrName.sendKeys(buildingNumberOrName1);
    }
    public void setStreetName(String streetName1) {
        streetName.click();
        streetName.sendKeys(streetName1);
    }
    public void setTownOrCity(String townOrCity1) {
        townOrCity.click();
        townOrCity.sendKeys(townOrCity1);
    }
    public void setPostcode(String postcode1) {
        postcode.click();
        postcode.sendKeys(postcode1);
    }
    public void setEmailDetails(String emailDetails1) {
        emailDetails.click();
        emailDetails.sendKeys(emailDetails1);
    }
    public void setContinueButtonElement(){
        continueButtonElement.click();
    }
}

