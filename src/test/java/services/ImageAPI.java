package services;

import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.equalTo;


public class ImageAPI {


    String key = "0fiuZFh4";
    Response response;

    public void imageAPI() {

        response = given().contentType(ContentType.JSON)
                .pathParam("culture","en")
                .pathParam("object-number","SK-A-3262")
                .queryParam("key", key)
                .queryParam("format", "json")
                .when().log().all().
                get("{culture}/collection/{object-number}/tiles");

    }

    public void ImageApiVerify() {

        response.then().statusCode(200);

        response.then().assertThat().contentType(equalTo("application/json; charset=UTF-8"));
        response.then().assertThat().header("Transfer-Encoding","chunked");
    }
}

