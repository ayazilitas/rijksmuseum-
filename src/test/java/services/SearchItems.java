package services;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class SearchItems {

    String key = "0fiuZFh4";
    Response response;

    public void searchItem(String item) {

        response = given().contentType(ContentType.JSON)
                .pathParam("culture","en")
                .queryParam("key", key)
                .queryParam("q", item)
                .when().log().all().
                get("{culture}/collection");

    }

    public void verifyItem(int code) {
        response.then().statusCode(code);
    }
}
