package uk.gov.bptds.seleniumtutorial.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WhatIsTheChildsDOB {
    private WebDriver driver;

    public WhatIsTheChildsDOB(WebDriver driver) {

        this.driver = driver;
    }
    public HowOftenDoesChildStayOvernightWithTheOtherParentEachWeek child1DateOfBirth (String dayOfBirth, String monthOfBirth, String yearOfBirth) {


        WebElement day = driver.findElement(By.xpath("//*[@id=\"child-1-date-of-birth-day\"]"));
        day.click();
        day.sendKeys(dayOfBirth);

        WebElement month = driver.findElement(By.xpath("//*[@id=\"child-1-date-of-birth-month\"]"));
        month.click();
        month.sendKeys(monthOfBirth);

        WebElement year = driver.findElement(By.xpath("//*[@id=\"child-1-date-of-birth-year\"]"));
        year.click();
        year.sendKeys(yearOfBirth);

        WebElement continueButton = driver.findElement(By.className("govuk-button"));
        continueButton.click();


        return new HowOftenDoesChildStayOvernightWithTheOtherParentEachWeek(driver);
    }
}
