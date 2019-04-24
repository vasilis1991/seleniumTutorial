package uk.gov.bptds.seleniumtutorial.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CMSValidationScreenOne {

    private WebDriver driver;
    private WebDriverWait wait;


    public CMSValidationScreenOne(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, 190);
    }

    public CMSValidationScreenTwo cmsValTwo(){
        System.out.println("This is the CMS Validation page and we try to enter val text");

        WebElement CMSReferenceID = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@rn='CMECCMSId']")));
        CMSReferenceID.click();
        CMSReferenceID.sendKeys("213");

        return new CMSValidationScreenTwo(driver);
    }
}
