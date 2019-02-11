package page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class FleetPage extends BasePage {

    private String title = "MY SHIP: FLEET";


    public AddShipPage addShipPage() {
        $(By.xpath("//div[@class='raised-button']/button")).click();
        AddShipPage addShipPage = new AddShipPage();
        addShipPage
                .checkOpenPage();
        return new AddShipPage();
    }

    public FleetPage checkOpenPage() {
        getTitle()
                .shouldBe(Condition.visible)
                .shouldBe(Condition.text(title));
        return this;
    }

    public FleetShipPage shipSearchImoForDell(String imo)//для неподтвержденных судов
    {
        //получает список элементов
        //находит елемент с нужным imo
        //возвращает 0й элемент массива
        SelenideElement shipPage=$$(By.xpath("//section[@class='_3QtUN _3AjEp']")).filter(Condition.text(imo)).get(0);

        FleetShipPage  fleetShipPage=new FleetShipPage(shipPage);
        return fleetShipPage;
    }
    public FleetShipPage shipSearchImo(String imo)//Для подтвержденных судов
     {
        //получает список элементов
        //находит елемент с нужным imo
        //возвращает 0й элемент массива
        SelenideElement shipPage=$$(By.xpath("//section[@class='_3QtUN _3AjEp']")).filter(Condition.text(imo)).get(0);

        FleetShipPage  fleetShipPage=new FleetShipPage(shipPage);
        return fleetShipPage;
    }


    public ElementsCollection shipIsExistForDell(String imo){
        return $$(By.xpath("//section[@class='_3QtUN _3AjEp']")).filter(Condition.text(imo));
    }



}
