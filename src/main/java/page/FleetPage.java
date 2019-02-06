package page;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class FleetPage extends BasePage{

    String title ="MY SHIP: FLEET";


    public String title() {
        return title;
    }

    public AddShipPage addShipPage(){
        $(By.xpath("//div[@class='raised-button']/button")).click();
        AddShipPage addShipPage=new AddShipPage();
        addShipPage
                .getTitle()
                .shouldBe(Condition.visible)
                .shouldBe(Condition.text(addShipPage.title()));
        return new AddShipPage();
    }

}
