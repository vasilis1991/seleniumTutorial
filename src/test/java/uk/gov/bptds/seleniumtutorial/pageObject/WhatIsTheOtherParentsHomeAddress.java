package uk.gov.bptds.seleniumtutorial.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WhatIsTheOtherParentsHomeAddress {

    private WebDriver driver;

    public WhatIsTheOtherParentsHomeAddress(WebDriver driver) {

        this.driver = driver;
    }

    public WhatIsTheOtherParentsPhoneNumber otherParentsAddress(String buildingAndStreetDetailsLineOne,String buildingAndStreetDetailsLineTwo, String townOrCityDetails, String countyDetails, String postCode) {

        WebElement buildingAndStreetDetails = driver.findElement(By.xpath("//*[@id=\"other-parent-address-line-1\"]"));
        buildingAndStreetDetails.click();
        buildingAndStreetDetails.sendKeys(buildingAndStreetDetailsLineOne);

        WebElement buildingAndStreetDetailsTwo = driver.findElement(By.xpath("//*[@id=\"other-parent-address-line-2\"]"));
        buildingAndStreetDetailsTwo.click();
        buildingAndStreetDetailsTwo.sendKeys(buildingAndStreetDetailsLineTwo);

        WebElement townOrCity = driver.findElement(By.xpath("//*[@id=\"other-parent-address-town\"]"));
        townOrCity.click();
        townOrCity.sendKeys(townOrCityDetails);

        WebElement county = driver.findElement(By.xpath("//*[@id=\"other-parent-address-county\"]"));
        county.click();
        county.sendKeys(countyDetails);

        WebElement postcode = driver.findElement(By.xpath("//*[@id=\"other-parent-address-postcode\"]"));
        postcode.click();
        postcode.sendKeys(postCode);

        WebElement continueButton = driver.findElement(By.className("govuk-button"));
        continueButton.click();

        return new WhatIsTheOtherParentsPhoneNumber(driver);
    }
}
