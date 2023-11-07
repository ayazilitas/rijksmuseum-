package Step_Defs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import services.ImageAPI;

public class ImageApi_StepDefs {

ImageAPI imageAPI=new ImageAPI();


    @Given("User gets the information in json format")
    public void user_gets_the_information_in_json_format() {
        imageAPI.imageAPI();
    }
    @Then("Verify the status code and body")
    public void verify_the_status_code_and_body() {
        imageAPI.ImageApiVerify();
    }

}
