package page;

import Elements.MenuElement;
import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class BasePage {
    public MenuElement openMenu() //for inside pages
    {
        $(By.xpath("//button[@class='_23-k9']")).should(Condition.visible).click();
        return new MenuElement();
    }

    public MenuElement openMenuLogout()  //for main page and the "Login page" not authorizated user
    {

        $(By.xpath("//button[@class='_23-k9 _3OMaJ Oriue']")).should(Condition.visible).click();
        return new MenuElement();
    }


}
