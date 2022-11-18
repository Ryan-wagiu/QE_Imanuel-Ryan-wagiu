package com.example.app.page;

import com.example.app.base.BasePageObject;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class SubtractionPage extends BasePageObject {
    private By calculateResult3 = By.xpath("(//android.view.View[@content-desc='3'])[1]");
    private By calculateResult3point2 = By.xpath("(//android.view.View[@content-desc='3.2'])[1]");
    private By calculateResultMinus4 = By.xpath("(//android.view.View[@content-desc='4'])[1]");
    private By subtractionButton = MobileBy.AccessibilityId("-");
    public void calculateResult3Display() {
        isDisplayed(calculateResult3);
    }
    public void calculateResult3point2Display() {
        isDisplayed(calculateResult3point2);
    }
    public void calculateResultMinus4Display() {
        isDisplayed(calculateResultMinus4);
    }

    public void clickSubtractionButton() {
        click(subtractionButton);
    }
}
