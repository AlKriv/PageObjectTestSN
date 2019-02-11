package page;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class FleetShipMessagePage{
    public FleetPage pressOkButton(){
         $(By.xpath("//div[@class='row flex justify-content-end']/div[2]//button")).click();
         return new FleetPage();
    }
    public FleetPage pressCancelButton(){
        $(By.xpath("//div[@class='row flex justify-content-end']/div//button")).click();
        return new FleetPage();
    }
}
