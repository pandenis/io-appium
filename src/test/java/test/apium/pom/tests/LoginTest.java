package test.apium.pom.tests;
import org.testng.Assert;
import org.testng.annotations.*;
import test.apium.pom.pages.LoginPage;
import test.apium.pom.pages.ProfilePage;

import java.lang.reflect.Method;
import java.net.MalformedURLException;

public class LoginTest extends AbstractTest {


    public LoginTest() throws MalformedURLException {
        super();
    }
    String testName;

    @BeforeMethod
    public void BeforeTest(){
        androidDriver.resetApp();
    }

    @BeforeMethod
    public void handleTestMethodName(Method method) {
        testName  = method.getName();
    }

    @Test(testName = "01. Positive Login Test")
    public void PositiveTest() {

        LoginPage loginPage = new LoginPage(androidDriver);
        Assert.assertTrue(loginPage.isDisplaying());

        loginPage.login(Utils.USERNAME, Utils.CORRECT_PASSWORD);
        ProfilePage profilePage = new ProfilePage(androidDriver);
        Assert.assertTrue(profilePage.isDisplaying());

        System.out.println("Test " + testName + " completed successfully!");

    }

    @Test(testName = "02. Wrong Password Test")
    public void WrongPassword() {

        LoginPage loginPage = new LoginPage(androidDriver);
        Assert.assertTrue(loginPage.isDisplaying());

        loginPage.login(Utils.USERNAME, Utils.INCORRECT_PASSWORD);
//        ProfilePage profilePage = new ProfilePage(androidDriver);
        Assert.assertTrue(loginPage.isDisplaying());

        System.out.println("Test" + testName + "completed successfully!");
    }


    @AfterMethod
    public void closeDriver() {
        androidDriver.quit();
    }
}
