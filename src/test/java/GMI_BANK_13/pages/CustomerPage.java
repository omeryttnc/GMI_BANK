package GMI_BANK_13.pages;

import GMI_BANK_13.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerPage {
    public CustomerPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//ul[@id='header-tabs']/li[8]")
    public WebElement my_Operation;

    @FindBy(xpath = "//ul[@id='header-tabs']/li[9]")
    public WebElement userdetails;

    @FindBy(xpath = "(//li[@id='entity-menu']/div/a)[1]")
    public WebElement my_Accounts;

    @FindBy(xpath = "(//li[@id='entity-menu']/div/a)[2]")
    public WebElement transfer_Money;

    @FindBy(xpath = "(//div[@class='table-responsive']/div/table/tbody/tr)[1]")
    public WebElement transaction_1;

    @FindBy(xpath = "(//div[@class='table-responsive']/div/table/tbody/tr)[2]")
    public WebElement transaction_2;


}
