package uk.gov.bptds.seleniumtutorial.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WouldYouLikeToAddAnotherChild {

    private WebDriver driver;

    public WouldYouLikeToAddAnotherChild(WebDriver driver) {

        this.driver = driver;
    }

    public CheckYourAnswersSoFarFirstChildren noButton () {

        WebElement noButton = driver.findElement(By.xpath("//*[@id=\"add-another-child-no\"]"));
        noButton.click();

        WebElement continueButton = driver.findElement(By.className("govuk-button"));
        continueButton.click();

        return new CheckYourAnswersSoFarFirstChildren(driver);

    }
}
