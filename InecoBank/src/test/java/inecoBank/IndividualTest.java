package inecoBank;


import inecoBank.individualNavMenu.Account;
import inecoBank.individualNavMenu.Cards;
import inecoBank.individualNavMenu.loans.OneClick;
import inecoBank.individualNavMenu.savings.Flexible;
import inecoBank.individualNavMenu.savings.Replenishable;
import inecoBank.individualNavMenu.savings.Savings;
import inecoBank.pages.ContactUs;
import inecoBank.pages.Individuals;
import inecoBank.pages.NotExist;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static util.CustomElement.click;
import static util.urls.Card.*;
import static util.urls.URL.CONTACT_US;
import static util.urls.Account.ACCOUNTS;
import static util.urls.Deposit.*;
import static util.urls.Loan.LOAN_ONE_CLCICK;
import static util.urls.URL.NOT_EXIST;

public class IndividualTest extends BaseTest{
    private Individuals individual;

    @Test
    public void newAccountBtn(){
        individual = new Individuals();
        Account account = individual.newAccount();
        Assert.assertEquals(ACCOUNTS, account.getURL());
    }
    @Test
    public void visaCard(String cardVisa){
        individual = new Individuals();
        Cards card = individual.visaBtn();
        card.toVisa();
        Assert.assertEquals(CARD_VISA, card.getURL());
    }

    @Test
    public void masterCard(){
        individual = new Individuals();
        Cards card = individual.masterBtn();
        card.toMaster();
        Assert.assertEquals(CARD_MASTER, card.getURL());
    }
    @Test
    public void arCaCard(){
        individual = new Individuals();
        Cards card = individual.arCaBtn();
        card.toArCa();
        Assert.assertEquals(CARD_ARCA, card.getURL());
    }
    @Test
    public void simple(){
        individual = new Individuals();
        Savings savings = individual.simpleBn();
        Assert.assertEquals(DEPOSIT_SIMPLE, savings.getURL());
    }
    @Test
    public void flexible(){
        individual = new Individuals();
        Flexible flexible = individual.flexibleBtn();
        Assert.assertEquals(DEPOSITS_FLEXIBLE, flexible.getURL());
    }
    @Test
    public void replanishable(){
        individual = new Individuals();
        Replenishable replenishable = individual.replenishableBn();
        Assert.assertEquals(DEPOSITS_REPLENISHABLE, replenishable.getURL());
    }
    @Test
    public void oneClick(){
        individual = new Individuals();
        OneClick oneClick = individual.oneClickLoanBn();
        Assert.assertEquals(LOAN_ONE_CLCICK, oneClick.getURL());
    }

    @Test
    public void contactUs(){
        individual = new Individuals();
        ContactUs contactUs = individual.contactCenterBn();
        Assert.assertEquals(CONTACT_US, contactUs.getURL());
    }
    @Test
    public void eMail(){
        individual = new Individuals();
        ContactUs contactUs = individual.e_mailBtn();
        Assert.assertEquals(CONTACT_US, contactUs.getURL());
    }
    @Test
    public void loanRepayment(){
        individual = new Individuals();
        NotExist notExist = individual.loanRepaymentBtn();
        Assert.assertEquals(NOT_EXIST, notExist.getURL());
    }
    @Test
    public void depositReplenishment(){
        individual = new Individuals();
        NotExist notExist = individual.depositReplenishmentBtn();
        Assert.assertEquals(NOT_EXIST, notExist.getURL());
    }
    @Test
    public void cardReplenishment(){
        individual = new Individuals();
        NotExist notExist = individual.cardReplenishmentBtn();
        Assert.assertEquals(NOT_EXIST, notExist.getURL());
    }
    @Test
    public void accountReplenishment(){
        individual = new Individuals();
        NotExist notExist = individual.accounReplenishmentBtn();
        Assert.assertEquals(NOT_EXIST, notExist.getURL());
    }
    @Test
    public void usd(){
        individual = new Individuals();
        individual.selectItem();
        Assert.assertTrue(individual.isSelected());
//        individual.cashBtnBn();

//        Select select = new Select(individual.getHave$selectItem());
//        select.selectByIndex(2);
//        ArrayList<WebElement> have = individual.haveBn();
//        System.out.println(have.size());
//        click(have.get(1));
//        Assert.assertEquals(NOT_EXIST, "");
    }





}

