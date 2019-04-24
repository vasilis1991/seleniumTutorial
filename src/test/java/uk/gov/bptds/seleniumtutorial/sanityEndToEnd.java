package uk.gov.bptds.seleniumtutorial;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import uk.gov.bptds.seleniumtutorial.pageObject.*;

public class sanityEndToEnd {
    private WebDriver driver;
    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", this.getClass().getClassLoader().getResource("chromedriver").getPath());
        driver = new ChromeDriver();
        driver.get("http://10.30.20.10:8080/epublicsectoroui_enu/start.swe?SWECmd=AutoOn");
        driver.manage().window().maximize();
    }
    @Test
    public void siebelCreationTest() {
        LoginPageSiebel loginPageSiebel = new LoginPageSiebel(driver);
        HomeScreenSiebelPageObject homeScreenSiebelPageObject = loginPageSiebel.homePageSiebel("50000033","sit_50000033");
        CMSValidationPageObject cmsValidationPageObject = homeScreenSiebelPageObject.cmsVal();
        CMSValidationScreenOne cmsValidationScreenOne = cmsValidationPageObject.validateNewCMSId();
        CMSValidationScreenTwo cmsValidationScreenTwo = cmsValidationScreenOne.cmsValTwo();
    }

    @After
    public void tearDown() {
        //driver.quit();
    }

}
