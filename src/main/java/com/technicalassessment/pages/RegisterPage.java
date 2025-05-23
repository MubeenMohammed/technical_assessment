package com.technicalassessment.pages;

import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.clickJS;
import static utilities.JavaScriptUtility.scrollToElement;

public class RegisterPage extends BasePage{
    private final By usernameField = By.id("username");
    private final By passwordField = By.id("password");
    private final By confirmPasswordField = By.id("confirmPassword");
    private final By registerButton = By.xpath("//form//button");
    private final By errorMessage = By.xpath("//div[@id='flash-message']//b");

    public void enterUsername(String username) {
        scrollToElement(usernameField);
        set(usernameField, username);
    }
    public void enterPassword(String password) {
        scrollToElement(passwordField);
        set(passwordField, password);
    }
    public void enterConfirmPassword(String confirmPassword) {
        scrollToElement(confirmPasswordField);
        set(confirmPasswordField, confirmPassword);
    }
    public LoginPage clickRegisterButton() {
        scrollToElement(registerButton);
        clickJS(registerButton);
        return new LoginPage();
    }
    public String getErrorMessage() {
        return find(errorMessage).getText();
    }

    public LoginPage register(String username, String password, String confirmPassword) {
        enterUsername(username);
        enterPassword(password);
        enterConfirmPassword(confirmPassword);
        return clickRegisterButton();
    }
}
