package GMI_BANK_13.pages;

import GMI_BANK_13.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TransferMoneyPage {
    public TransferMoneyPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(className = "fromAccountId")
    public WebElement from;

    @FindBy(className = "toAccountId")
    public WebElement to;

    @FindBy(className = "balance")
    public WebElement balance;

    @FindBy(className = "description")
    public WebElement description;

    @FindBy(id = "make-transfer")
    public WebElement make_Transfer;

    @FindBy(xpath = ("//div[@class='invalid-feedback'])[1]"))
    public WebElement alert_balance;

    @FindBy(xpath = ("//div[@class='invalid-feedback'])[2]"))
    public WebElement alert_description;
}