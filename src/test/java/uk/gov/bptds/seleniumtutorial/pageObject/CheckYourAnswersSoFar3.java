package uk.gov.bptds.seleniumtutorial.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckYourAnswersSoFar3 {


    private WebDriver driver;

    public CheckYourAnswersSoFar3(WebDriver driver) {

        this.driver = driver;
    }

    public HowWouldYouLikeChildMaintenanceToBePaid checkAndContinue() {


        WebElement continueButton = driver.findElement(By.className("govuk-button"));
        continueButton.click();

        return new HowWouldYouLikeChildMaintenanceToBePaid(driver);
    }



}
