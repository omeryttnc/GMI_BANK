package GMI_BANK_13.utilities;

import GMI_BANK_13.pages.MainPage;
import org.junit.Test;

public class Omer {
    MainPage mainPage = new MainPage();

    @Test
    public void Sign_In_to_System(String username, String password) {
        Driver.driver.get(ConfigurationReader.getProperty("website"));
        mainPage.login_in_kelkafa.click();
        Driver.wait(2);
        mainPage.sign_In.click();
        Driver.wait(2);

        mainPage.user_name.sendKeys(username);
        mainPage.password.sendKeys(password);
        mainPage.submit_button.click();
    }
}
