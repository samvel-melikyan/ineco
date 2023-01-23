package inecoBank.individualNavMenu.savings;

import inecoBank.pages.BasePage;

public class Replenishable extends BasePage {
    public String getURL(){
        return driver.getCurrentUrl();
    }
}
