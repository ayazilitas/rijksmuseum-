package services;


import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import java.util.Optional;

import static org.junit.Assert.*;


public class InvolvedMaker {

    String key = "0fiuZFh4";
    Response response;

    public void makerData(String Maker){

        response=given().contentType(ContentType.JSON)
                .pathParam("culture","en")
                .queryParam("key", key)
                .queryParam("involvedMaker",Maker).log().all()
                .when().log().all().get("{culture}/collection");



    }

    public void verifyMakerData(Integer statusCode){
        response.then().statusCode(statusCode);

        JsonPath jsonPath = response.jsonPath();

        int expectedFacets = 7;
        int actualfacets = jsonPath.getList("facets").size();
        assertEquals(expectedFacets, actualfacets);

        int expectedArtObjectCount = 10;
        int actualArtObjectCount = jsonPath.getList("artObjects").size();
        assertEquals(expectedArtObjectCount, actualArtObjectCount);

       assertEquals("Schelpenvisser, Vincent van Gogh (possibly), 1863 - 1890",jsonPath.getString("artObjects[9].longTitle"));
       assertEquals("11",jsonPath.getString("countFacets.hasimage"));





    }
}
