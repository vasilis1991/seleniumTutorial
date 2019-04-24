package uk.gov.bptds.seleniumtutorial.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CMSValidationPageObject {
    private WebDriver driver;
    private WebDriverWait wait;




    public CMSValidationPageObject(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, 400);


    }

    public CMSValidationScreenOne validateNewCMSId(){
        System.out.println("This is the CMS Validation page");

        WebElement newActivityPlusButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@title='Activity:New']")));
        newActivityPlusButton.click();

        System.out.println("Here we should click to activate the password");

        driver.findElement(By.xpath("//div//input[@un='Activity #']")).click();

        WebElement differentPlace = driver.findElement(By.xpath("//input[@rn='CMECCMSId']"));
        differentPlace.click();

        System.out.println("Here we already click once");

        return new CMSValidationScreenOne(driver);
    }
}

