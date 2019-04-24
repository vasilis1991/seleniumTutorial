package uk.gov.bptds.seleniumtutorial.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JetTwoHomePage {
    private WebDriver driver;

    public JetTwoHomePage(WebDriver driver){
        this.driver = driver;
    }

    public FirstLandingPage landPage(){

        WebElement oneWayButton = driver.findElement(By.xpath("//*[@id=\"search-panel\"]/div[1]/div/div/form/div[2]/div[3]/div/label/input"));
        oneWayButton.click();

        return new FirstLandingPage(driver);
    }
}
