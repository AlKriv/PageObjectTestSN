package page;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class FleetPage extends BasePage{

    public AddShipPage addShipPage(){
        $(By.xpath("//div[@class='raised-button']/button")).click();
        return new AddShipPage();
    }

}
