package test.apium.pom.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import test.apium.pom.pages.ProfilePage;

import java.net.MalformedURLException;

public class LoginPageTests extends AbstractTest{
    public LoginPageTests() throws MalformedURLException {
    }

    @Test(testName = "01. Positive Login Test")
    public void PositiveTest() {

        test.apium.pom.pages.LoginPage loginPage = new test.apium.pom.pages.LoginPage(androidDriver);
        Assert.assertTrue(loginPage.isDisplaying());

        loginPage.login(Utils.USERNAME, Utils.CORRECT_PASSWORD);
        ProfilePage profilePage = new ProfilePage(androidDriver);
        Assert.assertTrue(profilePage.isDisplaying());

        System.out.println("Test \"" + testName + "\" completed successfully!");

    }

    @Test(testName = "02. Wrong Password Test")
    public void WrongPasswordLogin() {

        test.apium.pom.pages.LoginPage loginPage = new test.apium.pom.pages.LoginPage(androidDriver);
        Assert.assertTrue(loginPage.isDisplaying());

        loginPage.login(Utils.USERNAME, Utils.INCORRECT_PASSWORD);
        Assert.assertTrue(loginPage.isDisplaying());

        System.out.println("Test \"" + testName + "\" completed successfully!");
    }

}
