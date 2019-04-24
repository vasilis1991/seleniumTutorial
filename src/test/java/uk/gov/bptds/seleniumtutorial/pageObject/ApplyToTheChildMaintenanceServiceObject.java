package uk.gov.bptds.seleniumtutorial.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ApplyToTheChildMaintenanceServiceObject {
    private WebDriver driver;

    public ApplyToTheChildMaintenanceServiceObject(WebDriver driver) {

        this.driver = driver;
    }

    public WhatIsYourInvitationCode startNowButton() {

        WebElement startNowButton = driver.findElement(By.cssSelector("#main-content > div > div.govuk-grid-column-two-thirds > a"));
        startNowButton.click();

        return new WhatIsYourInvitationCode(driver);
    }
}
