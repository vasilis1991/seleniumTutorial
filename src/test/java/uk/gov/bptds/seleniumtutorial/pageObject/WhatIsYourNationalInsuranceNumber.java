package uk.gov.bptds.seleniumtutorial.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WhatIsYourNationalInsuranceNumber {
    private WebDriver driver;

    public WhatIsYourNationalInsuranceNumber(WebDriver driver) {

        this.driver = driver;
    }

    public WhatIsYourHomeAddress nationalInsNo(String nino) {

        WebElement natInsNum = driver.findElement(By.xpath("//*[@id=\"applicant-national-insurance-number\"]"));
        natInsNum.click();
        natInsNum.sendKeys(nino);

        WebElement continueBtn = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div/form/button"));
        continueBtn.click();

        return new WhatIsYourHomeAddress(driver);

    }

    public IDoNotKnowMyNationalInsuranceNumber doNotRememberNILink () {

        WebElement linkNIForgotLink = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div/details/summary/span"));
        linkNIForgotLink.click();

        return new IDoNotKnowMyNationalInsuranceNumber(driver);

    }
}