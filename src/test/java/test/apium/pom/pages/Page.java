package test.apium.pom.pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;

public abstract class Page {

    private AndroidDriver<AndroidElement> androidDriver;

    public Page(AndroidDriver<AndroidElement> androidDriver) {
        this.androidDriver = androidDriver;
        PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this);
    }

    public void hideKeyboardIfVisible() {
        if (androidDriver.isKeyboardShown()) {
            androidDriver.hideKeyboard();
        }
    }
}
