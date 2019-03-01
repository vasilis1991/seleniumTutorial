package uk.gov.bptds.seleniumtutorial.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class RecoveryCompleteRegistrationPageObject {
    private WebDriver driver;
    private WebDriverWait wait;

    public RecoveryCompleteRegistrationPageObject(WebDriver driver) {

        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
    }

    public WelcomePageNewUserPageObject welcomeToGmail(String rPhone, String rEmail, String rDay, String rYear) {

        WebElement revoveryPhoneNumber = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("phoneNumberId")));
        revoveryPhoneNumber.clear();
        revoveryPhoneNumber.sendKeys(rPhone);

        WebElement recoveryEmailAddress = driver.findElement(By.cssSelector("#view_container > form > div.mbekbe.bxPAYd > div > div.fQxwff.cDSmF.OcVpRe > div > div.aCsJod.oJeWuf > div > div.Xb9hP > input"));
        recoveryEmailAddress.sendKeys(rEmail);

        WebElement recoveryDayOfBirth = driver.findElement(By.cssSelector("#day"));
        recoveryDayOfBirth.sendKeys(rDay);

        WebElement recoveryYearOfBirth = driver.findElement(By.cssSelector("#year"));
        recoveryYearOfBirth.sendKeys(rYear);

        WebElement recoveryMonthOfBirth = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#month")));
        Select sel = new Select(recoveryMonthOfBirth);
        sel.selectByValue("2");


        WebElement recoveryGender = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#gender")));
        Select sel1 = new Select(recoveryGender);
        sel1.selectByValue("1");

        WebElement recoveryNextPageButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("personalDetailsNext")));
        recoveryNextPageButton.click();



        return new WelcomePageNewUserPageObject(driver);
    }
}


