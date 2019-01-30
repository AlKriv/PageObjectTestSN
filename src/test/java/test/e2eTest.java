package test;

import org.testng.annotations.Test;
import page.LoginPage;
import page.MainDeckGeneralPage;

public class e2eTest extends BaseTest {
    @Test
    public void createShip(){
        LoginPage loginPage = new LoginPage();
        loginPage
                .login(user.getEmail(), user.getPassword())
                .openPage()
                .openMenu()
                .myShip()
                .fleet()
                .addShipPage();
    }
}
