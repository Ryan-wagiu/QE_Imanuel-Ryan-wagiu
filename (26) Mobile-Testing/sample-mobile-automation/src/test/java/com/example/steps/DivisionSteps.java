package com.example.steps;

import com.example.app.page.DivisionPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DivisionSteps {

    DivisionPage divisionPage = new DivisionPage();
    @And("I click divide Button")
    public void iClickDivideButton() {
        divisionPage.clickDivideButton();
    }

    @Then("I get result two point five")
    public void iGetResultTwoPointFive() {
        divisionPage.calculateResult2point5Display();
    }

    @When("I input four")
    public void iInputFour() {
        divisionPage.clickfourButton();
    }

    @Then("I get result two")
    public void iGetResultTwo() {
        divisionPage.calculateResult2Display();
    }
}
