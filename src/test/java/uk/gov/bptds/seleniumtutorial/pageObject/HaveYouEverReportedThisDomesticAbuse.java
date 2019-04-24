package uk.gov.bptds.seleniumtutorial.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HaveYouEverReportedThisDomesticAbuse {
    private WebDriver driver;
    private WebDriverWait wait;

    public HaveYouEverReportedThisDomesticAbuse(WebDriver driver) {

        this.driver = driver;
        wait = new WebDriverWait(driver, 3);
    }

    public YouDoNotNeedToPayAFeeToApplyToTheChildMaintenance yesButton() {

        WebElement yesButtonElement = driver.findElement(By.xpath("//*[@id=\"domestic-abuse-reported-yes\"]"));
        yesButtonElement.click();

        WebElement continueButton = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div/form/button"));
        continueButton.click();

        return new YouDoNotNeedToPayAFeeToApplyToTheChildMaintenance(driver);
    }

    public YouDoNotNeedToPayAFeeToApplyToTheChildMaintenance noButton() {

        WebElement noButtonElement = driver.findElement(By.xpath("//*[@id=\"domestic-abuse-reported-no\"]"));
        noButtonElement.click();

        WebElement continueButton = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div/form/button"));
        continueButton.click();

        WebElement continueButton1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"main-content\"]/div/div/form/button")));
        continueButton1.click();

        return new YouDoNotNeedToPayAFeeToApplyToTheChildMaintenance(driver);
    }

}
