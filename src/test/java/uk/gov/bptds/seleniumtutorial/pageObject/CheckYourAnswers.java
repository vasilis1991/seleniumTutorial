package uk.gov.bptds.seleniumtutorial.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckYourAnswers {
    private WebDriver driver;

    public CheckYourAnswers(WebDriver driver) {

        this.driver = driver;
    }

    public YouNeedToPayA20ApplicationFee checkAnswersAndContinue() {

        WebElement continueButton = driver.findElement(By.className("govuk-button"));
        continueButton.click();

        return new YouNeedToPayA20ApplicationFee(driver);
    }

    public DeclarePageObject checkAnswersAndContinueToDeclare() {

        WebElement continueButton = driver.findElement(By.className("govuk-button"));
        continueButton.click();

        return new DeclarePageObject(driver);
    }


}
