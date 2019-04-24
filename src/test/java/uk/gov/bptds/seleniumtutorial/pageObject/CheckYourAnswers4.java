package uk.gov.bptds.seleniumtutorial.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckYourAnswers4 {

    private WebDriver driver;

    public CheckYourAnswers4(WebDriver driver) {

        this.driver = driver;
    }

    public YouNeedToPayA20ApplicationFee checkAnswersAndContinueToTheNextPage() {

        WebElement continueButton = driver.findElement(By.className("govuk-button"));
        continueButton.click();

        return new YouNeedToPayA20ApplicationFee(driver);
    }
}
