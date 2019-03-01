package uk.gov.bptds.seleniumtutorial.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CodeVerificationPageObject {

    private WebDriver driver;
    private WebDriverWait wait;

    public CodeVerificationPageObject(WebDriver driver) {

        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
    }

    public RecoveryCompleteRegistrationPageObject completeReg(String vCode) {

        WebElement verificationCode = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#code")));
        verificationCode.sendKeys(vCode);

        WebElement verifyCodeButton = driver.findElement(By.cssSelector("#gradsIdvVerifyNext"));
        verifyCodeButton.click();

        return new RecoveryCompleteRegistrationPageObject(driver);
    }
}
