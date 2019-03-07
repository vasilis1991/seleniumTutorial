package uk.gov.bptds.seleniumtutorial.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePageNewUserPageFactory {
    WebDriver driver;

    @FindBy(css = "#view_container > form > div.mbekbe.bxPAYd > div > div.GtglAe > div.OZliR > div.Zf2Owf.Hj2jlf > button")
    WebElement notNowButton;

    public WelcomePageNewUserPageFactory(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void clickNotNow(){
        notNowButton.click();
    }
}
