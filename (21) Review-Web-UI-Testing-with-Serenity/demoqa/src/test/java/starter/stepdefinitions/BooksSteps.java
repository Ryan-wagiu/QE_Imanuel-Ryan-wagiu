package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.BooksPage;

public class BooksSteps {

    @Steps
    BooksPage booksPage;

    @Given("I on book store page")
    public void iOnBookStorePage() {
        booksPage.openUrl();
    }

    @When("I input available book name")
    public void iInputAvailableBookName() {
        booksPage.inputBook ("Git Pocket Guide");
    }

    @Then("I will get book I want")
    public void iWillGetBookIWant() {
        booksPage.rightBookDisplayed();
    }

    @When("I input non available book name")
    public void iInputNonAvailableBookName() {
        booksPage.inputBook("kunci jawaban");
    }

    @Then("I will get nothing")
    public void iWillGetNothing() {
        booksPage.noneBookDisplayed();
    }

    @When("I input null book name")
    public void iInputNullBookName() {
        booksPage.inputBook("");
    }

    @Then("I will get all books available")
    public void iWillGetAllBooksAvailable() {
        booksPage.rightBookDisplayed();
    }
}
