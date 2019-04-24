package uk.gov.bptds.seleniumtutorial.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageSiebel {
    private WebDriver driver;

    public LoginPageSiebel(WebDriver driver){
        this.driver = driver;
    }

    public HomeScreenSiebelPageObject homePageSiebel(String userID, String passWord){

        WebElement userIdDetails = driver.findElement(By.cssSelector("#s_swepi_1"));
        userIdDetails.sendKeys(userID);

        WebElement passwordDetails = driver.findElement(By.cssSelector("#s_swepi_2"));
        passwordDetails.sendKeys(passWord);

        WebElement loginButton = driver.findElement(By.cssSelector(" #s_swepi_22"));
        loginButton.click();

        return new HomeScreenSiebelPageObject(driver);
    }
}
