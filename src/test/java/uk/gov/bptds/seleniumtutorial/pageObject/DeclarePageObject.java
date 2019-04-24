package uk.gov.bptds.seleniumtutorial.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DeclarePageObject {

    private WebDriver driver;

    public DeclarePageObject(WebDriver driver) {

        this.driver = driver;
    }

    public EndOfProgress agreeSendApplication() {

        WebElement continueButton = driver.findElement(By.className("govuk-button"));
        continueButton.click();

        return new EndOfProgress(driver);
    }

    public ApplyToTheChildMaintenanceServiceObject returnToStartPage() {

        WebElement returnToStartPageLink = driver.findElement(By.className("govuk-link"));
        returnToStartPageLink.click();

        return new ApplyToTheChildMaintenanceServiceObject(driver);
    }
}
