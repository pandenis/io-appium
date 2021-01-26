package test.apium.pom.tests;
import org.testng.Assert;
import org.testng.annotations.*;
import test.apium.pom.pages.LoginPage;
import test.apium.pom.pages.ProfilePage;

import java.net.MalformedURLException;


public class LoginTest extends AbstractTest {


    public LoginTest() throws MalformedURLException {
        super();
    }
    @BeforeSuite
    public void BeforeTest(){
        androidDriver.resetApp();
    }
    @Test(testName = "Positive Login Test", priority = 1)

    public void PositiveTest() {

        LoginPage loginPage = new LoginPage(androidDriver);
        Assert.assertTrue(loginPage.isDisplaying());

        loginPage.login(Utils.USERNAME, Utils.CORRECT_PASSWORD);
        ProfilePage profilePage = new ProfilePage(androidDriver);
        Assert.assertTrue(profilePage.isDisplaying(), "Test completed successfully!");

        System.out.println("Test completed successfully!");

    }

    @AfterSuite
    public void closeDriver() {
        androidDriver.quit();
    }
}
