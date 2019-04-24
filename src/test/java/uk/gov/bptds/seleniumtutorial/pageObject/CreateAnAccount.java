package uk.gov.bptds.seleniumtutorial.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateAnAccount {
    private WebDriver driver;

    public CreateAnAccount(WebDriver driver) {

        this.driver = driver;
    }
    public CheckYourAnswers4 checkAnswers() {

        WebElement pin = driver.findElement(By.xpath("//*[@id=\"security-details-pin\"]"));
        pin.click();
        pin.sendKeys("1234567");

        WebElement password = driver.findElement(By.xpath("//*[@id=\"security-details-password\"]"));
        password.click();
        password.sendKeys("ne111azA");

        WebElement continueButton = driver.findElement(By.xpath("//*[@id=\"personalDetailsBtn\"]"));
        continueButton.click();

        return new CheckYourAnswers4(driver);
    }
}
