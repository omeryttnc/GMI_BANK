package GMI_BANK_13.stepdefitions;

import GMI_BANK_13.pages.CustomerPage;
import GMI_BANK_13.pages.TransferMoneyPage;
import GMI_BANK_13.utilities.Driver;
import GMI_BANK_13.utilities.Omer;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class omer_US14_TC04 {
    CustomerPage customerPage = new CustomerPage();
    TransferMoneyPage transfer = new TransferMoneyPage();

    @Then("Go to my operations")

    public void go_to_my_operations() {
        customerPage.my_Operation.click();
        Driver.waitForPageToLoad(20);
    }

    @Then("Go to transfer money")
    public void go_to_transfer_money() {
        customerPage.transfer_Money.click();
        Driver.wait(2);
    }

    @Then("choose first account")
    public void choose_first_account() {
//        String path = String.valueOf(transfer.from);
 //       Omer.Dropdown_selecetBy_id(transfer.from, "30239");
        WebElement dropdownlist = Driver.getDriver().findElement(By.id("fromAccountId"));
        Select options = new Select(dropdownlist);
        Driver.wait(2);
        options.selectByValue("30238");
    }

    @Then("choose remain one")
    public void choose_remain_one() {
//        String path = String.valueOf(transfer.from);
//        Omer.Dropdown_selecetBy_classname(path, "30238");

        WebElement dropdownlist = Driver.getDriver().findElement(By.id("fromAccountId"));
        Select options = new Select(dropdownlist);
        Driver.wait(2);
        options.selectByValue("30238");
    }

    @Then("enter balance")
    public void enter_balance() {
        transfer.balance.sendKeys("30239");
    }

    @Then("click on transfer money")
    public void click_on_transfer_money() {
        transfer.make_Transfer.click();

    }

    @Then("receive alert description")
    public void receive_alert_description() {
        System.out.println(transfer.alert_balance.getText());
        Driver.wait(2);
    }

    @Then("close browser")
    public void close_browser() {
        Driver.closeDriver();
    }

}
