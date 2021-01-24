package test.apium.pom.pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ProfilePage extends Page{

    public ProfilePage(AndroidDriver<AndroidElement> androidDriver) {
        super(androidDriver);
    }

    @AndroidFindBy(id = "greetings")
    private AndroidElement greetingsElement;

    @AndroidFindBy(id = "logout")
    private AndroidElement logoutElement;

    @AndroidFindBy(id = "country")
    private AndroidElement countryElement;

    @AndroidFindBy(id = "address")
    private AndroidElement addressElement;

    @AndroidFindBy(id = "email")
    private AndroidElement emailElement;

    @AndroidFindBy(id = "phone")
    private AndroidElement phoneElement;

    @AndroidFindBy(id = "save")
    private AndroidElement saveElement;

    @AndroidFindBy(id = "saved")
    private AndroidElement savedElement;

    public boolean isDisplaying() {
        return greetingsElement.isDisplayed();
    }
    public void typeAddress(String address) {
        addressElement.sendKeys(address);
    }
    public void typeEmail(String email) {
        emailElement.sendKeys(email);
    }
    public void typePhone(String phone) {
        phoneElement.sendKeys(phone);
    }

    public void saveContact() {
        saveElement.click();
    }

    public boolean isSaved() {
        return savedElement.isDisplayed();
    }
}
