package uk.gov.bptds.seleniumtutorial.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WhatIsYourInvitationCode {
    private WebDriver driver;

    public WhatIsYourInvitationCode(WebDriver driver) {

        this.driver = driver;
    }

    public HaveYouOrYourChildrenEverExperiencedDomesticAbuse invitationAndContinueButton() {

        WebElement invitationCodeFld = driver.findElement(By.xpath("//input[@class='govuk-input govuk-input--width-10']"));
        invitationCodeFld.click();
        invitationCodeFld.sendKeys("53343434535543");

        WebElement continueBtn = driver.findElement(By.cssSelector("#main-content > div > div > form > p > button"));
        continueBtn.click();

        return new HaveYouOrYourChildrenEverExperiencedDomesticAbuse(driver);
    }

        public DoNotHaveAnInvitationCode noInvlink(){

            WebElement noInvitationCodeLink = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div/details/summary/span"));
            noInvitationCodeLink.click();

            WebElement callCharges = driver.findElement(By.xpath("//a[@href='/call-charges']"));
            callCharges.click();

            return new DoNotHaveAnInvitationCode(driver);
    }


}
