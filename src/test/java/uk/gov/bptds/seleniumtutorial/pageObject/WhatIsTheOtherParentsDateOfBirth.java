package uk.gov.bptds.seleniumtutorial.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WhatIsTheOtherParentsDateOfBirth {
    private WebDriver driver;

    public WhatIsTheOtherParentsDateOfBirth(WebDriver driver) {

        this.driver = driver;
    }

    public WhatIsTheOtherParentsNationalInsuranceNumber otherParentsBirthDetails(String dayOfBirth, String monthOfBirth, String yearOfBirth) {

        WebElement otherParentDayOfBirth = driver.findElement(By.xpath("//*[@id=\"other-parent-date-of-birth-day\"]"));
        otherParentDayOfBirth.click();
        otherParentDayOfBirth.sendKeys(dayOfBirth);

        WebElement otherParentMonthOfBirth = driver.findElement(By.xpath("//*[@id=\"other-parent-date-of-birth-month\"]"));
        otherParentMonthOfBirth.click();
        otherParentMonthOfBirth.sendKeys(monthOfBirth);

        WebElement otherParentYearOfBirth = driver.findElement(By.xpath("//*[@id=\"other-parent-date-of-birth-year\"]"));
        otherParentYearOfBirth.click();
        otherParentYearOfBirth.sendKeys(yearOfBirth);

        WebElement continueButton = driver.findElement(By.className("govuk-button"));
        continueButton.click();

        return new WhatIsTheOtherParentsNationalInsuranceNumber(driver);
    }
}
