package com.example.steps;

import com.example.app.page.SubtractionPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class SubtractionSteps {

    SubtractionPage subtractionPage = new SubtractionPage();
    @And("I click Subtraction Button")
    public void iClickSubtractionButton() {
        subtractionPage.clickSubtractionButton();
    }

    @Then("I get result three")
    public void iGetResultThree() {
        subtractionPage.calculateResult3Display();
    }

    @Then("I get result minus four")
    public void iGetResultMinusFour() {
        subtractionPage.calculateResultMinus4Display();
    }

    @Then("I get result three point two")
    public void iGetResultThreePointTwo() {
        subtractionPage.calculateResult3point2Display();
    }
}
