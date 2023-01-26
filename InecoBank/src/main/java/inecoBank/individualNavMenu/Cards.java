package inecoBank.individualNavMenu;

import inecoBank.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static util.URL.*;
import static util.WaitHelpers.waitForJSToLoad;

public class Cards extends BasePage {
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

    public Cards(){
        super();
        this.url = CARDS;
        get();
        PageFactory.initElements(driver,this);
    }

    public void toVisa(){
        driver.navigate().to(CARD_VISA);
    }
    public void toMaster(){
        driver.navigate().to(CARD_MASTER);
    }
    public void toArCa(){
        driver.navigate().to(CARD_ARCA);
    }

    public String getURL() {
        return driver.getCurrentUrl();
    }

    @Override
    public void load() {
//        driver.get(url);
        super.load();
    }
    @Override
    public void isLoaded() throws Error {
        load();
        waitForJSToLoad(driver);
    }


}
