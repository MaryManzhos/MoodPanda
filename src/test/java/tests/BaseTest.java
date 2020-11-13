package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import com.codeborne.selenide.Configuration;
import pages.FeedPage;
import pages.HomePage;
import pages.LoginPage;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class BaseTest {
    HomePage homePage;
    LoginPage loginPage;
    FeedPage feedPage;

    @BeforeMethod
    public void setUp() {
        //Configuration.browser = "safari";
        Configuration.startMaximized = true;
        Configuration.timeout = 10000;
        homePage = new HomePage();
        loginPage = new LoginPage();
        feedPage = new FeedPage();
    }

    @AfterMethod(alwaysRun = true)
    public void closeBrowser() {
        getWebDriver().quit();
    }
}
