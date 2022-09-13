package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByText;
import org.openqa.selenium.By;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;

public class EditProfilePage {
    private SelenideElement updateMessage = $(new ByText("Your identity was updated"));
    private SelenideElement userNameField = $(By.xpath("//input[@placeholder='e.g Jake']"));
    private SelenideElement userLastNameField = $(By.xpath("//input[@placeholder='e.g. S']"));
    private SelenideElement saveButton = $(new ByText("Save identity"));
    public String name = "NotAlina";
    public String lastName = "K";


    public void changeName() {
        userNameField.shouldBe(Condition.visible, Duration.ofSeconds(1));
        userNameField.clear();
        userNameField.sendKeys(name);

    }

    public void changeLastName() {
        userLastNameField.shouldBe(Condition.visible, Duration.ofSeconds(2));
        userLastNameField.clear();
        userLastNameField.sendKeys(lastName);

    }

    public boolean isUpdateMessageDisplayed() {
        updateMessage.shouldBe(Condition.visible, Duration.ofSeconds(2));
        return updateMessage.isDisplayed();
    }

    public void clickSaveButton() {
        saveButton.click();
    }

}
