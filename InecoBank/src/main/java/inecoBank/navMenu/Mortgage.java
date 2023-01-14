package inecoBank.navMenu;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Mortgage {
    @FindBy(linkText = "Mortgage")
    private WebElement mortgage;

    ///////////////////////////////////////Mortgage

        @FindBy(linkText = "Mortgage Loans")
        private WebElement mortgageLoans;
            @FindBy(linkText = "Acquisition")
            private WebElement acquisition;
            @FindBy(linkText = "Construction")
            private WebElement construction;
            @FindBy(linkText = "Renovation")
            private WebElement renovation;
            @FindBy(linkText = "Refinancing")
            private WebElement refinancing;
        @FindBy(linkText = "Constructors offers")
        private WebElement constructorsOffers;

    ///////////////////////////////////////Mortgage
}
