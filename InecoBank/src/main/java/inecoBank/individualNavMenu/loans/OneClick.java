package inecoBank.individualNavMenu.loans;

import inecoBank.pages.BasePage;

public class OneClick extends BasePage {
    @Override
    public String getURL() {
        return driver.getCurrentUrl();
    }
}
