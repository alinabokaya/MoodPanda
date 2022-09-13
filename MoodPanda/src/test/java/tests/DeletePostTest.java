package tests;

import pages.LoginPage;
import pages.MainPage;
import pages.MoodUpdatedPage;
import pages.PostUpdatePage;
import constants.Credentials;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DeletePostTest extends BaseTest {

    @Test
    public void deletePostTest() {
        LoginPage loginPage = new LoginPage();
        loginPage.login(Credentials.USERNAME, Credentials.PASSWORD);
        MainPage mainPage = new MainPage();
        PostUpdatePage postUpdatePage = new PostUpdatePage();
        mainPage.clickPostUpdateButton();
        postUpdatePage.postUpdate();
        MoodUpdatedPage moodUpdatedPage = new MoodUpdatedPage();
        moodUpdatedPage.clickHomeButton();
        mainPage.clickMessageMenuButton();
        mainPage.clickDeleteButton();

        boolean isUserNameDisplayed = mainPage.isDeleteMessageDisplayed();
        Assert.assertTrue(isUserNameDisplayed, "Message is not displayed");
    }
}
