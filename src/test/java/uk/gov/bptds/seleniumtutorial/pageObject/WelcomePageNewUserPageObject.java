package uk.gov.bptds.seleniumtutorial.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WelcomePageNewUserPageObject {
    private WebDriver driver;
    private WebDriverWait wait;

    public WelcomePageNewUserPageObject(WebDriver driver) {

        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
    }

    public VerAddPageObject addNoCode() {
        WebElement notNowButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#view_container > form > div.mbekbe.bxPAYd > div > div.GtglAe > div.OZliR > div.Zf2Owf.Hj2jlf > button")));
        notNowButton.click();

        return new VerAddPageObject(driver);
    }
}
