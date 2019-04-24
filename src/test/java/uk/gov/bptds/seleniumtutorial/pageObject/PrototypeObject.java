package uk.gov.bptds.seleniumtutorial.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PrototypeObject {
    private WebDriver driver;

    public PrototypeObject(WebDriver driver) {

        this.driver = driver;
    }

    public PrototypeNavigationPages prototypeVersionSelection() {

        WebElement prototypesel = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[2]/div/table/tbody/tr[5]/td[1]/a"));
        prototypesel.click();

        return new PrototypeNavigationPages (driver);
    }
}
