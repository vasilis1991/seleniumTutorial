package uk.gov.bptds.seleniumtutorial.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HowWouldYouLikeChildMaintenanceToBePaid {


    private WebDriver driver;

    public HowWouldYouLikeChildMaintenanceToBePaid(WebDriver driver) {

        this.driver = driver;
    }


    //Calc and Collect
    public YourBankAccountDetails collectPaymentOption() {

        WebElement getTheChildMaintanceColletPaymentService = driver.findElement(By.xpath("//*[@id=\"service-choice-2\"]"));
        getTheChildMaintanceColletPaymentService.click();

        WebElement continueButton = driver.findElement(By.className("govuk-button"));
        continueButton.click();

        return new YourBankAccountDetails(driver);
    }

    //Maintainance Direct
    public CreateAnAccount directPaymentOption() {

        WebElement directPayment = driver.findElement(By.xpath("//*[@id=\"service-choice-1\"]"));
        directPayment.click();

        WebElement continueButton = driver.findElement(By.className("govuk-button"));
        continueButton.click();

        return new CreateAnAccount(driver);
    }

}
