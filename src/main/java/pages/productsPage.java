package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import utils.elementHelper;

public class productsPage {
    AppiumDriver driver;
    elementHelper elementHelper;
    By swagLabsLogo = AppiumBy.xpath("(//XCUIElementTypeImage)[1]");


    public productsPage(AppiumDriver appiumDriver) {
        driver = appiumDriver;
        elementHelper = new elementHelper(appiumDriver);
    }

    public void checkProductsPage() {
     elementHelper.checkElement(swagLabsLogo);
    }
}

