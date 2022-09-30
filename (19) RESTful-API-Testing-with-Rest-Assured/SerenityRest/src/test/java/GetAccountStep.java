import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class GetAccountStep {

    @Steps
    CreateProject createproject;

    @Given("I set url and valid token to get account")
    public void ISetUrlAndValidTokenToGetAccount() {
    }

    @When("I request get Account")
    public void iRequestGetAccount() {


    }

    @Then("I will get 401")
    public void iWillGet() {
    }

    @And("get forbiden message")
    public void getForbidenMessage() {
    }

    @And("I input userid")
    public void iInputUserid() {
    }

    @And("I input null userid")
    public void iInputNullUserid() {
    }

    @Then("I will get 200")
    public void iWillGet(int arg0) {
    }

    @And("get success message")
    public void getSuccessMessage() {
    }

    @Given("I set url and invalid token to get account")
    public void iSetUrlAndInvalidTokenToGetAccount() {
    }
}
