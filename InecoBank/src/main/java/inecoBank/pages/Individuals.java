package inecoBank.pages;

import inecoBank.individualNavMenu.Account;
import inecoBank.individualNavMenu.Cards;
import inecoBank.individualNavMenu.loans.OneClick;
import inecoBank.individualNavMenu.savings.Flexible;
import inecoBank.individualNavMenu.savings.Replenishable;
import inecoBank.individualNavMenu.savings.Savings;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static util.CustomElement.click;
import static util.CustomElement.sendKyes;
import static util.urls.URL.INDIVIDUALS;
import static util.WaitHelpers.waitForJSToLoad;

public class Individuals extends BasePage {
    //  #come_online
    @FindBy(css = "#promotion\\.individual\\.homepage\\.online\\.services\\.1 > div > div.promotion__description > div.promotion__links > div")
    private WebElement openAnewAccount;
//    //  #order_online
    @FindBy(css = "#promotion\\.individual\\.homepage\\.online\\.services\\.2․cards > div:nth-child(1) > div:nth-child(4) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > a:nth-child(1)")
    private WebElement visa;
    @FindBy(xpath = "//*[@id=\"promotion.individual.homepage.online.services.2․cards\"]/div/div[3]/div[2]/div/div[2]/a")
    private WebElement master;
    @FindBy(xpath = "//*[@id=\"promotion.individual.homepage.online.services.2․cards\"]/div/div[3]/div[2]/div/div[3]/a")
    private WebElement arCa;
//    //  #save_online

    @FindBy(xpath = "//*[@id=\"promotion.individual.homepage.online.services.5.savings\"]/div/div[3]/div[2]/div/div[1]/a")
    private WebElement simple;
    @FindBy(xpath = "//*[@id=\"promotion.individual.homepage.online.services.5.savings\"]/div/div[3]/div[2]/div/div[2]/a")
    private WebElement flexible;
    @FindBy(xpath = "//*[@id=\"promotion.individual.homepage.online.services.5.savings\"]/div/div[3]/div[2]/div/div[3]/a")
    private WebElement replenishable;
//    //  #get_Online
    @FindBy(xpath = "//*[@id=\"promotion.individual.homepage.online.services.4․loans\"]/div/div[3]/div[2]/div/div/a")
    private WebElement oneClickLoan;
//    //  Contact
    @FindBy(css = "#promotion\\.individual\\.homepage\\.online\\.services\\.6 > div:nth-child(1) > div:nth-child(3) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > a:nth-child(1)")
    private WebElement contactCenter;
    @FindBy(css = "#promotion\\.individual\\.homepage\\.online\\.services\\.6 > div:nth-child(1) > div:nth-child(3) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > a:nth-child(1)")
    private WebElement e_mail;
//
//    //  Online Payments
    @FindBy(css = "div.c-row__col--6:nth-child(1) > a:nth-child(1)")
    private WebElement loanRepayment;
    @FindBy(css = "div.c-row__col--6:nth-child(2) > a:nth-child(1)")
    private WebElement depositReplenishment;
    @FindBy(css = "div.c-row__col--6:nth-child(3) > a:nth-child(1)")
    private WebElement cardReplenishment;
    @FindBy(css = "div.squareLinkGroup__item:nth-child(4) > a:nth-child(1)")
    private WebElement accounReplenishment;
//
//    //  Exchange RAtes
    @FindBy(css = "#root > div > main > div.currencyCalculatorGroupWrapper > div.container > div > div.currencyCalculatorGroup__item.currencyRates.container--main.c-row__col.c-row__col--5 > div.currencyRates__group > div > div.currencyCalculator__tags > div > div > div:nth-child(1) > button")
    private WebElement cashBtn;
    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div[3]/div[1]/div/div[2]/div[2]/div/div[1]/div/div/div[2]/button")
    private WebElement nonCashBtn;
    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div[3]/div[1]/div/div[2]/div[2]/div/div[1]/div/div/div[3]/button")
    private WebElement onlineBtn;
    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div[3]/div[1]/div/div[2]/div[2]/div/div[1]/div/div/div[4]/button")
    private WebElement cardBtn;
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//    //Have
    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div[3]/div[1]/div/div[2]/div[2]/div/div[3]/div/div[1]/div[2]/div/div/div/div[1]/span")
    private WebElement have;
    @FindBy(id = "haveCurrencyAmount")
    private WebElement haveInpiut;
    @FindBy(css = "#root > div > main > div.currencyCalculatorGroupWrapper > div.container > div > div.currencyCalculatorGroup__item.currencyRates.container--main.c-row__col.c-row__col--5 > div.currencyRates__group > div > div.currencyCalculator__exchange > div > div:nth-child(1) > div:nth-child(2) > div > div > div > div.customDropDown__options > div")
    public static ArrayList<WebElement> haveCheckItem;
//
//    //Want
//    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div[3]/div[1]/div/div[2]/div[2]/div/div[3]/div/div[3]/div[2]/div/div/div/div[1]/span")
//    private WebElement want;
//    @FindBy(id = "wantCurrencyAmount")
//    private WebElement wantInpiut;
//    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div[3]/div[1]/div/div[2]/div[2]/div/div[3]/div/div[3]/div[2]/div/div/div/div[2]/div")
//    private ArrayList <WebElement> wantCheckItem;
//
//    @FindBy(className = "currencyExchange__icon")
//    private WebElement changeIcon;
//
//    //InecoMobile
//    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div[4]/div/div/div/div[2]/div/div/div[2]/div/div[2]/a[1]")
//    private WebElement appStore;
//    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div[4]/div/div/div/div[2]/div/div/div[2]/div/div[2]/a[2]")
//    private WebElement playStore;
//    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div[4]/div/div/div/div[2]/div/div/div[2]/div/div[2]/a[3]/span/span")
//    private WebElement inecoMobile;
//
//    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div[5]/div[2]/div[2]/div/div[2]/div[2]/a")
//    private WebElement newsMore;
//    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div[5]/div[2]/div[3]/div/div[2]/div[2]/a")
//    private WebElement notificMore;

