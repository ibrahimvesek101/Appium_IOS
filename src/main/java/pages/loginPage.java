package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import utils.elementHelper;

public class loginPage {
    AppiumDriver driver;
    elementHelper elementHelper;
    By logo = AppiumBy.xpath("(//XCUIElementTypeImage)[1]");
    By usernameTextbox = AppiumBy.xpath("//XCUIElementTypeTextField[@name=\"test-Username\"]");
    By passwordTextbox = AppiumBy.xpath("//XCUIElementTypeSecureTextField[@name=\"test-Password\"]");
    By loginButton = AppiumBy.xpath("//XCUIElementTypeOther[@name=\"test-LOGIN\"]");
    By errorMessage = AppiumBy.name("test-Error message");
    By icon = AppiumBy.xpath("(//XCUIElementTypeImage)[2]");


    public loginPage(AppiumDriver appiumDriver) {
        driver = appiumDriver;
        elementHelper = new elementHelper(appiumDriver);
    }


    public void checkLoginPage() {
        elementHelper.checkElement(logo);
    }

    public void sendKeysUsername(String text) {
        elementHelper.sendKeys(usernameTextbox,text);
    }

    public void sendKeysPassword(String text) {
        elementHelper.sendKeys(passwordTextbox,text);

    }

    public void clickLoginButton() {
        elementHelper.click(loginButton);
    }

    public String getTextErrorMessage() {
       return elementHelper.getText(errorMessage);
    }

    public void checkLogo() {
    elementHelper.checkElement(logo);
    }

    public String getTextUsernameTextbox() {
        return elementHelper.getText(usernameTextbox);
    }

    public String getTextPasswordTextbox() {
        return elementHelper.getText(passwordTextbox);
    }

    public String getTextLoginButton() {
        return elementHelper.getText(loginButton);
    }

    public void checkIcon() {
        elementHelper.checkElement(icon);
    }

}

