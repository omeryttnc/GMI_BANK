package GMI_BANK_13.pages;

import GMI_BANK_13.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
    public RegisterPage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }


    @FindBy(name = "ssn")
    public WebElement ssnInputBox;

    @FindBy(xpath = "//input[@id='firstname']")
    public WebElement firstNameInputBox;

    @FindBy(xpath = "//input[@id='lastname']")
    public WebElement lastNameInputBox;

    @FindBy(xpath = "//input[@id='address']")
    public WebElement addressInputBox;

    @FindBy(xpath = "//input[@id='mobilephone']")
    public WebElement mobilePhoneInputBox;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement usernameInputBox;

    @FindBy(xpath = " //input[@name='email']")
    public WebElement emailInputBox;

    @FindBy(xpath = " //input[@name='firstPassword']")
    public WebElement newPasswordInputBox;

    @FindBy(xpath = " //input[@name='secondPassword']")
    public WebElement confirmationPasswordInputBox;

    @FindBy(css = "#register-submit")
    public WebElement registerBtn;


























}



