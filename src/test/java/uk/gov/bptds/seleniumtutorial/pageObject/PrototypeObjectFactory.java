package uk.gov.bptds.seleniumtutorial.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PrototypeObjectFactory {
    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"main-content\"]/div[2]/div/table/tbody/tr[5]/td[1]/a")
    WebElement prototypesel;

    public PrototypeObjectFactory(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void setPrototypesel(){
        prototypesel.click();
    }
}
