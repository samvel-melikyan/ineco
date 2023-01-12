package inecoBank.pages.pages;

import inecoBank.pages.navMenu.Account;
import inecoBank.pages.navMenu.Cards;
import inecoBank.pages.navMenu.Loans;
import inecoBank.pages.navMenu.Savings;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.WaitHelpers;

import java.util.ArrayList;

import static util.CustomElement.click;
import static util.CustomElement.sendKyes;
import static util.URL.INDIVIDUALS;

public class Individuals extends BasePage {
    //  #come_online
    @FindBy(css = "//*[@id=\"promotion.individual.homepage.online.services.1\"]/div/div[2]/div[2]/div/div/a/div")
    private WebElement openAnewAccount;
//    //  #order_online
//    @FindBy(xpath = "//*[@id=\"promotion.individual.homepage.online.services.2․cards\"]/div/div[3]/div[2]/div/div[1]/a")
//    private WebElement visa;
//    @FindBy(xpath = "//*[@id=\"promotion.individual.homepage.online.services.2․cards\"]/div/div[3]/div[2]/div/div[2]/a")
//    private WebElement master;
//    @FindBy(xpath = "//*[@id=\"promotion.individual.homepage.online.services.2․cards\"]/div/div[3]/div[2]/div/div[3]/a")
//    private WebElement arCa;
//    //  #save_online
//    @FindBy(xpath = "//*[@id=\"promotion.individual.homepage.online.services.5.savings\"]/div/div[3]/div[2]/div/div[1]/a")
//    private WebElement simple;
//    @FindBy(xpath = "//*[@id=\"promotion.individual.homepage.online.services.5.savings\"]/div/div[3]/div[2]/div/div[2]/a")
//    private WebElement flexible;
//    @FindBy(xpath = "//*[@id=\"promotion.individual.homepage.online.services.5.savings\"]/div/div[3]/div[2]/div/div[3]/a")
//    private WebElement replenishable;
//    //  #get_Online
//    @FindBy(xpath = "//*[@id=\"promotion.individual.homepage.online.services.4․loans\"]/div/div[3]/div[2]/div/div/a")
//    private WebElement oneClickLoan;
//    //  Contact
//    @FindBy(xpath = "//*[@id=\"promotion.individual.homepage.online.services.6\"]/div/div[2]/div[2]/div/div[1]/a")
//    private WebElement contactCenter;
//    @FindBy(xpath = "//*[@id=\"promotion.individual.homepage.online.services.6\"]/div/div[2]/div[2]/div/div[2]/a")
//    private WebElement e_mail;
//
//    //  Online Payments
//    @FindBy(xpath = "//*[@id=\"InecoPromotion.individual.homepage.payments\"]/div/div[3]/div[2]/div/div[1]/a")
//    private WebElement loanRepayment;
//    @FindBy(xpath = "//*[@id=\"InecoPromotion.individual.homepage.payments\"]/div/div[3]/div[2]/div/div[2]/a")
//    private WebElement depositReplenishment;
//    @FindBy(xpath = "//*[@id=\"InecoPromotion.individual.homepage.payments\"]/div/div[3]/div[2]/div/div[3]/a")
//    private WebElement cardReplenishment;
//    @FindBy(xpath = "//*[@id=\"InecoPromotion.individual.homepage.payments\"]/div/div[3]/div[2]/div/div[4]/a")
//    private WebElement accounReplenishment;
//
//    //  Exchange RAtes
//    @FindBy(className="btn btn--primary  ")
//    private WebElement cashBtn;
//    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div[3]/div[1]/div/div[2]/div[2]/div/div[1]/div/div/div[2]/button")
//    private WebElement nonCashBtn;
//    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div[3]/div[1]/div/div[2]/div[2]/div/div[1]/div/div/div[3]/button")
//    private WebElement onlineBtn;
//    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div[3]/div[1]/div/div[2]/div[2]/div/div[1]/div/div/div[4]/button")
//    private WebElement cardBtn;
//    //Have
//    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div[3]/div[1]/div/div[2]/div[2]/div/div[3]/div/div[1]/div[2]/div/div/div/div[1]/span")
//    private WebElement have;
//    @FindBy(id = "haveCurrencyAmount")
//    private WebElement haveInpiut;
//    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div[3]/div[1]/div/div[2]/div[2]/div/div[3]/div/div[1]/div[2]/div/div/div/div[2]/div")
//    private ArrayList <WebElement> haveCheckItem;
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
        get();
//        load();
        PageFactory.initElements(driver,this);
    }

    public Account newAccount(){
        click(openAnewAccount);
        return new Account();
    }
//    public Account goToAccount(){
//
//    }

//    public Cards visaBn(){
//        click(visa);
//        return new Cards();
//    }
//    public Cards arCaBn(){
//        click(arCa);
//        return new Cards();
//    }
//    public Cards masterBn(){
//        click(master);
//        return new Cards();
//    }
//    public Savings simpleBn(){
//        click(simple);
//        return new Savings();
//    }
//
//    public Savings flexibleBn(){
//        click(flexible);
//        return new Savings();
//    }
//    public Savings replenishableBn(){
//        click(replenishable);
//        return new Savings();
//    }
//    public Loans oneClickLoanBn(){
//        click(oneClickLoan);
//        return new Loans();
//    }
//    public ContactUs contactCenterBn(){
//        click(contactCenter);
//        return new ContactUs();
//    }
//    public ContactUs e_mailBn(){
//        click(e_mail);
//        return new ContactUs();
//    }
//
//    public NotExist loanRepaymentBn(){
//        click(loanRepayment);
//        return new NotExist();
//    }
//    public NotExist depositReplenishmentBn(){
//        click(depositReplenishment);
//        return new NotExist();
//    }
//    public NotExist cardReplenishmentBn(){
//        click(cardReplenishment);
//        return new NotExist();
//    }
//
//    public void cashBtnBn(){
//        click(cashBtn);
//    }
//
//    public void nonCashBtnBn(){
//        click(nonCashBtn);
//    }
//
//    public void onlineBn(){
//        click(onlineBtn);
//    }
//
//    public void cardBn(){
//        click(cardBtn);
//    }
//    public ArrayList haveBn(){
//        click(have);
//        return haveCheckItem;
//    }
//    public void haveInpiutBn(String num){
//        sendKyes(haveInpiut, num);
//    }
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
        driver.get(INDIVIDUALS);
    }

    @Override
    public void isLoaded() throws Error {
        WaitHelpers.waitForJSToLoad();
    }



}
