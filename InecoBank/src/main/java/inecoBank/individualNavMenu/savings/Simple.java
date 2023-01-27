package inecoBank.individualNavMenu.savings;

import inecoBank.pages.BasePage;
import org.openqa.selenium.support.PageFactory;

import static util.url.Deposit.DEPOSIT_SIMPLE;

public class Simple extends BasePage {

    public Simple(){
        super();
        this.url = DEPOSIT_SIMPLE;
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
        super.isLoaded();
    }
}
