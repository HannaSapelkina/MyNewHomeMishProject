package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Random;

public class CreateAccountPageHelper extends PageBase {
    @FindBy(xpath = "//span[contains(text(),'Cancel')]")
    WebElement cancelButton;
    @FindBy (xpath = "//input[@formcontrolname='email']")
    WebElement emailField;
    @FindBy (xpath = "//input[@formcontrolname='password']")
    WebElement passwordField;
    @FindBy (xpath = "//input[@formcontrolname='passwordRep']")
    WebElement passwordRepField;
    @FindBy (xpath = "//span[contains(text(),'Registration')]")
    WebElement registrationButton;

    public CreateAccountPageHelper(WebDriver driver) {
        super(driver);
    }

    public void waitUntilPageIsLoaded(){

        waitUntilElementIsLoaded(driver,cancelButton,40);
    }


    public void enterValueToFieldEmail(String value) {

        setValueToField(emailField,value);
    }

    public void enterValueToFieldPassword(String value) {

        setValueToField(passwordField,value);
    }

    public void enterValueToFieldPasswordRep(String value) {

        setValueToField(passwordRepField,value);
    }

    public void pressRegistrationButton() {

        waitUntilElementIsLoaded(driver, registrationButton,20);
        registrationButton.click();
    }


    public void enterValueToFieldEmailRandom() {
        String email = getSaltString() + "@gmail.com";
        enterValueToFieldEmail(email);

    }

}
