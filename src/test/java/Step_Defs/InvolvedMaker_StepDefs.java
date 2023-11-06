package Step_Defs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import services.InvolvedMaker;

public class InvolvedMaker_StepDefs {

    InvolvedMaker involvedMaker =new InvolvedMaker();

    @Given("User should get {string} data")
    public void user_should_get_data(String involvedMaker) {
      this.involvedMaker.makerData(involvedMaker);

    }

    @Then("Status code should be {int}")
    public void statusCodeShouldBe(int statusCode) {
        involvedMaker.verifyMakerData(statusCode);
    }

    @Then("User verify that the status code should be {int}")
    public void userVerifyThatTheStatusCodeShouldBe(int statuscode) {
        involvedMaker.verifyMakerData(statuscode);
    }
}
