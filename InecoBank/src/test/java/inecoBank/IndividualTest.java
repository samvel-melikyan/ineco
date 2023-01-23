package inecoBank;


import inecoBank.individualNavMenu.Account;
import inecoBank.individualNavMenu.Cards;
import inecoBank.individualNavMenu.loans.OneClick;
import inecoBank.individualNavMenu.savings.Flexible;
import inecoBank.individualNavMenu.savings.Replenishable;
import inecoBank.individualNavMenu.savings.Savings;
import inecoBank.pages.Individuals;
import org.testng.Assert;
import org.testng.annotations.Test;

import static util.URL.*;

public class IndividualTest extends BaseTest{
    private Individuals individual;

    @Test
    public void newAccountBtn(){
        individual = new Individuals();
        Account account = individual.newAccount();
        Assert.assertEquals(ACCOUNTS, account.getURL());
    }
    @Test
    public void visaCard(){
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
    public void oneC(){
        individual = new Individuals();
        OneClick oneClick = individual.oneClickLoanBn();
        Assert.assertEquals(LOAN_ONE_CLCICK, oneClick.getURL());
    }




}

