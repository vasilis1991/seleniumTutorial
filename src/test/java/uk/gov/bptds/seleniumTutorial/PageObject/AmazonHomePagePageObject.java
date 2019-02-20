package uk.gov.bptds.seleniumTutorial.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class AmazonHomePagePageObject {
    private WebDriver driver;

    public AmazonHomePagePageObject(WebDriver driver) {

        this.driver = driver;
    }


    public void searchForItem(String searchTerm) {

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(searchTerm);
        driver.findElement(By.cssSelector("#nav-search > form > div.nav-right > div > input")).click();
    }

}
