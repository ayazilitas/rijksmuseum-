package Step_Defs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utilities.ConfigurationReader;
import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.reset;

public class Hooks {

    @Before
    public void setUp() {
        baseURI=ConfigurationReader.get("baseURI");

    }

    @After
    public void tearDown() {
        reset();
    }
}

