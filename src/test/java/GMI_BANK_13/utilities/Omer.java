package GMI_BANK_13.utilities;

import GMI_BANK_13.pages.MainPage;
import org.junit.Test;

public class Omer {
    MainPage mainPage = new MainPage();
    @Test
    public void Sign_In_to_System(String username,String password){
        mainPage.login_in_kelkafa.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        mainPage.sign_In.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        mainPage.user_name.sendKeys(username);
        mainPage.password.sendKeys(password);
        mainPage.submit_button.click();
    }
}
