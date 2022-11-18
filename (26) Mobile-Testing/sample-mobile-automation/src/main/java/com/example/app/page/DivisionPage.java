package com.example.app.page;

import com.example.app.base.BasePageObject;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class DivisionPage extends BasePageObject {
    private By calculateResult2 = By.xpath("(//android.view.View[@content-desc='2'])[1]");
    private By calculateResult2point5 = By.xpath("(//android.view.View[@content-desc='2.5'])[1]");
    private By fourButton = MobileBy.AccessibilityId("4");
    private By divideButton = MobileBy.AccessibilityId("÷");
    public void calculateResult2Display() {
        isDisplayed(calculateResult2);
    }
    public void calculateResult2point5Display() {
        isDisplayed(calculateResult2point5);
    }
    public void clickfourButton() {
        click(fourButton);
    }
    public void clickDivideButton() {
        click(divideButton);
    }
}
