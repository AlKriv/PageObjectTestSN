import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RegistrationPage {

    //login settings
    private By emailField = By.name("email");
    private By passwordField = By.name("password");
    private By confirmPasswordField = By.name("confirmPassword");
    private By nextFirstGroupButton = By.xpath("//*[@id='stepper']/div/div[1]/div/div/div/div/form/div[2]/div/button");

    //Profile Info
    private By nameField = By.name("name");
    private  By surnameField = By.name("surname");
    private By telField = By.xpath("//*[@id='stepper']/div/div[3]/div/div/div/div/form/div[1]/div/div[3]/div/div/div/div[1]/input");
    private By nextSecondGroupButton = By.xpath("//*[@id='stepper']/div/div[3]/div/div/div/div/form/div[2]/div[2]/button");

    //Company info
    private By companyNameField = By.name("company");
    private By industryDropDownList = By.xpath("//*[@id='sector']/div[1]/div[2]");
    private By industrySetDropDownList = By.xpath("/html/body/div[3]/div/div/div/div[1]/span");
    private By organizationDropDownList = By.xpath("//*[@id='organization']/div[1]/div[2]");
    private By organizationSetDropDownList = By.xpath("/html/body/div[2]/div/div/div/div[2]/span");
    private By siteField = By.name("site");
    private By addressField = By.name("address");
    private By cityField = By.name("city");
    private By countryField = By.name("country");
    private By telCompanyField = By.xpath("//*[@id='stepper']/div/div[5]/div/div/div/div/form/div[1]/div[1]/div[7]/div/div/div/div[1]/input");
    private By emailCompanyField = By.name("emailAddresses[0]");
    private By termsCheckbox = By.name("terms");
    private By registerButton = By.xpath("//*[@id='stepper']/div/div[5]/div/div/div/div/form/div[2]/div[2]/button");

    public RegistrationPage openPage() {
        open("/register");
        return this;
    }

    public RegistrationPage typeEmail(String email) {
        $(emailField).sendKeys(email);
        return this;

    }

    public RegistrationPage typePassword(String password) {
        $(passwordField).sendKeys(password);
        return this;

    }

    public RegistrationPage typeConfirmPassword(String confirmPassword) {
        $(confirmPasswordField).sendKeys(confirmPassword);
        return this;
    }

    public RegistrationPage clickNextFirst() {
        $(nextFirstGroupButton).click();
        return this;
    }

    public RegistrationPage typeName(String name) {
        $(nameField).sendKeys(name);
        return this;
    }

    public RegistrationPage typeSurname(String surname) {
        $(surnameField).sendKeys(surname);
        return this;
    }

    public RegistrationPage typeTel(String phone) {
        $(telField).clear();
        $(telField).sendKeys(phone);
        return this;
    }

    public RegistrationPage clickNextSecond() {
        $(nextSecondGroupButton).click();
        return this;
    }

    public RegistrationPage typeCompanyName(String CompanyName) {
        $(companyNameField).sendKeys(CompanyName);
        return this;
    }

    public RegistrationPage setIndustry() {
        $(industryDropDownList).click();
        $(industrySetDropDownList).waitUntil(Condition.visible,5).click();
        return this;
    }

    public RegistrationPage setTypeOrganization() {
        $(organizationDropDownList).click();
        $(organizationSetDropDownList).waitUntil(Condition.visible,5).click();
        return this;
    }

    public RegistrationPage typeSite(String site) {
        $(siteField).sendKeys(site);
        return this;
    }

    public RegistrationPage typeAddress(String address) {
        $(addressField).sendKeys(address);
        return this;
    }

    public RegistrationPage typeCity(String city) {
        $(cityField).sendKeys(city);
        $(cityField).pressTab();
        return this;
    }

    public RegistrationPage typeCountry(String country) {
        $(countryField).sendKeys(country);
        return this;
    }

    public RegistrationPage typeTelCompany(String telComp) {
        $(telCompanyField).sendKeys(telComp);
        return this;
    }

    public RegistrationPage typeEmailCompany(String emailComp) {
        $(emailCompanyField).sendKeys(emailComp);
        return this;
    }

    public RegistrationPage setTerms(boolean value) {

        $(termsCheckbox).setSelected(value);
        return this;
    }
    public RegistrationPage setTersams(boolean value) {

        $(termsCheckbox).setSelected(value);
        return this;
    }
    public void clickRegisterButton() {
        $(registerButton).click();
    }


}
