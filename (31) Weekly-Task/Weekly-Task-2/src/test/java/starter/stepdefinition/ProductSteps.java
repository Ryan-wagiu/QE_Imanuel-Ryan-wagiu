package starter.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Utils.Product;

public class ProductSteps {

    @Steps
    Product product;

    @Given("I set the url")
    public void iSetTheUrl() {
        product.setUrl();
    }

    @When("I send request get all product")
    public void iSendRequestGetAllProduct() {
        product.requestGetAllProduct();
    }

    @Given("I set url get a product")
    public void iSetUrlGetAProduct() {
        product.setUrlGetProduct();
    }

    @When("I request get product")
    public void iRequestGetProduct() {
        product.requestGetProduct();
    }

    @Given("I set url add Product")
    public void iSetUrlAddProduct() {product.SetUrlAddProduct();
    }
    @And("I set email username password")
    public void iSetEmailUsernamePassword() {
        product.SetEmailUsernamePassword();
    }
    @When("I send request add product")
    public void iSendRequestAddProduct() {
        product.SendRequestAddProduct();
    }


    @Then("I get status code {int}")
    public void iGetStatusCode(int arg0) {
        product.getStatusCode203();
    }
}
