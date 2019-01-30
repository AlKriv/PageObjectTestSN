package page;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RegistrationPage extends BasePage{


    //Company info

    public RegistrationPage openPage() {
        open("/register");
        return this;
    }

    //login settings
    public RegistrationPage setEmail(String email) {
        $(By.name("email")).sendKeys(email);
        return this;

    }

    public RegistrationPage setPassword(String password) {
        $(By.name("password")).sendKeys(password);
        return this;

    }

    public RegistrationPage setConfirmPassword(String Password) {
        $(By.name("confirmPassword")).sendKeys(Password);
        return this;
    }

    public RegistrationPage clickNextFirst() {
        $(By.xpath("//*[@id='stepper']/div/div[1]/div/div/div/div/form/div[2]/div/button")).click();
        return this;
    }
    //Profile Info
    public RegistrationPage setName(String name) {
        $(By.name("name")).sendKeys(name);
        return this;
    }

    public RegistrationPage setSurname(String surname) {
        $(By.name("surname")).sendKeys(surname);
        return this;
    }

    public RegistrationPage setPhone(String phone) {
        By telField = By.xpath("//*[@id='stepper']/div/div[3]/div/div/div/div/form/div[1]/div/div[3]/div/div/div/div[1]/input");
        $(telField).clear();
        $(telField).sendKeys(phone);
        return this;
    }

    public RegistrationPage clickNextSecond() {
        $( By.xpath("//*[@id='stepper']/div/div[3]/div/div/div/div/form/div[2]/div[2]/button")).click();
        return this;
    }

    //Company info

    public RegistrationPage setCompanyName(String CompanyName) {
        $(By.name("company")).sendKeys(CompanyName);
        return this;
    }

    public RegistrationPage setIndustry() {

        $(By.xpath("//*[@id='sector']/div[1]/div[2]")).click();
        $( By.xpath("/html/body/div[3]/div/div/div/div[1]/span")).waitUntil(Condition.visible,5).click();
        return this;
    }

    public RegistrationPage setTypeOrganization() {
        $(By.xpath("//*[@id='organization']/div[1]/div[2]")).click();
        $(By.xpath("//*[@id='organization']/div[1]/div[2]")).waitUntil(Condition.visible,5).click();
        return this;
    }

    public RegistrationPage setSite(String site) {
        $(By.name("site")).sendKeys(site);
        return this;
    }

    public RegistrationPage setAddress(String address) {
        $(By.name("address")).sendKeys(address);
        return this;
    }

    public RegistrationPage setCity(String city) {
        By cityField = By.name("city");
        $(cityField).sendKeys(city);
        $(cityField).pressTab();
        return this;
    }

    public RegistrationPage setCountry(String country) {
        $(By.name("country")).sendKeys(country);
        return this;
    }

    public RegistrationPage setTelCompany(String telComp) {
        $(By.xpath("//*[@id='stepper']/div/div[5]/div/div/div/div/form/div[1]/div[1]/div[7]/div/div/div/div[1]/input")).sendKeys(telComp);
        return this;
    }

    public RegistrationPage setEmailCompany(String emailComp) {
        $(By.name("emailAddresses[0]")).sendKeys(emailComp);
        return this;
    }

    public RegistrationPage setTerms(boolean value) {

        $( By.name("terms")).setSelected(value);
        return this;
    }

    public void clickRegisterButton() {
        $(By.xpath("//*[@id='stepper']/div/div[5]/div/div/div/div/form/div[2]/div[2]/button")).click();
    }


}
