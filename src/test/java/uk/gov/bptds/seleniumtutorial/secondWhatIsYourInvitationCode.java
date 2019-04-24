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

public class secondWhatIsYourInvitationCode {
    private WebDriver driver;
    PrototypeObjectFactory shouldSelectPrototype;
    PrototypeNavigationPagesFactory shouldSelectPrototypeVersion;
    ApplyToTheChildMaintenanceServicePageFactory startTheChildMaintanceApplication;
    WhatIsYourInvitationCodePageFactory placeYourInvitationCode;

    //This is for the reports
    ExtentReports extent;
    ExtentTest logger;


    @Before
    public void setUp() throws Exception {
        ExtentHtmlReporter reporter = new ExtentHtmlReporter("/Users/vasileio.ntokas/Documents/seleniumTutorial/E2E.html");
        extent = new ExtentReports();
        extent.attachReporter(reporter);
        logger = extent.createTest("Happy scenario E2E");
        System.setProperty("webdriver.chrome.driver", this.getClass().getClassLoader().getResource("chromedriver").getPath());
        driver = new ChromeDriver();
        driver.get("https:/dwp_application01:dwp_password05@cmg-application-prototype.herokuapp.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        shouldSelectPrototype = new PrototypeObjectFactory(driver);
        shouldSelectPrototypeVersion = new PrototypeNavigationPagesFactory(driver);
        startTheChildMaintanceApplication = new ApplyToTheChildMaintenanceServicePageFactory(driver);
        placeYourInvitationCode = new WhatIsYourInvitationCodePageFactory(driver);

        shouldSelectPrototype.setPrototypesel();
        shouldSelectPrototypeVersion.setPrototypesel1();
        startTheChildMaintanceApplication.setStartNowButton();

    }
    //This test is to check that user is able to click on start button and navigate to the next page with URL""

    @Test
    public void invitationCodeFunctionality() {
       placeYourInvitationCode.setInvitationCodeFld("342432");
    }
    @Test
    public void invitationCodeNoDataFunctionality() {
       placeYourInvitationCode.setInvitationCodeFld("");
    }
    @Test
    public void validInvitationCodeAndContinue() {
        placeYourInvitationCode.setInvitationCodeFld("1234431");
        placeYourInvitationCode.setContinueBtn();

        //This is to check about the assertion in the message is displayed and is referring to link and not this specific part
        /*String expectedMessage = "The Institution is deleted Successfully!";
        String message = driver.findElement(By.xpath("//div[contains(@class,'callout callout-success')]")).getText();
        Assert.assertTrue("Your error message", message.contains(expectedMessage));*/
    }
    @Test
    public void notValidInvitationCodeaAndContinue() {
        placeYourInvitationCode.setInvitationCodeFld("12344saddsads31");
        placeYourInvitationCode.setContinueBtn();
    }
    @Test
    public void emptyInvitationCodeAndContinue() {
        placeYourInvitationCode.setInvitationCodeFld("");
        placeYourInvitationCode.setContinueBtn();
    }
    @Test
    public void backButtonFunctionality() {
        placeYourInvitationCode.clickBackButton();
    }
    @Test
    public void noDataContinueButton() {
        placeYourInvitationCode.setContinueBtn();
    }
    @Test
    public void noInvitationCodeLinkNoData() {
        placeYourInvitationCode.setNoInvitationCodeLink();
    }
    @Test
    public void noInvitationCodeLinkData() {
        placeYourInvitationCode.setNoInvitationCodeLink();
    }
    @Test
    public void enterDataClickBack() {
        placeYourInvitationCode.setInvitationCodeFld("12344saddsads31");
        placeYourInvitationCode.clickBackButton();
    }
    @Test
    public void licenceLinkFunctionality() {
        placeYourInvitationCode.govermentLicenceLink();
        Assert.assertEquals("https://www.nationalarchives.gov.uk/doc/open-government-licence/version/3/",driver.getCurrentUrl());
    }
    @Test
    public void govUKLogotypeFunctionality() {
        placeYourInvitationCode.govUKLogotyoe();
        Assert.assertEquals("",driver.getCurrentUrl());
    }
    @Test
    public void crownCopyrightLogoFunctionality() {
        placeYourInvitationCode.crownCopyRightLogo();
        Assert.assertEquals("https://www.nationalarchives.gov.uk/information-management/re-using-public-sector-information/uk-government-licensing-framework/crown-copyright/",driver.getCurrentUrl());
    }

}
