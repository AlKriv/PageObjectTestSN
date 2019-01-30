package page;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class AddShipPage {

    //Button
    public FleetPage cancel(){
        $(By.xpath("//div[@class='COk6w']//button")).click();
        return new FleetPage();
    }
    public FleetPage save(){
        $(By.xpath("//div[@class='COk6w']/div[2]/button")).click();
        return new FleetPage;
    }
}
