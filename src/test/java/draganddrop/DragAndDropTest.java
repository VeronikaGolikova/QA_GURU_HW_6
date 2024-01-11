package draganddrop;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.DragAndDropOptions.to;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.actions;
import static com.codeborne.selenide.Selenide.open;

public class DragAndDropTest {
    @Test
    void dragAndDropTest() {
        open("https://the-internet.herokuapp.com/drag_and_drop");
        $(byId("column-a")).shouldHave(text("A"));
        actions().moveToElement($(byId("column-a"))).clickAndHold().moveToElement($(byId("column-b"))).release().perform();
        $(byId("column-a")).shouldHave(text("B"));
        $(byId("column-a")).dragAndDrop(to($(byId("column-b"))));
        $(byId("column-a")).shouldHave(text("A"));
    }
}
