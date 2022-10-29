package starter.Utils;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

public class Cart {
    private String url;
    private String token;
    public void setUrlGetAllCart() {
        url = "https://fakestoreapi.com/carts";
        token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOjIsInVzZXIiOiJtb3JfMjMxNCIsImlhdCI6MTY2NzA3MDY4OX0.RYGeZAjbJGVQDZmTFF2xp47K3W9YKt48s0DoXAfrYFQ";
    }

    public void requestWithValidUrl() {
        given().header("Authorization", token).header("Content-Type", "application/json");
        when().get(url);
    }
}
