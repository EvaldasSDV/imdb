package pages;

import com.codeborne.selenide.*;
import static com.codeborne.selenide.Selenide.*;

public class ImdbHomePage {

    private SelenideElement searchField = $("#suggestion-search");
    private SelenideElement searchButton = $("#suggestion-search-button");

    public ImdbResultsPage searchFor(String text) {
        searchField.val(text);
        searchButton.click();
        return new ImdbResultsPage();
    }

}
