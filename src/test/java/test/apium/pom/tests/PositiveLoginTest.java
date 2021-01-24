package test.apium.pom.tests;
import test.apium.pom.pages.LoginPage;
import test.apium.pom.pages.ProfilePage;


public class PositiveLoginTest extends Test{

    public static void main(String[] args) {

        androidDriver.resetApp();

        LoginPage loginPage = new LoginPage(androidDriver);
        if (!loginPage.isDisplaying()) {
            return;
        }

        loginPage.login("Jhon Smith", Utils.CORRECT_PASSWORD);
        ProfilePage profilePage = new ProfilePage(androidDriver);
        if (!profilePage.isDisplaying()) {
            return;
        }

        System.out.println("Test completed successfully!");

        androidDriver.quit();
    }
}
