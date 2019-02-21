package test;

import Model.Company;
import Model.Ship;
import Model.User;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import java.util.Random;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.open;

public class BaseTest {
    private User userFirst;

    User user;
    Company company;
    Ship shipDel;
    Ship ship;
    String imo;


    @BeforeSuite
    public static void BeforeClass() {
        baseUrl = "";
        open("");
    }
    @BeforeTest
    public void BeforeTest(){
         user = User.newEntity()
                .setEmail("dert3@i.ua")
                .setName("ALeks")
                .setSurname("Fedorov")
                .setPassword("qwerty")
                .setPhone1("777888999")
                .setPhone2("788999555")
                .setWrongLogin("sdfnsi@i.ua")
                .setWrongPassword("sodisocjdfweo")
                .build();

         company = Company.newEntity()
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
        //vessel for create and delete
         shipDel= Ship.newEntity()
                 .setDwtSummer("8000")
                 .setFlag("")
                 .setName("e2e test")
                 .setVesselType("")
                 .setYear("")
                 .setImo(getImo())
                 .setIdShip("")
                 .build();
         //vessel for all opperation
         ship=Ship.newEntity()
                 .setDwtSummer("8000")
                 .setFlag("")
                 .setName("e2e test")
                 .setVesselType("")
                 .setYear("")
                 .setImo("6162898")
                 .setIdShip("5c5c18bea915f7258c718510")
                 .build();
    }

    public String getImo(){
        //Функция rnd.nextInt(limit) возвращает число от нуля (включительно) до limit (не включая limit).
        // Инициализируем генератор
        Random rnd = new Random(System.currentTimeMillis());
        String imo="";
        for (int i=0;i<7;i++)//imo 7 digit max
        {
            Integer min = 1;
            Integer max = 9;
            Integer number = min + rnd.nextInt(max - min + 1);
            imo=imo+number.toString();
        }
        return imo;
    }

}
