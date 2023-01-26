package inecoBank.individualNavMenu;

import inecoBank.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.WaitHelpers;

import static util.URL.ACCOUNTS;

public class Account extends BasePage {
    @FindBy(linkText = "Accounts")
    private WebElement accounts;

    ///////////////////////////////////////Aacount
        @FindBy(linkText = "Account Packages")
        private WebElement accountPackages;
            @FindBy(linkText = "start")
            private WebElement start;
            @FindBy(linkText = "basic")
            private WebElement basic;
            @FindBy(linkText = "plus")
            private WebElement plus;
            @FindBy(linkText = "special")
            private WebElement special;
        @FindBy(linkText = "Special Accounts")
        private WebElement specialAccounts;
            @FindBy(linkText = "InecoSave")
            private WebElement inecoSave;
            @FindBy(linkText = "Escrow")
            private WebElement escrow;
            @FindBy(linkText = "Social Insurance")
            private WebElement socialInsurance;
            @FindBy(linkText = "Social Package")
            private WebElement socialPackage;

    ///////////////////////////////////////Aacount
    public Account (){
        super();
        this.url = ACCOUNTS;
        get();
        PageFactory.initElements(driver, this );
    }

    @Override
    public void load() {
//        driver.get(url);
        super.load();
    }

    @Override
    protected void isLoaded() throws Error {
        load();
        WaitHelpers.waitForJSToLoad(driver);
    }
    @Override
    public String getURL() {
        return driver.getCurrentUrl();
    }
}
