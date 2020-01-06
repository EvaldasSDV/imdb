package pages;

import com.codeborne.selenide.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selectors.*;

public class ImdbResultsPage {

    private SelenideElement searchCategories = $(".findFilterList");

    public ImdbVideoGameResults selectVideoGameCategory() {
        searchCategories.$(byText("Video Game")).click();
        return new ImdbVideoGameResults();
    }

}
