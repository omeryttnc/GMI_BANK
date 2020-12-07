package GMI_BANK_13.stepdefitions;

import GMI_BANK_13.pages.CustomerPage;
import GMI_BANK_13.utilities.Driver;
import io.cucumber.java.en.Then;

public class omer_US14_TC01 {
    CustomerPage customerPage = new CustomerPage();


    @Then("Go to my accounts")
    public void go_to_my_accounts() {
        customerPage.my_Accounts.click();
        Driver.wait(2);
    }


    @Then("Assert if there is 2nd View Transaction")
    public void assert_if_there_is_2nd_View_Transaction() {
        Driver.verifyElementDisplayed(customerPage.transaction_2);
    }

}
