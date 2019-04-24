package uk.gov.bptds.seleniumtutorial.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class YouNeedToPayA20ApplicationFee {
    private WebDriver driver;

    public YouNeedToPayA20ApplicationFee(WebDriver driver) {

        this.driver = driver;
    }

    public EnterCardDetails agreePayFeeAndSendApplication() {

        WebElement agreementAndPaymentOfApplicationFee = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div/a"));
        agreementAndPaymentOfApplicationFee.click();

        return new EnterCardDetails(driver);
    }
}
