package GMI_BANK_13.stepdefitions;

import GMI_BANK_13.pages.US_09_NewCustomerPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class US_09_SSNSearchStepDef {

    US_09_NewCustomerPage newCustomerPage = new US_09_NewCustomerPage();
    @When("user navigates to manage customers page")
    public void user_navigates_to_manage_customers_page() {
       newCustomerPage.myOperationsMenuBtn.click();
       newCustomerPage.manageCustomersBtn.click();
    }

    @When("user clicks new customer button")
    public void user_clicks_new_customer_button() {
       newCustomerPage.createNewCustomerBtn.click();
    }

    @When("user searchs the {string}")
    public void user_searchs_the(String string) {
       newCustomerPage.ssnSearchbox.sendKeys(string);
       newCustomerPage.searchButton.click();
    }


    @Then("verify all registration info is populated")
    public void verifyAllRegistrationIsPopulated(List<String> data) {
        for(String w : data){
            Assert.assertTrue(w.contains(newCustomerPage.firstname.getText()));
            Assert.assertTrue(w.contains(newCustomerPage.lastname.getText()));
            Assert.assertTrue(w.contains(newCustomerPage.ssn.getText()));
        }
    }

    @Then("verify all registration info is not populated")
    public void verifyAllRegistrationInfoIsNotPopulated() {
        Assert.assertTrue(newCustomerPage.firstname.getText().isEmpty());
        Assert.assertTrue(newCustomerPage.lastname.getText().isEmpty());
        Assert.assertTrue(newCustomerPage.ssn.getText().isEmpty());

    }


}
