package GMI_BANK_13.stepdefitions;

import GMI_BANK_13.pojos.Country;
import GMI_BANK_13.utilities.ApiUtil;
import GMI_BANK_13.utilities.ReadTxt;
import GMI_BANK_13.utilities.WriteTxt;
import io.cucumber.java.en.Given;

import io.restassured.response.Response;
import org.codehaus.jackson.map.ObjectMapper;
import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.junit.Assert;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountriesSD {

    Response response;
    private String endpoint;
    String dataFile = "src/test/resources/apiData/Country.txt";

    @Given("user provides the api endpoint {string}")
    public void user_provides_the_api_endpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    @Given("user gets all countries")
    public void user_gets_all_countries() throws IOException {
        response = ApiUtil.get(endpoint);

        ObjectMapper obj = new ObjectMapper();
        Country[] countries = obj.readValue(response.asString(),Country[].class);

        WriteTxt.allCountriesData(dataFile, countries);

    }

    @Given("user selects country with id and send new {string}")
    public void user_selects_country_with_id_and_send_new(String name) {

        List<Country> countryLs = ReadTxt.readAllCountries(dataFile);
        String id = String.valueOf(countryLs.get(0).getId());

        Map<String, String> requestBody = new HashMap<>();
        requestBody.put("id",id);
        requestBody.put("name", name);

        response = ApiUtil.put(endpoint, requestBody);
        response.then().assertThat()
                .body("id", Matchers.equalTo(Integer.parseInt(id)),
                        "name", Matchers.equalTo(name));
    }

}
