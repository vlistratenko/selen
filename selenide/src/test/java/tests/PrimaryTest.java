package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pages.LoginPage;

public class PrimaryTest {

    @BeforeAll
    public void before() {
        Configuration.browserCapabilities.setBrowserName("chrome");
        Configuration.browserCapabilities.setVersion("81");
    }

    @Test
    public void loginTest() {
        new LoginPage()
                .login("admin-madison", "A123456#")
                .waitUntilWelcomeMessageIsDisplayed();
    }
}
