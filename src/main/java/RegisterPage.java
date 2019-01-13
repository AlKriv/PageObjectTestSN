import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

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
    By industrySetDropDownList = By.xpath("/html/body/div[3]/div/div/div/div[1]/span");
    By organizationDropDownList = By.xpath("//*[@id='organization']/div[1]/div[2]");
    By organizationSetDropDownList = By.xpath("/html/body/div[3]/div/div/div/div[2]/span/div");
    By siteField = By.name("site");
    By addressField = By.name("address");
    By cityField = By.name("city");
    By countryField = By.name("country");
    By telCompanyField = By.xpath("//*[@id='stepper']/div/div[5]/div/div/div/div/form/div[1]/div[1]/div[7]/div/div/div/div[1]/input");
    By emailCompanyField = By.name("emailAddresses[0]");
    By termsCheckbox = By.name("terms");
    By registerButton = By.xpath("//*[@id='stepper']/div/div[5]/div/div/div/div/form/div[2]/div[2]/button");

    public RegisterPage typeEmail(String email)
    {
        driver.findElement(emailField).sendKeys(email);
        return this;

    }
    public RegisterPage typePassword(String password)
    {
        driver.findElement(passwordField).sendKeys(password);
        return this;

    }
    public RegisterPage typeConfirmPassword(String confirmPassword)
    {
        driver.findElement(confirmPasswordField).sendKeys(confirmPassword);
        return this;
    }
    public RegisterPage clickNextFirst()
    {
        driver.findElement(nextFirstGroupButton).click();
        return this;
    }
    public RegisterPage typeName(String name)
    {
        driver.findElement(nameField).sendKeys(name);
        return this;
    }
    public RegisterPage typeSurname(String surname)
    {
        driver.findElement(surnameField).sendKeys(surname);
        return this;
    }
    public RegisterPage typeTel(String phone)
    {
        driver.findElement(telField).clear();
        driver.findElement(telField).sendKeys(phone);
        return this;
    }
    public RegisterPage clickNextSecond()
    {
        driver.findElement(nextSecondGroupButton).click();
        return this;
    }
    public RegisterPage typeCompanyName(String CompanyName)
    {
        driver.findElement(companyNameField).sendKeys(CompanyName);
        return this;
    }
    public RegisterPage setIndustry()
    {
        driver.findElement(industryDropDownList).click();
        new WebDriverWait(driver,10).until(ExpectedConditions.elementToBeClickable(industrySetDropDownList)).click();

        return this;
    }
    public RegisterPage setTypeOrganization(String surname)
    {
        driver.findElement(organizationDropDownList).click();
        new WebDriverWait(driver,10).until(ExpectedConditions.elementToBeClickable(organizationSetDropDownList)).click();
        return this;
    }
    public RegisterPage typeSite(String site)
    {
        driver.findElement(siteField).sendKeys(site);
        return this;
    }
    public RegisterPage typeAddress(String address)
    {
        driver.findElement(addressField).sendKeys(address);
        return this;
    }
    public RegisterPage typeCity(String city)
    {
        driver.findElement(cityField).sendKeys(city);
        return this;
    }
    public RegisterPage typeCountry(String country)
    {
        driver.findElement(countryField).sendKeys(country);
        return this;
    }
    public RegisterPage typeTelCompany(String telComp)
    {
        driver.findElement(telCompanyField).sendKeys(telComp);
        return this;
    }
    public RegisterPage typeEmailCompany(String emailComp)
    {
        driver.findElement(emailCompanyField).sendKeys(emailComp);
        return this;
    }
    public RegisterPage setTerms(boolean value)
    {
        WebElement checkbox=driver.findElement(termsCheckbox);
        if(!checkbox.isSelected()==value)
            checkbox.click();
        return this;
    }
    public void clickRegisterButton()
    {
        driver.findElement(registerButton).click();
    }


}
