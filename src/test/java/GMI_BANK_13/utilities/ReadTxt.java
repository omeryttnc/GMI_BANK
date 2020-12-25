package GMI_BANK_13.utilities;

import GMI_BANK_13.pojos.Country;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadTxt {

    public static List<Country> readAllCountries(String fileName) {
        List<Country> countries= new ArrayList<>();
        try {
            File myObj = new File(fileName);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                Country country  = new Country();
                String data = myReader.nextLine();
                //  System.out.println(data);
                String [] temp = data.split(",");

                country.setId(Integer.parseInt(temp[0]));
                country.setName(temp[1]);
                country.setStates(temp[2]);

                countries.add(country);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return countries;
    }
}
