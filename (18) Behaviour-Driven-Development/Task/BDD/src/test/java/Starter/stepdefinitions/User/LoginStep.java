package Starter.stepdefinitions.User;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep {
    @Given("I go to login page")
    public void iGoToLoginPage() {
        System.out.println("I go to login page");
    }

    @When("I click Login button")
    public void iClickLoginButton() {
        System.out.println("I click Login button");
    }

    @Then("I will get error message data is required")
    public void iWillGetErrorMessageDataIsRequired() {
        System.out.println("I will get error message data is required");
    }

    @And("I can't login")
    public void iCanTLogin() {
        System.out.println("I can't login");
    }

    @When("I input valid password")
    public void iInputValidPassword() {
        System.out.println("I input valid password");
    }

    @Then("I will get error message data email is required")
    public void iWillGetErrorMessageDataEmailIsRequired() {
        System.out.println("I will get error message data email is required");
    }

    @When("I input valid email")
    public void iInputValidEmail() {
    }

    @Then("I will get error message data password is required")
    public void iWillGetErrorMessageDataPasswordIsRequired() {
    }
}
