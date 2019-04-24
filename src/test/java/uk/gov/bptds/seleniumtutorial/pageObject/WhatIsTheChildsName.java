package uk.gov.bptds.seleniumtutorial.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WhatIsTheChildsName {

    private WebDriver driver;

    public WhatIsTheChildsName(WebDriver driver) {

        this.driver = driver;
    }
    public WhatIsTheChildsDOB childNameDetailsNoAdditionalChild(String firstName, String middleName, String lastName) {

        WebElement childFirstName = driver.findElement(By.xpath("//*[@id=\"child-1-first-name\"]"));
        childFirstName.click();
        childFirstName.sendKeys(firstName);

        WebElement childMiddleName = driver.findElement(By.xpath("//*[@id=\"child-1-middle-name\"]"));
        childMiddleName.click();
        childMiddleName.sendKeys(middleName);

        WebElement childLastName = driver.findElement(By.xpath("//*[@id=\"child-1-last-name\"]"));
        childLastName.click();
        childLastName.sendKeys(lastName);

        WebElement noAdditionalChildButton = driver.findElement(By.xpath("//input[@value='no']"));
        noAdditionalChildButton.click();

        WebElement continueButton = driver.findElement(By.className("govuk-button"));
        continueButton.click();

        return new WhatIsTheChildsDOB(driver);
    }

    public WhatIsTheChildsDOB childNamedetailsAdditionalChild(String firstName, String middleName, String lastName, String firstNameSecondChild, String middleNameSecondChild, String lastNameSecondChild) {

        WebElement childFirstName = driver.findElement(By.xpath("//*[@id=\"child-1-first-name\"]"));
        childFirstName.click();
        childFirstName.sendKeys(firstName);

        WebElement childMiddleName = driver.findElement(By.xpath("//*[@id=\"child-1-middle-name\"]"));
        childMiddleName.click();
        childMiddleName.sendKeys(middleName);

        WebElement childLastName = driver.findElement(By.xpath("//*[@id=\"child-1-last-name\"]"));
        childLastName.click();
        childLastName.sendKeys(lastName);

        WebElement yesAdditionalChildButton = driver.findElement(By.xpath("//input[@value='yes']"));
        yesAdditionalChildButton.click();

        WebElement continueButton = driver.findElement(By.className("govuk-button"));
        continueButton.click();

        WebElement secondChildFirstName = driver.findElement(By.xpath("//div//input[@id='child-2-first-name']"));
        secondChildFirstName.click();
        secondChildFirstName.sendKeys(firstNameSecondChild);

        WebElement secondChildMiddleName = driver.findElement(By.xpath("//div//input[@id='child-2-middle-name']"));
        secondChildMiddleName.click();
        secondChildMiddleName.sendKeys(middleNameSecondChild);

        WebElement secondChildLastName = driver.findElement(By.xpath("//div//input[@id='child-2-last-name']"));
        secondChildLastName.click();
        secondChildLastName.sendKeys(lastNameSecondChild);

        WebElement noAdditionalChildButton = driver.findElement(By.xpath("//input[@value='No']"));
        noAdditionalChildButton.click();

        WebElement continueButton1 = driver.findElement(By.className("govuk-button"));
        continueButton1.click();

        return new WhatIsTheChildsDOB(driver);
    }
}
