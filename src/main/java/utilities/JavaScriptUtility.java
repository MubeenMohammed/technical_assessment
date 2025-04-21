package utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class JavaScriptUtility extends Utility {

    public static void scrollToElement(By locator) {
        WebElement element = driver.findElement(locator);
        String script = "arguments[0].scrollIntoView();";
        ((JavascriptExecutor) driver).executeScript(script, element);
    }

}
