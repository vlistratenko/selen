package tests;

import org.junit.jupiter.api.Test;
import pages.LoginPage;

public class PrimaryTest {

    @Test
    public void loginTest() {
        new LoginPage()
                .login("admin-madison", "A123456#")
                .waitUntilWelcomeMessageIsDisplayed();
    }
}
