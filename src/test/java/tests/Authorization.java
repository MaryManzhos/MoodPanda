package tests;

import org.testng.annotations.BeforeClass;

import static data.TestData.EMAIL;
import static data.TestData.PASSWORD;

public class Authorization extends BaseTest {

    @BeforeClass
    public void authorization() {
        homePage
                .openPage()
                .isPageOpened();
        loginPage
                .openPage()
                .isPageOpened()
                .login(EMAIL, PASSWORD)
                .isPageOpened();
    }
}
