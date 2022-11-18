package com.example.steps;

import com.example.app.pages.AdditionPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdditionSteps {

    AdditionPage additionPage = new AdditionPage();
    @Given("I on calculator")
    public void iOnCalculator() {
        additionPage.calculatorHeaderDisplay();
    }

    @When("I input five")
    public void iInputFive() {
        additionPage.clickFiveButton();
    }

    @And("I click Addition Button")
    public void iClickAdditionButton() {
        additionPage.clickAdditionButton();
    }

    @And("I input two")
    public void iInputTwo() {
        additionPage.clickTwoButton();
    }

    @Then("I get result seven")
    public void iGetResultSeven() {
        additionPage.calculateResult7Display();
    }

    @When("I input nine")
    public void iInputNine() {
        additionPage.clickNineButton();
    }

    @Then("I get result eleven")
    public void iGetResultEleven() {
        additionPage.calculateResul11Display();
    }

    @When("I input five point two")
    public void iInputFivePointTwo() {
        additionPage.clickFiveButton();
        additionPage.clickCommaButton();
        additionPage.clickTwoButton();
    }

    @Then("I get result fourteen")
    public void iGetResultFourteen() {
        additionPage.calculateResult14Display();
    }

    @Then("I get result seven point two")
    public void iGetResultSevenPointTwo() {
        additionPage.calculateResult7pointDisplay();
    }
}
