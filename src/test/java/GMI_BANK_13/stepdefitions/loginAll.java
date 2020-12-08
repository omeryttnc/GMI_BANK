package GMI_BANK_13.stepdefitions;

import GMI_BANK_13.utilities.ConfigurationReader;
import GMI_BANK_13.utilities.Driver;
import GMI_BANK_13.utilities.Omer;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;

public class loginAll {

    @Given("Login in customer account")
    public void Login_in_customer_account() {

        Omer.Sign_In_to_System(ConfigurationReader.getProperty("Customer_username"),
                ConfigurationReader.getProperty("Customer_password"));
        Driver.wait(2);
    }

    @Given("Login in employee account")
    public void Login_in_employee_account() {

        Omer.Sign_In_to_System(ConfigurationReader.getProperty("Employee_username"),
                ConfigurationReader.getProperty("Employee_password"));
        Driver.wait(2);
    }

    @Given("Login in manager account")
    public void Login_in_manager_account() {

        Omer.Sign_In_to_System(ConfigurationReader.getProperty("Manager_username"),
                ConfigurationReader.getProperty("Manager_password"));
        Driver.wait(2);
    }

    @Given("Login in admin account")
    public void Login_in_admin_account() {

        Omer.Sign_In_to_System(ConfigurationReader.getProperty("Admin_username"),
                ConfigurationReader.getProperty("Admin_password"));
        Driver.wait(2);
    }

//    @Then("user enters \"(.*)\" and \"(.*)\"$")
//    public void user_enters_and(String username, String password) {
//      Omer.Sign_In_to_System(username,password);
//      Driver.wait(5);
@Then("user enters {string} and {string}")
public void user_enters_and(String username, String password) {
    Omer.Sign_In_to_System(username,password);
//      Driver.wait(5);
}



}
