package uk.gov.bptds.seleniumtutorial.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPageObject {

    private WebDriver driver;

    public ProductPageObject(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPageObject addToBasket() {

        WebElement addBasket = driver.findElement(By.id("one-click-button"));
        addBasket.click();

        return new LoginPageObject(driver);
    }

}
