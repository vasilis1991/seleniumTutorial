package uk.gov.bptds.seleniumtutorial.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HaveYouOrYourChildrenEverExperiencedDomesticAbuse {
    private WebDriver driver;

    public HaveYouOrYourChildrenEverExperiencedDomesticAbuse(WebDriver driver) {

        this.driver = driver;
    }

    public WhatIsYourNameObject noButton() {

        WebElement noButtonElement = driver.findElement(By.xpath("//*[@id=\"domestic-abuse-query-no\"]"));
        noButtonElement.click();

        WebElement continueButton = driver.findElement(By.className("govuk-button"));
        continueButton.click();

        return new WhatIsYourNameObject(driver);
    }
    public HaveYouEverReportedThisDomesticAbuse yesButton() {

        WebElement yesButtonElement = driver.findElement(By.xpath("//*[@id=\"domestic-abuse-query-yes\"]"));
        yesButtonElement.click();

        WebElement continueButton = driver.findElement(By.className("govuk-button"));
        continueButton.click();

        return new HaveYouEverReportedThisDomesticAbuse(driver);
    }

}
