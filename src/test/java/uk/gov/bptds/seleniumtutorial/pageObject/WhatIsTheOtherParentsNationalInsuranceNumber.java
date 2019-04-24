package uk.gov.bptds.seleniumtutorial.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WhatIsTheOtherParentsNationalInsuranceNumber {


    private WebDriver driver;

    public WhatIsTheOtherParentsNationalInsuranceNumber(WebDriver driver) {

        this.driver = driver;
    }

    public WhatIsTheOtherParentsHomeAddress nationalInsurance(String otherParentNI) {

        WebElement NI = driver.findElement(By.xpath("//*[@id=\"other-parent-national-insurance-number\"]"));
        NI.click();
        NI.sendKeys(otherParentNI);

        WebElement continueButton = driver.findElement(By.className("govuk-button"));
        continueButton.click();

        return new WhatIsTheOtherParentsHomeAddress(driver);
    }


}
