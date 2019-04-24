package uk.gov.bptds.seleniumtutorial.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HowOftenDoesChildStayOvernightWithTheOtherParentEachWeek {
    private WebDriver driver;

    public HowOftenDoesChildStayOvernightWithTheOtherParentEachWeek(WebDriver driver) {

        this.driver = driver;
    }
// EXW NA ALLAXW TO ONOMA STO WOULDYOULIKE TO ADD ANOTHER CHILD
    public CheckYourAnswersSoFarFirstChildren never() {

        WebElement neverOption = driver.findElement(By.xpath("//div//input[@value='Never']"));
        neverOption.click();

        WebElement continueButton = driver.findElement(By.className("govuk-button"));
        continueButton.click();

        return new CheckYourAnswersSoFarFirstChildren(driver);

    }

    public CheckYourAnswersSoFarFirstChildren lessThan1NightPerWeek() {

        WebElement lessThanOneNightOption = driver.findElement(By.xpath("//div//input[@value='Less than 1 night a week']"));
        lessThanOneNightOption.click();

        WebElement continueButton = driver.findElement(By.className("govuk-button"));
        continueButton.click();

        return new CheckYourAnswersSoFarFirstChildren(driver);

    }

    public CheckYourAnswersSoFarFirstChildren oneToTwoNightsAWeek() {

        WebElement oneToTwoNightsOption = driver.findElement(By.xpath("//div//input[@value='1 to 2 nights a week']"));
        oneToTwoNightsOption.click();

        WebElement continueButton = driver.findElement(By.className("govuk-button"));
        continueButton.click();

        return new CheckYourAnswersSoFarFirstChildren(driver);

    }

    public CheckYourAnswersSoFarFirstChildren twoToThreeNightsAWeek() {

        WebElement twoToThreeNightsOption = driver.findElement(By.xpath("//div//input[@value='2 to 3 nights a week']"));
        twoToThreeNightsOption.click();

        WebElement continueButton = driver.findElement(By.className("govuk-button"));
        continueButton.click();

        return new CheckYourAnswersSoFarFirstChildren(driver);

    }

    public CheckYourAnswersSoFarFirstChildren threeNightsAWeek() {

        WebElement threeNightsOption = driver.findElement(By.xpath("//div//input[@value='3 nights a week']"));
        threeNightsOption.click();

        WebElement continueButton = driver.findElement(By.className("govuk-button"));
        continueButton.click();

        return new CheckYourAnswersSoFarFirstChildren(driver);

    }

    public CheckYourAnswersSoFarFirstChildren moreThanThreeNightsAWeek() {

        WebElement moreThanThreeNightsOption = driver.findElement(By.xpath("//div//input[@value='More than 3 nights a week']"));
        moreThanThreeNightsOption.click();

        WebElement continueButton = driver.findElement(By.className("govuk-button"));
        continueButton.click();

        return new CheckYourAnswersSoFarFirstChildren(driver);

    }
}