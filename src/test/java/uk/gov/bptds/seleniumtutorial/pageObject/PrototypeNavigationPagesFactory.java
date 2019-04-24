package uk.gov.bptds.seleniumtutorial.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PrototypeNavigationPagesFactory {
    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"main-content\"]/div[2]/div/table/thead/tr[2]/td[1]/a")
    WebElement prototypesel1;

    public PrototypeNavigationPagesFactory(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void setPrototypesel1(){
        prototypesel1.click();
    }
}
