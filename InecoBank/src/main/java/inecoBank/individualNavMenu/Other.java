package inecoBank.individualNavMenu;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Other {
    ///////////////////////////////////////Other
    @FindBy(linkText = "Other")
    private WebElement other;
        @FindBy(linkText = "Investment Services")
        private WebElement investmentServices;
            @FindBy(linkText = "Security Custody Services")
            private WebElement securityCustodyServices;
            @FindBy(linkText = "Brokerage Services")
            private WebElement brokerageServices;
        @FindBy(linkText = "Insurance")
        private WebElement insurance;
            @FindBy(linkText = "Compulsory third party liability motor insurance")
            private WebElement Compulsory_third_party_liability_motor_insurance;
            @FindBy(linkText = "Motor Insurance")
            private WebElement motorInsurance;
            @FindBy(linkText = "Residential Property Insurance")
            private WebElement residentialPropertyInsurance;
            @FindBy(linkText = "Accidents Insurance")
            private WebElement accidentsInsurance;
            @FindBy(linkText = "Travel Insurance")
            private WebElement travelInsurance;
        @FindBy(linkText = "Money Transfers")
        private WebElement moneyTransfers;
            @FindBy(linkText = "Fast Transfers")
            private WebElement fastTransfers;
            @FindBy(linkText = "Transfers without  opening account")
            private WebElement transfersWithoutOpeningAccount;

    ///////////////////////////////////////Other
}
