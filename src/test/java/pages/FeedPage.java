package pages;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.$;

public class FeedPage {

    public static final String UPDATE_MOOD_CSS = "#LinkUpdate";

    public void isPageOpened() {
        $(UPDATE_MOOD_CSS).waitUntil(Condition.visible, 10000);
    }
}
