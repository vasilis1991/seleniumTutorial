package uk.gov.bptds.seleniumtutorial.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WhatIsYourInvitationCodePageFactory {
    WebDriver driver;

    @FindBy(xpath = "//input[@class='govuk-input govuk-input--width-10']")
    WebElement invitationCodeFld;

    @FindBy(css ="#main-content > div > div > form > p > button")
    WebElement continueBtn;

    @FindBy(xpath = "//*[@id=\"main-content\"]/div/div/details/summary/span")
    WebElement noInvitationCodeLink;

    @FindBy(xpath = "//a[@href='/call-charges']")
    WebElement callCharges;

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


    public WhatIsYourInvitationCodePageFactory(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void setInvitationCodeFld(String invitationCode){
        invitationCodeFld.click();
        invitationCodeFld.sendKeys(invitationCode);
    }

    public void setContinueBtn(){

        continueBtn.click();
    }

    public void setNoInvitationCodeLink(){
        noInvitationCodeLink.click();
        callCharges.click();
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
}
