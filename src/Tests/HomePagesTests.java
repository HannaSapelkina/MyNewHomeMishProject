package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


public class HomePagesTests extends TestBase {
    @Test
    public void openHomePageTest() {

        waitUntilElementIsLoaded(driver, By.xpath("//span[contains(text(),'Login')]"), 45);

        WebElement goToEventsButton = driver.findElement(By.className("mat-stroked-button"));

        Assert.assertTrue(goToEventsButton.getText().equals("Go to Event list"));
    }
    @Test
    public void goToEventsTest() {
        waitUntilElementIsLoaded(driver, By.xpath("//span[contains(text(),'Login')]"), 45);
        WebElement goToEventsButton = driver.findElement(By.className("mat-stroked-button"));
        goToEventsButton.click();
        WebElement titlePage = driver.findElement(By.xpath("//h1[@class='gorisontal-center']"));
        Assert.assertTrue(titlePage.getText().equals("Find event"));
    }

}
