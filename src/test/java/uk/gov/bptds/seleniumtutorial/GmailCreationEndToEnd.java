package uk.gov.bptds.seleniumtutorial;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import uk.gov.bptds.seleniumtutorial.pageObject.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GmailCreationEndToEnd {
    private WebDriver driver;

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", this.getClass().getClassLoader().getResource("chromedriver").getPath());
        driver = new ChromeDriver();
        driver.get("https://accounts.google.com/signup");
        driver.manage().window().maximize();
    }

    @Test
    public void gmailCreationAccount() {
        GmailSignUpPageObject gmailSignUpPageObject = new GmailSignUpPageObject(driver);
        PhoneVerificationObject phoneVerificationObject = gmailSignUpPageObject.userdetails("vasaSs", "adaasSda", "da15AddDsd", "adsKd4fWS3");
        CodeVerificationPageObject codeVerificationPageObject = phoneVerificationObject.successfullRegistration("07479363987");
        RecoveryCompleteRegistrationPageObject recoveryCompleteRegistrationPageObject = codeVerificationPageObject.completeReg("922211");
        WelcomePageNewUserPageObject welcomePageNewUserPageObject = recoveryCompleteRegistrationPageObject.welcomeToGmail("07566982450", "ntokasvasilis@hotmail.com", "14", "1991");
        VerAddPageObject verAddPageObject = welcomePageNewUserPageObject.addNoCode();
        AcceptPrivacyAndTermsObject acceptPrivacyAndTermsObject = verAddPageObject.termsAndPriv();
    }

    @After
    //This is to turn down the window
    public void tearDown() {
        driver.quit();
    }
}

