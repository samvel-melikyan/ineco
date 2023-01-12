package inecoBank.pages.pages.navMenu;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loans {
    @FindBy(linkText = "Loans")
    private WebElement loans;

    ///////////////////////////////////////Loans

    @FindBy(linkText = "Consumer Loans")
    private WebElement consumerLoans;
        @FindBy(linkText = "1 CLICK Online Loans")
        private WebElement oneC;
        @FindBy(linkText = "Express Consumer Loans")
        private WebElement expressConsumerLoans;
        @FindBy(linkText = "Collateral Secured")
        private WebElement sollateralSecured;
        @FindBy(linkText = "Gold Pledge Secured")
        private WebElement goldPledgeSecured;
        @FindBy(linkText = "Deposit Secured")
        private WebElement depositSecured;
    @FindBy(linkText = "Credit Lines")
    private WebElement creditLines;
        @FindBy(linkText = "Non-Collateral")
        private WebElement nonCollateral;
        @FindBy(linkText = "Collateral")
        private WebElement collateral;
    @FindBy(linkText = "Car Loan")
    private WebElement carLoan;
        @FindBy(linkText = "Partner dealers")
        private WebElement partnerdealers;
    //Other Loans
        @FindBy(linkText = "Point of Sale Loans")
        private WebElement pointOfSaleLoans;
        @FindBy(linkText = "Microbusiness Loans")
        private WebElement microbusinessLoans;


    ///////////////////////////////////////Loans
}
