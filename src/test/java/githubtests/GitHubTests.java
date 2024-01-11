package githubtests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class GitHubTests {
    @Test
    void openEnterprizePage() {
        open("https://github.com/");
        $(byTagName("nav")).$(byText("Solutions")).hover();
        $(".border-bottom").$(byText("Enterprise")).click();
        $(byId("hero-section-brand-heading")).shouldHave(text("The AI-powered\ndeveloper platform"));
    }
}
