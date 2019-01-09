package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;


public class TestBase {
    public WebDriver driver;
    @BeforeMethod
    public void initWebDriver(){
        driver = new ChromeDriver();
        driver.get("https://mish.sheygam.com/#/wellcome");
        driver.manage().window().maximize();
    }
     @AfterMethod
    public void tearDown(){

        driver.quit();
    }
    public void waitUntilElementIsLoaded(WebDriver driver, By locator, int time)
    {
        try {
            new WebDriverWait(driver, time).until(ExpectedConditions.presenceOfElementLocated(locator));
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