    public Individuals(){
        super();
        this.url = INDIVIDUALS;
        get();
        PageFactory.initElements(driver,this);
    }

    public Account newAccount(){
        click(openAnewAccount);
        return new Account();
    }
//    public Account goToAccount(){
//
//    }

    public Cards visaBtn(){
        click(visa);
        return new Cards();
    }
    public Cards arCaBtn(){
        click(arCa);
        return new Cards();
    }
    public Cards masterBtn(){
        click(master);
        return new Cards();
    }
    public Savings simpleBn(){
        click(simple);
        return new Savings();
    }

    public Flexible flexibleBtn(){
        click(flexible);
        return new Flexible();
    }
    public Replenishable replenishableBn(){
        click(replenishable);
        return new Replenishable();
    }
    public OneClick oneClickLoanBn(){
        click(oneClickLoan);
        return new OneClick();
    }
    public ContactUs contactCenterBn(){
        click(contactCenter);
        return new ContactUs();
    }
    public ContactUs e_mailBtn(){
        click(e_mail);
        return new ContactUs();
    }

    public NotExist loanRepaymentBtn(){
        click(loanRepayment);
        return new NotExist();
    }
    public NotExist depositReplenishmentBtn(){
        click(depositReplenishment);
        return new NotExist();
    }
    public NotExist cardReplenishmentBtn(){
        click(cardReplenishment);
        return new NotExist();
    }
    public NotExist accounReplenishmentBtn(){
        click(accounReplenishment);
        return new NotExist();
    }

    public void cashBtnBn(){
        click(cashBtn);
    }

    public void nonCashBtnBn(){
        click(nonCashBtn);
    }

    public void onlineBn(){
        click(onlineBtn);
    }

    public void cardBn(){
        click(cardBtn);
    }
    public  ArrayList haveBn(){
//        click(have);
        return haveCheckItem;
    }

    public static void main(String[] args) {
        List<WebElement> blo = Individuals.haveCheckItem;
//        for (WebElement i : blo){
//            System.out.println();
//        }
        System.out.println(blo.size());

    }




    public void haveInpiutBn(String num){
        sendKyes(haveInpiut, num);
    }
//    public ArrayList wantBn(){
//        click(want);
//        return wantCheckItem;
//    }
//    public void wantInpiutBn(String num){
//        sendKyes(wantInpiut, num);
//    }
//    public void changeIconBn(){
//        click(changeIcon);
//    }
//
//    public AppStore appStoreBn(){
//        click(appStore);
//        return new AppStore();
//    }
//    public PlayStore playStoreBn(){
//        click(playStore);
//        return new PlayStore();
//    }
//    public InecoMobile InecoMobileBn(){
//        click(inecoMobile);
//        return new InecoMobile();
//    }
//    public News newsMoreBn(){
//        click(newsMore);
//        return new News();
//    }
//    public Notification notificMoreBn(){
//        click(notificMore);
//        return new Notification();
//    }


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

    @Override
    public String getURL() {
        return driver.getCurrentUrl();
    }


}
