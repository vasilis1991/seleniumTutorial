package uk.gov.bptds.seleniumtutorial.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YouNeedToPayA20ApplicationFeeFactory {
    WebDriver driver;

    @FindBy(xpath ="//*[@id=\"main-content\"]/div/div/a")
    WebElement agreementAndPaymentOfApplicationFee;

    public YouNeedToPayA20ApplicationFeeFactory(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void setAgreementAndPaymentOfApplicationFee(){
        agreementAndPaymentOfApplicationFee.click();
    }
}

