package com.test.tests;

import org.testng.annotations.Test;
import com.test.base.BaseTest;
import com.test.pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void testLogin() {

        LoginPage loginPage = new LoginPage(driver);

        loginPage.openSite();
        loginPage.login("tomsmith", "SuperSecretPassword!");

    }
}