package tests;

import constants.Credentials;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.EditProfilePage;
import pages.LoginPage;
import pages.MainPage;
import pages.YourDashboardPage;


public class ChangeUserLastNameTest extends BaseTest{

    @Test
    public void changeUserDataTest() {
        LoginPage loginPage = new LoginPage();
        loginPage.login(Credentials.USERNAME, Credentials.PASSWORD);
        MainPage mainPage = new MainPage();
        mainPage.clickYourDashboardButton();
        YourDashboardPage yourDashboardPage = new YourDashboardPage();
        yourDashboardPage.clickEditProfileButton();
        EditProfilePage editProfilePage = new EditProfilePage();
        editProfilePage.changeLastName();
        editProfilePage.clickSaveButton();

        boolean isUserDataChanged = editProfilePage.isUpdateMessageDisplayed();
        Assert.assertTrue(isUserDataChanged, "Message is not displayed");
    }

}
