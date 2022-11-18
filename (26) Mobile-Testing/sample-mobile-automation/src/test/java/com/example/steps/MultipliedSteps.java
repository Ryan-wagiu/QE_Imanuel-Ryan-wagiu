package com.example.steps;

import com.example.app.page.MultipliedPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class MultipliedSteps {

    MultipliedPage multipliedPage = new MultipliedPage();
    @And("I click multiplied Button")
    public void iClickMultipliedButton() {
        multipliedPage.clickMultipliedButton();
    }

    @Then("I get result ten")
    public void iGetResultTen() {
        multipliedPage.calculateResult10Display();
    }

    @Then("I get result eight")
    public void iGetResultEight() {
        multipliedPage.calculateResult8Display();
    }
}
