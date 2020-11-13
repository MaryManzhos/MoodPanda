package pages;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    public static final String EMAIL_CSS = "#ContentPlaceHolderContent_TextBoxEmail";
    public static final String PASS_CSS = "#ContentPlaceHolderContent_TextBoxPassword";
    public static final String LOGIN_BTN_CSS = "#ContentPlaceHolderContent_ButtonLogin";
    public static final String GP_ICON_CSS = "[alt='MoodPanda Android App on Google Play']";
    public static final String LOGIN_XPATH = "//ul[contains(@class,'nav')]//a[contains(text(),'Login')]";

    public LoginPage openPage() {
        $(LOGIN_XPATH).click();
        return this;
    }

    public LoginPage isPageOpened() {
        $(GP_ICON_CSS).waitUntil(Condition.visible, 10000);
        return this;
    }

    public FeedPage login(String email, String password) {
        $(EMAIL_CSS).click();
        $(EMAIL_CSS).setValue(email);
        $(PASS_CSS).setValue(password);
        $(LOGIN_BTN_CSS).click();
        return new FeedPage();
    }
}
