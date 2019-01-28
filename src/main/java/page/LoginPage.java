package page;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginPage {


    public LoginPage openPage() {
        open("/login");
        return this;
    }

    public LoginPage typeEmail(String email)
    {
        $(By.id("login_email")).sendKeys(email);
        return this;
    }
    public  LoginPage typePasswod(String password)
    {
        $(By.id("login_password")).sendKeys(password);
        return this;
    }
    public  void clickSignIn(){
        $(By.xpath("//*[@class='raised-button']/button")).click();
    }
}
