package starter.Utils;

import org.json.simple.JSONObject;

import static io.restassured.RestAssured.given;

public class User {
    private String url;
    public void setUrlDelete() {
        url = "https://fakestoreapi.com/users/6";
    }

    public void requestSendDeleteUser() {
        given().when().get(url);
    }

}
