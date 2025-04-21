package com.technicalassessment.pages;

import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollToElement;

public class SecurePage extends BasePage{
    private final By securePageText = By.xpath("//h1");
    private final By logoutButton = By.xpath("//div[@class='page-layout']//a[@href='/logout']");

    public boolean isSecurePageDisplayed() {
        scrollToElement(securePageText);
        return find(securePageText).isDisplayed();
    }

    public String getSecurePageText() {
        scrollToElement(securePageText);
        return find(securePageText).getText();
    }

    public void clickLogoutButton() {
        scrollToElement(logoutButton);
        find(logoutButton).click();
    }
}
