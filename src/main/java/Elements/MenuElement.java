package Elements;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import page.FleetPage;

import java.awt.*;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.title;

public class MenuElement {

    public void close()
    {
        $(By.xpath("//div[@class='_3iC0k']/button")).click();

    }
    public SelenideElement getLabelEmail()
    {
        return $(By.cssSelector("div._14yZE"));
    }

    //menu item
    public void home(){
        $(By.xpath("//a[@class='pBjTn']")).click();
    }

    //Main Deck
    public MenuElement mainDeck(){
        $(By.xpath("//div[@class='_2ZrUi']//span")).click();
        return this;
    }
    public void generalCargo() {
        $(By.xpath("//a[@class='ZVL9_ _1AVr4']")).click();
    }


    //My Cargo
    public MenuElement myCargo(){
        $(By.xpath("//div[@class='_2ZrUi']/div[3]/span")).click();
        return this;
    }
    public void request(){
        $(By.xpath("//div[@class='_2ZrUi']/div[3]//a")).click();
    }


    //MyShip
    public MenuElement myShip(){
        $(By.xpath("//div[@class='_2ZrUi']/div[4]//span")).click();
        return this;
    }
    public void freightOffers(){
        $(By.xpath("//div[@class='_2ZrUi']/div[4]/div/div//a"));
    }
    public FleetPage fleet(){
        $(By.xpath("//div[@class='_2ZrUi']/div[4]/div/div[2]//a")).click();

        FleetPage fleetPage=new FleetPage();
        fleetPage
                .getTitle()
                .shouldBe(Condition.visible)
                .shouldBe(Condition.text(fleetPage.title()));

        return fleetPage;
    }


    //

    //button
    public SelenideElement loginButton(){
       return $(By.cssSelector("a._2PTJD"));
    }

}
