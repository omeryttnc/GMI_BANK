package GMI_BANK_13.pages;

import GMI_BANK_13.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US_08_PasswordPage {
    public US_08_PasswordPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "account-menu")
    public WebElement accountMenu;

    @FindBy(linkText = "Password")
    public WebElement passwordLink;

    @FindBy(id = "currentPassword")
    public WebElement currentPasswordTextBox;

    @FindBy(id = "newPassword")
    public WebElement newPasswordTextBox;

    @FindBy(id = "confirmPassword")
    public WebElement confirmPasswordTextBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement saveButton;

    @FindBy(xpath = "//*[@class = 'Toastify__toast-body']")
    public WebElement toastMessage;

    @FindBy(xpath = "//ul[@id='strengthBar']//li")
    public List<WebElement> strengthBarList;
}
