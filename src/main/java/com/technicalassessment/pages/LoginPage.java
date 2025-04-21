package com.technicalassessment.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static utilities.JavaScriptUtility.scrollToElement;

public class LoginPage extends BasePage {
    private final By usernameField = By.id("username");
    private final By passwordField = By.id("password");
    private final By loginButton = By.xpath("//form//button");
    private final By ErrorMessage = By.xpath("//div[@id='flash']//b");

    public void enterUsername(String username) {
        scrollToElement(usernameField);
        set(usernameField, username);
    }

    public void enterPassword(String password) {
        scrollToElement(passwordField);
        set(passwordField, password);
    }

    public SecurePage clickLoginButton() {
        scrollToElement(loginButton);
        click(loginButton);
        return new SecurePage();
    }

    public String getErrorMessage() {
        WebElement errorMessageElement = find(ErrorMessage);
        return errorMessageElement.getText();
    }

    public SecurePage login(String username, String password) {
        enterUsername(username);
        enterPassword(password);
        return clickLoginButton();
    }
}
