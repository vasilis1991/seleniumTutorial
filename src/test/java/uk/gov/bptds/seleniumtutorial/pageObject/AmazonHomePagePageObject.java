package uk.gov.bptds.seleniumtutorial.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class AmazonHomePagePageObject {
    private WebDriver driver;

    public AmazonHomePagePageObject(WebDriver driver) {

        this.driver = driver;
    }


    public SearchResultPageObject searchForItem(String searchTerm) {

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(searchTerm);
        driver.findElement(By.cssSelector("#nav-search > form > div.nav-right > div > input")).click();

        return new SearchResultPageObject(driver);
    }

    public FindJobsPageObject searchForCareers() {
        WebElement searchcareer = driver.findElement(By.xpath("//a[@href='https://www.amazon.jobs/en-gb']"));
        searchcareer.click();
        return new FindJobsPageObject(driver);
    }

    }

