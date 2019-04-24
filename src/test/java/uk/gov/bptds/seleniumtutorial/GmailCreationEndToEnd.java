package uk.gov.bptds.seleniumtutorial;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import uk.gov.bptds.seleniumtutorial.pageObject.*;

import java.util.concurrent.TimeUnit;

public class GmailCreationEndToEnd {
    private WebDriver driver;
    /*GmailSignUpPageFactory searchPage;
    PhoneVerificationPageFactory gmailVerification;
    CodeVerificationPageFactory gmailCodeVerification;
    GmailRecoveryCompleteRegistrationPageFactory gmailRecoveryRegistration;
    WelcomePageNewUserPageFactory gmailWelcomePage;
    VerAddPageFactory additionalVerificationPage;*/


    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", this.getClass().getClassLoader().getResource("chromedriver").getPath());
        driver = new ChromeDriver();
        driver.get("https://accounts.google.com/signup");
        //searchPage = new GmailSignUpPageFactory(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    @Test
    public void gmailCreationAccount() {

        GmailSignUpPageObject gmailSignUpPageObject = new GmailSignUpPageObject(driver);
        PhoneVerificationObject phoneVerificationObject = gmailSignUpPageObject.userdetails("vasaSs", "adaasSda", "da15AddDsd", "adsKd4fWS3");
        CodeVerificationPageObject codeVerificationPageObject = phoneVerificationObject.successfullRegistration("07544917240");
        RecoveryCompleteRegistrationPageObject recoveryCompleteRegistrationPageObject = codeVerificationPageObject.completeReg("922211");
        WelcomePageNewUserPageObject welcomePageNewUserPageObject = recoveryCompleteRegistrationPageObject.welcomeToGmail("07566982450", "ntokasvasilis@hotmail.com", "14", "1991");
        VerAddPageObject verAddPageObject = welcomePageNewUserPageObject.addNoCode();
        AcceptPrivacyAndTermsObject acceptPrivacyAndTermsObject = verAddPageObject.termsAndPriv();

        /*searchPage.setGmailFirstName("sdasdasd");
        searchPage.setGmailLastName("asdffafs");
        searchPage.setGmailUserName("asda");
        searchPage.setGmailPassword("ASDvbn123");
        searchPage.setGmailConfirmPassword("ASDvbn123");
        searchPage.clickNextButton();
        gmailVerification.setGmailPhoneNumberId("07544917240");
        gmailVerification.setGmailRegNextButton();
        gmailCodeVerification.setGmailVerificationCode("1515");
        gmailCodeVerification.clickVerificationCodeButton();
        gmailRecoveryRegistration.setRecoveryPhoneNumber("07544917240");
        gmailRecoveryRegistration.setRecoveryEmailAddress("sadad@gmail.com");
        gmailRecoveryRegistration.setRecoveryDayOfBirth("14");
        gmailRecoveryRegistration.setRecoveryYearOfBirth("1991");
        gmailRecoveryRegistration.setRecoveryMonthOfBirth("5");
        gmailRecoveryRegistration.setRecoveryGender("1");
        gmailRecoveryRegistration.clickDetailsNextButton();
        gmailWelcomePage.clickNotNow();
        additionalVerificationPage.clickAgreeToTerms();
        additionalVerificationPage.clickAgreeToInformation();
        additionalVerificationPage.clickFinalCreateAccount();*/


    }

    @After
    //This is to turn down the window
    public void tearDown() {
        driver.quit();
    }
}

