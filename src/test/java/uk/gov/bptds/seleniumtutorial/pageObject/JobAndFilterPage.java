package uk.gov.bptds.seleniumtutorial.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JobAndFilterPage {
    private WebDriver driver;

    public JobAndFilterPage(WebDriver driver) {

        this.driver = driver;
    }

    public  JobLandPageToApply findSpecificJobPage() {

        WebElement applyButton = driver.findElement(By.id("apply-button"));
        applyButton.click();

        return new JobLandPageToApply(driver);

    }
}
