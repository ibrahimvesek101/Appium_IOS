package utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.options.XCUITestOptions;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class driverFactory {
    static AppiumDriver driver;

    public static void setDriver() {
        XCUITestOptions options = new XCUITestOptions();
        options.setPlatformName("iOS");
        options.setAutomationName("XCUITest");
        //similatordaki iphone SE için BundleId; XCODE-window-devices and simulators kısmında var:
        options.setBundleId("org.reactjs.native.example.SwagLabsMobileApp");
        options.setUdid("482FF08A-6715-4B44-8CC2-3949819E8DFC");
        options.setNoReset(false);

        try {
            driver = new AppiumDriver(new URL("http://127.0.0.1:4723/"), options);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public static void quitDriver() {

        driver.quit();
    }

    public static AppiumDriver getDriver() {
        return driver;
    }
}
