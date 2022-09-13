package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByText;
import org.openqa.selenium.By;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;

public class MainPage {

    private SelenideElement postUpdateButton = $(new ByText("Post update"));
    private SelenideElement hugButton = $(new ByText("Hug"));
    private SelenideElement hugButtonClicked = $(new ByText("Hug sent"));
    private SelenideElement messageMenuButton = $(By.className("dropdown-trigger"));
    private SelenideElement deleteButton = $(new ByText("Delete"));
    private SelenideElement deleteMessage = $(new ByText("Your post was deleted. It may take a minute or so to update the feeds"));
    private SelenideElement yourDashboardButton = $(new ByText("Your dashboard"));

    public boolean isPostUpdateDisplayed() {
        postUpdateButton.shouldBe(Condition.visible, Duration.ofSeconds(5));
        return postUpdateButton.isDisplayed();
    }

    public void clickHugButton() {
        hugButton.click();
    }

    public boolean isHugButtonClicked() {
        hugButtonClicked.shouldBe(Condition.visible, Duration.ofSeconds(2));
        return hugButtonClicked.isDisplayed();
    }

    public void clickPostUpdateButton() {
        postUpdateButton.click();
    }

    public void clickMessageMenuButton() {
        messageMenuButton.click();
    }

    public void clickDeleteButton() {
        deleteButton.click();
    }

    public boolean isDeleteMessageDisplayed() {
        deleteMessage.shouldBe(Condition.visible, Duration.ofSeconds(1));
        return deleteMessage.isDisplayed();
    }

    public void clickYourDashboardButton() {
        yourDashboardButton.click();
    }

}
