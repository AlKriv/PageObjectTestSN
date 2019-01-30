package test;

import Model.Company;
import Model.User;
import org.testng.annotations.BeforeSuite;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.open;

public class BaseTest {
    private User userFirst;

    User user = User.newEntity()
            .setEmail("dert3@i.ua")
            .setName("ALeks")
            .setSurname("Fedorov")
            .setPassword("qwerty")
            .setPhone1("777888999")
            .setPhone2("788999555")
            .setWrongLogin("sdfnsi@i.ua")
            .setWrongPassword("sodisocjdfweo")
            .build();

    Company company = Company.newEntity()
            .setCompany("dert QA aut")
            .setAddress("koroleva st23")
            .setCountry("Ukraine")
            .setEmail("dert32@i.ua")
            .setIndustry("")
            .setOrganization("")
            .setPhone1("77999666")
            .setPhone2("733311222")
            .setSite("otr.org")
            .build();
    @BeforeSuite
    public static void BeforeClass() {
        baseUrl = "https://testing.shipnext.com";
        open("https://shipnext:atdnsshinc@testing.shipnext.com");
    }

}
