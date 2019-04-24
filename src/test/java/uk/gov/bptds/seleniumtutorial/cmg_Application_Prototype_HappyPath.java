package uk.gov.bptds.seleniumtutorial;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import uk.gov.bptds.seleniumtutorial.pageObject.*;
import uk.gov.bptds.seleniumtutorial.pageObject.Utility;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;

public class cmg_Application_Prototype_HappyPath {
    private WebDriver driver;
    PrototypeObjectFactory shouldSelectPrototype;
    PrototypeNavigationPagesFactory shouldSelectPrototypeVersion;
    ApplyToTheChildMaintenanceServicePageFactory startTheChildMaintanceApplication;
    WhatIsYourInvitationCodePageFactory placeYourInvitationCode;
    HaveYouOrYourChildrenEverExperiencedDomesticAbusePageFactory haveYouOrYourChildrenEverExperiencedDomesticAbuseQuestion;
    WhatIsYourNameFactory enterYourName;
    WhatIsYourDateOfBirthFactory enterDateOfBirth;
    WhatIsYourNationalInsuranceNumberFactory enterYourNationalInsurance;
    WhatIsYourHomeAddressFactory enterYourPostCode;
    HowShouldWeContactYouFactory sayHowShouldWeContactYou;
    CheckYourAnswerSoFarFactory checkYourAnswersAndContinue;
    IsThereACourtOrderOrConsentOrderForChildMaintenanceInPlaceFactory sayIfThereIsAnyChildCourtOrder;
    WhatIsTheChildsNameFactory enterChildNameAndTellUsAboutAdditionChildren;
    WhatIsTheChildsDOBFactory enterChildDateOfBirth;
    HowOftenDoesChildStayOvernightWithTheOtherParentEachWeekFactory enterHowOftenChildStaysOvernight;
    CheckYourAnswersSoFarFirstChildrenFactory checkYourAnswerForFirstChildAndContinue;
    YouHaveToldUsAboutSpecificClildrenFactory sayIfYouNeedToAddAnotherChild;
    WhatIsTheOtherParentsNameFactory enterOtherParentsName;
    WhatIsYourDateOfBirthFactory enterOtherParentsDateOfBirth;
    WhatIsYourNationalInsuranceNumberFactory enterOtherParentsNationalInsurance;
    WhatIsTheOtherParentsHomeAddressFactory enterOtherParentsHomeAddress;
    WhatIsTheOtherParentsPhoneNumberFactory enterOtherParentsPhoneNumber;
    CheckYourAnswersSoFar3Factory checkOtherParentsDetailsAndContinue;
    HowWouldYouLikeChildMaintenanceToBePaidFactory selectPaymentMethod;
    YourBankAccountDetailsFactory enterYourBankAccountDetails;
    WhatIsYourRollNumberFactory enterYourRollNumber;
    CheckYourAnswersFactory checkYourAnswersForTheWholeApplication;
    YouNeedToPayA20ApplicationFeeFactory shouldAgreeAndConfirmForPayment;
    EnterCardDetailsFactory shouldEnterCardDetails;
    ConfirmYourPaymentFactory confirmTheFinalPayment;

    //This is for the reports
    ExtentReports extent;
    ExtentTest logger;


