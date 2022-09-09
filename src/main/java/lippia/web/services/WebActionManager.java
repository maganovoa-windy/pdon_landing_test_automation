package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.driver.DriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class WebActionManager extends ActionManager {
    public static void scroll(String locatorElement, String... locatorReplacementArgs) {
        WebElement element = waitVisibility(locatorElement, locatorReplacementArgs);
        scroll(element);
    }

    protected static void scroll(WebElement element) {
        JavascriptExecutor jse = DriverManager.getDriverInstance();
        jse.executeScript("arguments[0].scrollIntoView()", element);
    }



}
