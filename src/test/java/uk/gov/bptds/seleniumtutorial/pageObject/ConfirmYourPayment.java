package uk.gov.bptds.seleniumtutorial.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ConfirmYourPayment {
    private WebDriver driver;

    public ConfirmYourPayment(WebDriver driver) {

        this.driver = driver;
    }

    public EndOfProgress confirmPaymentButton() {

        WebElement confirmButton = driver.findElement(By.xpath("//*[@id=\"confirm\"]"));
        confirmButton.click();

        return new EndOfProgress(driver);
    }
}
