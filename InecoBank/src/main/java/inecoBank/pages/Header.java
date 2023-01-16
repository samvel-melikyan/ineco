package inecoBank.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import util.CustomLoadableComponent;

import static util.BaseDriver.getDriver;
import static util.URL.BASE;
import static util.WaitHelpers.waitForJSToLoad;

public class Header extends CustomLoadableComponent<Header> {
    protected WebDriver driver;

    //////////////////////////////////////////<header>//////////////////////////////////////////////////////////////////////////////

//    @FindBy(className="navSegment__logo")
//    private WebElement logoBtn;
//
////------------------------------------
//    @FindBy(linkText="Individuals")
//    private WebElement individuals;
//    @FindBy(linkText="Business")
//    private WebElement business;
//    @FindBy(linkText="Premium")
//    private WebElement premium;
//
////------------------------------------
//
//
//    @FindBy(className="headerSearchForm__submit")
//    private WebElement search;
//    @FindBy(className="languageDropDown__btn.languageDropDown__btn--icon")
//    private WebElement language;
//    @FindBy(className="headerSearchForm__close")
//    private WebElement searchClose;
//    @FindBy(className="headerTopContacts__item headerTopContacts__item--weekdays")
//    private WebElement phonenumber;
//
//////////////////////////////////////////<secondaryNav>////////////////////////////////////////////////////////////////////////////////
//    @FindBy(className="btn.btn--fullWidth.btn--secondary")
//    private WebElement signIn;


////////////////////////////////////////<header>///////////////////////////////////////////////////////////////////////////////////////////

    Header(){
        driver = getDriver();
        PageFactory.initElements(driver, this);

    }

    @Override
    protected void load() {

    }


    @Override
    protected void isLoaded() throws Error {

    }




}
