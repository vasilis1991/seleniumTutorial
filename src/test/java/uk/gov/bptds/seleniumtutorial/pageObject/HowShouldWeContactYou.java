package uk.gov.bptds.seleniumtutorial.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HowShouldWeContactYou {
    private WebDriver driver;

    public HowShouldWeContactYou(WebDriver driver) {

        this.driver = driver;
    }

    public CheckYourAnswersSoFar phoneContact(String numberPhone) {

        WebElement phoneBox = driver.findElement(By.xpath("//input[@value='email']"));
        phoneBox.click();

        WebElement phoneNumber = driver.findElement(By.xpath("//*[@id=\"applicants-contact-home-phone\"]"));
        phoneNumber.click();
        phoneNumber.sendKeys(numberPhone);

        return new CheckYourAnswersSoFar(driver);
    }

    public CheckYourAnswersSoFar textMessageContact(String textMessage) {

        WebElement textBox = driver.findElement(By.xpath("//input[@value='phone']"));
        textBox.click();

        WebElement textMes = driver.findElement(By.xpath("//*[@id=\"applicants-contact-mobile-phone\"]"));
        textMes.click();
        textMes.sendKeys(textMessage);

        return new CheckYourAnswersSoFar(driver);
    }

    public CheckYourAnswersSoFar emailContact(String email) {

        WebElement emailBox = driver.findElement(By.xpath("//input[@value='email']"));
        emailBox.click();

        WebElement emailText = driver.findElement(By.xpath("//*[@id=\"applicant-email\"]"));
        emailText.click();
        emailText.sendKeys(email);

        return new CheckYourAnswersSoFar(driver);
    }

    public CheckYourAnswersSoFar postContact() {

        WebElement postBox = driver.findElement(By.xpath("//input[@value='post']"));
        postBox.click();

        WebElement postDetails = driver.findElement(By.xpath("//*[@id=\"applicants-contact-home-phone\"]"));
        postDetails.click();

        return new CheckYourAnswersSoFar(driver);
    }

    public CheckYourAnswersSoFar continueToCheckYourAnswer() {

        WebElement continueButton = driver.findElement(By.className("govuk-button"));
        continueButton.click();

        return new CheckYourAnswersSoFar(driver);
    }





}
