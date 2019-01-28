package test;

import org.junit.Test;
import page.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void login()
    {
        LoginPage page =new LoginPage();
        page.openPage()
                .typeEmail(user.getEmail())
                .typePasswod(user.getPassword())
                .clickSignIn();

    }
}
