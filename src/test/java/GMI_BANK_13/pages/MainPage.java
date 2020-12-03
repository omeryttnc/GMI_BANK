package GMI_BANK_13.pages;

import GMI_BANK_13.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
    public MainPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//ul[@id='header-tabs']/li[1]")
    public WebElement home;

    @FindBy(xpath = "//ul[@id='header-tabs']/li[2]")
    public WebElement loan;

    @FindBy(xpath = "//ul[@id='header-tabs']/li[3]")
    public WebElement about_Us;

    @FindBy(xpath = "//ul[@id='header-tabs']/li[4]")
    public WebElement services;

    @FindBy(xpath = "//ul[@id='header-tabs']/li[5]")
    public WebElement blog;

    @FindBy(xpath = "//ul[@id='header-tabs']/li[6]")
    public WebElement about;

    @FindBy(xpath = "//ul[@id='header-tabs']/li[7]")
    public WebElement contact;

    @FindBy(xpath = "//ul[@id='header-tabs']/li[8]")
    public WebElement login_in_kelkafa;

    @FindBy(xpath = "(//a[@class=\"initiate-scripts\"])[1]")
    public WebElement withdraw;

    @FindBy(xpath = "(//a[@class=\"initiate-scripts\"])[2]")
    public WebElement send_Money;

    @FindBy(xpath = "(//a[@class=\"initiate-scripts\"])[3]")
    public WebElement cards;

    @FindBy(xpath = "(//a[@class=\"initiate-scripts\"])[4]")
    public WebElement exchange;

    @FindBy(xpath = "(//div/a[@class='dropdown-item'])[1]")
    public WebElement sign_In;

    @FindBy(xpath = "(//div/a[@class='dropdown-item'])[2]")
    public WebElement register;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement user_name;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement password;

    @FindBy(xpath = "(//div[@class='modal-footer']/button)[2]")
    public WebElement submit_button;


}
