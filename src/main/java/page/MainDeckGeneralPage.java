package page;

import static com.codeborne.selenide.Selenide.open;

public class MainDeckGeneralPage extends BasePage{

    public MainDeckGeneralPage openPage() {
        open("/main-deck/general");
        return this;
    }

}
