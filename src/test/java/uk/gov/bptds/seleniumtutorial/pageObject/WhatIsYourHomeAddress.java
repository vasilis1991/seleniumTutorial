package uk.gov.bptds.seleniumtutorial.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WhatIsYourHomeAddress {
    private WebDriver driver;

    public WhatIsYourHomeAddress(WebDriver driver) {

        this.driver = driver;
    }

    public HowShouldWeContactYou postcode (String PWCPostCode) {

        WebElement homePostcode = driver.findElement(By.xpath("//*[@id=\"idpc_input\"]"));
        homePostcode.click();
        homePostcode.sendKeys(PWCPostCode);

        WebElement findAddressButton =  driver.findElement(By.className("govuk-button"));
        findAddressButton.click();

        WebElement continueButton =  driver.findElement(By.xpath("//*[@id=\"customButton_proto_print_1\"]"));
        continueButton.click();

        return new HowShouldWeContactYou(driver);
    }
    public ManuallyWhatIsYourAddress linkToEnterAddressMannualy (String PWCPostCode) {

        WebElement homePostcode = driver.findElement(By.xpath("//*[@id=\"idpc_input\"]"));
        homePostcode.click();
        homePostcode.sendKeys(PWCPostCode);

        WebElement findAddressButton =  driver.findElement(By.className("govuk-button"));
        findAddressButton.click();

        WebElement linkManualAddress =  driver.findElement(By.xpath("//*[@id=\"idpc_error_message\"]/a"));
        linkManualAddress.click();

        return new ManuallyWhatIsYourAddress(driver);
    }



}
