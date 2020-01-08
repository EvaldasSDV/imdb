package base;

import com.codeborne.selenide.testng.ScreenShooter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.ImdbHomePage;
import pages.ImdbResultsPage;
import pages.ImdbVideoGameResults;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Condition.text;

@Listeners({ScreenShooter.class} )
public class ImdbTests {

    @BeforeTest
    public void before() {
        ScreenShooter.captureSuccessfulTests = true;
        open("http://www.imdb.com");
    }

    @Test
    public void testGot() {
        ImdbResultsPage results = new ImdbHomePage().searchFor("games of thrones");
        ImdbVideoGameResults videoResults = results.selectVideoGameCategory();
        videoResults.categorySubHeader().shouldHave(text("Video Game Titles"));
    }
}
