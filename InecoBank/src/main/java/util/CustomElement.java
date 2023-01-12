package util;

import org.openqa.selenium.WebElement;


import static util.WaitHelpers.toBeClickable;
import static util.WaitHelpers.visibilityOf;

public class CustomElement {


    public static String toUpperCase() {
        return "";
    }


    public static void click(WebElement element) {
        toBeClickable(element);
        element.click();
    }

    public static void sendKyes(WebElement element, String key) {
        visibilityOf(element);
        element.clear();
        element.sendKeys(key);
    }

    public static String getText(WebElement element) {
        visibilityOf(element);

        return element.getText();
    }

//    public static void select(WebElement element){
//        // until element is selected
//        toBeSelected(driver, element);
//
//    }


}
