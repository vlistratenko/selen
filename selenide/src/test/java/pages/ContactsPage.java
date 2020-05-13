package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ContactsPage {
    private final SelenideElement
            newContactButton = $(By.xpath("//button[.='New Contact']")),
            contactFirstNameTextField = $(By.xpath("//*[@name='firstName']")),
            contactLastNameTextField = $(By.xpath("//*[@name='lastName']")),
            adviorCodeDropDown = $(By.xpath("//*[@id='react-select-5--value']")),
            officeCodeDropDown = $(By.xpath("//*[@id='react-select-6--value']")),
            saveContactButton = $(By.xpath("//button[@type='submit'][.='Save']"));

    public ContactsPage addNewContact(String contactFirstName, String contactLastName, String adviorCode) {
        newContactButton.click();
        contactFirstNameTextField.val(contactFirstName);
        contactLastNameTextField.val(contactLastName);
        adviorCodeDropDown.click();
        $(By.xpath(String.format("//*[contains(@id, 'react-select-5--option')][.='%s']", adviorCode))).click();
        saveContactButton.click();

        return this;
    }
}
