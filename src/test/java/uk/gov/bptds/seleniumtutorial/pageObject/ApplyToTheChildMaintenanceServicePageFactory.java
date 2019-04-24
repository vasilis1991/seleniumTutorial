package uk.gov.bptds.seleniumtutorial.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApplyToTheChildMaintenanceServicePageFactory {
    WebDriver driver;

    @FindBy(css = "#main-content > div > div.govuk-grid-column-two-thirds > a")
    WebElement startNowButton;

    @FindBy(xpath = "//*[@id=\"main-content\"]/div/div[1]/p[5]/a")
    WebElement checkYourEligibility;

    @FindBy(xpath = "//*[@id=\"main-content\"]/div/div[1]/p[6]/a")
    WebElement arrangeChildMaintainace;

    @FindBy(xpath = "//a[@href='/cael-eich-pensiwn-y-wladwriaeth']")
    WebElement WelshTranslation;

    @FindBy(xpath = "//a[@href='/call-charges']")
    WebElement charges;

    @FindBy(className = "govuk-header__link govuk-header__link--service-name")
    WebElement title;

    @FindBy(className = "govuk-header__logotype-text")
    WebElement logotype;

    @FindBy(xpath = "//a[@href='https://www.nationalarchives.gov.uk/doc/open-government-licence/version/3/']")
    WebElement licenceLink;

    @FindBy(xpath = "//a[@href='https://www.nationalarchives.gov.uk/information-management/re-using-public-sector-information/uk-government-licensing-framework/crown-copyright/']")
    WebElement crownCopyrightLink;



    public ApplyToTheChildMaintenanceServicePageFactory(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public void setStartNowButton(){
        startNowButton.click();
    }
    public void checkYourEligility() {
        checkYourEligibility.click();
    }
    public void arrangeChildMaintainceLink() {
        arrangeChildMaintainace.click();
    }
    public void welsh() {
        WelshTranslation.click();
    }
    public void CallCharges() {
        charges.click();
    }
    public void ApplyToChildMaintanceMainTitle() { title.click(); }
    public void govUKLogotyoe() {
        logotype.click();
    }
    public void govermentLicenceLink() {
        licenceLink.click();
    }
    public void crownCopyRightLogo() {
        crownCopyrightLink.click();
    }


}
