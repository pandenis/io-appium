package test.apium.pom.pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class LoginPage extends Page{

    public LoginPage(AndroidDriver androidDriver) {
        super();
    }



    @AndroidFindBy(id = "name")
    private AndroidElement nameElement;

    @AndroidFindBy(id = "password")
    private AndroidElement passwordElement;

    @AndroidFindBy(id = "login")
    private AndroidElement loginElement;

    public  boolean isDisplaying() {
        return loginElement.isDisplayed();
    }

    public void enterName(String name) {
        nameElement.sendKeys(name);
    }

    public void enterPassword(String password) {
        passwordElement.sendKeys(password);
    }

    public void clickLogin() {
        loginElement.click();
    }


    public void login (String name, String password) {
        hideKeyboardIfVisible();
        enterName(name);
        enterPassword(password);
        clickLogin();
    }
}
