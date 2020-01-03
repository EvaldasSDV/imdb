package base;

import com.codeborne.selenide.testng.ScreenShooter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.ImdbHomePage;
import pages.ImdbResultsPage;
import pages.ImdbVideoGameResults;
import static com.codeborne.selenide.Selenide.open;

@Listeners({ScreenShooter.class} )
public class ImdbTests {

    @BeforeTest
    public void before() {
        ScreenShooter.captureSuccessfulTests = true;
    }

    @Test
    public void testGot() {
        open("http://www.imdb.com");
        ImdbResultsPage results = new ImdbHomePage().searchFor("games of thrones");
        ImdbVideoGameResults videoResults = results.selectCategory("Video Game");
        videoResults.assertIfHasText("Video Game Titles");
    }
}
