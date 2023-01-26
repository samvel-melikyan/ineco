package inecoBank.individualNavMenu.savings;

import inecoBank.pages.BasePage;
import org.openqa.selenium.support.PageFactory;

import static util.URL.DEPOSITS_FLEXIBLE;
import static util.URL.DEPOSITS_REPLENISHABLE;

public class Replenishable extends BasePage {
    public Replenishable(){
            super();
            this.url = DEPOSITS_REPLENISHABLE;
            get();
            PageFactory.initElements(driver, this);
        }
    @Override
    public String getURL() {
        return driver.getCurrentUrl();
    }



    @Override
    protected void load() {
//        driver.get(driver);
        super.load();
    }
    @Override
    protected void isLoaded() throws Error {
        super.isLoaded();
    }
}
