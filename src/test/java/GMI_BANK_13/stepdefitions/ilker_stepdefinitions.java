package GMI_BANK_13.stepdefitions;

import GMI_BANK_13.pages.MainPage;
import GMI_BANK_13.pages.RegisterPage;
import GMI_BANK_13.utilities.ConfigurationReader;
import GMI_BANK_13.utilities.Driver;
import GMI_BANK_13.utilities.ReusableMethods;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ilker_stepdefinitions {

    Faker faker = new Faker();
    MainPage mainPage = new MainPage();
    RegisterPage registerPage = new RegisterPage();


    @Given("User navigates to GMI BANK HomePage")
    public void user_navigates_to_GMI_BANK_HomePage() {
        {
            Driver.getDriver().get(ConfigurationReader.getProperty("website"));


        }
    }

    @Then("user clicks to user-icon")
    public void user_clicks_to_user_icon() {
        mainPage.login_in_kelkafa.click();


    }

    @Then("user clicks on register button")
    public void user_clicks_on_register_button() {
        mainPage.register.click();


    }


    @Then("user fills SSN input box")
    public void user_fills_SSN_input_box() {
        ReusableMethods.waitForVisibility(registerPage.ssnInputBox, 3);
        registerPage.ssnInputBox.sendKeys(ConfigurationReader.getProperty("ssn"));


    }

    @Then("user fills the firstname and lastname input box")
    public void user_fills_the_firstname_and_lastname_input_box() {
        registerPage.firstNameInputBox.sendKeys(ConfigurationReader.getProperty("firstname"));
        registerPage.lastNameInputBox.sendKeys(ConfigurationReader.getProperty("lastname"));

    }

    @Then("user fills the address input box")
    public void user_fills_the_address_input_box() {
        registerPage.addressInputBox.sendKeys(ConfigurationReader.getProperty("address"));


    }

    @Then("user fills the username input box")
    public void user_fills_the_username_input_box() {
        registerPage.usernameInputBox.sendKeys(ConfigurationReader.getProperty("newusername"));
    }

    @Then("user fills the mobilePhone input box")
    public void user_fills_the_mobilePhone_input_box() {
        registerPage.mobilePhoneInputBox.sendKeys(ConfigurationReader.getProperty("mobilephone"));

    }

    @Then("user fills the email input box")
    public void user_fills_the_email_input_box() {
        registerPage.emailInputBox.sendKeys(ConfigurationReader.getProperty("email"));

    }

    @Then("user fills the new password and confirmation password")
    public void user_fills_the_new_password_and_confirmation_password() {
        registerPage.newPasswordInputBox.sendKeys(ConfigurationReader.getProperty("registrationpassword"));
        registerPage.confirmationPasswordInputBox.sendKeys(ConfigurationReader.getProperty("registrationpassword"));


    }

    @Then("user clicks on registerSubmit button")
    public void user_clicks_on_registerSubmit_button()
    {
        registerPage.registerBtn.click();
    }

}
