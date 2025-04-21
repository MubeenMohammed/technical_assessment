package com.technicalassessment.tests;

import com.technicalassessment.base.BaseTest;
import com.technicalassessment.pages.SecurePage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {
    @BeforeMethod
    public void navigateToLoginPage() {
        driver.get("https://practice.expandtesting.com/login");
    }


    @Test
    public void testValidLogin() {
        SecurePage securePage = loginPage.
                login("practice", "SuperSecretPassword!");
        Assert.assertTrue(securePage.isSecurePageDisplayed());
        Assert.assertEquals(securePage.getSecurePageText(), "Secure Area page for Automation Testing Practice");
    }

    @Test
    public void testInvalidUserName() {
        loginPage.enterUsername("invalidUser");
        loginPage.enterPassword("invalidPassword");
        loginPage.clickLoginButton();
        String errorMessage = loginPage.getErrorMessage();
        Assert.assertEquals(errorMessage, "Your username is invalid!");
    }

    @Test
    public void testInvalidPassword() {
        loginPage.enterUsername("practice");
        loginPage.enterPassword("invalidPassword");
        loginPage.clickLoginButton();
        String errorMessage = loginPage.getErrorMessage();
        Assert.assertEquals(errorMessage, "Your password is invalid!");
    }
}
