package inecoBank;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

import static util.BaseDriver.getDriver;
import static util.BaseDriver.setDriver;

public class BaseTest {
    protected WebDriver driver;

    @BeforeMethod
    public void setUp() {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver(109).exe");
        driver = getDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @AfterMethod
    public void tearDown() {
        if(driver != null) {
            driver.quit();
            setDriver(null);
        }
    }

    @Test(enabled = false)
    private void test(){
        driver.get("https://www.google.com/");
        driver.get("https://www.yandex.ru/");
        driver.get("https://www.mozilla.org/");
        driver.navigate().back();
        driver.navigate().back();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.google.com/" );
    }

}
