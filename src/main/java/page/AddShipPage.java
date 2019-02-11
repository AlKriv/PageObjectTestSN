package page;


import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class AddShipPage extends BasePage{

    private String title ="MY SHIP: CREATE";


    //Button
    public FleetPage cancel(){
        $(By.xpath("//div[@class='COk6w']//button")).click();
        return new FleetPage();
    }
    public FleetPage save(){
        $(By.xpath("//div[@class='COk6w']/div[2]/button")).click();
        FleetPage fleetPage = new FleetPage();
        fleetPage
                .checkOpenPage();
        return fleetPage;
    }
    //Mandatory fields
    public AddShipPage typeName(String name){
        $(By.name("name")).sendKeys(name);
        return this;
    }
    //add check open this page
    public AddShipPage checkOpenPage(){
        getTitle()
                .shouldBe(Condition.visible)
                .shouldBe(Condition.text(title));
        return this;
    }


    public AddShipPage typeImo(String imo){
        $(By.name("imoNumber")).sendKeys(imo);
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


    public FleetPage createShipMandatoryFields(String imo, String name, String dwtSummer){

        return this.typeImo(imo)
                .typeName(name)
                .dwsSummer(dwtSummer)
                .flag()
                .year()
                .typeVessel()
                .save();

    }
}
