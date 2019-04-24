package uk.gov.bptds.seleniumtutorial.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WhatIsYourDateOfBirth {
    private WebDriver driver;

    public WhatIsYourDateOfBirth(WebDriver driver) {

        this.driver = driver;
    }



    public WhatIsYourNationalInsuranceNumber dateOfBirth (String dayOfBirth, String monthOfBirth, String yearOfBirth) {


        WebElement day = driver.findElement(By.xpath("//*[@id=\"applicant-date-of-birth-day\"]"));
        day.click();
        day.sendKeys(dayOfBirth);

        WebElement month = driver.findElement(By.xpath("//*[@id=\"applicant-date-of-birth-month\"]"));
        month.click();
        month.sendKeys(monthOfBirth);

        WebElement year = driver.findElement(By.xpath("//*[@id=\"applicant-date-of-birth-year\"]"));
        year.click();
        year.sendKeys(yearOfBirth);

        WebElement continueBtn = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div/form/button"));
        continueBtn.click();


        return new WhatIsYourNationalInsuranceNumber(driver);
}
}
