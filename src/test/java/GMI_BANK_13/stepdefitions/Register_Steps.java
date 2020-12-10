package GMI_BANK_13.stepdefitions;

import GMI_BANK_13.pages.RegisterPage;
import GMI_BANK_13.utilities.Driver;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Register_Steps {
    RegisterPage registerPage = new RegisterPage();

    @Given("go to homepage and click user icon")
    public void goToHomepageAndClickUserIcon() {
        Driver.getDriver().get("http://gmibank.com/");
        registerPage.accountMenu.click();
    }

    @Given("click register page")
    public void clickRegisterPage() {
        registerPage.registerButton.click();
    }

    @When("edit password field with {int} char type variety" )
    public void editPasswordFieldWithCharTypeVariety(int charTypeVariety, DataTable table) {
        List<String> passwords = table.asList(String.class);
        List<WebElement> cells = registerPage.strengthBarCells;

        String[] colors = { "background-color: rgb(255, 0, 0);", //red
                            "background-color: rgb(255, 153, 0);", // orange with 2 different char type
                            "background-color: rgb(153, 255, 0);", // light green with 3 different char type
                            "background-color: rgb(0, 255, 0);", // dark green with 4 different char type
                            "background-color: rgb(221, 221, 221);" // gray
                          };

        for(String each : passwords){
            Arrays.stream(each.split("")).forEach(ch->registerPage.password.sendKeys(ch));
            Driver.wait(1);
            Boolean colorCode = IntStream.range(0, charTypeVariety)
                                         .allMatch(i -> cells.get(i).getAttribute("style")
                                                                    .equals(colors[charTypeVariety - 1]));

            Assert.assertTrue(colorCode);
            Driver.wait(1);
            registerPage.password.clear();

        }

    }


}
