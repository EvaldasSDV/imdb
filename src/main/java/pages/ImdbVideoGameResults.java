package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class ImdbVideoGameResults {

    private SelenideElement categoryHeader = $("#findSubHeader");

    public void assertIfHasText(String category) {
        categoryHeader.shouldHave(text(category));
    }
}
