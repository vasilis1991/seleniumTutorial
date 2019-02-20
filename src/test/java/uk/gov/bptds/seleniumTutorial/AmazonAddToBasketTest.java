package uk.gov.bptds.seleniumTutorial;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

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
    }
    @Test
    //This is to take tha main url
    public void testSearchForProductAndAddToBasket(){
        driver.get("https://www.amazon.co.uk");
        assertThat("url is wrong", driver.getCurrentUrl(), is("https://www.amazon.co.uk/"));

    }
    @After
    //This is to turn down the window
    public void turnDown(){
        driver.quit();
    }


}

