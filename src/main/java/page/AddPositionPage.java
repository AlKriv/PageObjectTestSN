package page;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class AddPositionPage {

    private String idShip;
    private String title="ADD POSITION";


    //construct///
    public AddPositionPage(String idShip){
        this.idShip=idShip;
    }
    //////////////

    public AddPositionPage openPage() {
        open("/vessel/fleet/" + idShip + "/add-position");
        return this;
    }

    public AddPositionPage checkOpenPage() {
        $(By.className("_3CfzY"))
                .shouldBe(Condition.visible)
                .shouldBe(Condition.text(title));
        return this;
    }
    public AddPositionPage enterPort(String port){
        $(By.xpath("//input[@name='open[where]']")).sendKeys(port);
        $(By.xpath("//div[@role='menu']")).click();
        return this;
    }
    public DatePage setDateOpen(String day, String mounth, String year){
        $(By.xpath("//input[@name='open[from]']")).click();

        DatePage datePage =new DatePage($(By.cssSelector("body > div:nth-child(13) > div")));//the window for choise data

        datePage
                .checkOpen()
                .setDateOpen(day,mounth,year);

        return datePage;
    }
}
