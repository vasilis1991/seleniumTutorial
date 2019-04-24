package uk.gov.bptds.seleniumtutorial.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckYourAnswersSoFar {
    private WebDriver driver;

    public CheckYourAnswersSoFar(WebDriver driver) {

        this.driver = driver;
    }

    public IsThereACourtOrderOrConsentOrderForChildMaintenanceInPlace checkAnswersAndContinue() {

        WebElement continueButton = driver.findElement(By.className("govuk-button"));
        continueButton.click();

        return new IsThereACourtOrderOrConsentOrderForChildMaintenanceInPlace(driver);
    }
}
