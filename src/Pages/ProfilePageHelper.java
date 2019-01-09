package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePageHelper extends PageBase {
    @FindBy(xpath = "//mat-icon[@class='but mat-icon material-icons']") WebElement menuIcon;
    @FindBy(xpath = "//span[contains(text(),'Cancel')]") WebElement cancelButton;
    @FindBy(xpath = "//h1[@class='classCentr']") WebElement header;

    public ProfilePageHelper(WebDriver driver) {
        super(driver);
    }

    public void waitUntilPageIsLoaded() {
        waitUntilElementIsLoaded(driver,cancelButton,40);
        waitUntilElementIsLoaded(driver,menuIcon,40);
        waitUntilElementIsLoaded(driver,header,40);
    }

    public void  pressMenuIcon(){

        menuIcon.click();
    }

    public String getHeader() {
        return header.getText();
    }
}
