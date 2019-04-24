package uk.gov.bptds.seleniumtutorial.pageObject;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HaveYouOrYourChildrenEverExperiencedDomesticAbusePageFactory {
    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"domestic-abuse-query-no\"]")
    WebElement noButtonElement;

    @FindBy(xpath ="//*[@id=\"domestic-abuse-query-yes\"]")
    WebElement yesButtonElement;

    @FindBy(className ="govuk-button")
    WebElement continueButtonElement;

    @FindBy(className = "govuk-back-link")
    WebElement backButton;

    @FindBy(className = "govuk-header__link govuk-header__link--service-name")
    WebElement title;

    @FindBy(className = "govuk-header__logotype-text")
    WebElement logotype;

    @FindBy(xpath = "//a[@href='https://www.nationalarchives.gov.uk/doc/open-government-licence/version/3/']")
    WebElement licenceLink;

    @FindBy(xpath = "//a[@href='https://www.nationalarchives.gov.uk/information-management/re-using-public-sector-information/uk-government-licensing-framework/crown-copyright/']")
    WebElement crownCopyrightLink;


    public HaveYouOrYourChildrenEverExperiencedDomesticAbusePageFactory(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void setNoButtonElement(){
        noButtonElement.click();
    }

    public void setYesButtonElement(){

        yesButtonElement.click();
    }

    public void setContinueButtonElement(){

        continueButtonElement.click();
    }
    public void clickBackButton(){
        backButton.click();
    }
    public void govUKLogotyoe() {
        logotype.click();
    }
    public void govermentLicenceLink() {
        licenceLink.click();
    }
    public void crownCopyRightLogo() {
        crownCopyrightLink.click();
    }
    @Test
    public void mainPageTitleLinkFunctionality() {
        title.click();
    }
}

