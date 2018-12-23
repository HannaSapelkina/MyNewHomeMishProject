package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTests extends TestBase {

    @Test
    public void loginPositive() {

        waitUntilElementIsLoaded(driver, By.xpath("//span[contains(text(),'Login')]"), 45);

        WebElement login = driver.findElement(By.xpath("//span[contains(text(),'Login')]"));
        login.click();
        waitUntilElementIsLoaded(driver, By.xpath("//span[contains(text(),'Cancel')]"), 20);

        WebElement email_field = driver.findElement(By.xpath("//input[@formcontrolname='email']"));
        WebElement password_field = driver.findElement(By.xpath("//input[@formcontrolname='password']"));

        email_field.click();
        email_field.sendKeys("mishUser13@gmail.com");
        password_field.click();
        password_field.sendKeys("example");

        WebElement login_button=driver.findElement(By.xpath("//span[contains(text(),'Log in')]"));
        waitUntilElementIsLoaded(driver, By.xpath("//span[contains(text(),'Log in')]"), 45);
        login_button.click();

        waitUntilElementIsLoaded(driver, By.xpath("//mat-icon[@class='but mat-icon material-icons']"), 45);

        WebElement menu_icon = driver.findElement(By.xpath("//mat-icon[@class='but mat-icon material-icons']"));
        Assert.assertTrue(menu_icon.getAttribute("mattooltip").equals("Menu"));
    }

    @Test
    public void loginNegative (){
        waitUntilElementIsLoaded(driver, By.xpath("//span[contains(text(),'Login')]"), 45);

        WebElement login = driver.findElement(By
                .xpath("//span[contains(text(),'Login')]"));
        login.click();
        waitUntilElementIsLoaded(driver, By.xpath("//span[contains(text(),'Cancel')]"), 20);

        WebElement email_field = driver.findElement(By.xpath("//input[@formcontrolname='email']"));
        WebElement password_field = driver.findElement(By.xpath("//input[@formcontrolname='password']"));

        email_field.click();
        email_field.sendKeys("mishUser1555553@gmail.com");
        password_field.click();
        password_field.sendKeys("example");
        WebElement login_button=driver.findElement(By.xpath("//span[contains(text(),'Log in')]"));
        waitUntilElementIsLoaded(driver, By.xpath("//span[contains(text(),'Log in')]"), 45);
        login_button.click();

        waitUntilElementIsLoaded(driver, By.xpath("//div[@class='alert alert-danger ng-star-inserted']"), 45);
        WebElement alertTest = driver.findElement(By.xpath("//div[@class='alert alert-danger ng-star-inserted']"));
        Assert.assertTrue(alertTest.getText().equals("Wrong authorization, login or password"));
    }
}
