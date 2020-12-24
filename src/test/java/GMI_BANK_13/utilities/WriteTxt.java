package GMI_BANK_13.utilities;

import GMI_BANK_13.pojos.Country;

import java.io.FileWriter;

public class WriteTxt {

    public static void allCountriesData(String fileName, Country[] countries) {
        try {
            FileWriter myWriter = new FileWriter(fileName);
            for (int i = 0; i < countries.length; i++) {
                myWriter.write(countries[i].getId()+",");
                myWriter.write(countries[i].getName()+",");
                myWriter.write(countries[i].getStates()+",\n");
            }
            myWriter.close();
            System.out.println("countries Successfully wrote to the file.");
        } catch (Exception e) {
            System.out.println("An error occurred.");   e.printStackTrace();
        }
    }
}
