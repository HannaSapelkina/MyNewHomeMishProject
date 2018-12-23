package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase {

    @Test
    public void CreateNewAccountTest(){

        waitUntilElementIsLoaded(driver, By.xpath("//span[contains(text(),'Login')]"), 45);

        WebElement createAccount = driver.findElement(By.xpath("//span[contains(text(),'Create Account')]"));
        createAccount.click();

        WebElement mailField = driver.findElement(By.xpath("//input[@formcontrolname='email']"));
        mailField.click();
        mailField.sendKeys("NewUser32145@gmail.com");


        WebElement passwordField = driver.findElement(By.xpath("//input[@formcontrolname='password']"));
        passwordField.click();
        passwordField.sendKeys("example");

        WebElement repPasswordField = driver.findElement(By.xpath("//input[@formcontrolname='passwordRep']"));
        repPasswordField.click();
        repPasswordField.sendKeys("example");

        WebElement registrationButton = driver.findElement(By.xpath("//span[contains(text(),'Registration')]"));
        registrationButton.click();
        waitUntilElementIsLoaded(driver, By.xpath("//mat-icon[@class='but mat-icon material-icons']"), 45);

        //WebElement cancelButton = driver.findElement(By.xpath("//button[@type='button']//span[contains(text(),'Cancel')]/.."));
        //cancelButton.click();
        // waitUntilElementIsLoaded(driver, By.xpath("//mat-icon[@mattooltip='Menu'']"), 45);

        WebElement menuButton = driver.findElement(By.xpath("//mat-icon[@mattooltip='Menu']"));
        menuButton.click();

        WebElement logOutMenu = driver.findElement(By.xpath("//span[@class='marginLeft']"));
        logOutMenu.click();
       // waitUntilElementIsLoaded(driver, By.xpath("//span[contains(text(),'Login')]"), 45);
        waitUntilElementIsLoaded(driver, By.className("mat-stroked-button"), 45);
        WebElement goToEventsButton = driver.findElement(By.className("mat-stroked-button"));
        Assert.assertTrue(goToEventsButton.getText().equals("Go to Event list"));
    }

    @Test
    public void CreateNewAccountAndLoginTest()  {

        waitUntilElementIsLoaded(driver, By.xpath("//span[contains(text(),'Login')]"), 45);

        WebElement createAccount = driver.findElement(By.xpath("//span[contains(text(),'Create Account')]"));
        createAccount.click();

        WebElement mailField = driver.findElement(By.xpath("//input[@formcontrolname='email']"));
        mailField.click();
        mailField.sendKeys("Ann8@gmail.com");


        WebElement passwordField = driver.findElement(By.xpath("//input[@formcontrolname='password']"));
        passwordField.click();
        passwordField.sendKeys("example");

        WebElement repPasswordField = driver.findElement(By.xpath("//input[@formcontrolname='passwordRep']"));
        repPasswordField.click();
        repPasswordField.sendKeys("example");

        WebElement registrationButton = driver.findElement(By.xpath("//span[contains(text(),'Registration')]"));
        registrationButton.click();
        waitUntilElementIsLoaded(driver, By.xpath("//span[contains(text(),'Cancel')]"), 45);

        WebElement cancelButton = driver.findElement(By.xpath("//button[@type='button']//span[contains(text(),'Cancel')]/.."));
        cancelButton.click();
        waitUntilElementIsLoaded(driver, By.xpath("//mat-icon[@class='but mat-icon material-icons']"), 45);

        WebElement menuButton = driver.findElement(By.xpath("//mat-icon[@mattooltip='Menu']"));
        //menuButton = driver.findElement(By.cssSelector('mat-icon.but.mat-icon'));
        menuButton.click();

        WebElement logOutMenu = driver.findElement(By.xpath("//span[@class='marginLeft']"));
        logOutMenu.click();
        waitUntilElementIsLoaded(driver, By.xpath("//span[contains(text(),'Login')]"), 45);

        //----------Login created user----------

        WebElement login = driver.findElement(By.xpath("//span[contains(text(),'Login')]"));
        login.click();

        WebElement emailReg = driver.findElement(By.xpath("//input[@formcontrolname='email']"));
        emailReg.click();
        emailReg.sendKeys("Ann8@gmail.com");


        WebElement passReg =  driver.findElement(By.xpath("//input[@formcontrolname='password']"));
        passReg.click();
        passReg.sendKeys("example");

        WebElement log_In = driver.findElement(By.xpath("//span[contains(text(),'Log in')]"));
        waitUntilElementIsLoaded(driver, By.xpath("//span[contains(text(),'Log in')]"), 45);
        log_In.click();

        //WebElement menu_icon = driver.findElement(By.xpath("//mat-icon[@class='but mat-icon material-icons']"));
        //Assert.assertTrue(menu_icon.getAttribute("mattooltip").equals("Menu"));
    }
}
