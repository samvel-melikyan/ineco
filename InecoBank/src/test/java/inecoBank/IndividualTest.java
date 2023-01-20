package inecoBank;


import inecoBank.individualNavMenu.Account;
import inecoBank.individualNavMenu.Cards;
import inecoBank.individualNavMenu.savings.Savings;
import inecoBank.individualNavMenu.savings.Simple;
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
        Savings savings = individual.flexibleBtn();
        Simple simple = savings.simpleBtn();
        Assert.assertEquals(DEPOSIT_SIMPLE, simple.getURL());
    }



}

