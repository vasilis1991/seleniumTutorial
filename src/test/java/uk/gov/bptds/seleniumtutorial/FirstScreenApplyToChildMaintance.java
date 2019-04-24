package uk.gov.bptds.seleniumtutorial;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import uk.gov.bptds.seleniumtutorial.pageObject.*;
import uk.gov.bptds.seleniumtutorial.pageObject.Utility;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;

public class FirstScreenApplyToChildMaintance {
    private WebDriver driver;
    PrototypeObjectFactory shouldSelectPrototype;
    PrototypeNavigationPagesFactory shouldSelectPrototypeVersion;
    ApplyToTheChildMaintenanceServicePageFactory startTheChildMaintanceApplication;
    WhatIsYourInvitationCodePageFactory placeYourInvitationCode;

    //This is for the reports
    ExtentReports extent;

    ExtentTest logger;
    ExtentTest logger2;


    @Before
    public void setUp() throws Exception {
        ExtentHtmlReporter reporter = new ExtentHtmlReporter("/Users/vasileio.ntokas/Documents/seleniumTutorial/2nd page.html");
        extent = new ExtentReports();
        extent.attachReporter(reporter);
        logger = extent.createTest("Start Page");
        logger2= extent.createTest("2nd page");
        System.setProperty("webdriver.chrome.driver", this.getClass().getClassLoader().getResource("chromedriver").getPath());
        driver = new ChromeDriver();
        driver.get("https:/dwp_application01:dwp_password05@cmg-application-prototype.herokuapp.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        shouldSelectPrototype = new PrototypeObjectFactory(driver);
        shouldSelectPrototypeVersion = new PrototypeNavigationPagesFactory(driver);
        startTheChildMaintanceApplication = new ApplyToTheChildMaintenanceServicePageFactory(driver);

        shouldSelectPrototype.setPrototypesel();
        shouldSelectPrototypeVersion.setPrototypesel1();

    }
    //This test is to check that user is able to click on start button and navigate to the next page with URL""

    @Test
    public void startButtonFunctionality()throws IOException { startTheChildMaintanceApplication.setStartNowButton();
        //Assert.assertEquals("What is your invitation code?",driver.getTitle());
        /*logger.log(Status.INFO,"Apply to Child Maintenance Fist Page");
        logger.log(Status.PASS,"Start Now button is clickable and navigate appropriate to 'What is your Invitation Code Page'");
        String temp = Utility.getScreenshot(driver);
        logger.log(Status.PASS,"What is your invitation Code page", MediaEntityBuilder.createScreenCaptureFromPath(temp).build());
        extent.flush();*/
    }
    @Test
    public void checkEligibilityLinkFunctionality()throws IOException {startTheChildMaintanceApplication.checkYourEligility();
        Assert.assertEquals("https://child-maintenance.awscmg-dev.dwpcloud.uk/options/do-both-parents-usually-live-in-the-uk",driver.getCurrentUrl());
        /*logger2.log(Status.INFO,"Apply to Child Maintenance Fist Page");
        logger2.log(Status.PASS,"''Check if your are eligible' link should be clickable and navigate to 'Do both parents usually live in the UK' page");
        String temp = Utility.getScreenshot(driver);
        logger2.log(Status.PASS,"'Do both parents usually live in the UK' page", MediaEntityBuilder.createScreenCaptureFromPath(temp).build());
        extent.flush();*/}
    @Test
    public void arrangeChildMaintainceLinkFunctionality()throws IOException { startTheChildMaintanceApplication.arrangeChildMaintainceLink();
        Assert.assertEquals("https://child-maintenance.awscmg-dev.dwpcloud.uk/options/",driver.getCurrentUrl());
        /*logger2.log(Status.INFO,"Apply to Child Maintenance Fist Page");
        logger2.log(Status.PASS,"'Arrange child maintenance yourselves' link should be clickable and navigate to 'Arrange Child Maintenance' page");
        String temp = Utility.getScreenshot(driver);
        logger2.log(Status.PASS,"'Arrange Child Maintenance'", MediaEntityBuilder.createScreenCaptureFromPath(temp).build());
        extent.flush();*/}
    @Test
    public void welshLinkFunctionality() {
        startTheChildMaintanceApplication.welsh();
        Assert.assertEquals("",driver.getCurrentUrl());
    }
    @Test
    public void callChargesLinkFunctionality() {
        startTheChildMaintanceApplication.CallCharges();
        Assert.assertEquals("", driver.getCurrentUrl());
    }
    @Test
    public void mainPageTitleLinkFunctionality() {
        startTheChildMaintanceApplication.ApplyToChildMaintanceMainTitle();
        Assert.assertTrue(driver.getTitle().contains("Apply to the Child Maintenance Service"));
       }
    @Test
    public void licenceLinkFunctionality() {
        startTheChildMaintanceApplication.govermentLicenceLink();
        Assert.assertEquals("https://www.nationalarchives.gov.uk/doc/open-government-licence/version/3/",driver.getCurrentUrl());}
    @Test
    public void govUKLogotypeFunctionality() {
        startTheChildMaintanceApplication.govUKLogotyoe();
        Assert.assertEquals("",driver.getCurrentUrl());
    }
    @Test
    public void crownCopyrightLogoFunctionality() {
        startTheChildMaintanceApplication.crownCopyRightLogo();
        Assert.assertEquals("https://www.nationalarchives.gov.uk/information-management/re-using-public-sector-information/uk-government-licensing-framework/crown-copyright/",driver.getCurrentUrl());
    }

}