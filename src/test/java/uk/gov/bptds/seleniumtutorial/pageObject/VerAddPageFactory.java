package uk.gov.bptds.seleniumtutorial.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerAddPageFactory {
    WebDriver driver;

    @FindBy(css = "#c0")
    WebElement agreeToTerms;

    @FindBy(css = "#c2")
    WebElement agreeToInformation;

    @FindBy(id = "termsofserviceNext")
    WebElement finalCreateAccount;

    public VerAddPageFactory(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void clickAgreeToTerms(){

        agreeToTerms.click();
    }

    public void clickAgreeToInformation(){

        agreeToInformation.click();
    }

    public void clickFinalCreateAccount(){

        finalCreateAccount.click();
    }

}
