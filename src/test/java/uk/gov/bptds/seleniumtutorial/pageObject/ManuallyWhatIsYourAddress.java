package uk.gov.bptds.seleniumtutorial.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ManuallyWhatIsYourAddress {
    private WebDriver driver;

    public ManuallyWhatIsYourAddress(WebDriver driver) {

        this.driver = driver;
    }

    public HowShouldWeContactYou UKFullAddress (String buildingOrStreetLine1, String buildingOrStreetLine2, String town_City, String countyDetails, String countryDetails, String postCode) {

        WebElement buildingAndStreet1 = driver.findElement(By.xpath("//*[@id=\"applicants-address-line-1\"]"));
        buildingAndStreet1.click();
        buildingAndStreet1.sendKeys(buildingOrStreetLine1);

        WebElement buildingAndStreet2 = driver.findElement(By.xpath("//*[@id=\"applicants-address-line-2\"]"));
        buildingAndStreet2.click();
        buildingAndStreet2.sendKeys(buildingOrStreetLine2);

        WebElement townOrCity =  driver.findElement(By.xpath("//*[@id=\"applicants-address-town\"]"));
        townOrCity.click();
        townOrCity.sendKeys(town_City);

        WebElement county =  driver.findElement(By.xpath("//*[@id=\"applicants-address-county\"]"));
        county.click();
        county.sendKeys(countyDetails);

        WebElement country =  driver.findElement(By.xpath("//*[@id=\"applicants-address-country\"]"));
        country.click();
        country.sendKeys(countryDetails);


        WebElement postcode =  driver.findElement(By.xpath("//*[@id=\"applicants-address-postcode\"]"));
        postcode.click();
        postcode.sendKeys(postCode);

        WebElement continueButton = driver.findElement(By.className("govuk-button"));
        continueButton.click();

        return new HowShouldWeContactYou(driver);
    }
//You currently live outside of the UK, do any of the following statements relate to you?
    public YouCurrentlyLiveOutsideOfUKDoAnyOfTheFollowingStatementsRelateToYou nonUKAddress (String buildingOrStreetLine1, String buildingOrStreetLine2, String town_City, String countyDetails, String countryDetails, String postCode) {

        WebElement buildingAndStreet1 = driver.findElement(By.xpath("//*[@id=\"applicants-address-line-1\"]"));
        buildingAndStreet1.click();
        buildingAndStreet1.sendKeys(buildingOrStreetLine1);

        WebElement buildingAndStreet2 = driver.findElement(By.xpath("//*[@id=\"applicants-address-line-2\"]"));
        buildingAndStreet2.click();
        buildingAndStreet2.sendKeys(buildingOrStreetLine2);

        WebElement townOrCity =  driver.findElement(By.xpath("//*[@id=\"applicants-address-town\"]"));
        townOrCity.click();
        townOrCity.sendKeys(town_City);

        WebElement county =  driver.findElement(By.xpath("//*[@id=\"applicants-address-county\"]"));
        county.click();
        county.sendKeys(countyDetails);

        WebElement country =  driver.findElement(By.xpath("//*[@id=\"applicants-address-country\"]"));
        country.click();
        country.sendKeys(countryDetails);


        WebElement postcode =  driver.findElement(By.xpath("//*[@id=\"applicants-address-postcode\"]"));
        postcode.click();
        postcode.sendKeys(postCode);

        WebElement continueButton = driver.findElement(By.className("govuk-button"));
        continueButton.click();

        return new YouCurrentlyLiveOutsideOfUKDoAnyOfTheFollowingStatementsRelateToYou(driver);
    }
}
