package page;


import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class AddShipPage extends BasePage{

    private String title ="MY SHIP: CREATE";


    public String title() {
        return title;
    }

    //Button
    public FleetPage cancel(){
        $(By.xpath("//div[@class='COk6w']//button")).click();
        return new FleetPage();
    }
    public FleetPage save(){
        $(By.xpath("//div[@class='COk6w']/div[2]/button")).click();
        return new FleetPage();
    }

    //Mandatory fields
    public AddShipPage typeName(String name){
        $(By.name("name")).sendKeys(name);
        return this;
    }

    public AddShipPage typeImo(String imo){
        $(By.name("imoNumber")).sendKeys();
        return this;
    }
    public AddShipPage dwsSummer(String dws){
        $(By.id("dw[summer]")).sendKeys(dws);
        return this;
    }
    public AddShipPage year(){
        $(By.name("blt")).click();
        $(By.xpath("//div[@role='menu']/div")).click();
        return this;
    }
    public AddShipPage flag(){
        $(By.name("flag")).click();
        $(By.xpath("//div[@role='menu']/div")).click();
        return this;
    }
    public AddShipPage typeVessel(){
        $(By.name("type")).click();
        $(By.xpath("//div[@role='menu']/div[2]")).click();
        return this;
    }
}
