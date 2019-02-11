package page;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class PositionPage extends BasePage {

    private String idShip;
    private String title = "POSITIONS";

    //construct
    public PositionPage(String idShip) {
        this.idShip = idShip;
    }
    ///////////



    public PositionPage openPage() {
        open("/vessel/fleet/" + idShip);
        return this;
    }
    public PositionPage checkOpenPage() {
        getTitle()
                .shouldBe(Condition.visible)
                .shouldBe(Condition.text(title));
        return this;
    }
    public AddPositionPage addPosition(){
        $(By.xpath("//div[@class='_3bWcE']//button")).click();

        return new AddPositionPage(idShip);
    }


}