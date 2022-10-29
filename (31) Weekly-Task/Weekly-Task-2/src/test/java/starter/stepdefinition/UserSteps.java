package starter.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Utils.User;

public class UserSteps {

    @Steps
    User user;

    @Given("I set url delete user")
    public void iSetUrlDeleteUser() {
        user.setUrlDelete();
    }

    @When("I send request delete user")
    public void iSendRequestDeleteUser() {
        user.requestSendDeleteUser();
    }

}
