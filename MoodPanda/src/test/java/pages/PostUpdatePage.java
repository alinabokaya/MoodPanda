package pages;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByText;

import static com.codeborne.selenide.Selenide.$;

public class PostUpdatePage {

    private SelenideElement friendsButton = $(new ByText("friends"));
    private SelenideElement updateButton = $(new ByText("Update to 5"));

    public void postUpdate() {
        friendsButton.click();
        updateButton.click();
    }

}
