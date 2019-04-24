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

public class thirdWhatIsYourInvitationCodePage {
    private WebDriver driver;
    PrototypeObjectFactory shouldSelectPrototype;
    PrototypeNavigationPagesFactory shouldSelectPrototypeVersion;
    ApplyToTheChildMaintenanceServicePageFactory startTheChildMaintanceApplication;
    WhatIsYourInvitationCodePageFactory placeYourInvitationCode;
    HaveYouOrYourChildrenEverExperiencedDomesticAbusePageFactory haveYouOrYourChildrenEverExperiencedDomesticAbuseQuestion;

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
        haveYouOrYourChildrenEverExperiencedDomesticAbuseQuestion = new HaveYouOrYourChildrenEverExperiencedDomesticAbusePageFactory(driver);

        shouldSelectPrototype.setPrototypesel();
        shouldSelectPrototypeVersion.setPrototypesel1();
        startTheChildMaintanceApplication.setStartNowButton();
        placeYourInvitationCode.setInvitationCodeFld("2313");
        placeYourInvitationCode.setContinueBtn();

    }
    //This test is to check that user is able to click on start button and navigate to the next page with URL""

    @Test
    public void noExperienceDomesticAbuseButtonFunctionality() {
        haveYouOrYourChildrenEverExperiencedDomesticAbuseQuestion.setNoButtonElement();
    }
    @Test
    public void yesExperienceDomesticAbuseButtonFunctionality() {
        haveYouOrYourChildrenEverExperiencedDomesticAbuseQuestion.setYesButtonElement();
    }
    @Test
    public void noDomesticAbuseAndContinue() {
        haveYouOrYourChildrenEverExperiencedDomesticAbuseQuestion.setNoButtonElement();
        haveYouOrYourChildrenEverExperiencedDomesticAbuseQuestion.setContinueButtonElement();
    }
    @Test
    public void yesDomesticAbuseAndContinue() {
        haveYouOrYourChildrenEverExperiencedDomesticAbuseQuestion.setYesButtonElement();
        haveYouOrYourChildrenEverExperiencedDomesticAbuseQuestion.setContinueButtonElement();
    }
    @Test
    public void backButtonFunctionality() {
        haveYouOrYourChildrenEverExperiencedDomesticAbuseQuestion.clickBackButton();
    }
    @Test
    public void noDataContinueButton() {
        haveYouOrYourChildrenEverExperiencedDomesticAbuseQuestion.setContinueButtonElement();
    }
    @Test
    public void enterNoClickBack() {
        haveYouOrYourChildrenEverExperiencedDomesticAbuseQuestion.setNoButtonElement();
        haveYouOrYourChildrenEverExperiencedDomesticAbuseQuestion.clickBackButton();
    }
    @Test
    public void enterYesClickBack() {
        haveYouOrYourChildrenEverExperiencedDomesticAbuseQuestion.setYesButtonElement();
        haveYouOrYourChildrenEverExperiencedDomesticAbuseQuestion.clickBackButton();
    }
    @Test
    public void licenceLinkFunctionality() {
        startTheChildMaintanceApplication.govermentLicenceLink();
        Assert.assertEquals("https://www.nationalarchives.gov.uk/doc/open-government-lersion/3/",driver.getCurrentUrl());
    }
    @Test
    public void govUKLogotypeFunctionality() {
        startTheChildMaintanceApplication.govUKLogotyoe();
    }
    @Test
    public void crownCopyrightLogoFunctionality() {
        startTheChildMaintanceApplication.crownCopyRightLogo();
    }
    @Test
    public void TitlePageFunctionality() {
       // startTheChildMaintanceApplication.ApplyToChildMaintanceMainTitle();
    }

}
