package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByText;
import org.openqa.selenium.By;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;

public class YourDashboardPage {

    private SelenideElement editProfileButton = $(By.xpath("//a[@href='/dashboard/editprofile'][@class='dropdown-item']"));
    private SelenideElement dropDownMenu = $(By.className("dropdown-trigger"));

    public void clickEditProfileButton() {
        dropDownMenu.shouldBe(Condition.visible, Duration.ofSeconds(2));
        dropDownMenu.click();
        editProfileButton.shouldBe(Condition.visible, Duration.ofSeconds(1));
        editProfileButton.click();
    }

}
