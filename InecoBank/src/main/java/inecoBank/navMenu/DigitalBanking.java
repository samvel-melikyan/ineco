package inecoBank.navMenu;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DigitalBanking {

    @FindBy(linkText = "Digital Banking")
    private WebElement digitalBanking;
    ///////////////////////////////////////Digital Banking
    @FindBy(linkText = "InecoOnline")
    private WebElement inecoOnline;
    @FindBy(linkText = "InecoMobile")
    private WebElement inecoMobile;
    @FindBy(linkText = "Payments")
    private WebElement payments;
        @FindBy(linkText = "paylater")
        private WebElement paylater;
        @FindBy(linkText = "Apple Pay")
        private WebElement applePay;
        @FindBy(linkText = "NFC")
        private WebElement nfc;
        @FindBy(linkText = "InecoPay")
        private WebElement inecoPay;

    ///////////////////////////////////////Digital Banking
}
