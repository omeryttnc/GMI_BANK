package GMI_BANK_13.stepdefitions;

import GMI_BANK_13.pages.NewUserRegistrationPage;
import GMI_BANK_13.utilities.ConfigurationReader;
import GMI_BANK_13.utilities.Driver;
import GMI_BANK_13.utilities.Mahmut;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class MahmutStepDefinitions {

    NewUserRegistrationPage newUserRegistrationPage = new NewUserRegistrationPage();

    @Given("user is on the website")
    public void user_is_on_the_website() {
        Mahmut.getDriver().get(ConfigurationReader.getProperty("website"));
    }

    @When("user clicks on user icon")
    public void user_clicks_on_user_icon() {
        newUserRegistrationPage.userIcon.click();
        Driver.wait(3);
    }

    @When("user clicks on register button")
    public void user_clicks_on_register_button() {
        newUserRegistrationPage.register.click();
    }

    @Then("user enters the SSN {string}")
    public void user_enters_the_SSN(String string) {
        newUserRegistrationPage.ssn.sendKeys(string);
    }

    @Then("user enters the first name {string}")
    public void user_enters_the_first_name(String string) {
        newUserRegistrationPage.firstName.sendKeys(string);
    }

    @Then("user enters the last name {string}")
    public void user_enters_the_last_name(String string) {
        newUserRegistrationPage.lastName.sendKeys(string);
    }

    @Then("user enters the address {string}")
    public void user_enters_the_address(String string) {
        newUserRegistrationPage.address.sendKeys(string);
    }

    @Then("user enters the mobile phone number {string}")
    public void user_enters_the_mobile_phone_number(String string) {
        newUserRegistrationPage.mobilePhoneNumber.sendKeys(string);
    }

    @Then("user enters the username {string}")
    public void user_enters_the_username(String string) {
        newUserRegistrationPage.userName.sendKeys(string);
    }

    @Then("user enters the email address {string}")
    public void user_enters_the_email_address(String string) {
        newUserRegistrationPage.email.sendKeys(string);
    }

    @Then("user enters the new password {string}")
    public void user_enters_the_new_password(String string) {
        newUserRegistrationPage.newPassword.sendKeys(string);
    }

    @Then("user enters the new password confirmation {string}")
    public void user_enters_the_new_password_confirmation(String string) {
        newUserRegistrationPage.newPasswordConfirmation.sendKeys(string);
    }

    @Then("user clicks on the Register button")
    public void user_clicks_on_the_Register_button() {
        newUserRegistrationPage.registerSubmitButton.click();
    }

    @Then("verify the text message")
    public void verify_the_text_message() {
        Driver.wait(3);
        String expectedMessage = ("If you want to sign in, you can try the default accounts:\n" +
                "- Administrator (login=\"admin\" and password=\"admin\")\n" +
                "- User (login=\"user\" and password=\"user\")");
        String actualMessage = newUserRegistrationPage.textMessage.getText();
        Assert.assertEquals(expectedMessage, actualMessage);
    }
}
