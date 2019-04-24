package uk.gov.bptds.seleniumtutorial.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HowOftenDoesChildStayOvernightWithTheOtherParentEachWeekFactory {
    WebDriver driver;

    @FindBy(xpath = "//div//input[@value='Never']")
    WebElement never;

    @FindBy(xpath ="//div//input[@value='Less than 1 night a week']")
    WebElement lessThanOneNightOption;

    @FindBy(xpath ="//div//input[@value='1 to 2 nights a week']")
    WebElement oneToTwoNightsOption;

    @FindBy(xpath ="//div//input[@value='2 to 3 nights a week'")
    WebElement twoToThreeNightsOption;

    @FindBy(xpath ="//div//input[@value='3 nights a week']")
    WebElement threeNightsOption;

    @FindBy(xpath ="//div//input[@value='More than 3 nights a week']")
    WebElement moreThanThreeNightsOption;

    @FindBy(className ="govuk-button")
    WebElement continueButtonElement;


    public HowOftenDoesChildStayOvernightWithTheOtherParentEachWeekFactory(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public void setNever(){
        never.click();
    }
    public void setLessThanOneNightOption(){
        lessThanOneNightOption.click();
    }
    public void setOneToTwoNightsOption(){
        oneToTwoNightsOption.click();
    }
    public void setTwoToThreeNightsOption(){
        twoToThreeNightsOption.click();
    }
    public void setThreeNightsOption(){
        threeNightsOption.click();
    }
    public void setMoreThanThreeNightsOption(){
        oneToTwoNightsOption.click();
    }
    public void setContinueButtonElement(){
        continueButtonElement.click();
    }
}

