package uk.gov.bptds.seleniumtutorial.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JobsFoundObject {

    private WebDriver driver;
    private WebDriverWait wait;

    public JobsFoundObject(WebDriver driver) {
        this.driver =driver;
         wait = new WebDriverWait(driver, 10);
    }

    public void addFilterJobsByCategory(String category) {
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("search-content-cover")));
        WebElement jobCategory = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button/p[contains(text(),'" + category + "')]/..")));
        jobCategory.click();
    }

    public void selectDistance(int targetDistance) {
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("search-content-cover")));
        driver.findElement(By.xpath("//button[@data-label='" + targetDistance + "']")).click();
    }

    public JobAndFilterPage selectSpecificJob() {
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("search-content-cover")));
        driver.findElement(By.xpath("//div[@data-job-id='730525']")).click();
        return new JobAndFilterPage(driver);
    }
}

