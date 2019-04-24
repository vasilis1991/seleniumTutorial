package uk.gov.bptds.seleniumtutorial.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class YourBankAccountDetails {

    private WebDriver driver;

    public YourBankAccountDetails(WebDriver driver) {

        this.driver = driver;
    }

    public WhatIsYourRollNumber enterBankAccountDetails(String nameAccountHolder, String sortCodeTwoFirstDig, String sortCodeMiddleDig,String sortCodeLastDig, String accountNumber) {

        WebElement accountHolderName = driver.findElement(By.xpath("//*[@id=\"account-holder\"]"));
        accountHolderName.click();
        accountHolderName.sendKeys(nameAccountHolder);

        WebElement sortCodeFirstDigits = driver.findElement(By.xpath("//*[@id=\"sort-code-number-1\"]"));
        sortCodeFirstDigits.click();
        sortCodeFirstDigits.sendKeys(sortCodeTwoFirstDig);

        WebElement sortCodeMiddleDigits = driver.findElement(By.xpath("//*[@id=\"sort-code-number-2\"]"));
        sortCodeMiddleDigits.click();
        sortCodeMiddleDigits.sendKeys(sortCodeMiddleDig);

        WebElement sortCodeLastDigits = driver.findElement(By.xpath("//*[@id=\"sort-code-number-3\"]"));
        sortCodeLastDigits.click();
        sortCodeLastDigits.sendKeys(sortCodeLastDig);

        WebElement accountDetails = driver.findElement(By.xpath("//*[@id=\"account-number\"]"));
        accountDetails.click();
        accountDetails.sendKeys(accountNumber);

        WebElement continueButton = driver.findElement(By.className("govuk-button"));
        continueButton.click();

        return new WhatIsYourRollNumber(driver);
    }
}
