package com.technicalassessment.tests;

import com.technicalassessment.base.BaseTest;
import com.technicalassessment.pages.LoginPage;
import com.technicalassessment.pages.SecurePage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegisterTests extends BaseTest {
    @BeforeMethod
    public void navigateToRegisterPage() {
        driver.get("https://practice.expandtesting.com/register");
    }

    // Test case for successful registration
    @Test
    public void testValidRegister() {
        String username = generateUniqueUsername();
        registerPage.enterUsername(username);
        registerPage.enterPassword("Mubeen1234");
        registerPage.enterConfirmPassword("Mubeen1234");
        LoginPage loginPage = registerPage.clickRegisterButton();
        SecurePage securePage = loginPage.login(username, "Mubeen1234");
        Assert.assertTrue(securePage.isSecurePageDisplayed());
        Assert.assertEquals(securePage.getSecurePageText(), "Secure Area page for Automation Testing Practice");
    }

    // Test case for invalid username
    @Test
    public void testPasswordMismatch() {
        registerPage.enterUsername("Mubeen213123");
        registerPage.enterPassword("Mubeen1234");
        registerPage.enterConfirmPassword("Mubeen12345");
        LoginPage loginPage = registerPage.clickRegisterButton();
        String errorMessage = registerPage.getErrorMessage();
        Assert.assertEquals(errorMessage, "Passwords do not match.");
    }

    // Test for already registered username
    @Test
    public void testAlreadyRegisteredUsername() {
        String username = "Mubeen";
        registerPage.enterUsername(username);
        registerPage.enterPassword("Mubeen1234");
        registerPage.enterConfirmPassword("Mubeen1234");
        LoginPage loginPage = registerPage.clickRegisterButton();
        String errorMessage = registerPage.getErrorMessage();
        Assert.assertEquals(errorMessage, "An error occurred during registration. Please try again.");
    }

    @Test
    public void testEmptyUsername() {
        registerPage.enterUsername("");
        registerPage.enterPassword("Mubeen1234");
        registerPage.enterConfirmPassword("Mubeen1234");
        LoginPage loginPage = registerPage.clickRegisterButton();
        String errorMessage = registerPage.getErrorMessage();
        Assert.assertEquals(errorMessage, "All fields are required.");
    }

    @Test
    public void testEmptyPassword() {
        registerPage.enterUsername("Mubeen");
        registerPage.enterPassword("");
        registerPage.enterConfirmPassword("");
        LoginPage loginPage = registerPage.clickRegisterButton();
        String errorMessage = registerPage.getErrorMessage();
        Assert.assertEquals(errorMessage, "All fields are required.");
    }

    @Test
    public void testEmptyUsernameAndPassword() {
        registerPage.enterUsername("");
        registerPage.enterPassword("");
        registerPage.enterConfirmPassword("");
        LoginPage loginPage = registerPage.clickRegisterButton();
        String errorMessage = registerPage.getErrorMessage();
        Assert.assertEquals(errorMessage, "All fields are required.");
    }


    private String generateUniqueUsername() {
        return "Mubeen" + System.currentTimeMillis();
    }
}
