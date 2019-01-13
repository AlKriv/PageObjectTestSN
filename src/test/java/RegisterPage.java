import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {

    WebDriver driver;

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }

    //login settings
    By emailField = By.name("email");
    By passwordField = By.name("password");
    By confirmPasswordField = By.name("confirmPassword");
    By nextFirstGroupButton = By.xpath("//*[@id='stepper']/div/div[1]/div/div/div/div/form/div[2]/div/button");

    //Profile Info
    By nameField = By.name("name");
    By surnameField = By.name("surname");
    By telField = By.xpath("//*[@id='stepper']/div/div[3]/div/div/div/div/form/div[1]/div/div[3]/div/div/div/div[1]/input");
    By nextSecondGroupButton = By.xpath("//*[@id='stepper']/div/div[3]/div/div/div/div/form/div[2]/div[2]/button");

    //Company info
    By companyNameField = By.name("company");
    By industryDropDownList = By.xpath("//*[@id='sector']/div[1]/div[2]");
    By organizationDropDownList = By.xpath("//*[@id='organization']/div[1]/div[2]");
    By siteField = By.name("site");
    By addressField = By.name("address");
    By cityField = By.name("city");
    By countryField = By.name("country");
    By telCompanyField = By.xpath("//*[@id='stepper']/div/div[5]/div/div/div/div/form/div[1]/div[1]/div[7]/div/div/div/div[1]/input");
    By emailCompanyField = By.name("emailAddresses[0]");
    By termsCheckbox = By.name("terms");
    By registerBzxzutton = By.xpath("//*[@id='stepper']/div/div[5]/div/div/div/div/form/div[2]/div[2]/button");

}
