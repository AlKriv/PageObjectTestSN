package page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byText;

public class DatePage {

    SelenideElement datePage;
    String idShip;

    //construct//
    public DatePage(SelenideElement se){
        this.datePage=se;

    }
    /////////////


    public DatePage checkOpen(){
        datePage.shouldBe(Condition.visible);
        return this;
    }
    public void setDateOpen(String day, String mounth, String year) {




        //set year
        String yearNow =datePage.find(By.xpath("//div[@direction='down']/div|//div[@direction='up']/div")).getText();
        if (Integer.parseInt(year)>Integer.parseInt(yearNow))
        {
            datePage.find(By.xpath("//div[@direction='down']/div|//div[@direction='up']/div")).click();
            datePage.find(byText(year)).click();
        }
        //set mounth





        //set Day
        datePage.find(byText(day)).click();

    }


}
