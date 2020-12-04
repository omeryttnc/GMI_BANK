package GMI_BANK_13.stepdefitions;

import GMI_BANK_13.pages.CustomerPage;
import GMI_BANK_13.pages.TransferMoneyPage;
import GMI_BANK_13.utilities.Driver;
import GMI_BANK_13.utilities.Omer;
import io.cucumber.java.en.Then;

public class omer_US14_TC04 {
    CustomerPage customerPage = new CustomerPage();
    TransferMoneyPage transfer = new TransferMoneyPage();
    Omer omer = new Omer();

    @Then("Go to my operations")

    public void go_to_my_operations() {
        customerPage.my_Operation.click();
        Driver.wait(2);
    }

    @Then("Go to transfer money")
    public void go_to_transfer_money() {
        customerPage.transfer_Money.click();
        Driver.wait(2);
    }

    @Then("choose first account")
    public void choose_first_account() {
        String path = String.valueOf(transfer.from);
        omer.Dropdown_selecetBy_classname(path, "1");
    }

    @Then("choose remain one")
    public void choose_remain_one() {
        String path = String.valueOf(transfer.from);
        omer.Dropdown_selecetBy_classname(path, "1");
    }

    @Then("enter balance")
    public void enter_balance() {
        transfer.balance.sendKeys("20");
    }

    @Then("click on transfer money")
    public void click_on_transfer_money() {
        transfer.make_Transfer.click();
    }

//    @Then("receive alert description")
//    public void receive_alert_description() {
//    Driver.
//    }

    @Then("close browser")
    public void close_browser() {

    }

}
