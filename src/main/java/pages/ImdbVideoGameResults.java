package pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.*;

public class ImdbVideoGameResults {

    private SelenideElement categoryHeader = $("#findSubHeader");

    public SelenideElement categorySubHeader() {
        return categoryHeader;
    }
}
