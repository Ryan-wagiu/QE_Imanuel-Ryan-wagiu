package com.example.app.page;

import com.example.app.base.BasePageObject;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class MultipliedPage extends BasePageObject {
    private By calculateResult10 = By.xpath("(//android.view.View[@content-desc='10'])[1]");
    private By calculateResult8 = By.xpath("(//android.view.View[@content-desc='8'])[1]");
    private By multipliedButton = MobileBy.AccessibilityId("x");
    public void calculateResult10Display() {
        isDisplayed(calculateResult10);
    }
    public void calculateResult8Display() {
        isDisplayed(calculateResult8);
    }
    public void clickMultipliedButton() {
        click(multipliedButton);
    }
}
