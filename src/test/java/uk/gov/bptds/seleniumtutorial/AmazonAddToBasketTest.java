package uk.gov.bptds.seleniumtutorial;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import uk.gov.bptds.seleniumtutorial.PageObject.AddToBasketPageObject;
import uk.gov.bptds.seleniumtutorial.PageObject.AmazonHomePagePageObject;
import uk.gov.bptds.seleniumtutorial.PageObject.SearchResultPageObject;



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
        searchResultPageObject.findSpecificItemFromSearchResultsByTtile("The Book of Forgotten Authors");


        //assertThat("Not on book product page", driver.getTitle(), containsString("The Book of Forgotten Authors"));
        AddToBasketPageObject addToBasketPageObject = searchResultPageObject.addToBasket();


    }
    @After
    //This is to turn down the window
    public void turnDown(){
        driver.quit();
    }


}

