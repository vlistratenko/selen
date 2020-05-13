package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginPage {

    public final SelenideElement
            usernameTextField = $(By.xpath("//*[@name='_username']")),
            passwordTextField = $(By.xpath("//*[@name='_password']")),
            loginButton = $(By.xpath("//button[.='Login']"));

    public MainPage login(String username, String password) {
        open("https://dev3-madison.advisorengine.net/");

        usernameTextField.val(username);
        passwordTextField.val(password);
        loginButton.click();

        return new MainPage();
    }
}
