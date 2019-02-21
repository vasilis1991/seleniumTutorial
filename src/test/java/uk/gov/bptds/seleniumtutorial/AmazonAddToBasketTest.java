package uk.gov.bptds.seleniumtutorial;

import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import uk.gov.bptds.seleniumtutorial.pageObject.*;


public class AmazonAddToBasketTest {
    private WebDriver driver;

    @Before
    //Initiation of Chrome Driver
    public void setUp() {
        System.setProperty("webdriver.chrome.driver",
                this.getClass().getClassLoader().getResource("chromedriver").getPath());
        driver = new ChromeDriver();
        driver.get("https://www.amazon.co.uk");
        driver.manage().window().maximize();
    }

    @Test
    //This is to take tha main url
    public void testSearchForProductAndAddToBasket() {

        AmazonHomePagePageObject amazonHomePagePageObject = new AmazonHomePagePageObject(driver);
        SearchResultPageObject searchResultPageObject = amazonHomePagePageObject.searchForItem("author");
        ProductPageObject productPageObject = searchResultPageObject.findSpecificItemFromSearchResultsByTtile("The Book of Forgotten Authors");
        LoginPageObject loginPageObject = productPageObject.addToBasket();
//        Assert.assertEquals("https://www.amazon.co.uk/ap/signin?_encoding=UTF8&accountStatusPolicy=P1&openid.assoc_handle=gbflex&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.co.uk%2Fgp%2Fdigital%2Ffiona%2Fbuy.html%3Fie%3DUTF8%26ASIN.0%3DB01MYWEBFN%26addAyceBenefit%3D0%26addNarration%3D0%26audibleAsin%3D%26audibleOurPrice%3D%26buyActionIdentifier%3Darn%253Aaction%253Apa%253A1%253AQjAxTVlXRUJGTjpBMUY4M0c4QzJBUk83UDpCdXk6bnVsbDo0Ljk5OkdCUDpudWxs%26cor.0%3DGB%26displayedPrice%3D4.99%26displayedPriceCurrency%3DGBP%26displayedPriceCurrencyCode%3DGBP%26emailSubscriptionIdList%3D%26isPreorder%3D0%26itemCount%3D1%26offerListingID.0%3DDqA7uRuQCHD035N%252FZfY%252FXpFSvKNV6lnsIDIjkZZM36BjJRqbfXJluRVnvEnpLHYiGEyl%252FOQbTnAwvCEX7r1jNAn%252B%252B9sZADCdWk6sekkd%252BBfUPgvc6xM12ak6PjUM5zhGLcf0Qtu%252FTeH94gsd5SB4ww%253D%253D%26ref_%3Ddbs_p_ebk_r00_pbcb_cv1c00%26signInRedirect%3D1%26submit.one-click-order.x%3DBuy%2520now%26subtype.0%3DSTANDARD%26t%3Dfiona%26transactionMode%3Done-click");
    }

    @Test
    // This is to take the main URL
    public void testSearcForCareerToApply() {
        AmazonHomePagePageObject amazonHomePagePageObject = new AmazonHomePagePageObject(driver);
        FindJobsPageObject findJobsPageObject = amazonHomePagePageObject.searchForCareers();
        JobsFoundObject jobsFoundObject = findJobsPageObject.findJobByLocationAndName("software engineer", "London");
        jobsFoundObject.addFilterJobsByCategory("Software Development");
        jobsFoundObject.selectDistance(5);
        JobAndFilterPage jobLandPageToApply = jobsFoundObject.selectSpecificJob();
    }

    @After
    //This is to turn down the window
    public void tearDown() {
        driver.quit();
    }
}

