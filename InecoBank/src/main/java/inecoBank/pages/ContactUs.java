package inecoBank.pages;

import org.openqa.selenium.support.PageFactory;

import static util.urls.URL.CONTACT_US;

public class ContactUs extends BasePage{

    ContactUs(){
        super();
        this.url = CONTACT_US;
        get();
        PageFactory.initElements(driver, this);
    }
    @Override
    protected void load() {
//        driver.get(this.url);
        super.load();
    }
    @Override
    protected void isLoaded() throws Error {
        this.load();
        super.isLoaded();
    }
    @Override
    public String getURL() {
        return driver.getCurrentUrl();
    }
}
