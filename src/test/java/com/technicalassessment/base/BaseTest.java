package com.technicalassessment.base;

import com.technicalassessment.pages.BasePage;
import com.technicalassessment.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import static utilities.Utility.setUtilityDriver;

public class BaseTest {
    protected WebDriver driver;
    protected BasePage basePage;
    protected LoginPage loginPage;
    private final String loginUrl = "https://practice.expandtesting.com/login";
    private final String registerUrl = "https://practice.expandtesting.com/register";

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(loginUrl);
        basePage = new BasePage();
        BasePage.setDriver(driver);
        setUtilityDriver();
        loginPage = new LoginPage();
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    public void navigateToRegisterPage() {
        driver.get(registerUrl);
    }
}
