package Starter.stepdefinitions.User;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SigninStep {
    @Given("I go to signin page")
    public void iGoToSigninPage() {
    }

    @When("I click Signin button")
    public void iClickSigninButton() {
    }

    @Then("I will get error message password and email is required")
    public void iWillGetErrorMessagePasswordAndEmailIsRequired() {
    }

    @And("I can't signin")
    public void iCanTSignin() {
    }

    @When("I input new valid email")
    public void iInputNewValidEmail() {
    }

    @Then("I will get error message password is required")
    public void iWillGetErrorMessagePasswordIsRequired() {
    }

    @When("I input new valid password")
    public void iInputNewValidPassword() {
    }

    @Then("I will get error message email is required")
    public void iWillGetErrorMessageEmailIsRequired() {
    }

    @And("I created an new account")
    public void iCreatedAnNewAccount() {
    }
}
