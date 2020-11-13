package pages;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static data.TestData.URL;

public class HomePage {

    public static final String LOGO_CSS = ".navbar-brand";

    public HomePage openPage() {
        open(URL);
        return this;
    }

    public HomePage isPageOpened() {
        $(LOGO_CSS).waitUntil(Condition.visible,10000);
        return this;
    }
}
