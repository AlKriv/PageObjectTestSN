import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.open;
import static java.lang.Thread.sleep;

public class RegistrationTest {
    RegistrationPage page;

    @BeforeClass
    public static void BeforeClass() {
        baseUrl = "https://testing.shipnext.com";

        //driver.get("https://shipnext:atdnsshinc@testing.shipnext.com/register");
        //driver.get("https://testing.shipnext.com/register");

    }
    @Before
    public void Before()
    {
        open("https://shipnext:atdnsshinc@testing.shipnext.com");
        //open("https://testing.shipnext.com/register");
    }

    @Test
    public void typeInvalid() throws InterruptedException {
        page = new RegistrationPage();
        page.openPage()
                .typeEmail("dert3@i.ua")
                .typePassword("qwerty")
                .typeConfirmPassword("qwerty")
                .clickNextFirst()
                .typeName("al")
                .typeSurname("kr")
                .typeTel("555555555")
                .clickNextSecond()
                .typeCompanyName("automi1")
                .setIndustry()
                .setTypeOrganization()
                .typeSite("")
                .typeAddress("sdfssdfsdsfs")
                .typeCity("odesa")
                .typeCountry("Ukraine")
                .typeTelCompany("777777777")
                .typeEmailCompany("dert3@i.ua")
                .setTerms(true);
                //.clickRegisterButton();
sleep(10000);

    }

}
