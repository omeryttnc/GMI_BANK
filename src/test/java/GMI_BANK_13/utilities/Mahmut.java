package GMI_BANK_13.utilities;

import GMI_BANK_13.pages.MainPage;

public class Mahmut {

    private static MainPage mainPage;

    public static void registerToTheSystem() {

        Driver.driver.get(ConfigurationReader.getProperty("website"));

    }
}