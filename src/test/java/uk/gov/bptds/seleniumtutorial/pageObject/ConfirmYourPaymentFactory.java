package uk.gov.bptds.seleniumtutorial.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmYourPaymentFactory {
    WebDriver driver;

    @FindBy(xpath ="//*[@id=\"confirm\"]")
    WebElement confirmButton;

    public ConfirmYourPaymentFactory(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public void setConfirmButton() {
        confirmButton.click();
    }
}
