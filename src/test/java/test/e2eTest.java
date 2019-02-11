package test;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import org.testng.annotations.Test;
import page.AddPositionPage;
import page.LoginPage;

public class e2eTest extends BaseTest {
    @Test
    public void createShipTest() {
        imo=shipDel.getImo();
        LoginPage loginPage = new LoginPage();
        loginPage
                .login(user.getEmail(), user.getPassword())
                .openMenu()
                .myShip()
                .fleet()
                .addShipPage()
                .createShipMandatoryFields(shipDel.getImo(), shipDel.getName(), shipDel.getDwtSummer())
                .shipSearchImoForDell(shipDel.getImo())
                .getShip()
                .shouldBe(Condition.text(shipDel.getImo()))
                .shouldBe(Condition.text(shipDel.getName()))
                .shouldBe(Condition.text(shipDel.getDwtSummer()));

    }

    @Test
    public void deleteShipTest() {


        new LoginPage()
                .login(user.getEmail(),user.getPassword())
                .openMenu()
                .myShip()
                .fleet()
                .shipSearchImoForDell(imo)
                .delete()
                .pressOkButton()
                .shipIsExistForDell(imo)
                .shouldBe(CollectionCondition.size(0));
    }

    @Test
    public  void addPositionTest(){
        new LoginPage()
                .openPage()
                .login(user.getEmail(),user.getPassword());
        new AddPositionPage(ship.getIdShip())
                .openPage()
                .checkOpenPage()
                .enterPort("odessa")
                .openDate("12","02","2019");


    }


}
