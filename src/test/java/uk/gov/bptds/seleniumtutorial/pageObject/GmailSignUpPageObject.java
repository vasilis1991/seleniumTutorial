package uk.gov.bptds.seleniumtutorial.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GmailSignUpPageObject {
    private WebDriver driver;

    public GmailSignUpPageObject(WebDriver driver) {

        this.driver = driver;
    }

    public PhoneVerificationObject userdetails(String fName, String lName, String uName, String pWord) {

        WebElement firstName = driver.findElement(By.id("firstName"));
        firstName.sendKeys(fName);

        WebElement lastName = driver.findElement(By.id("lastName"));
        lastName.sendKeys(lName);

        WebElement userName = driver.findElement(By.xpath("//*[@id=\"username\"]"));
        userName.sendKeys(uName);

        WebElement passWord = driver.findElement(By.cssSelector("#passwd > div.aCsJod.oJeWuf > div > div.Xb9hP > input"));
        passWord.sendKeys(pWord);

        WebElement confirmPassWord = driver.findElement(By.cssSelector("#confirm-passwd > div.aCsJod.oJeWuf > div > div.Xb9hP > input"));
        confirmPassWord.sendKeys(pWord);

        WebElement nextButton = driver.findElement(By.id("accountDetailsNext"));
        nextButton.click();

        return new PhoneVerificationObject(driver);
    }
}
