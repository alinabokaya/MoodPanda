package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByText;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;

public class MoodUpdatedPage {

    private SelenideElement homeButton = $(new ByText("Home"));

    public void clickHomeButton() {
        homeButton.shouldBe(Condition.visible, Duration.ofSeconds(2));
        homeButton.click();
    }

}
