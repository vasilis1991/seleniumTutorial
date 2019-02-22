package uk.gov.bptds.seleniumtutorial.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.WeakHashMap;

public class FindJobsPageObject {

    private WebDriver driver;
    private WebDriverWait wait;

    public FindJobsPageObject(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
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

        List <WebElement> list = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@role='option']/div/div[@class='title']")));
         System.out.println("total locations" + list.size());
         try {
             for (int i = 0; i < list.size(); i++) {
                 System.out.println(list.get(i).getText());
                 if (list.get(i).getText().contains("London")) {
                     list.get(i).click();
                 }
             }
         } catch(StaleElementReferenceException e) {
           // do nothing
         }

                //findLocation.submit();
        return new JobsFoundObject(driver);
    }

}


