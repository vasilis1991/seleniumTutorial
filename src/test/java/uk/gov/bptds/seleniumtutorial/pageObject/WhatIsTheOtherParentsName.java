package uk.gov.bptds.seleniumtutorial.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WhatIsTheOtherParentsName {

    private WebDriver driver;

    public WhatIsTheOtherParentsName(WebDriver driver) {

        this.driver = driver;
    }

    public WhatIsTheOtherParentsDateOfBirth otherParentsName(String title, String firstName, String middleName, String lastName) {

        WebElement otherParentTitle = driver.findElement(By.xpath("//*[@id=\"other-parent-title\"]"));
        otherParentTitle.clear();
        otherParentTitle.click();
        otherParentTitle.sendKeys(title);

        WebElement otherParentFirstName = driver.findElement(By.xpath("//*[@id=\"other-parent-first-name\"]"));
        otherParentFirstName.click();
        otherParentFirstName.sendKeys(firstName);

        WebElement otherParentMiddleName = driver.findElement(By.xpath("//*[@id=\"other-parent-middle-name\"]"));
        otherParentMiddleName.click();
        otherParentMiddleName.sendKeys(middleName);

        WebElement otherParentLastName = driver.findElement(By.xpath("//*[@id=\"other-parent-last-name\"]"));
        otherParentLastName.click();
        otherParentLastName.sendKeys(lastName);

        WebElement continueButton = driver.findElement(By.className("govuk-button"));
        continueButton.click();

        return new WhatIsTheOtherParentsDateOfBirth(driver);
    }

}
