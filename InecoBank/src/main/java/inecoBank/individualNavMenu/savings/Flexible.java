package inecoBank.individualNavMenu.savings;

import inecoBank.pages.BasePage;
import org.openqa.selenium.support.PageFactory;

import static util.url.Deposit.DEPOSITS_FLEXIBLE;

public class Flexible extends BasePage {

    public Flexible(){
        super();
        this.url = DEPOSITS_FLEXIBLE;
        get();
        PageFactory.initElements(driver, this);
    }

    public String getURL(){
        return driver.getCurrentUrl();
    }

    @Override
    protected void load() {
//        driver.get(url);
        super.load();
    }

    @Override
    protected void isLoaded() throws Error {
        this.load();
        super.isLoaded();
    }
}
