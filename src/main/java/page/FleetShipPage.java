package page;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class FleetShipPage {
// the page discribe one ship
    private SelenideElement shipPage;


    public FleetShipPage(SelenideElement shipPage){
        this.shipPage=shipPage;
    }

    public FleetShipMessagePage delete()
    {
        shipPage.find((By.className("_3YNlp"))).click();
       // deleteButton.click();
        //выпадающее окно
        return new FleetShipMessagePage();
    }

    public SelenideElement getShip(){
                return shipPage;
    }


}
