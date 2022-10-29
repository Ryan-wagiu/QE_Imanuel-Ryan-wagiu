package starter.stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Utils.Cart;

public class CartSteps {

    @Steps
    Cart cart;

    @Given("I set url get all cart")
    public void iSetUrlGetAllCart() {
        cart.setUrlGetAllCart();
    }

    @When("I request with valid url get all")
    public void iRequestWithValidUrlGetAll() {
        cart.requestWithValidUrl();
    }
}
