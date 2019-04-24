package uk.gov.bptds.seleniumtutorial.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WhatIsTheOtherParentsPhoneNumber {

    private WebDriver driver;

    public WhatIsTheOtherParentsPhoneNumber(WebDriver driver) {

        this.driver = driver;
    }

    public CheckYourAnswersSoFar3 otherParentsPhoneNumber(String otherParentPhone) {

        WebElement otherParentPhoneDetails = driver.findElement(By.xpath("//*[@id=\"other-parent-contact-work-phone\"]"));
        otherParentPhoneDetails.click();
        otherParentPhoneDetails.sendKeys(otherParentPhone);

        WebElement continueButton = driver.findElement(By.className("govuk-button"));
        continueButton.click();

        return new CheckYourAnswersSoFar3(driver);
    }
}
