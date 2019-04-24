package uk.gov.bptds.seleniumtutorial.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EnterCardDetails {
    private WebDriver driver;

    public EnterCardDetails(WebDriver driver) {

        this.driver = driver;
    }

    public ConfirmYourPayment enterCardDet(String cardNo, String expiredMonth, String expiredYear, String nameOnCard, String securityDigits, String country, String buildingNoOrName, String street, String TownCity, String PostCode, String email) {

        WebElement cardNumber = driver.findElement(By.xpath("//*[@id=\"card-no\"]"));
        cardNumber.click();
        cardNumber.sendKeys(cardNo);

        WebElement expiryDateMonth = driver.findElement(By.xpath("//*[@id=\"expiry-month\"]"));
        expiryDateMonth.click();
        expiryDateMonth.sendKeys(expiredMonth);

        WebElement expiryDateYear = driver.findElement(By.xpath("//*[@id=\"expiry-year\"]"));
        expiryDateYear.click();
        expiryDateYear.sendKeys(expiredYear);

        WebElement nameOnCardDetails = driver.findElement(By.xpath("//*[@id=\"cardholder-name\"]"));
        nameOnCardDetails.click();
        nameOnCardDetails.sendKeys(nameOnCard);

        WebElement cardSecurityNumber = driver.findElement(By.xpath("//*[@id=\"cvc\"]"));
        cardSecurityNumber.click();
        cardSecurityNumber.sendKeys(securityDigits);

        WebElement countryTerritory = driver.findElement(By.xpath("//*[@id=\"address-country\"]"));
        countryTerritory.clear();
        countryTerritory.sendKeys(country);

        WebElement buildingNumberOrName = driver.findElement(By.xpath("//*[@id=\"address-line-1\"]"));
        buildingNumberOrName.click();
        buildingNumberOrName.sendKeys(buildingNoOrName);

        WebElement streetName = driver.findElement(By.xpath("//*[@id=\"address-line-2\"]"));
        streetName.click();
        streetName.sendKeys(street);

        WebElement townOrCity = driver.findElement(By.xpath("//*[@id=\"address-city\"]"));
        townOrCity.click();
        townOrCity.sendKeys(TownCity);

        WebElement postcode = driver.findElement(By.xpath("//*[@id=\"address-postcode\"]"));
        postcode.click();
        postcode.sendKeys(PostCode);

        WebElement emailDetails = driver.findElement(By.xpath("//*[@id=\"email\"]"));
        emailDetails.click();
        emailDetails.sendKeys(email);


        WebElement continueButton = driver.findElement(By.className("govuk-button"));
        continueButton.click();

        return new ConfirmYourPayment(driver);
    }
}
