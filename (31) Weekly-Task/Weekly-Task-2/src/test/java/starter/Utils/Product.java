package starter.Utils;

import org.json.simple.JSONObject;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static net.serenitybdd.rest.SerenityRest.then;

public class Product {
    private String url0, token, url, url2;

    public void setUrl() {
        url = "https://fakestoreapi.com/products";
    }

    public void requestGetAllProduct() {
        given().when().get(url);
    }

    public void setUrlGetProduct() {
        url2 = "https://fakestoreapi.com/products/1";
    }

    public void requestGetProduct() {
        given().when().get(url2);
    }
    public void SetUrlAddProduct() {url0 = "https://fakestoreapi.com/products";
        token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOjIsInVzZXIiOiJtb3JfMjMxNCIsImlhdCI6MTY2NzA3MTkzNH0.fofwzkpCpUO54k7HQcAF-OZ27vgj1-9Qyb30KqPM2Ng";
    }
    public void SetEmailUsernamePassword() {
        given().when().get(url);
    }
    public void SendRequestAddProduct() {
        given().header("Authorization", token).header("Content-Type", "application/json"); //kondisi yg harus disiapkan sebelum request, dan bisa pakai method chaining
        when().get(url);
    }
    public void getStatusCode203() {
        then().statusCode(203);
    }
}
