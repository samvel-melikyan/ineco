package util;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;
import static util.BaseDriver.getDriver;

public class WaitHelpers {
    private static WebDriverWait wait;      // = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
    public static Duration waitTime = Duration.ofSeconds(10);


    public static void toBeClickable(WebElement element) {
        wait = (WebDriverWait) new WebDriverWait(getDriver(), waitTime);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void visibilityOf( WebElement element) {
        wait = (WebDriverWait) new WebDriverWait(getDriver(), waitTime);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void toBeSelected( WebElement element) {
        wait = new WebDriverWait(getDriver(), waitTime);
        wait.until(ExpectedConditions.elementToBeSelected(element));
    }

    //  RETURNS BOOLEAN IF TITLE IS EQUAL TO GIVEN TEXT

    public static void testToBePresent(WebElement element, String text) {
        wait = new WebDriverWait(getDriver(), waitTime);
        wait.until(ExpectedConditions.textToBePresentInElement(element, text));
    }

    public static void title( String title) {
        wait = new WebDriverWait(getDriver(), waitTime);
        wait.until(ExpectedConditions.titleIs(title));
    }

    public static Object waitForJQuaryToLoad() {

        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(30));

        // wait for jQuery to load
        ExpectedCondition<Boolean> jQueryLoad = new ExpectedCondition<Boolean>() {

            @Override
            public Boolean apply(WebDriver driver) {
                try {
                    return ((Long) executeJavaScript(getDriver(), "return jQuery.active") == 0);
                } catch (Exception e) {
                    return true;
                }
            }
        };
        return wait.until(jQueryLoad);
    }


    public static boolean waitForJSToLoad(WebDriver driver) {
        wait = new WebDriverWait(getDriver(), Duration.ofSeconds(30));
        // wait for Javascript to load
        ExpectedCondition<Boolean> jsLoad = new ExpectedCondition<Boolean>() {
            @Override
            public Boolean apply(WebDriver driver) {
                return executeJavaScript(driver, "return document.readyState").toString().equals("complete");
            }
        };
        return wait.until(jsLoad);
    }



    private static Object executeJavaScript(WebDriver driver, String s) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        return js.executeScript(s);
    }


}
