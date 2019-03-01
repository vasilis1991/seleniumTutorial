package uk.gov.bptds.seleniumtutorial.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VerAddPageObject {
    private WebDriver driver;
    private WebDriverWait wait;

    public VerAddPageObject(WebDriver driver) {

        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
    }

    public AcceptPrivacyAndTermsObject termsAndPriv() {
        WebElement agreeToTerms =wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#c0")));
        agreeToTerms.click();

        WebElement agreeToInformation = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#c2")));
        agreeToInformation.click();

        WebElement finalCreateAccount = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("termsofserviceNext")));
        finalCreateAccount.click();

        return new AcceptPrivacyAndTermsObject(driver);
    }
}
