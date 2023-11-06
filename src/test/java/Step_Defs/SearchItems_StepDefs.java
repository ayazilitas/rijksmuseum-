package Step_Defs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import services.SearchItems;


public class SearchItems_StepDefs {


SearchItems searchItems=new SearchItems();

    @Given("User should search {string} by using the key words")
    public void user_should_search_by_using_the_key_words(String item) {
        searchItems.searchItem(item);
    }
    @Then("The data status code should be {int}")
    public void the_data_status_code_should_be(Integer statusCode) {
        searchItems.verifyItem(statusCode);
    }



}
