package tests;

import pages.LoginPage;
import pages.MainPage;
import constants.Credentials;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SendHugTest extends BaseTest {

    @Test
    public void sendHugTest() {
        LoginPage loginPage = new LoginPage();
        loginPage.login(Credentials.USERNAME, Credentials.PASSWORD);
        MainPage mainPage = new MainPage();
        mainPage.clickHugButton();

        boolean isHugSentDisplayed = mainPage.isHugButtonClicked();
        Assert.assertTrue(isHugSentDisplayed, "Hug isn't sent");
    }

}
