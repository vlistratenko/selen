package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    public final SelenideElement
            usernameTextField = $(By.xpath("//*[@name='_username']")),
            passwordTextField = $(By.xpath("//*[@name='_password']")),
            loginButton = $(By.xpath("//button[.='Login']"));

    public MainPage login(String username, String password) {
        usernameTextField.val(username);
        passwordTextField.val(password);
        loginButton.click();

        return new MainPage();
    }
}
