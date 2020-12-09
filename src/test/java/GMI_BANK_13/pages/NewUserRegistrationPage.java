package GMI_BANK_13.pages;

import GMI_BANK_13.utilities.Mahmut;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class NewUserRegistrationPage {

    public NewUserRegistrationPage() {PageFactory.initElements(Mahmut.getDriver(), this);}

    @FindBy(xpath = "//li[@id='account-menu']")
    public WebElement userIcon;

    @FindBy(xpath = "(//a[@class='dropdown-item'])[2]")
    public WebElement register;

    @FindBy(xpath = "//input[@id='ssn']")
    public WebElement ssn;

    @FindBy(xpath = "//input[@name='firstname']")
    public WebElement firstName;

    @FindBy(xpath = "//input[@name='lastname']")
    public WebElement lastName;

    @FindBy(xpath = "//input[@name='address']")
    public WebElement address;

    @FindBy(xpath = "//input[@name='mobilephone']")
    public WebElement mobilePhoneNumber;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement userName;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement email;

    @FindBy(xpath = "//input[@id='firstPassword']")
    public WebElement newPassword;

    @FindBy(xpath = "//input[@name='secondPassword']")
    public WebElement newPasswordConfirmation;

    @FindBy(xpath = "//button[@id='register-submit']")
    public WebElement registerSubmitButton;

    @FindBy(xpath = "//div[@role='alert']")
    public WebElement textMessage;
}
