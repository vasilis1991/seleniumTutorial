package uk.gov.bptds.seleniumtutorial.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IsThereACourtOrderOrConsentOrderForChildMaintenanceInPlace {

    private WebDriver driver;

    public IsThereACourtOrderOrConsentOrderForChildMaintenanceInPlace(WebDriver driver) {

        this.driver = driver;
    }


    public WhatIsTheChildsName noCourtOrderButton() {

        WebElement noButton = driver.findElement(By.xpath("//input[@value='no']"));
        noButton.click();

        WebElement continueButton = driver.findElement(By.className("govuk-button"));
        continueButton.click();

        return new WhatIsTheChildsName(driver);
    }

    public WhatIsTheChildsName yesCourtOrderButtonEligibleDate(String courtDay, String courtMonth, String courtYear) {

        WebElement yesButton = driver.findElement(By.xpath("//input[@value='yes']"));
        yesButton.click();

        WebElement courtOrderDay = driver.findElement(By.xpath("//div//input[@name='child-1-court-order-day']"));
        courtOrderDay.click();
        courtOrderDay.sendKeys(courtDay);

        WebElement courtOrderMonth = driver.findElement(By.xpath("//div//input[@name='child-1-court-order-month']"));
        courtOrderMonth.click();
        courtOrderMonth.sendKeys(courtMonth);

        WebElement courtOrderYear = driver.findElement(By.xpath("//div//input[@name='child-1-court-order-year']"));
        courtOrderYear.click();
        courtOrderYear.sendKeys(courtYear);

        WebElement continueButton = driver.findElement(By.className("govuk-button"));
        continueButton.click();

        return new WhatIsTheChildsName(driver);
    }

    public CourtOrderYouAreNotEligibleToApplyToTheChildMaintanceService yesCourtOrderButtonNotEligibleDate(String courtDay, String courtMonth, String courtYear) {

        WebElement yesButton = driver.findElement(By.xpath("//input[@value='yes']"));
        yesButton.click();

        WebElement courtOrderDay1 = driver.findElement(By.xpath("//div//input[@name='child-1-court-order-day']"));
        courtOrderDay1.click();
        courtOrderDay1.sendKeys(courtDay);

        WebElement courtOrderMonth1 = driver.findElement(By.xpath("//div//input[@name='child-1-court-order-month']"));
        courtOrderMonth1.click();
        courtOrderMonth1.sendKeys(courtMonth);

        WebElement courtOrderYear1 = driver.findElement(By.xpath("//div//input[@name='child-1-court-order-year']"));
        courtOrderYear1.click();
        courtOrderYear1.sendKeys(courtYear);

        WebElement continueButton1 = driver.findElement(By.className("govuk-button"));
        continueButton1.click();

        return new CourtOrderYouAreNotEligibleToApplyToTheChildMaintanceService(driver);
    }
}
