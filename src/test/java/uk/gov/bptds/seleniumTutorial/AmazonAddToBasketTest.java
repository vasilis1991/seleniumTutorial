package uk.gov.bptds.seleniumTutorial;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import uk.gov.bptds.seleniumTutorial.PageObject.AmazonHomePagePageObject;
import uk.gov.bptds.seleniumTutorial.PageObject.SearchResultPageObject;

import java.util.List;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class AmazonAddToBasketTest {
    private WebDriver driver;
    @Before
    //Initiation of Chrome Driver
    public void setUp(){
        System.setProperty("webdriver.chrome.driver",
                this.getClass().getClassLoader().getResource("chromedriver").getPath());
        driver = new ChromeDriver();
        driver.get("https://www.amazon.co.uk");
        driver.manage().window().maximize();
    }
    @Test
    //This is to take tha main url
    public void testSearchForProductAndAddToBasket(){
        //assertThat("url is wrong", driver.getCurrentUrl(), is("https://www.amazon.co.uk/"));
        AmazonHomePagePageObject amazonHomePagePageObject = new AmazonHomePagePageObject(driver);
        SearchResultPageObject searchResultPageObject = amazonHomePagePageObject.searchForItem("author");
        searchResultPageObject.FindSpecificItemFromSearchResultsByTtile("The Book of Forgotten Authors");


        assertThat("Not on book product page", driver.getTitle(), containsString("The Book of Forgotten Authors"));
        //WebElement addBasket = driver.findElement(By.id("add-to-cart-button"));
        //addBasket.click();
        //WebElement proceedCheckout = driver.findElement(By.cssSelector("#hlb-ptc-btn-native-bottom"));
        //proceedCheckout.click();
        //assertThat("url is correct", driver.getCurrentUrl(), is("https://www.amazon.co.uk/ap/signin?_encoding=UTF8&openid.assoc_handle=amazon_checkout_gb&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.co.uk%2Fgp%2Fbuy%2Fsignin%2Fhandlers%2Fcontinue.html%3Fie%3DUTF8%26brandId%3D%26cartItemIds%3D%26eGCApp%3D%26hasWorkingJavascript%3D0%26isEGCOrder%3D0%26isFresh%3D0%26oldCustomerId%3D%26oldPurchaseId%3D%26preInitiateCustomerId%3D%26purchaseInProgress%3D%26ref_%3Dcart_signin_submit%26siteDesign%3D&pageId=amazon_checkout_gb&showRmrMe=0&siteState=isRegularCheckout.1%7CIMBMsgs.%7CisRedirect.0"));


    }
    @After
    //This is to turn down the window
    public void turnDown(){
        driver.quit();
    }


}

