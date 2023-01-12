package inecoBank.pages.pages.navMenu;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Cards {
    @FindBy(linkText = "Cards")
    private WebElement cards;

    ///////////////////////////////////////Cards
    @FindBy(linkText = "Standard Cards")
    private WebElement standardCards;
        @FindBy(linkText = "Visa Digital")
        private WebElement visaDigital;
        @FindBy(linkText = "Visa Classic")
        private WebElement visaClassic;
        @FindBy(linkText = "Visa Gold")
        private WebElement visaGold;
        @FindBy(linkText = "MasterCard Standard")
        private WebElement masterCardStandard;
        @FindBy(linkText = "MasterCard Gold")
        private WebElement masterCardGold;
        @FindBy(linkText = "ArCa Classic")
        private WebElement arCaClassic;
    ///////////////////////////////////////Premium Cards
        @FindBy(linkText = "World Mastercard Black Edition")
        private WebElement worldMastercardBlackEdition;
        @FindBy(linkText = "Visa Signature")
        private WebElement visaSignature;
        @FindBy(linkText = "Visa Platinum")
        private WebElement visaPlatinum;

    ///////////////////////////////////////Cards
}
