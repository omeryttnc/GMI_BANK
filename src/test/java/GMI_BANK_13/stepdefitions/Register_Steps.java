package GMI_BANK_13.stepdefitions;

import GMI_BANK_13.pages.RegisterPage;
import GMI_BANK_13.utilities.Driver;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.util.List;

public class Register_Steps {
    RegisterPage registerPage = new RegisterPage();


    @Given("click user icon")
    public void clickUserIcon() {
        Driver.getDriver().get("http://gmibank.com/");
        registerPage.accountMenu.click();
    }

    @Given("click register page")
    public void clickRegisterPage() {
        registerPage.registerButton.click();
    }

    @Given("edit password field")
    public void editPasswordField(DataTable table) {
        List<String> passwords = table.asList();
        for(String each : passwords){
            registerPage.password.sendKeys(each);
            Driver.wait(5);
        }

    }

    @Then("click confirm password field")
    public void clickConfirmPasswordField() {
        registerPage.secondPassword.sendKeys("Test");
    }
}
