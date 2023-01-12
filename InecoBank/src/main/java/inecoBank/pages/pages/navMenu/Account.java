package inecoBank.pages.pages.navMenu;

import inecoBank.pages.pages.BasePage;
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
        get();
//        load();
        PageFactory.initElements(driver, this );
    }

    @Override
    public void load() {
        driver.get(ACCOUNTS);
    }

    @Override
    protected void isLoaded() throws Error {
        WaitHelpers.waitForJSToLoad();
    }

    public String getURL() {
        return driver.getCurrentUrl();
    }
}
