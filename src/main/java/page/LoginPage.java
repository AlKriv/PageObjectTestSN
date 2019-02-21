package page;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginPage extends BasePage {
    private SelenideElement email = $(By.id("login_email"));
    private SelenideElement password = $(By.id("login_password"));

    public LoginPage openPage() {
        open("/login");
        return this;
    }

    public LoginPage typeEmail(String email) {
        this.email.sendKeys(email);
        return this;
    }

    public LoginPage clearEmail() {
        email.clear();
        return this;
    }


    public LoginPage typePassword(String password) {
        this.password.sendKeys(password);
        return this;
    }

    public LoginPage clearPassword() {
        this.password.clear();
        return this;
    }

    public void clickSignIn() {
        $(By.xpath("//*[@class='raised-button']/button")).click();
    }

    public MainDeckGeneralPage login(String log, String pass) {
        this.openPage()
                .typeEmail(log)
                .typePassword(pass)
                .clickSignIn();


        MainDeckGeneralPage mainDeckGeneralPage = new MainDeckGeneralPage();
        return mainDeckGeneralPage;
    }

    public SelenideElement LabelLoginError() {
        return $(By.xpath("//form[@class='login']/div/div/div/div[3]"));
    }

    public SelenideElement LabelPasswordError() {
        return $(By.xpath("//form[@class='login']/div/div[2]/div/div[3]"));
    }
}
