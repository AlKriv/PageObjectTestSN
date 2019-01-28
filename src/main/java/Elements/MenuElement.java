package Elements;

import org.openqa.selenium.By;

import java.awt.*;

import static com.codeborne.selenide.Selenide.$;

public class MenuElement {

    public MenuElement open()
    {
        $(By.id("Menu/Sandvich")).click();
        return this;
    }
    public MenuElement labelEmail()
    {
        $(By.cssSelector("div._14yZE"));
        return this;
    }

}
