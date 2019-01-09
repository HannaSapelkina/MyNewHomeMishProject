package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class EventsUnAuthPageHelper extends PageBase{
    @FindBy (xpath = "//span[contains(text(),'Filters')]") WebElement filtersButton;
    @FindBy (xpath = "//h1[@class='gorisontal-center']") WebElement headerText;

    public EventsUnAuthPageHelper(WebDriver driver) {
        super(driver);
    }

    public void waitUntilPageIsLoaded() {
       waitUntilElementIsLoaded(driver,filtersButton, 45 );
    }

    public String getHeader() {

        return headerText.getText();
    }
}
