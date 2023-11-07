package services;

import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import static org.junit.Assert.*;

public class SortArtists {

    String key = "0fiuZFh4";
    Response response;
    public void sortDataFromAToZ(){

        response = given().contentType(ContentType.JSON)
                .pathParam("culture","en")
                .queryParam("key", key)
                .queryParam("p",1)
                .queryParam("ps",100)
                .queryParam("s","artist")
                . when().log().all().
                get("{culture}/collection");

    }
      public void sortDataFromZToA(){

        response = given().contentType(ContentType.JSON)
                .pathParam("culture","en")
                .queryParam("key", key)
                .queryParam("p",1)
                .queryParam("ps",100)
                .queryParam("s","artistdesc")
                . when().log().all().
                get("{culture}/collection");


    }
    public void verifyArtistFromAToZ(String firstArtist, String lastArtist){

        JsonPath jsonPath = response.jsonPath();
        assertEquals(firstArtist,jsonPath.getString("artObjects[0].principalOrFirstMaker"));
        assertEquals(lastArtist,jsonPath.getString("artObjects[99].principalOrFirstMaker"));

    }
    public void verifyArtistFromZToA(String firstArtist, String lastArtist){

        JsonPath jsonPath = response.jsonPath();
        assertEquals(firstArtist,jsonPath.getString("artObjects[0].principalOrFirstMaker"));
        assertEquals(lastArtist,jsonPath.getString("artObjects[99].principalOrFirstMaker"));

    }

    public void verifyStatusCode(Integer statuscode){
        response.then().statusCode(statuscode);
    }
}
