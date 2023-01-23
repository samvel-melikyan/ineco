package inecoBank.individualNavMenu.loans;

import inecoBank.pages.BasePage;

public class OneClick extends BasePage {
     public String getURL() {
        return driver.getCurrentUrl();
    }
}
