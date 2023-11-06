package Step_Defs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import services.SortArtists;

public class sortArtists_StepDefs {


    SortArtists sortArtists = new SortArtists();

    @Given("User should sort the data from a to z")
    public void user_should_sort_the_data_from_a_to_z() {
        sortArtists.sortDataFromAToZ();
    }

    @And("Verify that first artist is{string}, last artist is {string}")
    public void verifyThatFirstArtistIsLastArtistIs(String firstArtist, String lastArtist) {

        sortArtists.verifyArtistFromAToZ(firstArtist, lastArtist);

    }

    @Then("verify the status code {int}")
    public void verifyTheStatusCode(int statusCode) {
        sortArtists.verifyStatusCode(statusCode);

    }

    @Given("User should sort the collection from z to a")
    public void userShouldSortTheCollectionFromZToA() {
        sortArtists.sortDataFromZToA();

    }

    @And("Verify first artist is{string}, last artist is {string}")
    public void verifyFirstArtistIsLastArtistIs(String FArtist, String LArtist) {

        sortArtists.verifyArtistFromZToA(FArtist, LArtist);
    }
}