    //This is when we have to check about global tests for example not local environments
    //public String applicationURL = "";

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

    }


    //Happy Path Journey according to the diagram in blackboard
    @Test
    public void prototypeCmgApplicationHappyPath() throws IOException {
        PrototypeObject prototypeObject = new PrototypeObject(driver);
        PrototypeNavigationPages prototypeNavigationPages = prototypeObject.prototypeVersionSelection();
        ApplyToTheChildMaintenanceServiceObject applyToTheChildMaintenanceServiceObject = prototypeNavigationPages.prototypeVersionSelection1();
        WhatIsYourInvitationCode whatIsYourInvitationCode = applyToTheChildMaintenanceServiceObject.startNowButton();
        HaveYouOrYourChildrenEverExperiencedDomesticAbuse haveYouOrYourChildrenEverExperiencedDomesticAbuse = whatIsYourInvitationCode.invitationAndContinueButton();
        WhatIsYourNameObject whatIsYourNameObject = haveYouOrYourChildrenEverExperiencedDomesticAbuse.noButton();
        WhatIsYourDateOfBirth whatIsYourDateOfBirth = whatIsYourNameObject.noButton("Mr", "Vasileios", "Panagiotis", "Ntokas");
        WhatIsYourNationalInsuranceNumber whatIsYourNationalInsuranceNumber = whatIsYourDateOfBirth.dateOfBirth("01", "01", "1976");
        WhatIsYourHomeAddress whatIsYourHomeAddress = whatIsYourNationalInsuranceNumber.nationalInsNo("23123");
        HowShouldWeContactYou howShouldWeContactYou = whatIsYourHomeAddress.postcode("ne14ly");
        CheckYourAnswersSoFar checkYourAnswersSoFar11 = howShouldWeContactYou.phoneContact("07544917240");
        CheckYourAnswersSoFar checkYourAnswersSoFar22 = howShouldWeContactYou.postContact();
        CheckYourAnswersSoFar checkYourAnswersSoFar33 = howShouldWeContactYou.continueToCheckYourAnswer();
        IsThereACourtOrderOrConsentOrderForChildMaintenanceInPlace isThereACourtOrderOrConsentOrderForChildMaintenanceInPlace = checkYourAnswersSoFar33.checkAnswersAndContinue();
        WhatIsTheChildsName whatIsTheChildsName = isThereACourtOrderOrConsentOrderForChildMaintenanceInPlace.noCourtOrderButton();
        WhatIsTheChildsDOB whatIsTheChildsDOB = whatIsTheChildsName.childNameDetailsNoAdditionalChild("SADA", "AASDA", "SADAS");
        HowOftenDoesChildStayOvernightWithTheOtherParentEachWeek howOftenDoesChildStayOvernightWithTheOtherParentEachWeek = whatIsTheChildsDOB.child1DateOfBirth("01", "01", "2010");
        CheckYourAnswersSoFarFirstChildren checkYourAnswersSoFarFirstChildren = howOftenDoesChildStayOvernightWithTheOtherParentEachWeek.moreThanThreeNightsAWeek();
        YouHaveToldUsAboutSpecificClildren youHaveToldUsAboutSpecificClildren = checkYourAnswersSoFarFirstChildren.continueButton();
        WhatIsTheOtherParentsName whatIsTheOtherParentsName = youHaveToldUsAboutSpecificClildren.noAdditionalChildAndContinueButton();
        WhatIsTheOtherParentsDateOfBirth whatIsTheOtherParentsDateOfBirth = whatIsTheOtherParentsName.otherParentsName("Professor", "Kostas", "zak", "rise");
        WhatIsTheOtherParentsNationalInsuranceNumber whatIsTheOtherParentsNationalInsuranceNumber = whatIsTheOtherParentsDateOfBirth.otherParentsBirthDetails("21", "03", "1991");
        WhatIsTheOtherParentsHomeAddress whatIsTheOtherParentsHomeAddress = whatIsTheOtherParentsNationalInsuranceNumber.nationalInsurance("18320101");
        WhatIsTheOtherParentsPhoneNumber whatIsTheOtherParentsPhoneNumber = whatIsTheOtherParentsHomeAddress.otherParentsAddress("24", "Gallen House", "Newcastle", "Newcastle", "ne15ug");
        CheckYourAnswersSoFar3 checkYourAnswersSoFar3 = whatIsTheOtherParentsPhoneNumber.otherParentsPhoneNumber("07544917240");
        HowWouldYouLikeChildMaintenanceToBePaid howWouldYouLikeChildMaintenanceToBePaid = checkYourAnswersSoFar3.checkAndContinue();
        YourBankAccountDetails yourBankAccountDetails = howWouldYouLikeChildMaintenanceToBePaid.collectPaymentOption();
        WhatIsYourRollNumber whatIsYourRollNumber = yourBankAccountDetails.enterBankAccountDetails("vasileios", "12", "13", "14", "1444444");
        CheckYourAnswers checkYourAnswers = whatIsYourRollNumber.enterRollNumber("21233231");
        YouNeedToPayA20ApplicationFee youNeedToPayA20ApplicationFee = checkYourAnswers.checkAnswersAndContinue();
        EnterCardDetails enterCardDetails = youNeedToPayA20ApplicationFee.agreePayFeeAndSendApplication();
        ConfirmYourPayment confirmYourPayment = enterCardDetails.enterCardDet("4242424242424242", "03", "22", "Vasileios", "112", "United Kingdom", "13", "Friars", "Newcastle", "NE15UG", "");
        EndOfProgress endOfProgress = confirmYourPayment.confirmPaymentButton();
        logger.log(Status.INFO,"happy scenario");
        logger.log(Status.PASS,"final page");
        String temp = Utility.getScreenshot(driver);
        logger.log(Status.PASS,"e2e", MediaEntityBuilder.createScreenCaptureFromPath(temp).build());
        extent.flush();




    }
    @Test
    public void pageFactory() {
      shouldSelectPrototype.setPrototypesel();
      shouldSelectPrototypeVersion.setPrototypesel1();
      startTheChildMaintanceApplication.setStartNowButton();
      placeYourInvitationCode.setInvitationCodeFld("1588888222");
      placeYourInvitationCode.setContinueBtn();
      haveYouOrYourChildrenEverExperiencedDomesticAbuseQuestion.setNoButtonElement();
      haveYouOrYourChildrenEverExperiencedDomesticAbuseQuestion.setContinueButtonElement();
      enterYourName.setTitle("Mr");
      enterYourName.setFirstName("Vasileios");
      enterYourName.setMiddleName("Panagiotis");
      enterYourName.setLastName("Ntokas");
      enterYourName.setContinueButtonElement();
      enterDateOfBirth.setDayOfBirth("21");
      enterDateOfBirth.setMonthOfBirth("03");
      enterDateOfBirth.setYearOfBirth("1990");
      enterDateOfBirth.setContinueButtonElement();
      enterYourNationalInsurance.setNatInsNum("1299900");
      enterYourNationalInsurance.setContinueButtonElement();
      enterYourPostCode.setHomePostCode("Ne14LY");
      enterYourPostCode.setContinueButtonElement();
      enterYourPostCode.setContinueButtonElement();



    }
    //Reported Domestic Abuse No but have ever experienced you or your children domestic abuse Yes
    @Test
    public void prototypeCmgApplicationNegativeScenario() {
        PrototypeObject prototypeObject = new PrototypeObject(driver);
        PrototypeNavigationPages prototypeNavigationPages = prototypeObject.prototypeVersionSelection();
        ApplyToTheChildMaintenanceServiceObject applyToTheChildMaintenanceServiceObject = prototypeNavigationPages.prototypeVersionSelection1();
        WhatIsYourInvitationCode whatIsYourInvitationCode = applyToTheChildMaintenanceServiceObject.startNowButton();
        HaveYouOrYourChildrenEverExperiencedDomesticAbuse haveYouOrYourChildrenEverExperiencedDomesticAbuse = whatIsYourInvitationCode.invitationAndContinueButton();
        HaveYouEverReportedThisDomesticAbuse haveYouEverReportedThisDomesticAbuse = haveYouOrYourChildrenEverExperiencedDomesticAbuse.yesButton();
        YouDoNotNeedToPayAFeeToApplyToTheChildMaintenance youDoNotNeedToPayAFeeToApplyToTheChildMaintenance = haveYouEverReportedThisDomesticAbuse.noButton();
        WhatIsYourNameObject whatIsYourNameObject = youDoNotNeedToPayAFeeToApplyToTheChildMaintenance.continueButton();
        WhatIsYourDateOfBirth whatIsYourDateOfBirth = whatIsYourNameObject.noButton("Mr", "Vasileios", "Panagiotis", "Ntokas");
        WhatIsYourNationalInsuranceNumber whatIsYourNationalInsuranceNumber = whatIsYourDateOfBirth.dateOfBirth("01", "01", "1976");
        WhatIsYourHomeAddress whatIsYourHomeAddress = whatIsYourNationalInsuranceNumber.nationalInsNo("23123");
        HowShouldWeContactYou howShouldWeContactYou = whatIsYourHomeAddress.postcode("ne14ly");
        CheckYourAnswersSoFar checkYourAnswersSoFar11 = howShouldWeContactYou.phoneContact("07544917240");
        CheckYourAnswersSoFar checkYourAnswersSoFar22 = howShouldWeContactYou.postContact();
        CheckYourAnswersSoFar checkYourAnswersSoFar33 = howShouldWeContactYou.continueToCheckYourAnswer();
        IsThereACourtOrderOrConsentOrderForChildMaintenanceInPlace isThereACourtOrderOrConsentOrderForChildMaintenanceInPlace = checkYourAnswersSoFar33.checkAnswersAndContinue();
        WhatIsTheChildsName whatIsTheChildsName = isThereACourtOrderOrConsentOrderForChildMaintenanceInPlace.noCourtOrderButton();
        WhatIsTheChildsDOB whatIsTheChildsDOB = whatIsTheChildsName.childNameDetailsNoAdditionalChild("SADA", "AASDA", "SADAS");
        HowOftenDoesChildStayOvernightWithTheOtherParentEachWeek howOftenDoesChildStayOvernightWithTheOtherParentEachWeek = whatIsTheChildsDOB.child1DateOfBirth("01", "01", "2010");
        CheckYourAnswersSoFarFirstChildren checkYourAnswersSoFarFirstChildren = howOftenDoesChildStayOvernightWithTheOtherParentEachWeek.moreThanThreeNightsAWeek();
        YouHaveToldUsAboutSpecificClildren youHaveToldUsAboutSpecificClildren = checkYourAnswersSoFarFirstChildren.continueButton();
        WhatIsTheOtherParentsName whatIsTheOtherParentsName = youHaveToldUsAboutSpecificClildren.noAdditionalChildAndContinueButton();
        WhatIsTheOtherParentsDateOfBirth whatIsTheOtherParentsDateOfBirth = whatIsTheOtherParentsName.otherParentsName("Professor", "Kostas", "zak", "rise");
        WhatIsTheOtherParentsNationalInsuranceNumber whatIsTheOtherParentsNationalInsuranceNumber = whatIsTheOtherParentsDateOfBirth.otherParentsBirthDetails("21", "03", "1991");
        WhatIsTheOtherParentsHomeAddress whatIsTheOtherParentsHomeAddress = whatIsTheOtherParentsNationalInsuranceNumber.nationalInsurance("18320101");
        WhatIsTheOtherParentsPhoneNumber whatIsTheOtherParentsPhoneNumber = whatIsTheOtherParentsHomeAddress.otherParentsAddress("24", "Gallen House", "Newcastle", "Newcastle", "ne15ug");
        CheckYourAnswersSoFar3 checkYourAnswersSoFar3 = whatIsTheOtherParentsPhoneNumber.otherParentsPhoneNumber("07544917240");
        HowWouldYouLikeChildMaintenanceToBePaid howWouldYouLikeChildMaintenanceToBePaid = checkYourAnswersSoFar3.checkAndContinue();
        YourBankAccountDetails yourBankAccountDetails = howWouldYouLikeChildMaintenanceToBePaid.collectPaymentOption();
        WhatIsYourRollNumber whatIsYourRollNumber = yourBankAccountDetails.enterBankAccountDetails("vasileios", "12", "13", "14", "1444444");
        CheckYourAnswers checkYourAnswers = whatIsYourRollNumber.enterRollNumber("21233231");
        DeclarePageObject declarePageObject = checkYourAnswers.checkAnswersAndContinueToDeclare();
        EndOfProgress endOfProgress = declarePageObject.agreeSendApplication();

    }

    //Have you ever experienced YES and Reported Domestic Abuse YES - Accept Declaration and send application
    @Test
    public void prototypeCmgApplicationNegativeScenario1() {
        PrototypeObject prototypeObject = new PrototypeObject(driver);
        PrototypeNavigationPages prototypeNavigationPages = prototypeObject.prototypeVersionSelection();
        ApplyToTheChildMaintenanceServiceObject applyToTheChildMaintenanceServiceObject = prototypeNavigationPages.prototypeVersionSelection1();
        WhatIsYourInvitationCode whatIsYourInvitationCode = applyToTheChildMaintenanceServiceObject.startNowButton();
        HaveYouOrYourChildrenEverExperiencedDomesticAbuse haveYouOrYourChildrenEverExperiencedDomesticAbuse = whatIsYourInvitationCode.invitationAndContinueButton();
        HaveYouEverReportedThisDomesticAbuse haveYouEverReportedThisDomesticAbuse = haveYouOrYourChildrenEverExperiencedDomesticAbuse.yesButton();
        YouDoNotNeedToPayAFeeToApplyToTheChildMaintenance youDoNotNeedToPayAFeeToApplyToTheChildMaintenance = haveYouEverReportedThisDomesticAbuse.yesButton();
        WhatIsYourNameObject whatIsYourNameObject = youDoNotNeedToPayAFeeToApplyToTheChildMaintenance.continueButton();
        WhatIsYourDateOfBirth whatIsYourDateOfBirth = whatIsYourNameObject.noButton("Mr", "Vasileios", "Panagiotis", "Ntokas");
        WhatIsYourNationalInsuranceNumber whatIsYourNationalInsuranceNumber = whatIsYourDateOfBirth.dateOfBirth("01", "01", "1976");
        WhatIsYourHomeAddress whatIsYourHomeAddress = whatIsYourNationalInsuranceNumber.nationalInsNo("23123");
        HowShouldWeContactYou howShouldWeContactYou = whatIsYourHomeAddress.postcode("ne14ly");
        CheckYourAnswersSoFar checkYourAnswersSoFar11 = howShouldWeContactYou.phoneContact("07544917240");
        CheckYourAnswersSoFar checkYourAnswersSoFar22 = howShouldWeContactYou.postContact();
        CheckYourAnswersSoFar checkYourAnswersSoFar33 = howShouldWeContactYou.continueToCheckYourAnswer();
        IsThereACourtOrderOrConsentOrderForChildMaintenanceInPlace isThereACourtOrderOrConsentOrderForChildMaintenanceInPlace = checkYourAnswersSoFar33.checkAnswersAndContinue();
        WhatIsTheChildsName whatIsTheChildsName = isThereACourtOrderOrConsentOrderForChildMaintenanceInPlace.noCourtOrderButton();
        WhatIsTheChildsDOB whatIsTheChildsDOB = whatIsTheChildsName.childNameDetailsNoAdditionalChild("SADA", "AASDA", "SADAS");
        HowOftenDoesChildStayOvernightWithTheOtherParentEachWeek howOftenDoesChildStayOvernightWithTheOtherParentEachWeek = whatIsTheChildsDOB.child1DateOfBirth("01", "01", "2010");
        CheckYourAnswersSoFarFirstChildren checkYourAnswersSoFarFirstChildren = howOftenDoesChildStayOvernightWithTheOtherParentEachWeek.moreThanThreeNightsAWeek();
        YouHaveToldUsAboutSpecificClildren youHaveToldUsAboutSpecificClildren = checkYourAnswersSoFarFirstChildren.continueButton();
        WhatIsTheOtherParentsName whatIsTheOtherParentsName = youHaveToldUsAboutSpecificClildren.noAdditionalChildAndContinueButton();
        WhatIsTheOtherParentsDateOfBirth whatIsTheOtherParentsDateOfBirth = whatIsTheOtherParentsName.otherParentsName("Professor", "Kostas", "zak", "rise");
        WhatIsTheOtherParentsNationalInsuranceNumber whatIsTheOtherParentsNationalInsuranceNumber = whatIsTheOtherParentsDateOfBirth.otherParentsBirthDetails("21", "03", "1991");
        WhatIsTheOtherParentsHomeAddress whatIsTheOtherParentsHomeAddress = whatIsTheOtherParentsNationalInsuranceNumber.nationalInsurance("18320101");
        WhatIsTheOtherParentsPhoneNumber whatIsTheOtherParentsPhoneNumber = whatIsTheOtherParentsHomeAddress.otherParentsAddress("24", "Gallen House", "Newcastle", "Newcastle", "ne15ug");
        CheckYourAnswersSoFar3 checkYourAnswersSoFar3 = whatIsTheOtherParentsPhoneNumber.otherParentsPhoneNumber("07544917240");
        HowWouldYouLikeChildMaintenanceToBePaid howWouldYouLikeChildMaintenanceToBePaid = checkYourAnswersSoFar3.checkAndContinue();
        YourBankAccountDetails yourBankAccountDetails = howWouldYouLikeChildMaintenanceToBePaid.collectPaymentOption();
        WhatIsYourRollNumber whatIsYourRollNumber = yourBankAccountDetails.enterBankAccountDetails("vasileios", "12", "13", "14", "1444444");
        CheckYourAnswers checkYourAnswers = whatIsYourRollNumber.enterRollNumber("21233231");
        DeclarePageObject declarePageObject = checkYourAnswers.checkAnswersAndContinueToDeclare();
        EndOfProgress endOfProgress = declarePageObject.agreeSendApplication();
    }

    //Have you ever experienced YES and Reported Domestic Abuse Yes - Click after the declaration the button to navigate back to the Start Page
    @Test
    public void prototypeCmgApplicationNegativeScenario15() {
        PrototypeObject prototypeObject = new PrototypeObject(driver);
        PrototypeNavigationPages prototypeNavigationPages = prototypeObject.prototypeVersionSelection();
        ApplyToTheChildMaintenanceServiceObject applyToTheChildMaintenanceServiceObject = prototypeNavigationPages.prototypeVersionSelection1();
        WhatIsYourInvitationCode whatIsYourInvitationCode = applyToTheChildMaintenanceServiceObject.startNowButton();
        HaveYouOrYourChildrenEverExperiencedDomesticAbuse haveYouOrYourChildrenEverExperiencedDomesticAbuse = whatIsYourInvitationCode.invitationAndContinueButton();
        HaveYouEverReportedThisDomesticAbuse haveYouEverReportedThisDomesticAbuse = haveYouOrYourChildrenEverExperiencedDomesticAbuse.yesButton();
        YouDoNotNeedToPayAFeeToApplyToTheChildMaintenance youDoNotNeedToPayAFeeToApplyToTheChildMaintenance = haveYouEverReportedThisDomesticAbuse.yesButton();
        WhatIsYourNameObject whatIsYourNameObject = youDoNotNeedToPayAFeeToApplyToTheChildMaintenance.continueButton();
        WhatIsYourDateOfBirth whatIsYourDateOfBirth = whatIsYourNameObject.noButton("Mr", "Vasileios", "Panagiotis", "Ntokas");
        WhatIsYourNationalInsuranceNumber whatIsYourNationalInsuranceNumber = whatIsYourDateOfBirth.dateOfBirth("01", "01", "1976");
        WhatIsYourHomeAddress whatIsYourHomeAddress = whatIsYourNationalInsuranceNumber.nationalInsNo("23123");
        HowShouldWeContactYou howShouldWeContactYou = whatIsYourHomeAddress.postcode("ne14ly");
        CheckYourAnswersSoFar checkYourAnswersSoFar11 = howShouldWeContactYou.phoneContact("07544917240");
        CheckYourAnswersSoFar checkYourAnswersSoFar22 = howShouldWeContactYou.postContact();
        CheckYourAnswersSoFar checkYourAnswersSoFar33 = howShouldWeContactYou.continueToCheckYourAnswer();
        IsThereACourtOrderOrConsentOrderForChildMaintenanceInPlace isThereACourtOrderOrConsentOrderForChildMaintenanceInPlace = checkYourAnswersSoFar33.checkAnswersAndContinue();
        WhatIsTheChildsName whatIsTheChildsName = isThereACourtOrderOrConsentOrderForChildMaintenanceInPlace.noCourtOrderButton();
        WhatIsTheChildsDOB whatIsTheChildsDOB = whatIsTheChildsName.childNameDetailsNoAdditionalChild("SADA", "AASDA", "SADAS");
        HowOftenDoesChildStayOvernightWithTheOtherParentEachWeek howOftenDoesChildStayOvernightWithTheOtherParentEachWeek = whatIsTheChildsDOB.child1DateOfBirth("01", "01", "2010");
        CheckYourAnswersSoFarFirstChildren checkYourAnswersSoFarFirstChildren = howOftenDoesChildStayOvernightWithTheOtherParentEachWeek.moreThanThreeNightsAWeek();
        YouHaveToldUsAboutSpecificClildren youHaveToldUsAboutSpecificClildren = checkYourAnswersSoFarFirstChildren.continueButton();
        WhatIsTheOtherParentsName whatIsTheOtherParentsName = youHaveToldUsAboutSpecificClildren.noAdditionalChildAndContinueButton();
        WhatIsTheOtherParentsDateOfBirth whatIsTheOtherParentsDateOfBirth = whatIsTheOtherParentsName.otherParentsName("Professor", "Kostas", "zak", "rise");
        WhatIsTheOtherParentsNationalInsuranceNumber whatIsTheOtherParentsNationalInsuranceNumber = whatIsTheOtherParentsDateOfBirth.otherParentsBirthDetails("21", "03", "1991");
        WhatIsTheOtherParentsHomeAddress whatIsTheOtherParentsHomeAddress = whatIsTheOtherParentsNationalInsuranceNumber.nationalInsurance("18320101");
        WhatIsTheOtherParentsPhoneNumber whatIsTheOtherParentsPhoneNumber = whatIsTheOtherParentsHomeAddress.otherParentsAddress("24", "Gallen House", "Newcastle", "Newcastle", "ne15ug");
        CheckYourAnswersSoFar3 checkYourAnswersSoFar3 = whatIsTheOtherParentsPhoneNumber.otherParentsPhoneNumber("07544917240");
        HowWouldYouLikeChildMaintenanceToBePaid howWouldYouLikeChildMaintenanceToBePaid = checkYourAnswersSoFar3.checkAndContinue();
        YourBankAccountDetails yourBankAccountDetails = howWouldYouLikeChildMaintenanceToBePaid.collectPaymentOption();
        WhatIsYourRollNumber whatIsYourRollNumber = yourBankAccountDetails.enterBankAccountDetails("vasileios", "12", "13", "14", "1444444");
        CheckYourAnswers checkYourAnswers = whatIsYourRollNumber.enterRollNumber("21233231");
        DeclarePageObject declarePageObject = checkYourAnswers.checkAnswersAndContinueToDeclare();
        ApplyToTheChildMaintenanceServiceObject applyToTheChildMaintenanceServiceObject1 = declarePageObject.returnToStartPage();
    }


    //Address Lookup - postcode is not valid, enter address details
    @Test
    public void prototypeCmgApplicationNegativeScenario2() {
        PrototypeObject prototypeObject = new PrototypeObject(driver);
        PrototypeNavigationPages prototypeNavigationPages = prototypeObject.prototypeVersionSelection();
        ApplyToTheChildMaintenanceServiceObject applyToTheChildMaintenanceServiceObject = prototypeNavigationPages.prototypeVersionSelection1();
        WhatIsYourInvitationCode whatIsYourInvitationCode = applyToTheChildMaintenanceServiceObject.startNowButton();
        HaveYouOrYourChildrenEverExperiencedDomesticAbuse haveYouOrYourChildrenEverExperiencedDomesticAbuse = whatIsYourInvitationCode.invitationAndContinueButton();
        WhatIsYourNameObject whatIsYourNameObject = haveYouOrYourChildrenEverExperiencedDomesticAbuse.noButton();
        WhatIsYourDateOfBirth whatIsYourDateOfBirth = whatIsYourNameObject.noButton("Mr", "Vasileios", "Panagiotis", "Ntokas");
        WhatIsYourNationalInsuranceNumber whatIsYourNationalInsuranceNumber = whatIsYourDateOfBirth.dateOfBirth("01", "01", "1976");
        WhatIsYourHomeAddress whatIsYourHomeAddress = whatIsYourNationalInsuranceNumber.nationalInsNo("23123");
        ManuallyWhatIsYourAddress manuallyWhatIsYourAddress = whatIsYourHomeAddress.linkToEnterAddressMannualy("ne14ly");
    }

    //Address Lookup - postcode is not valid, enter address details - UK Address - full end to end
    @Test
    public void prototypeCmgApplicationNegativeScenario3() {
        PrototypeObject prototypeObject = new PrototypeObject(driver);
        PrototypeNavigationPages prototypeNavigationPages = prototypeObject.prototypeVersionSelection();
        ApplyToTheChildMaintenanceServiceObject applyToTheChildMaintenanceServiceObject = prototypeNavigationPages.prototypeVersionSelection1();
        WhatIsYourInvitationCode whatIsYourInvitationCode = applyToTheChildMaintenanceServiceObject.startNowButton();
        HaveYouOrYourChildrenEverExperiencedDomesticAbuse haveYouOrYourChildrenEverExperiencedDomesticAbuse = whatIsYourInvitationCode.invitationAndContinueButton();
        WhatIsYourNameObject whatIsYourNameObject = haveYouOrYourChildrenEverExperiencedDomesticAbuse.noButton();
        WhatIsYourDateOfBirth whatIsYourDateOfBirth = whatIsYourNameObject.noButton("Mr", "Vasileios", "Panagiotis", "Ntokas");
        WhatIsYourNationalInsuranceNumber whatIsYourNationalInsuranceNumber = whatIsYourDateOfBirth.dateOfBirth("01", "01", "1976");
        WhatIsYourHomeAddress whatIsYourHomeAddress = whatIsYourNationalInsuranceNumber.nationalInsNo("23123");
        ManuallyWhatIsYourAddress manuallyWhatIsYourAddress = whatIsYourHomeAddress.linkToEnterAddressMannualy("ne14ly");
        HowShouldWeContactYou howShouldWeContactYou = manuallyWhatIsYourAddress.UKFullAddress("18 Victoria Street", "", "Newcastle upon Tyne", "Tyne and Wear", "England", "NE14LY");
        CheckYourAnswersSoFar checkYourAnswersSoFar11 = howShouldWeContactYou.phoneContact("07544917240");
        CheckYourAnswersSoFar checkYourAnswersSoFar22 = howShouldWeContactYou.postContact();
        CheckYourAnswersSoFar checkYourAnswersSoFar33 = howShouldWeContactYou.continueToCheckYourAnswer();
        IsThereACourtOrderOrConsentOrderForChildMaintenanceInPlace isThereACourtOrderOrConsentOrderForChildMaintenanceInPlace = checkYourAnswersSoFar33.checkAnswersAndContinue();
        WhatIsTheChildsName whatIsTheChildsName = isThereACourtOrderOrConsentOrderForChildMaintenanceInPlace.noCourtOrderButton();
        WhatIsTheChildsDOB whatIsTheChildsDOB = whatIsTheChildsName.childNameDetailsNoAdditionalChild("SADA", "AASDA", "SADAS");
        HowOftenDoesChildStayOvernightWithTheOtherParentEachWeek howOftenDoesChildStayOvernightWithTheOtherParentEachWeek = whatIsTheChildsDOB.child1DateOfBirth("01", "01", "2010");
        CheckYourAnswersSoFarFirstChildren checkYourAnswersSoFarFirstChildren = howOftenDoesChildStayOvernightWithTheOtherParentEachWeek.moreThanThreeNightsAWeek();
        YouHaveToldUsAboutSpecificClildren youHaveToldUsAboutSpecificClildren = checkYourAnswersSoFarFirstChildren.continueButton();
        WhatIsTheOtherParentsName whatIsTheOtherParentsName = youHaveToldUsAboutSpecificClildren.noAdditionalChildAndContinueButton();
        WhatIsTheOtherParentsDateOfBirth whatIsTheOtherParentsDateOfBirth = whatIsTheOtherParentsName.otherParentsName("Professor", "Kostas", "zak", "rise");
        WhatIsTheOtherParentsNationalInsuranceNumber whatIsTheOtherParentsNationalInsuranceNumber = whatIsTheOtherParentsDateOfBirth.otherParentsBirthDetails("21", "03", "1991");
        WhatIsTheOtherParentsHomeAddress whatIsTheOtherParentsHomeAddress = whatIsTheOtherParentsNationalInsuranceNumber.nationalInsurance("18320101");
        WhatIsTheOtherParentsPhoneNumber whatIsTheOtherParentsPhoneNumber = whatIsTheOtherParentsHomeAddress.otherParentsAddress("24", "Gallen House", "Newcastle", "Newcastle", "ne15ug");
        CheckYourAnswersSoFar3 checkYourAnswersSoFar3 = whatIsTheOtherParentsPhoneNumber.otherParentsPhoneNumber("07544917240");
        HowWouldYouLikeChildMaintenanceToBePaid howWouldYouLikeChildMaintenanceToBePaid = checkYourAnswersSoFar3.checkAndContinue();
        YourBankAccountDetails yourBankAccountDetails = howWouldYouLikeChildMaintenanceToBePaid.collectPaymentOption();
        WhatIsYourRollNumber whatIsYourRollNumber = yourBankAccountDetails.enterBankAccountDetails("vasileios", "12", "13", "14", "1444444");
        CheckYourAnswers checkYourAnswers = whatIsYourRollNumber.enterRollNumber("21233231");
        YouNeedToPayA20ApplicationFee youNeedToPayA20ApplicationFee = checkYourAnswers.checkAnswersAndContinue();
        EnterCardDetails enterCardDetails = youNeedToPayA20ApplicationFee.agreePayFeeAndSendApplication();
        ConfirmYourPayment confirmYourPayment = enterCardDetails.enterCardDet("4242424242424242", "03", "22", "Vasileios", "112", "United Kingdom", "13", "Friars", "Newcastle", "NE15UG", "");
        EndOfProgress endOfProgress = confirmYourPayment.confirmPaymentButton();

    }

    //Address Lookup - postcode is not valid, enter address details - non-UK Address
    @Test
    public void prototypeCmgApplicationNegativeScenario4() {
        PrototypeObject prototypeObject = new PrototypeObject(driver);
        PrototypeNavigationPages prototypeNavigationPages = prototypeObject.prototypeVersionSelection();
        ApplyToTheChildMaintenanceServiceObject applyToTheChildMaintenanceServiceObject = prototypeNavigationPages.prototypeVersionSelection1();
        WhatIsYourInvitationCode whatIsYourInvitationCode = applyToTheChildMaintenanceServiceObject.startNowButton();
        HaveYouOrYourChildrenEverExperiencedDomesticAbuse haveYouOrYourChildrenEverExperiencedDomesticAbuse = whatIsYourInvitationCode.invitationAndContinueButton();
        WhatIsYourNameObject whatIsYourNameObject = haveYouOrYourChildrenEverExperiencedDomesticAbuse.noButton();
        WhatIsYourDateOfBirth whatIsYourDateOfBirth = whatIsYourNameObject.noButton("Mr", "Vasileios", "Panagiotis", "Ntokas");
        WhatIsYourNationalInsuranceNumber whatIsYourNationalInsuranceNumber = whatIsYourDateOfBirth.dateOfBirth("01", "01", "1976");
        WhatIsYourHomeAddress whatIsYourHomeAddress = whatIsYourNationalInsuranceNumber.nationalInsNo("23123");
        ManuallyWhatIsYourAddress manuallyWhatIsYourAddress = whatIsYourHomeAddress.linkToEnterAddressMannualy("ne14ly");
        YouCurrentlyLiveOutsideOfUKDoAnyOfTheFollowingStatementsRelateToYou youCurrentlyLiveOutsideOfUKDoAnyOfTheFollowingStatementsRelateToYou = manuallyWhatIsYourAddress.nonUKAddress("", "", "Madrid", "", "SPAIN", "");

    }

    //Address Lookup - postcode is not valid, enter address details - non-UK Address - VALID REASON FROM LIST(civil servant)
    @Test
    public void prototypeCmgApplicationNegativeScenario5() {
        PrototypeObject prototypeObject = new PrototypeObject(driver);
        PrototypeNavigationPages prototypeNavigationPages = prototypeObject.prototypeVersionSelection();
        ApplyToTheChildMaintenanceServiceObject applyToTheChildMaintenanceServiceObject = prototypeNavigationPages.prototypeVersionSelection1();
        WhatIsYourInvitationCode whatIsYourInvitationCode = applyToTheChildMaintenanceServiceObject.startNowButton();
        HaveYouOrYourChildrenEverExperiencedDomesticAbuse haveYouOrYourChildrenEverExperiencedDomesticAbuse = whatIsYourInvitationCode.invitationAndContinueButton();
        WhatIsYourNameObject whatIsYourNameObject = haveYouOrYourChildrenEverExperiencedDomesticAbuse.noButton();
        WhatIsYourDateOfBirth whatIsYourDateOfBirth = whatIsYourNameObject.noButton("Mr", "Vasileios", "Panagiotis", "Ntokas");
        WhatIsYourNationalInsuranceNumber whatIsYourNationalInsuranceNumber = whatIsYourDateOfBirth.dateOfBirth("01", "01", "1976");
        WhatIsYourHomeAddress whatIsYourHomeAddress = whatIsYourNationalInsuranceNumber.nationalInsNo("23123");
        ManuallyWhatIsYourAddress manuallyWhatIsYourAddress = whatIsYourHomeAddress.linkToEnterAddressMannualy("ne14ly");
        YouCurrentlyLiveOutsideOfUKDoAnyOfTheFollowingStatementsRelateToYou youCurrentlyLiveOutsideOfUKDoAnyOfTheFollowingStatementsRelateToYou = manuallyWhatIsYourAddress.nonUKAddress("", "", "Madrid", "", "SPAIN", "");
        HowShouldWeContactYou howShouldWeContactYou = youCurrentlyLiveOutsideOfUKDoAnyOfTheFollowingStatementsRelateToYou.youAreACivilServant();
        CheckYourAnswersSoFar checkYourAnswersSoFar11 = howShouldWeContactYou.phoneContact("07544917240");
        CheckYourAnswersSoFar checkYourAnswersSoFar22 = howShouldWeContactYou.postContact();
        CheckYourAnswersSoFar checkYourAnswersSoFar33 = howShouldWeContactYou.continueToCheckYourAnswer();
        IsThereACourtOrderOrConsentOrderForChildMaintenanceInPlace isThereACourtOrderOrConsentOrderForChildMaintenanceInPlace = checkYourAnswersSoFar33.checkAnswersAndContinue();
        WhatIsTheChildsName whatIsTheChildsName = isThereACourtOrderOrConsentOrderForChildMaintenanceInPlace.noCourtOrderButton();
        WhatIsTheChildsDOB whatIsTheChildsDOB = whatIsTheChildsName.childNameDetailsNoAdditionalChild("SADA", "AASDA", "SADAS");
        HowOftenDoesChildStayOvernightWithTheOtherParentEachWeek howOftenDoesChildStayOvernightWithTheOtherParentEachWeek = whatIsTheChildsDOB.child1DateOfBirth("01", "01", "2010");
        CheckYourAnswersSoFarFirstChildren checkYourAnswersSoFarFirstChildren = howOftenDoesChildStayOvernightWithTheOtherParentEachWeek.moreThanThreeNightsAWeek();
        YouHaveToldUsAboutSpecificClildren youHaveToldUsAboutSpecificClildren = checkYourAnswersSoFarFirstChildren.continueButton();
        WhatIsTheOtherParentsName whatIsTheOtherParentsName = youHaveToldUsAboutSpecificClildren.noAdditionalChildAndContinueButton();
        WhatIsTheOtherParentsDateOfBirth whatIsTheOtherParentsDateOfBirth = whatIsTheOtherParentsName.otherParentsName("Professor", "Kostas", "zak", "rise");
        WhatIsTheOtherParentsNationalInsuranceNumber whatIsTheOtherParentsNationalInsuranceNumber = whatIsTheOtherParentsDateOfBirth.otherParentsBirthDetails("21", "03", "1991");
        WhatIsTheOtherParentsHomeAddress whatIsTheOtherParentsHomeAddress = whatIsTheOtherParentsNationalInsuranceNumber.nationalInsurance("18320101");
        WhatIsTheOtherParentsPhoneNumber whatIsTheOtherParentsPhoneNumber = whatIsTheOtherParentsHomeAddress.otherParentsAddress("24", "Gallen House", "Newcastle", "Newcastle", "ne15ug");
        CheckYourAnswersSoFar3 checkYourAnswersSoFar3 = whatIsTheOtherParentsPhoneNumber.otherParentsPhoneNumber("07544917240");
        HowWouldYouLikeChildMaintenanceToBePaid howWouldYouLikeChildMaintenanceToBePaid = checkYourAnswersSoFar3.checkAndContinue();
        YourBankAccountDetails yourBankAccountDetails = howWouldYouLikeChildMaintenanceToBePaid.collectPaymentOption();
        WhatIsYourRollNumber whatIsYourRollNumber = yourBankAccountDetails.enterBankAccountDetails("vasileios", "12", "13", "14", "1444444");
        CheckYourAnswers checkYourAnswers = whatIsYourRollNumber.enterRollNumber("21233231");
        YouNeedToPayA20ApplicationFee youNeedToPayA20ApplicationFee = checkYourAnswers.checkAnswersAndContinue();
        EnterCardDetails enterCardDetails = youNeedToPayA20ApplicationFee.agreePayFeeAndSendApplication();
        ConfirmYourPayment confirmYourPayment = enterCardDetails.enterCardDet("4242424242424242", "03", "22", "Vasileios", "112", "United Kingdom", "13", "Friars", "Newcastle", "NE15UG", "");
        EndOfProgress endOfProgress = confirmYourPayment.confirmPaymentButton();


    }

    //Address Lookup - postcode is not valid, enter address details - non-UK Address - none =  REASON FROM LIST
    @Test
    public void prototypeCmgApplicationNegativeScenario6() {
        PrototypeObject prototypeObject = new PrototypeObject(driver);
        PrototypeNavigationPages prototypeNavigationPages = prototypeObject.prototypeVersionSelection();
        ApplyToTheChildMaintenanceServiceObject applyToTheChildMaintenanceServiceObject = prototypeNavigationPages.prototypeVersionSelection1();
        WhatIsYourInvitationCode whatIsYourInvitationCode = applyToTheChildMaintenanceServiceObject.startNowButton();
        HaveYouOrYourChildrenEverExperiencedDomesticAbuse haveYouOrYourChildrenEverExperiencedDomesticAbuse = whatIsYourInvitationCode.invitationAndContinueButton();
        WhatIsYourNameObject whatIsYourNameObject = haveYouOrYourChildrenEverExperiencedDomesticAbuse.noButton();
        WhatIsYourDateOfBirth whatIsYourDateOfBirth = whatIsYourNameObject.noButton("Mr", "Vasileios", "Panagiotis", "Ntokas");
        WhatIsYourNationalInsuranceNumber whatIsYourNationalInsuranceNumber = whatIsYourDateOfBirth.dateOfBirth("01", "01", "1976");
        WhatIsYourHomeAddress whatIsYourHomeAddress = whatIsYourNationalInsuranceNumber.nationalInsNo("23123");
        ManuallyWhatIsYourAddress manuallyWhatIsYourAddress = whatIsYourHomeAddress.linkToEnterAddressMannualy("ne14ly");
        YouCurrentlyLiveOutsideOfUKDoAnyOfTheFollowingStatementsRelateToYou youCurrentlyLiveOutsideOfUKDoAnyOfTheFollowingStatementsRelateToYou = manuallyWhatIsYourAddress.nonUKAddress("", "", "Madrid", "", "SPAIN", "");
        YouAreNotEligibleToApply youAreNotEligibleToApply = youCurrentlyLiveOutsideOfUKDoAnyOfTheFollowingStatementsRelateToYou.noneOfTheOptions();
    }

    //Happy Journey - Not exempt from £20 fee - Maintenance Direct
    @Ignore
    @Test
    public void prototypeCmgApplicationHappyPath9() {
        PrototypeObject prototypeObject = new PrototypeObject(driver);
        PrototypeNavigationPages prototypeNavigationPages = prototypeObject.prototypeVersionSelection();
        ApplyToTheChildMaintenanceServiceObject applyToTheChildMaintenanceServiceObject = prototypeNavigationPages.prototypeVersionSelection1();
        WhatIsYourInvitationCode whatIsYourInvitationCode = applyToTheChildMaintenanceServiceObject.startNowButton();
        HaveYouOrYourChildrenEverExperiencedDomesticAbuse haveYouOrYourChildrenEverExperiencedDomesticAbuse = whatIsYourInvitationCode.invitationAndContinueButton();
        WhatIsYourNameObject whatIsYourNameObject = haveYouOrYourChildrenEverExperiencedDomesticAbuse.noButton();
        WhatIsYourDateOfBirth whatIsYourDateOfBirth = whatIsYourNameObject.noButton("Mr", "Vasileios", "Panagiotis", "Ntokas");
        WhatIsYourNationalInsuranceNumber whatIsYourNationalInsuranceNumber = whatIsYourDateOfBirth.dateOfBirth("01", "01", "1976");
        WhatIsYourHomeAddress whatIsYourHomeAddress = whatIsYourNationalInsuranceNumber.nationalInsNo("23123");
        HowShouldWeContactYou howShouldWeContactYou = whatIsYourHomeAddress.postcode("ne14ly");
        CheckYourAnswersSoFar checkYourAnswersSoFar11 = howShouldWeContactYou.phoneContact("07544917240");
        CheckYourAnswersSoFar checkYourAnswersSoFar22 = howShouldWeContactYou.postContact();
        CheckYourAnswersSoFar checkYourAnswersSoFar33 = howShouldWeContactYou.continueToCheckYourAnswer();
        IsThereACourtOrderOrConsentOrderForChildMaintenanceInPlace isThereACourtOrderOrConsentOrderForChildMaintenanceInPlace = checkYourAnswersSoFar33.checkAnswersAndContinue();
        WhatIsTheChildsName whatIsTheChildsName = isThereACourtOrderOrConsentOrderForChildMaintenanceInPlace.noCourtOrderButton();
        WhatIsTheChildsDOB whatIsTheChildsDOB = whatIsTheChildsName.childNameDetailsNoAdditionalChild("SADA", "AASDA", "SADAS");
        HowOftenDoesChildStayOvernightWithTheOtherParentEachWeek howOftenDoesChildStayOvernightWithTheOtherParentEachWeek = whatIsTheChildsDOB.child1DateOfBirth("01", "01", "2010");
        CheckYourAnswersSoFarFirstChildren checkYourAnswersSoFarFirstChildren = howOftenDoesChildStayOvernightWithTheOtherParentEachWeek.moreThanThreeNightsAWeek();
        YouHaveToldUsAboutSpecificClildren youHaveToldUsAboutSpecificClildren = checkYourAnswersSoFarFirstChildren.continueButton();
        WhatIsTheOtherParentsName whatIsTheOtherParentsName = youHaveToldUsAboutSpecificClildren.noAdditionalChildAndContinueButton();
        WhatIsTheOtherParentsDateOfBirth whatIsTheOtherParentsDateOfBirth = whatIsTheOtherParentsName.otherParentsName("Professor", "Kostas", "zak", "rise");
        WhatIsTheOtherParentsNationalInsuranceNumber whatIsTheOtherParentsNationalInsuranceNumber = whatIsTheOtherParentsDateOfBirth.otherParentsBirthDetails("21", "03", "1991");
        WhatIsTheOtherParentsHomeAddress whatIsTheOtherParentsHomeAddress = whatIsTheOtherParentsNationalInsuranceNumber.nationalInsurance("18320101");
        WhatIsTheOtherParentsPhoneNumber whatIsTheOtherParentsPhoneNumber = whatIsTheOtherParentsHomeAddress.otherParentsAddress("24", "Gallen House", "Newcastle", "Newcastle", "ne15ug");
        CheckYourAnswersSoFar3 checkYourAnswersSoFar3 = whatIsTheOtherParentsPhoneNumber.otherParentsPhoneNumber("07544917240");
        HowWouldYouLikeChildMaintenanceToBePaid howWouldYouLikeChildMaintenanceToBePaid = checkYourAnswersSoFar3.checkAndContinue();
        CreateAnAccount createAnAccount = howWouldYouLikeChildMaintenanceToBePaid.directPaymentOption();
        CheckYourAnswers4 checkYourAnswers4 = createAnAccount.checkAnswers();
        YouNeedToPayA20ApplicationFee youNeedToPayA20ApplicationFee = checkYourAnswers4.checkAnswersAndContinueToTheNextPage();
        EnterCardDetails enterCardDetails = youNeedToPayA20ApplicationFee.agreePayFeeAndSendApplication();
        ConfirmYourPayment confirmYourPayment = enterCardDetails.enterCardDet("4242424242424242", "03", "22", "Vasileios", "112", "United Kingdom", "13", "Friars", "Newcastle", "NE15UG", "");
        EndOfProgress endOfProgress = confirmYourPayment.confirmPaymentButton();
    }



    //Check for Multiple children
    @Test
    public void prototypeCmgApplicationHappyPath88() {
        PrototypeObject prototypeObject = new PrototypeObject(driver);
        PrototypeNavigationPages prototypeNavigationPages = prototypeObject.prototypeVersionSelection();
        ApplyToTheChildMaintenanceServiceObject applyToTheChildMaintenanceServiceObject = prototypeNavigationPages.prototypeVersionSelection1();
        WhatIsYourInvitationCode whatIsYourInvitationCode = applyToTheChildMaintenanceServiceObject.startNowButton();
        HaveYouOrYourChildrenEverExperiencedDomesticAbuse haveYouOrYourChildrenEverExperiencedDomesticAbuse = whatIsYourInvitationCode.invitationAndContinueButton();
        WhatIsYourNameObject whatIsYourNameObject = haveYouOrYourChildrenEverExperiencedDomesticAbuse.noButton();
        WhatIsYourDateOfBirth whatIsYourDateOfBirth = whatIsYourNameObject.noButton("Mr", "Vasileios", "Panagiotis", "Ntokas");
        WhatIsYourNationalInsuranceNumber whatIsYourNationalInsuranceNumber = whatIsYourDateOfBirth.dateOfBirth("01", "01", "1976");
        WhatIsYourHomeAddress whatIsYourHomeAddress = whatIsYourNationalInsuranceNumber.nationalInsNo("23123");
        HowShouldWeContactYou howShouldWeContactYou = whatIsYourHomeAddress.postcode("ne14ly");
        CheckYourAnswersSoFar checkYourAnswersSoFar11 = howShouldWeContactYou.phoneContact("07544917240");
        CheckYourAnswersSoFar checkYourAnswersSoFar22 = howShouldWeContactYou.postContact();
        CheckYourAnswersSoFar checkYourAnswersSoFar33 = howShouldWeContactYou.continueToCheckYourAnswer();
        IsThereACourtOrderOrConsentOrderForChildMaintenanceInPlace isThereACourtOrderOrConsentOrderForChildMaintenanceInPlace = checkYourAnswersSoFar33.checkAnswersAndContinue();
        WhatIsTheChildsName whatIsTheChildsName = isThereACourtOrderOrConsentOrderForChildMaintenanceInPlace.noCourtOrderButton();
        WhatIsTheChildsDOB whatIsTheChildsDOB = whatIsTheChildsName.childNamedetailsAdditionalChild("vasileios","asdad","asdad","asdad","asdadsd","asddsa");
        HowOftenDoesChildStayOvernightWithTheOtherParentEachWeek howOftenDoesChildStayOvernightWithTheOtherParentEachWeek = whatIsTheChildsDOB.child1DateOfBirth("01", "01", "2010");
    }

    //This Test case is for court order with eligible date
    @Test
    public void prototypeCmgApplicationHappyPath234() {
        PrototypeObject prototypeObject = new PrototypeObject(driver);
        PrototypeNavigationPages prototypeNavigationPages = prototypeObject.prototypeVersionSelection();
        ApplyToTheChildMaintenanceServiceObject applyToTheChildMaintenanceServiceObject = prototypeNavigationPages.prototypeVersionSelection1();
        WhatIsYourInvitationCode whatIsYourInvitationCode = applyToTheChildMaintenanceServiceObject.startNowButton();
        HaveYouOrYourChildrenEverExperiencedDomesticAbuse haveYouOrYourChildrenEverExperiencedDomesticAbuse = whatIsYourInvitationCode.invitationAndContinueButton();
        WhatIsYourNameObject whatIsYourNameObject = haveYouOrYourChildrenEverExperiencedDomesticAbuse.noButton();
        WhatIsYourDateOfBirth whatIsYourDateOfBirth = whatIsYourNameObject.noButton("Mr", "Vasileios", "Panagiotis", "Ntokas");
        WhatIsYourNationalInsuranceNumber whatIsYourNationalInsuranceNumber = whatIsYourDateOfBirth.dateOfBirth("01", "01", "1976");
        WhatIsYourHomeAddress whatIsYourHomeAddress = whatIsYourNationalInsuranceNumber.nationalInsNo("23123");
        HowShouldWeContactYou howShouldWeContactYou = whatIsYourHomeAddress.postcode("ne14ly");
        CheckYourAnswersSoFar checkYourAnswersSoFar11 = howShouldWeContactYou.phoneContact("07544917240");
        CheckYourAnswersSoFar checkYourAnswersSoFar22 = howShouldWeContactYou.postContact();
        CheckYourAnswersSoFar checkYourAnswersSoFar33 = howShouldWeContactYou.continueToCheckYourAnswer();
        IsThereACourtOrderOrConsentOrderForChildMaintenanceInPlace isThereACourtOrderOrConsentOrderForChildMaintenanceInPlace = checkYourAnswersSoFar33.checkAnswersAndContinue();
        WhatIsTheChildsName whatIsTheChildsName = isThereACourtOrderOrConsentOrderForChildMaintenanceInPlace.yesCourtOrderButtonEligibleDate("01","01","2010");
        WhatIsTheChildsDOB whatIsTheChildsDOB = whatIsTheChildsName.childNameDetailsNoAdditionalChild("SADA", "AASDA", "SADAS");
        HowOftenDoesChildStayOvernightWithTheOtherParentEachWeek howOftenDoesChildStayOvernightWithTheOtherParentEachWeek = whatIsTheChildsDOB.child1DateOfBirth("01", "01", "2010");
        CheckYourAnswersSoFarFirstChildren checkYourAnswersSoFarFirstChildren = howOftenDoesChildStayOvernightWithTheOtherParentEachWeek.moreThanThreeNightsAWeek();
        YouHaveToldUsAboutSpecificClildren youHaveToldUsAboutSpecificClildren = checkYourAnswersSoFarFirstChildren.continueButton();
        WhatIsTheOtherParentsName whatIsTheOtherParentsName = youHaveToldUsAboutSpecificClildren.noAdditionalChildAndContinueButton();
        WhatIsTheOtherParentsDateOfBirth whatIsTheOtherParentsDateOfBirth = whatIsTheOtherParentsName.otherParentsName("Professor", "Kostas", "zak", "rise");
        WhatIsTheOtherParentsNationalInsuranceNumber whatIsTheOtherParentsNationalInsuranceNumber = whatIsTheOtherParentsDateOfBirth.otherParentsBirthDetails("21", "03", "1991");
        WhatIsTheOtherParentsHomeAddress whatIsTheOtherParentsHomeAddress = whatIsTheOtherParentsNationalInsuranceNumber.nationalInsurance("18320101");
        WhatIsTheOtherParentsPhoneNumber whatIsTheOtherParentsPhoneNumber = whatIsTheOtherParentsHomeAddress.otherParentsAddress("24", "Gallen House", "Newcastle", "Newcastle", "ne15ug");
        CheckYourAnswersSoFar3 checkYourAnswersSoFar3 = whatIsTheOtherParentsPhoneNumber.otherParentsPhoneNumber("07544917240");
        HowWouldYouLikeChildMaintenanceToBePaid howWouldYouLikeChildMaintenanceToBePaid = checkYourAnswersSoFar3.checkAndContinue();
        YourBankAccountDetails yourBankAccountDetails = howWouldYouLikeChildMaintenanceToBePaid.collectPaymentOption();
        WhatIsYourRollNumber whatIsYourRollNumber = yourBankAccountDetails.enterBankAccountDetails("vasileios", "12", "13", "14", "1444444");
        CheckYourAnswers checkYourAnswers = whatIsYourRollNumber.enterRollNumber("21233231");
        YouNeedToPayA20ApplicationFee youNeedToPayA20ApplicationFee = checkYourAnswers.checkAnswersAndContinue();
        EnterCardDetails enterCardDetails = youNeedToPayA20ApplicationFee.agreePayFeeAndSendApplication();
        ConfirmYourPayment confirmYourPayment = enterCardDetails.enterCardDet("4242424242424242", "03", "22", "Vasileios", "112", "United Kingdom", "13", "Friars", "Newcastle", "NE15UG", "");
        EndOfProgress endOfProgress = confirmYourPayment.confirmPaymentButton();
    }

    //This Test case is for court order with NOT eligible date
    @Test
    public void prototypeCmgApplicationHappyPath23d4() {
        PrototypeObject prototypeObject = new PrototypeObject(driver);
        PrototypeNavigationPages prototypeNavigationPages = prototypeObject.prototypeVersionSelection();
        ApplyToTheChildMaintenanceServiceObject applyToTheChildMaintenanceServiceObject = prototypeNavigationPages.prototypeVersionSelection1();
        WhatIsYourInvitationCode whatIsYourInvitationCode = applyToTheChildMaintenanceServiceObject.startNowButton();
        HaveYouOrYourChildrenEverExperiencedDomesticAbuse haveYouOrYourChildrenEverExperiencedDomesticAbuse = whatIsYourInvitationCode.invitationAndContinueButton();
        WhatIsYourNameObject whatIsYourNameObject = haveYouOrYourChildrenEverExperiencedDomesticAbuse.noButton();
        WhatIsYourDateOfBirth whatIsYourDateOfBirth = whatIsYourNameObject.noButton("Mr", "Vasileios", "Panagiotis", "Ntokas");
        WhatIsYourNationalInsuranceNumber whatIsYourNationalInsuranceNumber = whatIsYourDateOfBirth.dateOfBirth("01", "01", "1976");
        WhatIsYourHomeAddress whatIsYourHomeAddress = whatIsYourNationalInsuranceNumber.nationalInsNo("23123");
        HowShouldWeContactYou howShouldWeContactYou = whatIsYourHomeAddress.postcode("ne14ly");
        CheckYourAnswersSoFar checkYourAnswersSoFar11 = howShouldWeContactYou.phoneContact("07544917240");
        CheckYourAnswersSoFar checkYourAnswersSoFar22 = howShouldWeContactYou.postContact();
        CheckYourAnswersSoFar checkYourAnswersSoFar33 = howShouldWeContactYou.continueToCheckYourAnswer();
        IsThereACourtOrderOrConsentOrderForChildMaintenanceInPlace isThereACourtOrderOrConsentOrderForChildMaintenanceInPlace = checkYourAnswersSoFar33.checkAnswersAndContinue();
        CourtOrderYouAreNotEligibleToApplyToTheChildMaintanceService courtOrderYouAreNotEligibleToApplyToTheChildMaintanceService = isThereACourtOrderOrConsentOrderForChildMaintenanceInPlace.yesCourtOrderButtonNotEligibleDate("01","01","2019");
}

// This test is referring to the case that no invitation code exists
    @Test
    public void prototypeCmgApplicationHappyPath23sdd4() {
        PrototypeObject prototypeObject = new PrototypeObject(driver);
        PrototypeNavigationPages prototypeNavigationPages = prototypeObject.prototypeVersionSelection();
        ApplyToTheChildMaintenanceServiceObject applyToTheChildMaintenanceServiceObject = prototypeNavigationPages.prototypeVersionSelection1();
        WhatIsYourInvitationCode whatIsYourInvitationCode = applyToTheChildMaintenanceServiceObject.startNowButton();
        DoNotHaveAnInvitationCode doNotHaveAnInvitationCode = whatIsYourInvitationCode.noInvlink();
    }

    @After
    public void tearDown()throws IOException{
    }
}

