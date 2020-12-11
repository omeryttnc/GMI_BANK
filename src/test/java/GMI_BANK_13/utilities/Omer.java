package GMI_BANK_13.utilities;

import GMI_BANK_13.pages.MainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Omer {

    private static MainPage mainPage = new MainPage();

    public static void Sign_In_to_System(String username, String password) {
        Driver.driver.get(ConfigurationReader.getProperty("website"));
        Driver.wait(2);
        mainPage.login_in_kelkafa.click();
        Driver.wait(2);
        mainPage.sign_In.click();
        Driver.wait(2);

        mainPage.user_name.sendKeys(username);
        mainPage.password.sendKeys(password);
        mainPage.submit_button.click();
    }

    public static void Dropdown_selecetBy_id(WebElement id, String value) {
        WebElement dropdownlist = Driver.driver.findElement(By.id(id.getText()));
        Select options = new Select(dropdownlist);
        Driver.wait(2);
        options.selectByValue(value);
    }

    public static void Dropdown_selecetBy_classname(String classname, String value) {
        WebElement dropdownlist = Driver.driver.findElement(By.className(classname));
        Select options = new Select(dropdownlist);
        Driver.wait(2);
        options.selectByValue(value);

    }


    public static void Dropdown_selecetBy_xpath(String xpath, String value) {
        Select dropdownlist = new Select(Driver.driver.findElement(By.xpath(xpath)));
        dropdownlist.selectByValue(value);
    }

    public static void Dropdown_selecetBy_linkText(String linkText, String value) {
        Select dropdownlist = new Select(Driver.driver.findElement(By.linkText(linkText)));
        dropdownlist.selectByValue(value);
    }

    public static void Dropdown_selecetBy_cssSelector(String cssSelector, String value) {
        Select dropdownlist = new Select(Driver.driver.findElement(By.cssSelector(cssSelector)));
        dropdownlist.selectByValue(value);
    }

    public static void Dropdown_selecetBy_partialLinkText(String partialLinkText, String value) {
        Select dropdownlist = new Select(Driver.driver.findElement(By.partialLinkText(partialLinkText)));
        dropdownlist.selectByValue(value);
    }

    public static void Dropdown_selecetBy_tagName(String tagName, String value) {
        Select dropdownlist = new Select(Driver.driver.findElement(By.tagName(tagName)));
        dropdownlist.selectByValue(value);
    }

    public static class collect_data {
        public void collect_all_data(String website, String Locater) {
            Driver.getDriver().get(ConfigurationReader.getProperty(website));
            List<WebElement> tableData = Driver.getDriver().findElements(By.xpath(Locater));
            for (WebElement table : tableData) {
                System.out.println(table.getText());
            }

        }
    }
}
