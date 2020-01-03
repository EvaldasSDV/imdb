package pages;

import com.codeborne.selenide.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selectors.*;

public class ImdbResultsPage {

    private SelenideElement searchCategories = $(".findFilterList");

    public ImdbVideoGameResults selectCategory(String category) {
        searchCategories.$(byText(category)).click();
        return new ImdbVideoGameResults();
    }

}
