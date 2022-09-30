package starter.Account;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static net.serenitybdd.rest.SerenityRest.then;
import static org.hamcrest.CoreMatchers.equalTo;

public class GetAccount {
    private String url, token;

    public void setUrlAndvalidToken(){
        url = "https://demoqa.com/swagger/#/";
        token = "valid"; //penamaan variabel token
    }

    public void requestGetAccount(){
        given().header("Authorization", token)
                .header("Content-Type", "application/json"); //kondisi yg harus disiapkan sebelum request, dan bisa pakai method chaining
        when().get(url); //method dan url apa yg akan kita request dan melakukan requestnya
    }

    public void validateStatusCode(){
        then().statusCode(401);
    }

    public void validateStatus200(){
        then().statusCode(200);
    }

    public void validateAccount(){
        then().statusCode(200);
    }

    public void validateForbiddenMessage(){
        then().body(equalTo("Forbidden"));
    }

    public void validateListProject(){
        then().body("[0].name", equalTo("Inbox"));
    }
}
