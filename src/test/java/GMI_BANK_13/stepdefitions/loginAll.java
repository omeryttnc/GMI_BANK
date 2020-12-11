package GMI_BANK_13.stepdefitions;

import GMI_BANK_13.utilities.ConfigurationReader;
import GMI_BANK_13.utilities.Driver;
import GMI_BANK_13.utilities.Omer;
import io.cucumber.java.en.Given;
import org.junit.Test;

public class loginAll {
    Omer omer = new Omer();

    @Given("Login in customer account")
    public void Login_in_customer_account() {

        omer.Sign_In_to_System(ConfigurationReader.getProperty("Customer_username"),
                ConfigurationReader.getProperty("Customer_password"));
        Driver.wait(2);
    }

    @Given("Login in employee account")
    public void Login_in_employee_account() {

        omer.Sign_In_to_System(ConfigurationReader.getProperty("Employee_username"),
                ConfigurationReader.getProperty("Employee_password"));
        Driver.wait(2);
    }

    @Given("Login in manager account")
    public void Login_in_manager_account() {

        omer.Sign_In_to_System(ConfigurationReader.getProperty("Manager_username"),
                ConfigurationReader.getProperty("Manager_password"));
        Driver.wait(2);
    }

    @Given("Login in admin account")
    public void Login_in_admin_account() {

        omer.Sign_In_to_System(ConfigurationReader.getProperty("Admin_username"),
                ConfigurationReader.getProperty("Admin_password"));
        Driver.wait(2);
    }
}
