package Starter.stepdefinitions.User;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchForJobStep {
    @Given("I go to job page")
    public void iGoToJobPage() {
        System.out.println("I go to job page");
    }

    @When("I click job name")
    public void iClickJobName() {
        System.out.println("I click job name");
    }

    @And("I click apply button")
    public void iClickApplyButton() {
        System.out.println("I click apply button");
    }

    @Then("I go to company website")
    public void iGoToCompanyWebsite() {
        System.out.println("I go to company website");
    }

    @And("I click Save button")
    public void iClickSaveButton() {
        System.out.println("I click Save button");
    }

    @Then("I a will get massage login first.")
    public void iAWillGetMassageLoginFirst() {
        System.out.println("I a will get massage login first.");
    }

    @Then("I a save job in my job")
    public void iASaveJobInMyJob() {
        System.out.println("I a save job in my job");
    }
}
