package GMI_BANK_13.stepdefitions;

import GMI_BANK_13.utilities.Omer;
import org.junit.Test;

public class omer_stepdefinitions {
   Omer omer = new Omer();
    @Test
    public void enter_system(){
        omer.Sign_In_to_System("CustomerTeam13","gmibankteam13");
    }
}
