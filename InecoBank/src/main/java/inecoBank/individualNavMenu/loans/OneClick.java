package inecoBank.individualNavMenu.loans;

import inecoBank.pages.BasePage;

public class OneClick extends BasePage {
    protected String getURL() {
        return driver.getCurrentUrl();
    }
}
