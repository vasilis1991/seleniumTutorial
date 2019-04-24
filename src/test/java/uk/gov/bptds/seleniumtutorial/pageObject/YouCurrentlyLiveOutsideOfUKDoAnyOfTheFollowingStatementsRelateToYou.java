package uk.gov.bptds.seleniumtutorial.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class YouCurrentlyLiveOutsideOfUKDoAnyOfTheFollowingStatementsRelateToYou {
    private WebDriver driver;

    public YouCurrentlyLiveOutsideOfUKDoAnyOfTheFollowingStatementsRelateToYou(WebDriver driver) {

        this.driver = driver;
    }

    public HowShouldWeContactYou youAreACivilServant() {

        WebElement civilServant = driver.findElement(By.xpath("//input[@value='civil']"));
        civilServant.click();

        WebElement continueButton = driver.findElement(By.className("govuk-button"));
        continueButton.click();

        return new HowShouldWeContactYou(driver);
    }

    public HowShouldWeContactYou youWorkInHerMajestyDiplomaticService() {

        WebElement majestyDiplomacy = driver.findElement(By.xpath("//input[@value='diplomatic']"));
        majestyDiplomacy.click();

        WebElement continueButton = driver.findElement(By.className("govuk-button"));
        continueButton.click();

        return new HowShouldWeContactYou(driver);
    }

    public HowShouldWeContactYou youWorkForACompanyThatIsBasedAndRegisteredInTheUK() {

        WebElement registeredInUK = driver.findElement(By.xpath("//input[@value='company']"));
        registeredInUK.click();

        WebElement continueButton = driver.findElement(By.className("govuk-button"));
        continueButton.click();

        return new HowShouldWeContactYou(driver);
    }

    public HowShouldWeContactYou youAreAMemberOfTheArmyForces() {

        WebElement armyMember = driver.findElement(By.xpath("//input[@value='forces']"));
        armyMember.click();

        WebElement continueButton = driver.findElement(By.className("govuk-button"));
        continueButton.click();

        return new HowShouldWeContactYou(driver);
    }

    public HowShouldWeContactYou secondmend() {

        WebElement secondm = driver.findElement(By.xpath("//input[@value='prescribed']"));
        secondm.click();

        WebElement continueButton = driver.findElement(By.className("govuk-button"));
        continueButton.click();

        return new HowShouldWeContactYou(driver);
    }

    public YouAreNotEligibleToApply noneOfTheOptions() {

        WebElement non = driver.findElement(By.xpath("//input[@value='none']"));
        non.click();

        WebElement continueButton = driver.findElement(By.className("govuk-button"));
        continueButton.click();

        return new YouAreNotEligibleToApply(driver);
    }
}
