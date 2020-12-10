package GMI_BANK_13.stepdefitions;

import GMI_BANK_13.pages.US_08_PasswordPage;
import GMI_BANK_13.utilities.ConfigurationReader;
import GMI_BANK_13.utilities.Driver;
import GMI_BANK_13.utilities.Omer;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class US_08_PasswordStepDef {
    US_08_PasswordPage passwordPage = new US_08_PasswordPage();

    @Given("user logs in with user credentials")
    public void userLogsInWithUserCredentials() {

        Omer.Sign_In_to_System(ConfigurationReader.getProperty("user_name"),
                ConfigurationReader.getProperty("user_password"));

    }

    @Then("user navigates to password page")
    public void userNavigatesToPasswordPage() {
        passwordPage.accountMenu.click();
        passwordPage.passwordLink.click();
    }

    @When("user enters current password in current textbox")
    public void userEntersCurrentPasswordInCurrentTextbox() {
        passwordPage.currentPasswordTextBox.sendKeys(ConfigurationReader.getProperty("user_password"));
    }

    @And("user enters new password in new password textbox")
    public void userEntersNewPasswordInNewPasswordTextbox() {
        passwordPage.newPasswordTextBox.sendKeys(ConfigurationReader.getProperty("user_password"));
    }

    @And("user enters old password in new password confirmation textbox")
    public void userEntersOldPasswordInNewPasswordConfirmationTextbox() {
        passwordPage.confirmPasswordTextBox.sendKeys(ConfigurationReader.getProperty("user_password"));
    }

    @And("user clicks save button")
    public void userClicksSaveButton() {
        passwordPage.saveButton.click();
        Driver.wait(3);
    }

    @Then("verify the message is like {string}")
    public void verifyTheMessageIsLike(String expectedMessage) {
        Assert.assertEquals(expectedMessage, passwordPage.toastMessage.getText());
    }

    String defaultGrayBar = "background-color: rgb(221, 221, 221);";
    int defaultGrayBarCount = 5;
    @When("user enters {string} in new  password textbox")
    public void user_enters_in_new_password_textbox(String string) {
        passwordPage.newPasswordTextBox.sendKeys(string);
    }

    @Then("verify the changing of the level chart")
    public void verify_the_changing_of_the_level_chart() {
        System.out.println(passwordPage.strengthBarList.get(2).getAttribute("style"));
        int tempCount = defaultGrayBarCount;
        for (WebElement we : passwordPage.strengthBarList) {
            if(!we.getAttribute("style").equals(defaultGrayBar)){
                defaultGrayBarCount--;
            }
        }
        Assert.assertTrue(defaultGrayBarCount<tempCount);
    }

    @Then("user adds {string} for stronger password")
    public void user_adds_for_stronger_password(String string) {
        passwordPage.newPasswordTextBox.sendKeys(string);
    }

    @And("user enters new password in new password confirmation textbox")
    public void userEntersNewPasswordInNewPasswordConfirmationTextbox() {
        passwordPage.confirmPasswordTextBox.sendKeys(ConfigurationReader.getProperty("user_password"));
    }

}
