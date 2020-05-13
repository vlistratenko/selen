package tests;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import pages.LoginPage;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class PrimaryTests {

    @Test
    public void loginTest() {
        open("https://dev3-madison.advisorengine.net/");
        new LoginPage().login("admin-madison", "A123456#");

        $(By.xpath("//*[.='Welcome to AdvisorEngine.']")).waitUntil(Condition.visible, 50000);
    }
}
