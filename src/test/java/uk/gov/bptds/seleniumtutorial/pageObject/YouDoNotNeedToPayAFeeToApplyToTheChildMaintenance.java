package uk.gov.bptds.seleniumtutorial.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class YouDoNotNeedToPayAFeeToApplyToTheChildMaintenance {
    private WebDriver driver;

    public YouDoNotNeedToPayAFeeToApplyToTheChildMaintenance(WebDriver driver) {

        this.driver = driver;
    }

//WhatIsYourNameObject

    public WhatIsYourNameObject continueButton() {

        WebElement continueButton = driver.findElement(By.className("govuk-button"));
        continueButton.click();

        return new WhatIsYourNameObject(driver);
    }
}
