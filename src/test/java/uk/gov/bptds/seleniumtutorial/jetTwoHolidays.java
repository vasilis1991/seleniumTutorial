package uk.gov.bptds.seleniumtutorial;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import uk.gov.bptds.seleniumtutorial.pageObject.FirstLandingPage;
import uk.gov.bptds.seleniumtutorial.pageObject.JetTwoHomePage;

import java.util.concurrent.TimeUnit;

public class jetTwoHolidays {
    private WebDriver driver;


    @Before
    public void setUp() throws Exception{
        System.setProperty("webdriver.chrome.driver", this.getClass().getClassLoader().getResource("chromedriver").getPath());
        driver = new ChromeDriver();
        driver.get("https://www.jet2.com/en");
        driver.manage().window();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    @Test
    public void holidayBookingJetTwo(){

        JetTwoHomePage jetTwoHomePage = new JetTwoHomePage(driver);
        FirstLandingPage firstLandingPage = jetTwoHomePage.landPage();

    }
}
