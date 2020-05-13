package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class MainPage {
    private final SelenideElement contactsSubTab = $(By.xpath("//*[@href='/communicate/contacts']"));

    public ContactsPage clickContactsSubTab() {
        contactsSubTab.click();

        return new ContactsPage();
    }
}
