package uk.gov.bptds.seleniumtutorial.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WhatIsYourNameObject {
    private WebDriver driver;

    public WhatIsYourNameObject(WebDriver driver) {

        this.driver = driver;
    }
    public WhatIsYourDateOfBirth noButton(String PWCTitle, String PWCFirstName, String PWCMiddleName, String PWCLastName) {

        WebElement title = driver.findElement(By.id("applicants-title"));
        title.click();
        title.sendKeys(PWCTitle);

        WebElement firstName = driver.findElement(By.xpath("//*[@id=\"applicant-first-name\"]"));
        firstName.click();
        firstName.sendKeys(PWCFirstName);

        WebElement middleName = driver.findElement(By.xpath("//*[@id=\"applicant-middle-name\"]"));
        middleName.click();
        middleName.sendKeys(PWCMiddleName);

        WebElement lastName = driver.findElement(By.xpath("//*[@id=\"applicant-last-name\"]"));
        lastName.click();
        lastName.sendKeys(PWCLastName);

        WebElement continueButton = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div/form/button"));
        continueButton.click();

        return new WhatIsYourDateOfBirth(driver);
    }
}
