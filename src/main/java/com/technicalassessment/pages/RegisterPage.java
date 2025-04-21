package com.technicalassessment.pages;

import org.openqa.selenium.By;

public class RegisterPage extends BasePage{
    private final By usernameField = By.id("username");
    private final By passwordField = By.id("password");
    private final By confirmPasswordField = By.id("confirmPassword");
    private final By registerButton = By.xpath("//form//button");
    private final By errorMessage = By.xpath("//div[@id='flash-message']//b");

    public void enterUsername(String username) {
        set(usernameField, username);
    }
    public void enterPassword(String password) {
        set(passwordField, password);
    }
    public void enterConfirmPassword(String confirmPassword) {
        set(confirmPasswordField, confirmPassword);
    }
    public LoginPage clickRegisterButton() {
        click(registerButton);
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
