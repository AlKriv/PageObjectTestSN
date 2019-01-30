package Elements;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.awt.*;

import static com.codeborne.selenide.Selenide.$;

public class MenuElement {

    public void close()
    {
        $(By.xpath("//div[@class='_3iC0k']/button")).click();

    }
    public SelenideElement getLabelEmail()
    {
        return $(By.cssSelector("div._14yZE"));
    }






    //button
    public SelenideElement loginButton(){
       return $(By.cssSelector("a._2PTJD"));
    }

}
