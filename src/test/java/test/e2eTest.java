package test;

import org.testng.annotations.Test;
import page.LoginPage;
import page.MainDeckGeneralPage;

import static java.lang.Thread.sleep;

public class e2eTest extends BaseTest {
    @Test
    public void createShip(){
        LoginPage loginPage = new LoginPage();
        loginPage
                .login(user.getEmail(), user.getPassword())
                .openMenu()
                .myShip()
                .fleet()
                .addShipPage()
                .typeName("API Vessel Test")
                .flag()
                .year()
                .typeVessel()
                .typeImo("1932865")
                .dwsSummer("8000")
                .save();
        try {
            sleep(50000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
