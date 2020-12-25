package GMI_BANK_13.stepdefitions;

import GMI_BANK_13.utilities.ApiUtil;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.hamcrest.Matchers;

import java.util.HashMap;
import java.util.Map;

public class US19_AccountCreation {

    Response response;
    private String endpoint;

    String expectedDesc;

    @Given("user provides the account creation endpoint {string}")
    public void user_provides_the_account_creation_endpoint(String e) {
        this.endpoint = e;
    }

    @When("admin create new account with following attributes:")
    public void admin_create_new_account_with_following_attributes(DataTable dataTable) {

        Map<String, String> requestBody = new HashMap<>();
        requestBody.put(dataTable.cell(0, 0), dataTable.cell(1, 0));
        requestBody.put(dataTable.cell(0, 1), dataTable.cell(1, 1));
        requestBody.put(dataTable.cell(0, 2), dataTable.cell(1, 2));
        requestBody.put(dataTable.cell(0, 3), dataTable.cell(1, 3));
        requestBody.put(dataTable.cell(0, 4), dataTable.cell(1, 4));
        requestBody.put(dataTable.cell(0, 5), dataTable.cell(1, 5));

        //store description
        expectedDesc = dataTable.cell(1, 5);

        response = ApiUtil.post(endpoint, requestBody);
    }

    @Then("admin verify that account is created")
    public void admin_verify_that_account_is_created() {
        response.then().assertThat()
                .statusCode(201)
                .body("description", Matchers.equalTo(expectedDesc));
    }

}
