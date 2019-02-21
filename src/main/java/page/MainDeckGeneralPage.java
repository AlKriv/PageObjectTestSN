package page;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.open;

public class MainDeckGeneralPage extends BasePage{


    private String title = "MAIN DECK";


    public String title() {
        return title;
    }

    public MainDeckGeneralPage openPage() {
        open("/main-deck/general");
        return this;
    }
    //add check open this page
    public MainDeckGeneralPage checkOpenPage(){
        getTitle()
                .shouldBe(Condition.visible)
                .shouldBe(Condition.text(title));
        return this;
    }

}
