package Step_Defs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import services.Get_Collections;

public class GetCollection_StepDefs {


Get_Collections getAllCollections=new Get_Collections();
    @Given("User should see all collection")
    public void user_should_see_all_collection() {
       getAllCollections.allCollections();
    }
    @Then("User verify the status code and body")
    public void user_verify_the_status_code_and_body() {
        getAllCollections.verifyCollections();
    }

    @Given("User should see expected data")
    public void userShouldSeeExpectedData() {

        getAllCollections.allCollections();

    }




}
