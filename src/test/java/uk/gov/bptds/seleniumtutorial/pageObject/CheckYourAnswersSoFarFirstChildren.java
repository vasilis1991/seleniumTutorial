package uk.gov.bptds.seleniumtutorial.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckYourAnswersSoFarFirstChildren {

    private WebDriver driver;

    public CheckYourAnswersSoFarFirstChildren(WebDriver driver) {

        this.driver = driver;
    }


    public YouHaveToldUsAboutSpecificClildren continueButton() {

        WebElement continueButton = driver.findElement(By.className("govuk-button"));
        continueButton.click();

        return new YouHaveToldUsAboutSpecificClildren (driver);
    }



}
