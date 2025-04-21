package com.technicalassessment.pages;

import org.openqa.selenium.By;

public class SecurePage extends BasePage{
    private final By securePageText = By.xpath("//h4[@class='subheader']");

    public boolean isSecurePageDisplayed() {
        return find(securePageText).isDisplayed();
    }
}
