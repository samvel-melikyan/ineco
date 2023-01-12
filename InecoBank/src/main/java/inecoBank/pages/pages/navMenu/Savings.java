package inecoBank.pages.pages.navMenu;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Savings {

    @FindBy(linkText = "Savings")
    private WebElement savings;
    ///////////////////////////////////////Savings
        @FindBy(linkText = "Deposits")
        private WebElement deposits;
            @FindBy(linkText = "Simple Deposit")
            private WebElement simpleDeposit;
            @FindBy(linkText = "Replenishable Deposits")
            private WebElement replenishableDeposits;
            @FindBy(linkText = "Flexible Deposit")
            private WebElement flexibleDeposit;
    @FindBy(linkText = "Bonds")
    private WebElement bonds;

    ///////////////////////////////////////Saving Plan
        @FindBy(linkText = "Purpose")
        private WebElement purpose;

    ///////////////////////////////////////Savings
}
