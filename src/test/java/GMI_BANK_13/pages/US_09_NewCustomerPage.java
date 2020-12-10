package GMI_BANK_13.pages;

import GMI_BANK_13.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US_09_NewCustomerPage {
    public US_09_NewCustomerPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "tp-customer-firstName")
    public WebElement firstname;

    @FindBy(id = "tp-customer-lastName")
    public WebElement lastname;

    @FindBy(id = "tp-customer-ssn")
    public WebElement ssn;

    @FindBy(id = "entity-menu")
    public WebElement myOperationsMenuBtn;

    @FindBy(xpath = " //span[text()='Manage Customers']")
    public WebElement manageCustomersBtn;

    @FindBy(id = "jh-create-entity")
    public WebElement createNewCustomerBtn;

    @FindBy(id = "search-ssn")
    public WebElement ssnSearchbox;

    @FindBy(xpath = "//button[text()='Search']")
    public WebElement searchButton;
}
