package services;

import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import static org.junit.Assert.*;




public class Get_Collections {


 String key = "0fiuZFh4";
 Response response;
    public void allCollections() {

         response = given().contentType(ContentType.JSON)
                 .pathParam("culture","en")
                 .queryParam("key", key)
                 .queryParam("p",1)
                 .queryParam("ps",100)
                 . when().log().all().
                 get("{culture}/collection");




    }


public void verifyCollections(){
   response.then().statusCode(200);

   JsonPath jsonPath = response.jsonPath();

   assertEquals("anonymous",jsonPath.getString("artObjects[3].principalOrFirstMaker"));
   assertEquals("784258",jsonPath.getString("count"));

    int expectedArtObjectCount = 100;
    int actualArtObjectCount = jsonPath.getList("artObjects").size();
    assertEquals(expectedArtObjectCount, actualArtObjectCount);

    int expectedFacets = 7;
    int actualfacets = jsonPath.getList("facets").size();
    assertEquals(expectedFacets, actualfacets);

    assertEquals("8535",jsonPath.getString("countFacets.ondisplay"));
    assertEquals("The bodhisattva Manjushri, anonymous, c. 800 - c. 900",jsonPath.getString("artObjects[3].longTitle"));
    assertEquals("normalized32Colors.hex",jsonPath.getString("facets[6].name"));




    }






}