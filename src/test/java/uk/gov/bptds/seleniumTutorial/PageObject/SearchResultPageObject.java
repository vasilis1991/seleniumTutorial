package uk.gov.bptds.seleniumTutorial.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class SearchResultPageObject {
    private WebDriver driver;

    public SearchResultPageObject(WebDriver driver) {
        this.driver = driver;
    }

    public void FindSpecificItemFromSearchResultsByTtile(String specificItemTitle){
        WebDriverWait wait = new WebDriverWait(driver, 5);
        //We can use it instead of Thread sleep because is always better and when we meet the condition it continue and not wait instead
        List<WebElement> searchResults = wait.until(
                ExpectedConditions
                        .visibilityOfAllElementsLocatedBy(
                                By.cssSelector(
                                        "* > div > div > div >div.a-fixed-left-grid-col.a-col-right > div.a-row.a-spacing-small> div > a")));
        for(WebElement element : searchResults){
            try {
                if (element.getText().equals(specificItemTitle)) {
                    element.click();
                }
            } catch(StaleElementReferenceException e) {
                // do nothing
            }
        }


    }
}
