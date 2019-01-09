package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageHelper extends PageBase {
    @FindBy (xpath = "//span[contains(text(),'Cancel')]") WebElement cancelButton;
    @FindBy (xpath = "//input[@formcontrolname='email']") WebElement emailField;
    @FindBy (xpath = "//input[@formcontrolname='password']") WebElement passwordField;
    @FindBy (xpath = "//span[contains(text(),'Log in')]") WebElement logInButton;
    @FindBy (xpath = "//div[@class='alert alert-danger ng-star-inserted']") WebElement alertText;

    public LoginPageHelper (WebDriver driver){

        super(driver);
    }

    public void waitUntilPageIsLoaded() {

        waitUntilElementIsLoaded(driver, cancelButton,20);

    }

    public void enterValueToEmailField(String value){

        setValueToField(emailField,value);

    }

    public void enterValueToPasswordField(String value){

       setValueToField(passwordField,value);
    }

    public void pressLoginButton (){

        waitUntilElementIsLoaded(driver, logInButton, 45);
        logInButton.click();
    }


    public String getAlertText() {
        waitUntilElementIsLoaded(driver, alertText,20);
        return alertText.getText();
    }

    public boolean isAlertTextCorrect(String value) {
        waitUntilElementIsLoaded(driver, alertText, 45);
        return alertText.getText().equals(value);
    }
}
