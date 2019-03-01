package uk.gov.bptds.seleniumtutorial.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PhoneVerificationObject {
    private WebDriver driver;
    private WebDriverWait wait;

    public PhoneVerificationObject(WebDriver driver) {

        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
    }

    public CodeVerificationPageObject successfullRegistration(String mNumber) {

        WebElement mobileRegistrationNumber = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("phoneNumberId")));
        mobileRegistrationNumber.sendKeys(mNumber);

        WebElement nextMobileButton = driver.findElement(By.id("gradsIdvPhoneNext"));
        nextMobileButton.click();

        return new CodeVerificationPageObject(driver);
    }
}
