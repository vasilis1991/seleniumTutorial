package uk.gov.bptds.seleniumtutorial.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomeScreenSiebelPageObject {
    private WebDriver driver;
    private WebDriverWait wait;

    public HomeScreenSiebelPageObject(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, 190);
    }

    public CMSValidationPageObject cmsVal(){
        System.out.println("This is the Siebel Home page");
        WebElement editLay =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@un='Edit Layout']")));

        WebElement cmsValidationHomePageButton = driver.findElements(By.cssSelector("#s_sctrl_tabScreen>ul>li>a")).get(9);
        cmsValidationHomePageButton.click();

        return new CMSValidationPageObject(driver);
    }
}
