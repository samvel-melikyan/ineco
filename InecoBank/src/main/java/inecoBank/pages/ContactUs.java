package inecoBank.pages;

import static util.URL.CONTACT_US;
import static util.WaitHelpers.waitForJSToLoad;

public class ContactUs extends BasePage{

    ContactUs(){
        this.url = CONTACT_US;
    }
    @Override
    protected void load() {
        driver.get(this.url);
    }
    @Override
    protected void isLoaded() throws Error {
        load();
        waitForJSToLoad(driver);
    }
    @Override
    public String getURL() {
        return driver.getCurrentUrl();
    }
}
