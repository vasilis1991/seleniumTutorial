package uk.gov.bptds.seleniumtutorial.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FindJobsPageObject {

    private WebDriver driver;

    public FindJobsPageObject(WebDriver driver) {
        this.driver = driver;
    }

    public JobsFoundObject findJobByLocationAndName(String specificJob, String specificLocation){
        WebElement findjob;
        try {
             findjob = driver.findElements(By.id("search_typeahead")).get(1);
        } catch(IndexOutOfBoundsException e) {
            findjob = driver.findElement(By.id("search_typeahead"));
        }
        findjob.sendKeys(specificJob);
        WebElement findLocation = driver.findElements(By.id("location-typeahead")).get(1);
                findLocation.sendKeys(specificLocation);
                findLocation.submit();


        return new JobsFoundObject(driver);
    }
}

