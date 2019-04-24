package uk.gov.bptds.seleniumtutorial.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PrototypeNavigationPages {
    private WebDriver driver;

    public PrototypeNavigationPages(WebDriver driver) {

        this.driver = driver;
    }

    public ApplyToTheChildMaintenanceServiceObject prototypeVersionSelection1() {


        WebElement prototypesel1 = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[2]/div/table/thead/tr[2]/td[1]/a"));
        prototypesel1.click();

        return new ApplyToTheChildMaintenanceServiceObject(driver);
    }
}
