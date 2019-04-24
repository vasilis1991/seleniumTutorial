package uk.gov.bptds.seleniumtutorial.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CourtOrderYouAreNotEligibleToApplyToTheChildMaintanceService {

    private WebDriver driver;

    public CourtOrderYouAreNotEligibleToApplyToTheChildMaintanceService(WebDriver driver) {

        this.driver = driver;
    }

    //change or enforce an existing court order or consent order

    public ChangeOrEnforceAnExistingCourtOrderOrConsentOrder linkToChangeOrEnforceAnExistingCourtOrderOrConsentOrder() {


        WebElement linkChangeCourtOrder = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div/p[2]/a"));
        linkChangeCourtOrder.click();

        WebElement continueButton = driver.findElement(By.className("govuk-button"));
        continueButton.click();

        return new ChangeOrEnforceAnExistingCourtOrderOrConsentOrder(driver);
    }
}
