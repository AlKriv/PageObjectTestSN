package page;

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

}
