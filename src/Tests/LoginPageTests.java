package Tests;

import Pages.EventsAuthPageHelper;
import Pages.HomePageHelper;
import Pages.LoginPageHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTests extends TestBase {

    HomePageHelper homePage;
    LoginPageHelper loginPage;
    EventsAuthPageHelper eventsAuthPage;

    @BeforeMethod
    public void initPage() {
        homePage = PageFactory.initElements(driver, HomePageHelper.class);
        loginPage = PageFactory.initElements(driver,LoginPageHelper.class);
        eventsAuthPage = PageFactory.initElements(driver,EventsAuthPageHelper.class);
    }
    @Test
    public void loginPositive() {

        homePage.waitUntilPageIsLoaded();
        homePage.pressLoginButton();
        loginPage.waitUntilPageIsLoaded();
        loginPage.enterValueToEmailField("mishUser1@gmail.com");
        loginPage.enterValueToPasswordField("example");
        loginPage.pressLoginButton();
        eventsAuthPage.waitUntilPageIsLoaded();
        Assert.assertEquals("Menu",eventsAuthPage.getTooltipIconMenu());
        Assert.assertTrue(eventsAuthPage.isHeaderPageCorrect("Find event"));
    }

    @Test
    public void loginNegative (){
        homePage.waitUntilPageIsLoaded();
        homePage.pressLoginButton();
        loginPage.waitUntilPageIsLoaded();
        loginPage.enterValueToEmailField("mishUser15456@gmail.com");
        loginPage.enterValueToPasswordField("example");
        loginPage.pressLoginButton();
        Assert.assertEquals(loginPage.getAlertText(),"Wrong authorization, login or password");
        Assert.assertTrue(loginPage.isAlertTextCorrect("Wrong authorization, login or password"));
    }
}
