package com.example.app.pages;

import com.example.app.base.BasePageObject;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class AdditionPage extends BasePageObject {
    private By calculateResult7 = By.xpath("(//android.view.View[@content-desc='7'])[1]");
    private By calculateResult7point2 = By.xpath("(//android.view.View[@content-desc='7.2'])[1]");
    private By calculateResult14 = By.xpath("(//android.view.View[@content-desc='14'])[1]");
    private By calculateResult11 = By.xpath("(//android.view.View[@content-desc='11'])[1]");
    private By calculatorHeader = MobileBy.AccessibilityId("Calculator");
    private By twoButton = MobileBy.AccessibilityId("2");
    private By fiveButton = MobileBy.AccessibilityId("5");
    private By nineButton = MobileBy.AccessibilityId("9");
    private By additionButton = MobileBy.AccessibilityId("+");
    private By commaButton = MobileBy.AccessibilityId(".");
    public void calculatorHeaderDisplay() {
        isDisplayed(calculatorHeader);
    }
    public void calculateResult7Display() {
        isDisplayed(calculateResult7);
    }
    public void calculateResult7pointDisplay() {
        isDisplayed(calculateResult7point2);
    }
    public void calculateResult14Display() {
        isDisplayed(calculateResult14);
    }
    public void calculateResul11Display() {
        isDisplayed(calculateResult11);
    }
    public void clickTwoButton() {
        click(twoButton);
    }
    public void clickFiveButton() {
        click(fiveButton);
    }
    public void clickNineButton() {
        click(nineButton);
    }
    public void clickAdditionButton() {
        click(additionButton);
    }
    public void clickCommaButton() {
        click(commaButton);
    }

}
